package pam.pamhc2crops.datagen.common;

import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CampfireCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.Tags;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ForgeRegistry;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.tags.ITagManager;
import pam.pamhc2crops.datagen.common.tags.ModCropsTag;
import pam.pamhc2crops.init.BlockRegistry;

import java.rmi.registry.Registry;
import java.util.function.Consumer;

import static net.minecraftforge.versions.forge.ForgeVersion.MOD_ID;
import static pam.pamhc2crops.init.ItemRegistry.*;

public class ModRecipes extends RecipeProvider {
    public ModRecipes(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
        createShapelessItemToSeed(agaveitem.get(), agaveseeditem.get(), consumer);
        createShapelessItemToSeed(amaranthitem.get(), amaranthseeditem.get(), consumer);
        createShapelessItemToSeed(arrowrootitem.get(), arrowrootseeditem.get(), consumer);
        createShapelessItemToSeed(artichokeitem.get(), artichokeseeditem.get(), consumer);
        createShapelessItemToSeed(asparagusitem.get(), asparagusseeditem.get(), consumer);
        createShapelessItemToSeed(barleyitem.get(), barleyseeditem.get(), consumer);
        createShapelessItemToSeed(beanitem.get(), beanseeditem.get(), consumer);
        createShapelessItemToSeed(bellpepperitem.get(), bellpepperseeditem.get(), consumer);
        createShapelessItemToSeed(blackberryitem.get(), blackberryseeditem.get(), consumer);
        createShapelessItemToSeed(blueberryitem.get(), blueberryseeditem.get(), consumer);
        createShapelessItemToSeed(broccoliitem.get(), broccoliseeditem.get(), consumer);
        createShapelessItemToSeed(brusselsproutitem.get(), brusselsproutseeditem.get(), consumer);
        createShapelessItemToSeed(cabbageitem.get(), cabbageseeditem.get(), consumer);
        createShapelessItemToSeed(cactusfruititem.get(), cactusfruitseeditem.get(), consumer);
        createShapelessItemToSeed(candleberryitem.get(), candleberryseeditem.get(), consumer);
        createShapelessItemToSeed(cantaloupeitem.get(), cantaloupeseeditem.get(), consumer);
        createShapelessItemToSeed(cassavaitem.get(), cassavaseeditem.get(), consumer);
        createShapelessItemToSeed(caulifloweritem.get(), cauliflowerseeditem.get(), consumer);
        createShapelessItemToSeed(celeryitem.get(), celeryseeditem.get(), consumer);
        createShapelessItemToSeed(chickpeaitem.get(), chickpeaseeditem.get(), consumer);
        createShapelessItemToSeed(chilipepperitem.get(), chilipepperseeditem.get(), consumer);
        createShapelessItemToSeed(coffeebeanitem.get(), coffeebeanseeditem.get(), consumer);
        createShapelessItemToSeed(cornitem.get(), cornseeditem.get(), consumer);
        createShapelessItemToSeed(cottonitem.get(), cottonseeditem.get(), consumer);
        createShapelessItemToSeed(cranberryitem.get(), cranberryseeditem.get(), consumer);
        createShapelessItemToSeed(cucumberitem.get(), cucumberseeditem.get(), consumer);
        createShapelessItemToSeed(eggplantitem.get(), eggplantseeditem.get(), consumer);
        createShapelessItemToSeed(elderberryitem.get(), elderberryseeditem.get(), consumer);
        createShapelessItemToSeed(flaxitem.get(), flaxseeditem.get(), consumer);
        createShapelessItemToSeed(garlicitem.get(), garlicseeditem.get(), consumer);
        createShapelessItemToSeed(gingeritem.get(), gingerseeditem.get(), consumer);
        createShapelessItemToSeed(grapeitem.get(), grapeseeditem.get(), consumer);
        createShapelessItemToSeed(greengrapeitem.get(), greengrapeseeditem.get(), consumer);
        createShapelessItemToSeed(huckleberryitem.get(), huckleberryseeditem.get(), consumer);
        createShapelessItemToSeed(jicamaitem.get(), jicamaseeditem.get(), consumer);
        createShapelessItemToSeed(juniperberryitem.get(), juniperberryseeditem.get(), consumer);
        createShapelessItemToSeed(juteitem.get(), juteseeditem.get(), consumer);
        createShapelessItemToSeed(kaleitem.get(), kaleseeditem.get(), consumer);
        createShapelessItemToSeed(kenafitem.get(), kenafseeditem.get(), consumer);
        createShapelessItemToSeed(kiwiitem.get(), kiwiseeditem.get(), consumer);
        createShapelessItemToSeed(kohlrabiitem.get(), kohlrabiseeditem.get(), consumer);
        createShapelessItemToSeed(leekitem.get(), leekseeditem.get(), consumer);
        createShapelessItemToSeed(lentilitem.get(), lentilseeditem.get(), consumer);
        createShapelessItemToSeed(lettuceitem.get(), lettuceseeditem.get(), consumer);
        createShapelessItemToSeed(milletitem.get(), milletseeditem.get(), consumer);
        createShapelessItemToSeed(mulberryitem.get(), mulberryseeditem.get(), consumer);
        createShapelessItemToSeed(mustardseedsitem.get(), mustardseedsseeditem.get(), consumer);
        createShapelessItemToSeed(oatsitem.get(), oatsseeditem.get(), consumer);
        createShapelessItemToSeed(okraitem.get(), okraseeditem.get(), consumer);
        createShapelessItemToSeed(onionitem.get(), onionseeditem.get(), consumer);
        createShapelessItemToSeed(parsnipitem.get(), parsnipseeditem.get(), consumer);
        createShapelessItemToSeed(peanutitem.get(), peanutseeditem.get(), consumer);
        createShapelessItemToSeed(peasitem.get(), peasseeditem.get(), consumer);
        createShapelessItemToSeed(pineappleitem.get(), pineappleseeditem.get(), consumer);
        createShapelessItemToSeed(quinoaitem.get(), quinoaseeditem.get(), consumer);
        createShapelessItemToSeed(radishitem.get(), radishseeditem.get(), consumer);
        createShapelessItemToSeed(raspberryitem.get(), raspberryseeditem.get(), consumer);
        createShapelessItemToSeed(rhubarbitem.get(), rhubarbseeditem.get(), consumer);
        createShapelessItemToSeed(riceitem.get(), riceseeditem.get(), consumer);
        createShapelessItemToSeed(rutabagaitem.get(), rutabagaseeditem.get(), consumer);
        createShapelessItemToSeed(ryeitem.get(), ryeseeditem.get(), consumer);
        createShapelessItemToSeed(scallionitem.get(), scallionseeditem.get(), consumer);
        createShapelessItemToSeed(sesameseedsitem.get(), sesameseedsseeditem.get(), consumer);
        createShapelessItemToSeed(sisalitem.get(), sisalseeditem.get(), consumer);
        createShapelessItemToSeed(soybeanitem.get(), soybeanseeditem.get(), consumer);
        createShapelessItemToSeed(spiceleafitem.get(), spiceleafseeditem.get(), consumer);
        createShapelessItemToSeed(spinachitem.get(), spinachseeditem.get(), consumer);
        createShapelessItemToSeed(strawberryitem.get(), strawberryseeditem.get(), consumer);
        createShapelessItemToSeed(sweetpotatoitem.get(), sweetpotatoseeditem.get(), consumer);
        createShapelessItemToSeed(taroitem.get(), taroseeditem.get(), consumer);
        createShapelessItemToSeed(tealeafitem.get(), tealeafseeditem.get(), consumer);
        createShapelessItemToSeed(tomatilloitem.get(), tomatilloseeditem.get(), consumer);
        createShapelessItemToSeed(tomatoitem.get(), tomatoseeditem.get(), consumer);
        createShapelessItemToSeed(turnipitem.get(), turnipseeditem.get(), consumer);
        createShapelessItemToSeed(waterchestnutitem.get(), waterchestnutseeditem.get(), consumer);
        createShapelessItemToSeed(whitemushroomitem.get(), whitemushroomseeditem.get(), consumer);
        createShapelessItemToSeed(wintersquashitem.get(), wintersquashseeditem.get(), consumer);
        createShapelessItemToSeed(zucchiniitem.get(), zucchiniseeditem.get(), consumer);

       createCookingRecipes(arrowrootitem.get(), bakedarrowrootitem.get(), consumer);
       createCookingRecipes(cassavaitem.get(), bakedcassavaitem.get(), consumer);
       createCookingRecipes(jicamaitem.get(), bakedjicamaitem.get(), consumer);
       createCookingRecipes(parsnipitem.get(), bakedparsnipitem.get(), consumer);
       createCookingRecipes(rutabagaitem.get(), bakedrutabagaitem.get(), consumer);
       createCookingRecipes(sweetpotatoitem.get(), bakedsweetpotatoitem.get(), consumer);
       createCookingRecipes(taroitem.get(), bakedtaroitem.get(), consumer);
       createCookingRecipes(turnipitem.get(), bakedturnipitem.get(), consumer);
       createCookingRecipes(waterchestnutitem.get(), bakedwaterchestnutitem.get(), consumer);
       createCookingRecipes(coffeebeanitem.get(), hotcoffeeitem.get(), consumer);
       createCookingRecipes(tealeafitem.get(), hotteaitem.get(), consumer);
       createCookingRecipes(garlicitem.get(), roastedgarlicitem.get(), consumer);
       createCookingRecipes(kohlrabiitem.get(), roastedkohlrabiitem.get(), consumer);
       createCookingRecipes(leekitem.get(), roastedleekitem.get(), consumer);
       createCookingRecipes(whitemushroomitem.get(), roastedmushroomitem.get(), consumer);
       createCookingRecipes(onionitem.get(), roastedonionitem.get(), consumer);
       createCookingRecipes(peanutitem.get(), roastedpeanutitem.get(), consumer);
       createCookingRecipes(radishitem.get(), roastedradishitem.get(), consumer);
       createCookingRecipes(rhubarbitem.get(), roastedrhubarbitem.get(), consumer);
       createCookingRecipes(scallionitem.get(), roastedscallionitem.get(), consumer);

       createMiscRecipes(consumer);
    }

