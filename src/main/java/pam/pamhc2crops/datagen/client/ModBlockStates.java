package pam.pamhc2crops.datagen.client;

import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.common.data.ExistingFileHelper;
import pam.pamhc2crops.Pamhc2crops;
import pam.pamhc2crops.blocks.BlockPamCrop;
import pam.pamhc2crops.init.BlockRegistry;

import java.util.function.Function;

public class ModBlockStates extends BlockStateProvider {
    public ModBlockStates(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, Pamhc2crops.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        registerGardens();
        registerCrops();
    }

    public void registerCrops(){
        makeCrop((BlockPamCrop) BlockRegistry.pamagavecrop.get(), "agave_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pamamaranthcrop.get(), "amaranth_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pamarrowrootcrop.get(), "arrowroot_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pamartichokecrop.get(), "artichoke_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pamasparaguscrop.get(), "asparagus_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pambarleycrop.get(), "barley_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pambeancrop.get(), "bean_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pambellpeppercrop.get(), "bellpepper_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pamblackberrycrop.get(), "blackberry_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pamblueberrycrop.get(), "blueberry_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pambroccolicrop.get(), "broccoli_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pambrusselsproutcrop.get(), "brusselsprout_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pamcabbagecrop.get(), "cabbage_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pamcactusfruitcrop.get(), "cactusfruit_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pamcandleberrycrop.get(), "candleberry_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pamcantaloupecrop.get(), "cantaloupe_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pamcassavacrop.get(), "cassava_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pamcauliflowercrop.get(), "cauliflower_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pamcelerycrop.get(), "celery_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pamchickpeacrop.get(), "chickpea_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pamchilipeppercrop.get(), "chilipepper_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pamcoffeebeancrop.get(), "coffeebean_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pamcorncrop.get(), "corn_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pamcottoncrop.get(), "cotton_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pamcranberrycrop.get(), "cranberry_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pamcucumbercrop.get(), "cucumber_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pameggplantcrop.get(), "eggplant_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pamelderberrycrop.get(), "elderberry_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pamflaxcrop.get(), "flax_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pamgarliccrop.get(), "garlic_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pamgingercrop.get(), "ginger_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pamgrapecrop.get(), "grape_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pamgreengrapecrop.get(), "greengrape_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pamhuckleberrycrop.get(), "huckleberry_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pamjicamacrop.get(), "jicama_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pamjuniperberrycrop.get(), "juniperberry_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pamjutecrop.get(), "jute_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pamkalecrop.get(), "kale_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pamkenafcrop.get(), "kenaf_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pamkiwicrop.get(), "kiwi_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pamkohlrabicrop.get(), "kohlrabi_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pamleekcrop.get(), "leek_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pamlentilcrop.get(), "lentil_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pamlettucecrop.get(), "lettuce_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pammilletcrop.get(), "millet_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pammulberrycrop.get(), "mulberry_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pammustardseedscrop.get(), "mustardseeds_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pamoatscrop.get(), "oats_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pamokracrop.get(), "okra_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pamonioncrop.get(), "onion_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pamparsnipcrop.get(), "parsnip_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pampeanutcrop.get(), "peanut_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pampeascrop.get(), "peas_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pampineapplecrop.get(), "pineapple_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pamquinoacrop.get(), "quinoa_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pamradishcrop.get(), "radish_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pamraspberrycrop.get(), "raspberry_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pamrhubarbcrop.get(), "rhubarb_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pamricecrop.get(), "rice_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pamrutabagacrop.get(), "rutabaga_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pamryecrop.get(), "rye_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pamscallioncrop.get(), "scallion_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pamsesameseedscrop.get(), "sesameseeds_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pamsisalcrop.get(), "sisal_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pamsoybeancrop.get(), "soybean_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pamspiceleafcrop.get(), "spiceleaf_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pamspinachcrop.get(), "spinach_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pamstrawberrycrop.get(), "strawberry_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pamsweetpotatocrop.get(), "sweetpotato_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pamtarocrop.get(), "taro_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pamtealeafcrop.get(), "tealeaf_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pamtomatillocrop.get(), "tomatillo_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pamtomatocrop.get(), "tomato_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pamturnipcrop.get(), "turnip_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pamwaterchestnutcrop.get(), "waterchestnut_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pamwhitemushroomcrop.get(), "whitemushroom_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pamwintersquashcrop.get(), "wintersquash_stage");
        makeCrop((BlockPamCrop) BlockRegistry.pamzucchinicrop.get(), "zucchini_stage");
    }

    public void registerGardens(){
        makeGarden(BlockRegistry.aridgarden.get());
        makeGarden(BlockRegistry.frostgarden.get());
        makeGarden(BlockRegistry.shadedgarden.get());
        makeGarden(BlockRegistry.soggygarden.get());
        makeGarden(BlockRegistry.tropicalgarden.get());
        makeGarden(BlockRegistry.windygarden.get());
    }

    private void makeGarden(Block garden){
        simpleBlock(garden, models().cross(garden.getRegistryName().getPath(), blockTexture(garden)));
    }

    public void makeCrop(CropBlock block, String modelName) {
        Function<BlockState, ConfiguredModel[]> function = state -> states(state, block, modelName, modelName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] states(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().crop(modelName + "_" + getModifiedStage(state.getValue(block.getAgeProperty())),
                new ResourceLocation(Pamhc2crops.MOD_ID, "block/" + textureName + "_" + getModifiedStage(state.getValue(block.getAgeProperty())))));

        return models;
    }

    private int getModifiedStage(int value) {
        switch (value){
            case 0:
                return 0;
            case 7:
                return 3;
            default:
                return 1;
        }
    }
}
