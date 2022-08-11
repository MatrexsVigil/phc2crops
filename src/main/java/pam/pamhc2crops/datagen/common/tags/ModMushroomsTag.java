package pam.pamhc2crops.datagen.common.tags;

import net.minecraft.world.item.Items;

import static pam.pamhc2crops.init.ItemRegistry.whitemushroomitem;

public class ModMushroomsTag extends ModTags{
    public ModMushroomsTag() {
        super("mushrooms");
        createTagWithItem("brownmushroom", Items.BROWN_MUSHROOM);
        createTagWithItem("redmushroom", Items.RED_MUSHROOM);
        createTagWithItem(whitemushroomitem.get());
    }
}