    private void createMiscRecipes(Consumer<FinishedRecipe> consumer){
        ShapelessRecipeBuilder.shapeless(Items.BREAD)
                .requires(Ingredient.of(
                        ForgeRegistries.ITEMS.tags().getTag(ItemTags.create(new ResourceLocation(MOD_ID, "grain"))).getKey()), 2)
                .unlockedBy("has_crop", has(ForgeRegistries.ITEMS.tags().getTag(ItemTags.create(new ResourceLocation(MOD_ID, "grain"))).getKey()))
                .save(consumer, "bread_grain");

        ShapelessRecipeBuilder.shapeless(Items.PAPER)
                .requires(Ingredient.of(
                        ForgeRegistries.ITEMS.tags().getTag(ItemTags.create(new ResourceLocation(MOD_ID, "paper_plants"))).getKey()), 2)
                .unlockedBy("has_crop", has(ForgeRegistries.ITEMS.tags().getTag(ItemTags.create(new ResourceLocation(MOD_ID, "paper_plants"))).getKey()))
                .save(consumer, "paper_x2_paper_plants");

        ShapelessRecipeBuilder.shapeless(Items.STRING)
                .requires(Ingredient.of(
                        ForgeRegistries.ITEMS.tags().getTag(ItemTags.create(new ResourceLocation(MOD_ID, "fiber"))).getKey()), 2)
                .unlockedBy("has_crop", has(ForgeRegistries.ITEMS.tags().getTag(ItemTags.create(new ResourceLocation(MOD_ID, "fiber"))).getKey()))
                .save(consumer, "string_fiber");

        ShapelessRecipeBuilder.shapeless(Items.SUGAR)
                .requires(Ingredient.of(
                        ForgeRegistries.ITEMS.tags().getTag(ItemTags.create(new ResourceLocation(MOD_ID, "crops/agave"))).getKey()), 2)
                .unlockedBy("has_crop", has(ForgeRegistries.ITEMS.tags().getTag(ItemTags.create(new ResourceLocation(MOD_ID, "crops/agave"))).getKey()))
                .save(consumer, "sugar_x2_agave");
    }

