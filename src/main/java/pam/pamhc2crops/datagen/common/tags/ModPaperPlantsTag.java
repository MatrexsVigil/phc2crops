package pam.pamhc2crops.datagen.common.tags;


import net.minecraft.world.item.Items;

import static pam.pamhc2crops.init.ItemRegistry.*;

public class ModPaperPlantsTag extends ModTags {

    public ModPaperPlantsTag() {
        super("paper_plants");
        createTagWithItem(blackberryitem.get());
        createTagWithItem(juniperberryitem.get());
        createTagWithItem(Items.KELP);
        createTagWithItem(mulberryitem.get());
        createTagWithItem(okraitem.get());
        createTagWithItem(pineappleitem.get());
        createTagWithItem(raspberryitem.get());
        createTagWithItem(riceitem.get());
        createTagWithItem(spiceleafitem.get());
    }
}
