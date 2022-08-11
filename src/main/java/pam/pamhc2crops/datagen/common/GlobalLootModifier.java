package pam.pamhc2crops.datagen.common;

import com.mojang.datafixers.util.Pair;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.ApplyExplosionDecay;
import net.minecraft.world.level.storage.loot.functions.LootItemFunction;
import net.minecraft.world.level.storage.loot.predicates.*;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import pam.pamhc2crops.Pamhc2crops;
import pam.pamhc2crops.datagen.common.lootmodifiers.PlantAdditionModifier;
import pam.pamhc2crops.init.LootModifierRegistry;

import java.util.ArrayList;
import java.util.List;

import static pam.pamhc2crops.init.ItemRegistry.*;

public class GlobalLootModifier extends GlobalLootModifierProvider {
    public GlobalLootModifier(DataGenerator gen) {
        super(gen, Pamhc2crops.MOD_ID);
    }

    @Override
    protected void start() {
        add("fern_drops", LootModifierRegistry.PLANT_ADDITION.get(), new PlantAdditionModifier(
                new LootItemCondition[]{
                        LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.FERN).build(),
                        LootItemRandomChanceCondition.randomChance(0.0625f).build()
                }, getDefaultDrops(),
                new LootItemFunction[]{
                        ApplyBonusCount.addUniformBonusCount(Enchantments.BLOCK_FORTUNE, 2).build(),
                        ApplyExplosionDecay.explosionDecay().build()
                }
        ));
        add("grass_drops", LootModifierRegistry.PLANT_ADDITION.get(), new PlantAdditionModifier(
                new LootItemCondition[]{
                        LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.GRASS).build(),
                        LootItemRandomChanceCondition.randomChance(0.0625f).build()
                }, getDefaultDrops(),
                new LootItemFunction[]{
                        ApplyBonusCount.addUniformBonusCount(Enchantments.BLOCK_FORTUNE, 2).build(),
                        ApplyExplosionDecay.explosionDecay().build()
                }
        ));
        add("tall_grass_drops", LootModifierRegistry.PLANT_ADDITION.get(), new PlantAdditionModifier(
                new LootItemCondition[]{
                        LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.TALL_GRASS).build(),
                        LootItemRandomChanceCondition.randomChance(0.0625f).build()
                }, getDefaultDrops(),
                new LootItemFunction[]{
                        ApplyBonusCount.addUniformBonusCount(Enchantments.BLOCK_FORTUNE, 2).build(),
                        ApplyExplosionDecay.explosionDecay().build()
                }
        ));
    }

    private List<Pair<Item, Integer>> getDefaultDrops(){
        ArrayList<Pair<Item, Integer>> defaultDrops = new ArrayList<>();
        defaultDrops.add(getItemPair(agaveseeditem.get()));
        defaultDrops.add(getItemPair(amaranthseeditem.get()));
        defaultDrops.add(getItemPair(arrowrootseeditem.get()));
        defaultDrops.add(getItemPair(artichokeseeditem.get()));
        defaultDrops.add(getItemPair(asparagusseeditem.get()));
        defaultDrops.add(getItemPair(barleyseeditem.get()));
        defaultDrops.add(getItemPair(beanseeditem.get()));
        defaultDrops.add(getItemPair(bellpepperseeditem.get()));
        defaultDrops.add(getItemPair(blackberryseeditem.get()));
        defaultDrops.add(getItemPair(broccoliseeditem.get()));
        defaultDrops.add(getItemPair(brusselsproutseeditem.get()));
        defaultDrops.add(getItemPair(cabbageseeditem.get()));
        defaultDrops.add(getItemPair(cactusfruitseeditem.get()));
        defaultDrops.add(getItemPair(candleberryseeditem.get()));
        defaultDrops.add(getItemPair(cantaloupeseeditem.get()));
        defaultDrops.add(getItemPair(cassavaseeditem.get()));
        defaultDrops.add(getItemPair(cauliflowerseeditem.get()));
        defaultDrops.add(getItemPair(celeryseeditem.get()));
        defaultDrops.add(getItemPair(chickpeaseeditem.get()));
        defaultDrops.add(getItemPair(chilipepperseeditem.get()));
        defaultDrops.add(getItemPair(coffeebeanseeditem.get()));
        defaultDrops.add(getItemPair(cornseeditem.get()));
        defaultDrops.add(getItemPair(cranberryseeditem.get()));
        defaultDrops.add(getItemPair(cucumberseeditem.get()));
        defaultDrops.add(getItemPair(eggplantseeditem.get()));
        defaultDrops.add(getItemPair(elderberryseeditem.get()));
        defaultDrops.add(getItemPair(flaxseeditem.get()));
        defaultDrops.add(getItemPair(garlicseeditem.get()));
        defaultDrops.add(getItemPair(gingerseeditem.get()));
        defaultDrops.add(getItemPair(grapeseeditem.get()));
        defaultDrops.add(getItemPair(greengrapeseeditem.get()));
        defaultDrops.add(getItemPair(huckleberryseeditem.get()));
        defaultDrops.add(getItemPair(jicamaseeditem.get()));
        defaultDrops.add(getItemPair(juniperberryseeditem.get()));
        defaultDrops.add(getItemPair(juteseeditem.get()));
        defaultDrops.add(getItemPair(kaleseeditem.get()));
        defaultDrops.add(getItemPair(kenafseeditem.get()));
        defaultDrops.add(getItemPair(kiwiseeditem.get()));
        defaultDrops.add(getItemPair(kohlrabiseeditem.get()));
        defaultDrops.add(getItemPair(leekseeditem.get()));
        defaultDrops.add(getItemPair(lentilseeditem.get()));
        defaultDrops.add(getItemPair(lettuceseeditem.get()));
        defaultDrops.add(getItemPair(milletseeditem.get()));
        defaultDrops.add(getItemPair(mulberryseeditem.get()));
        defaultDrops.add(getItemPair(mustardseedsseeditem.get()));
        defaultDrops.add(getItemPair(oatsseeditem.get()));
        defaultDrops.add(getItemPair(okraseeditem.get()));
        defaultDrops.add(getItemPair(onionseeditem.get()));
        defaultDrops.add(getItemPair(parsnipseeditem.get()));
        defaultDrops.add(getItemPair(peanutseeditem.get()));
        defaultDrops.add(getItemPair(peasseeditem.get()));
        defaultDrops.add(getItemPair(pineappleseeditem.get()));
        defaultDrops.add(getItemPair(quinoaseeditem.get()));
        defaultDrops.add(getItemPair(radishseeditem.get()));
        defaultDrops.add(getItemPair(raspberryseeditem.get()));
        defaultDrops.add(getItemPair(rhubarbseeditem.get()));
        defaultDrops.add(getItemPair(riceseeditem.get()));
        defaultDrops.add(getItemPair(rutabagaseeditem.get()));
        defaultDrops.add(getItemPair(ryeseeditem.get()));
        defaultDrops.add(getItemPair(scallionseeditem.get()));
        defaultDrops.add(getItemPair(sesameseedsseeditem.get()));
        defaultDrops.add(getItemPair(sisalseeditem.get()));
        defaultDrops.add(getItemPair(soybeanseeditem.get()));
        defaultDrops.add(getItemPair(spiceleafseeditem.get()));
        defaultDrops.add(getItemPair(spinachseeditem.get()));
        defaultDrops.add(getItemPair(strawberryseeditem.get()));
        defaultDrops.add(getItemPair(sweetpotatoseeditem.get()));
        defaultDrops.add(getItemPair(taroseeditem.get()));
        defaultDrops.add(getItemPair(tealeafseeditem.get()));
        defaultDrops.add(getItemPair(tomatilloseeditem.get()));
        defaultDrops.add(getItemPair(tomatoseeditem.get()));
        defaultDrops.add(getItemPair(turnipseeditem.get()));
        defaultDrops.add(getItemPair(waterchestnutseeditem.get()));
        defaultDrops.add(getItemPair(whitemushroomseeditem.get()));
        defaultDrops.add(getItemPair(wintersquashseeditem.get()));
        defaultDrops.add(getItemPair(zucchiniseeditem.get()));
        return defaultDrops;
    }

    private Pair<Item, Integer> getItemPair(Item item){
        return new Pair<>(item, 1);
    }
}
