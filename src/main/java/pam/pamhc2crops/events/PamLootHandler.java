package pam.pamhc2crops.events;

import com.google.gson.*;
import com.mojang.datafixers.util.Pair;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.Deserializers;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.functions.LootItemFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.common.loot.LootModifier;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nonnull;
import java.util.*;

public class PamLootHandler extends LootModifier {
    private List<Pair<Item, Integer>> itemWeights;
    private int totalWeight;

    private LootItemFunction[] functions;

    private String type;

    private static Random rand;

    protected PamLootHandler(LootItemCondition[] conditionsIn, List<Pair<Item, Integer>> itemWeights, LootItemFunction[] functions, String type) {
        super(conditionsIn);
        this.itemWeights = itemWeights;
        this.totalWeight = getTotalItemWeight(itemWeights);

        this.functions = functions;

        this.type = type;

        rand = new Random();
    }

    private int getTotalItemWeight(List<Pair<Item, Integer>> itemWeights) {
        int totalWeight = 0;

        for (Pair<Item, Integer> itemWeight : itemWeights) {
            totalWeight += itemWeight.getSecond();
        }

        return totalWeight;
    }

    @NotNull
    @Override
    protected List<ItemStack> doApply(List<ItemStack> generatedLoot, LootContext context) {
        int targetWeight = rand.nextInt(totalWeight);
        Item drop = null;

        for (Pair<Item, Integer> itemWeight : itemWeights) {
            int weight = itemWeight.getSecond();
            if (targetWeight < weight) {
                drop = itemWeight.getFirst();
                break;
            } else {
                targetWeight -= weight;
            }
        }

        ItemStack reward = new ItemStack(drop, 1);

        for (LootItemFunction function : this.functions) {
            function.apply(reward, context);
        }

        generatedLoot.add(reward);
        return generatedLoot;
    }

    public static class PamLootSerializer extends GlobalLootModifierSerializer<PamLootHandler> {

        @Override
        public PamLootHandler read(ResourceLocation location, JsonObject object, LootItemCondition[] condition) {
            JsonArray entriesJsonArray = GsonHelper.getAsJsonArray(object, "entries");

            List<Pair<Item, Integer>> itemWeights = getItemWeightsFromEntries(entriesJsonArray);

            LootItemFunction[] functions;
            JsonArray functionsArray = object.getAsJsonArray("functions");
            if (functionsArray != null) {
                functions = Deserializers.createFunctionSerializer().create().fromJson(functionsArray, LootItemFunction[].class);
            } else {
                functions = new LootItemFunction[0];
            }

            String type = GsonHelper.getAsString(object, "type");

            return new PamLootHandler(condition, itemWeights, functions, type);
        }

        @Override
        public JsonObject write(PamLootHandler instance) {
            JsonObject res = this.makeConditions(instance.conditions);

            JsonElement functionsElement = Deserializers.createFunctionSerializer().create().toJsonTree(instance.functions);
            JsonArray entriesArray = getEntriesFromItemWeights(instance.itemWeights);

            res.add("functions", functionsElement);
            res.add("entries", entriesArray);

            res.addProperty("type", instance.type);

            return res;
        }

        @Nonnull
        private List<Pair<Item, Integer>> getItemWeightsFromEntries(JsonArray entries) {
            List<Pair<Item, Integer>> itemWeights = new ArrayList<>();

            for (JsonElement element : entries) {
                JsonObject entry = element.getAsJsonObject();
                Item item = GsonHelper.getAsItem(entry, "name");
                Integer weight = GsonHelper.getAsInt(entry, "weight");

                Pair<Item, Integer> itemWeight = new Pair<>(item, weight);
                itemWeights.add(itemWeight);
            }

            return itemWeights;
        }

        @Nonnull
        private JsonArray getEntriesFromItemWeights(List<Pair<Item, Integer>> itemWeights) {
            JsonArray entries = new JsonArray();

            for (Pair<Item, Integer> itemWeight : itemWeights) {
                JsonObject entry = new JsonObject();

                Item item = itemWeight.getFirst();
                Integer weight = itemWeight.getSecond();

                entry.addProperty("name", item.getRegistryName().toString());
                entry.addProperty("weight", weight);

                entries.add(entry);
            }

            return entries;
        }
    }

}
