package pam.pamhc2crops.datagen.common;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;
import pam.pamhc2crops.Pamhc2crops;
import pam.pamhc2crops.datagen.common.tags.*;

public class ModItemTags extends ItemTagsProvider {
    public ModItemTags(DataGenerator generator, BlockTagsProvider blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(generator, blockTags, Pamhc2crops.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        registerTags(new ModCarbsTag());
        registerTags(new ModFiberTag());
        registerTags(new ModCropsTag());
        registerTags(new ModFruitsTag());
        registerTags(new ModGrainTag());
        registerTags(new ModLeafyVegatablesTag());
        registerTags(new ModMushroomsTag());
        registerTags(new ModNutsTag());
        registerTags(new ModOnionsTag());
        registerTags(new ModPaperPlantsTag());
        registerTags(new ModPeppersTag());
        registerTags(new ModProteinTag());
        registerTags(new ModRootVegetablesTag());
        registerTags(new ModSaladIngredientsTag());
        registerTags(new ModSeedsTag());
        registerTags(new ModVegetablesTag());
        registerTags(new ModVinegarIngredientsTag());

    }

    private void registerTags(ModTags tags){
        tags.getPairList().forEach(pair -> tag(pair.getFirst()).add(pair.getSecond()));
        tags.getPairList().forEach(pair -> tag(tags.getFolderKey()).addTag(pair.getFirst()));
    }
}
