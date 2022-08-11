package pam.pamhc2crops.datagen.common.lootmodifiers;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.datafixers.util.Pair;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.Deserializers;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.functions.LootItemFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.common.loot.LootModifier;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PlantAdditionModifier extends LootModifier {
    private List<Pair<Item, Integer>> itemWeights;
    private final LootItemFunction[] functions;
    private final int totalWeight;

    private final Random random;

    public PlantAdditionModifier(LootItemCondition[] conditionsIn, List<Pair<Item, Integer>> itemWeights, LootItemFunction[] functions) {
        super(conditionsIn);
        this.itemWeights = itemWeights;
        this.functions = functions;
        this.totalWeight = getTotalItemWeight(itemWeights);
        this.random = new Random();
    }


    @NotNull
    @Override
    protected List<ItemStack> doApply(List<ItemStack> generatedLoot, LootContext context) {
        int targetWeight = random.nextInt(totalWeight);

        for(Pair<Item, Integer> itemWeight : itemWeights){
            int weight = itemWeight.getSecond();
            if(targetWeight < weight){
                generatedLoot.add(applyFunctions(new ItemStack(itemWeight.getFirst(), 1), context));
                break;
            }
            else {
                targetWeight -= weight;
            }
        }
        return generatedLoot;
    }

    private ItemStack applyFunctions(ItemStack itemStack, LootContext context){
        for (LootItemFunction function : this.functions){
            function.apply(itemStack, context);
        }
        return itemStack;
    }

    private int getTotalItemWeight(List<Pair<Item, Integer>> itemWeights) {
        int totalWeight = 0;

        for (Pair<Item, Integer> itemWeight : itemWeights) {
            totalWeight += itemWeight.getSecond();
        }

        return totalWeight;
    }

    public static class Serializer extends GlobalLootModifierSerializer<PlantAdditionModifier>{
        @Override
        public PlantAdditionModifier read(ResourceLocation location, JsonObject object, LootItemCondition[] ailootcondition) {
            JsonArray entries = GsonHelper.getAsJsonArray(object, "entries");
            List<Pair<Item, Integer>> itemWeights = getItemWeights(entries);

            JsonArray functionsArray = object.getAsJsonArray("functions");
            LootItemFunction[] functions = functionsArray != null ? Deserializers.createFunctionSerializer().create().fromJson(functionsArray, LootItemFunction[].class) : new LootItemFunction[0];

            return new PlantAdditionModifier(ailootcondition, itemWeights, functions);
        }

        @Override
        public JsonObject write(PlantAdditionModifier instance) {
            JsonObject res = this.makeConditions(instance.conditions);
            JsonElement functions = Deserializers.createFunctionSerializer().create().toJsonTree(instance.functions);
            JsonArray entries = getEntries(instance.itemWeights);

            res.add("functions", functions);
            res.add("entries", entries);

            return res;
        }

        @Nonnull
        private List<Pair<Item, Integer>> getItemWeights(JsonArray entries) {
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
        private JsonArray getEntries(List<Pair<Item, Integer>> itemWeights) {
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
