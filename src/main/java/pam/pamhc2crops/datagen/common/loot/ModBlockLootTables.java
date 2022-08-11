package pam.pamhc2crops.datagen.common.loot;

import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.ApplyExplosionDecay;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.registries.RegistryObject;
import pam.pamhc2crops.blocks.BlockPamCrop;
import pam.pamhc2crops.init.BlockRegistry;

import java.util.ArrayList;
import java.util.List;

import static pam.pamhc2crops.init.BlockRegistry.*;
import static pam.pamhc2crops.init.ItemRegistry.*;

public class ModBlockLootTables extends BlockLoot {

    @Override
    protected void addTables() {
        createPamCropDrops(pamagavecrop.get(), agaveitem.get());
        createPamCropDrops(pamamaranthcrop.get(), amaranthitem.get());
        createPamCropDrops(pamarrowrootcrop.get(), arrowrootitem.get());
        createPamCropDrops(pamartichokecrop.get(), artichokeitem.get());
        createPamCropDrops(pamasparaguscrop.get(), asparagusitem.get());
        createPamCropDrops(pambarleycrop.get(), barleyitem.get());
        createPamCropDrops(pambeancrop.get(), beanitem.get());
        createPamCropDrops(pambellpeppercrop.get(), bellpepperitem.get());
        createPamCropDrops(pamblackberrycrop.get(), blackberryitem.get());
        createPamCropDrops(pamblueberrycrop.get(), blueberryitem.get());
        createPamCropDrops(pambroccolicrop.get(), broccoliitem.get());
        createPamCropDrops(pambrusselsproutcrop.get(), brusselsproutitem.get());
        createPamCropDrops(pamcabbagecrop.get(), cabbageitem.get());
        createPamCropDrops(pamcactusfruitcrop.get(), cactusfruititem.get());
        createPamCropDrops(pamcandleberrycrop.get(), candleberryitem.get());
        createPamCropDrops(pamcantaloupecrop.get(), cantaloupeitem.get());
        createPamCropDrops(pamcassavacrop.get(), cassavaitem.get());
        createPamCropDrops(pamcauliflowercrop.get(), caulifloweritem.get());
        createPamCropDrops(pamcelerycrop.get(), celeryitem.get());
        createPamCropDrops(pamchickpeacrop.get(), chickpeaitem.get());
        createPamCropDrops(pamchilipeppercrop.get(), chilipepperitem.get());
        createPamCropDrops(pamcoffeebeancrop.get(), coffeebeanitem.get());
        createPamCropDrops(pamcorncrop.get(), cornitem.get());
        createPamCropDrops(pamcottoncrop.get(), cottonitem.get());
        createPamCropDrops(pamcranberrycrop.get(), cranberryitem.get());
        createPamCropDrops(pamcucumbercrop.get(), cucumberitem.get());
        createPamCropDrops(pameggplantcrop.get(), eggplantitem.get());
        createPamCropDrops(pamelderberrycrop.get(), elderberryitem.get());
        createPamCropDrops(pamflaxcrop.get(), flaxitem.get());
        createPamCropDrops(pamgarliccrop.get(), garlicitem.get());
        createPamCropDrops(pamgingercrop.get(), gingeritem.get());
        createPamCropDrops(pamgrapecrop.get(), grapeitem.get());
        createPamCropDrops(pamgreengrapecrop.get(), greengrapeitem.get());
        createPamCropDrops(pamhuckleberrycrop.get(), huckleberryitem.get());
        createPamCropDrops(pamjicamacrop.get(), jicamaitem.get());
        createPamCropDrops(pamjuniperberrycrop.get(), juniperberryitem.get());
        createPamCropDrops(pamjutecrop.get(), juteitem.get());
        createPamCropDrops(pamkalecrop.get(), kaleitem.get());
        createPamCropDrops(pamkenafcrop.get(), kenafitem.get());
        createPamCropDrops(pamkiwicrop.get(), kiwiitem.get());
        createPamCropDrops(pamkohlrabicrop.get(), kohlrabiitem.get());
        createPamCropDrops(pamleekcrop.get(), leekitem.get());
        createPamCropDrops(pamlentilcrop.get(), lentilitem.get());
        createPamCropDrops(pamlettucecrop.get(), lettuceitem.get());
        createPamCropDrops(pammilletcrop.get(), milletitem.get());
        createPamCropDrops(pammulberrycrop.get(), mulberryitem.get());
        createPamCropDrops(pammustardseedscrop.get(), mustardseedsitem.get());
        createPamCropDrops(pamoatscrop.get(), oatsitem.get());
        createPamCropDrops(pamokracrop.get(), okraitem.get());
        createPamCropDrops(pamonioncrop.get(), onionitem.get());
        createPamCropDrops(pamparsnipcrop.get(), parsnipitem.get());
        createPamCropDrops(pampeanutcrop.get(), peanutitem.get());
        createPamCropDrops(pampeascrop.get(), peasitem.get());
        createPamCropDrops(pampineapplecrop.get(), pineappleitem.get());
        createPamCropDrops(pamquinoacrop.get(), quinoaitem.get());
        createPamCropDrops(pamradishcrop.get(), radishitem.get());
        createPamCropDrops(pamraspberrycrop.get(), raspberryitem.get());
        createPamCropDrops(pamrhubarbcrop.get(), rhubarbitem.get());
        createPamCropDrops(pamricecrop.get(), riceitem.get());
        createPamCropDrops(pamrutabagacrop.get(), rutabagaitem.get());
        createPamCropDrops(pamryecrop.get(), ryeitem.get());
        createPamCropDrops(pamscallioncrop.get(), scallionitem.get());
        createPamCropDrops(pamsesameseedscrop.get(), sesameseedsitem.get());
        createPamCropDrops(pamsisalcrop.get(), sisalitem.get());
        createPamCropDrops(pamsoybeancrop.get(), soybeanitem.get());
        createPamCropDrops(pamspiceleafcrop.get(), spiceleafitem.get());
        createPamCropDrops(pamspinachcrop.get(), spinachitem.get());
        createPamCropDrops(pamstrawberrycrop.get(), strawberryitem.get());
        createPamCropDrops(pamsweetpotatocrop.get(), sweetpotatoitem.get());
        createPamCropDrops(pamtarocrop.get(), taroitem.get());
        createPamCropDrops(pamtealeafcrop.get(), tealeafitem.get());
        createPamCropDrops(pamtomatillocrop.get(), tomatilloitem.get());
        createPamCropDrops(pamtomatocrop.get(), tomatoitem.get());
        createPamCropDrops(pamturnipcrop.get(), turnipitem.get());
        createPamCropDrops(pamwaterchestnutcrop.get(), waterchestnutitem.get());
        createPamCropDrops(pamwhitemushroomcrop.get(), whitemushroomitem.get());
        createPamCropDrops(pamwintersquashcrop.get(), wintersquashitem.get());
        createPamCropDrops(pamzucchinicrop.get(), zucchiniitem.get());

        createPamGardenDrops(BlockRegistry.aridgarden.get(), new ArrayList<>() {{
            add(agaveitem.get());
            add(Items.CACTUS);
            add(cactusfruititem.get());
            add(cassavaitem.get());
            add(chickpeaitem.get());
            add(lentilitem.get());
            add(sisalitem.get());
        }});
        createPamGardenDrops(BlockRegistry.frostgarden.get(), new ArrayList<>(){{
            add(broccoliitem.get());
            add(cabbageitem.get());
            add(caulifloweritem.get());
            add(celeryitem.get());
            add(cottonitem.get());
            add(huckleberryitem.get());
            add(juniperberryitem.get());
            add(kohlrabiitem.get());
            add(oatsitem.get());
            add(peasitem.get());
            add(quinoaitem.get());
            add(raspberryitem.get());
            add(rutabagaitem.get());
            add(ryeitem.get());
            add(spinachitem.get());
        }});
        createPamGardenDrops(BlockRegistry.tropicalgarden.get(), new ArrayList<>(){{
            add(arrowrootitem.get());
            add(cantaloupeitem.get());
            add(coffeebeanitem.get());
            add(eggplantitem.get());
            add(grapeitem.get());
            add(kenafitem.get());
            add(kiwiitem.get());
            add(pineappleitem.get());
            add(sesameseedsitem.get());
            add(soybeanitem.get());
            add(taroitem.get());
            add(gingeritem.get());
        }});
        createPamGardenDrops(BlockRegistry.windygarden.get(), new ArrayList<>(){{
            add(amaranthitem.get());
            add(artichokeitem.get());
            add(barleyitem.get());
            add(bellpepperitem.get());
            add(chilipepperitem.get());
            add(cornitem.get());
            add(cucumberitem.get());
            add(elderberryitem.get());
            add(flaxitem.get());
            add(lettuceitem.get());
            add(mustardseedsitem.get());
            add(onionitem.get());
            add(parsnipitem.get());
            add(peanutitem.get());
            add(strawberryitem.get());
            add(wintersquashitem.get());
        }});
        createPamGardenDrops(BlockRegistry.shadedgarden.get(), new ArrayList<>(){{
            add(beanitem.get());
            add(blackberryitem.get());
            add(garlicitem.get());
            add(juteitem.get());
            add(leekitem.get());
            add(radishitem.get());
            add(rhubarbitem.get());
            add(scallionitem.get());
            add(spiceleafitem.get());
            add(sweetpotatoitem.get());
            add(tealeafitem.get());
            add(tomatoitem.get());
            add(turnipitem.get());
            add(whitemushroomitem.get());
            add(zucchiniitem.get());
        }});
        createPamGardenDrops(BlockRegistry.soggygarden.get(), new ArrayList<>(){{
            add(asparagusitem.get());
            add(blueberryitem.get());
            add(brusselsproutitem.get());
            add(cottonitem.get());
            add(cranberryitem.get());
            add(greengrapeitem.get());
            add(jicamaitem.get());
            add(kaleitem.get());
            add(milletitem.get());
            add(mulberryitem.get());
            add(okraitem.get());
            add(riceitem.get());
            add(spiceleafitem.get());
            add(tomatilloitem.get());
            add(waterchestnutitem.get());
        }});

    }