    private void createCookingRecipes(Item input, Item result, Consumer<FinishedRecipe> consumer){
        createCamfire(input, result, consumer, "crops");
        createSmoker(input, result, consumer, "crops");
        createSmelting(input, result, consumer, "crops");
    }

    private void createShapelessItemToSeed(Item input, Item result, Consumer<FinishedRecipe> consumer){
        ShapelessRecipeBuilder.shapeless(result)
                .requires(input)
                .unlockedBy("has_crop", inventoryTrigger(ItemPredicate.Builder.item().of(input).build()))
                .save(consumer);
    }

    private void createCamfire(Item input, Item output, Consumer<FinishedRecipe> consumer){
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(ForgeRegistries.ITEMS.tags().getTag(ItemTags.create(new ResourceLocation(MOD_ID, getTagName(input.getRegistryName().getPath())))).getKey()), output, 0.35f, 600)
                .unlockedBy("has_crop", inventoryTrigger(ItemPredicate.Builder.item().of(input).build()))
                .save(consumer, output.getRegistryName() + "_campfire");
    }

    private void createCamfire(Item input, Item output, Consumer<FinishedRecipe> consumer, String tagFolder){
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(ForgeRegistries.ITEMS.tags().getTag(ItemTags.create(new ResourceLocation(MOD_ID, tagFolder + "/" + getTagName(input.getRegistryName().getPath())))).getKey()), output, 0.35f, 600)
                .unlockedBy("has_crop", inventoryTrigger(ItemPredicate.Builder.item().of(input).build()))
                .save(consumer, output.getRegistryName() + "_campfire");
    }

    private void createSmoker(Item input, Item output, Consumer<FinishedRecipe> consumer, String tagFolder){
        SimpleCookingRecipeBuilder.smoking(Ingredient.of(ForgeRegistries.ITEMS.tags().getTag(ItemTags.create(new ResourceLocation(MOD_ID, tagFolder + "/" + getTagName(input.getRegistryName().getPath())))).getKey()), output, 0.35f, 100)
                .unlockedBy("has_crop", inventoryTrigger(ItemPredicate.Builder.item().of(input).build()))
                .save(consumer, output.getRegistryName() + "_smoker");
    }

    private void createSmelting(Item input, Item output, Consumer<FinishedRecipe> consumer, String tagFolder){
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ForgeRegistries.ITEMS.tags().getTag(ItemTags.create(new ResourceLocation(MOD_ID, tagFolder + "/" + getTagName(input.getRegistryName().getPath())))).getKey()), output, 0.35f, 200)
                .unlockedBy("has_crop", inventoryTrigger(ItemPredicate.Builder.item().of(input).build()))
                .save(consumer, output.getRegistryName() + "_forge");
    }

    private String getTagName(String name){
        if(name.contains("item")){
            return name.substring(0, name.length() - 4);
        }
        return name;
    }


}
