package pam.pamhc2crops.datagen.common;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;
import pam.pamhc2crops.Pamhc2crops;

public class ModBlockTags extends BlockTagsProvider {
    public ModBlockTags(DataGenerator p_126511_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_126511_, Pamhc2crops.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags() {

    }
}