    private void createPamGardenDrops(Block block, List<Item> entries) {
        add(block, getGardenLootTable(block, entries));
    }

    private LootTable.Builder getGardenLootTable(Block block, List<Item> entires) {
        LootPool.Builder builder = LootPool.lootPool()
                .name(block.getRegistryName().getPath().toString())
                .apply(ApplyBonusCount.addUniformBonusCount(Enchantments.BLOCK_FORTUNE, 2))
                .apply(ApplyExplosionDecay.explosionDecay());

        entires.forEach(x -> builder.add(LootItem.lootTableItem(x.asItem()).setWeight(1)));


        return LootTable.lootTable().withPool(builder);
    }

    private void createPamCropDrops(Block block, Item drop) {
        this.add(block, createCropDrops(block, drop, drop, getCropLootItemCondition((BlockPamCrop) block)));
    }

    protected static LootTable.Builder createCropDrops(Block p_124143_, Item p_124144_, Item p_124145_, LootItemCondition.Builder p_124146_) {
        return applyExplosionDecay(p_124143_, LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(p_124144_).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286f , 3)).when(p_124146_).otherwise(LootItem.lootTableItem(p_124145_)))).withPool(LootPool.lootPool().when(p_124146_).add(LootItem.lootTableItem(p_124145_).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 3)))));
    }

    private LootItemCondition.Builder getCropLootItemCondition(BlockPamCrop crop) {
        return LootItemBlockStatePropertyCondition.hasBlockStateProperties(crop).setProperties(
                StatePropertiesPredicate.Builder.properties().hasProperty(BlockPamCrop.AGE, 7));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
