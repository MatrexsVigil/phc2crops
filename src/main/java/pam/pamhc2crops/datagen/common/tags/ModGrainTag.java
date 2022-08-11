package pam.pamhc2crops.datagen.common.tags;

import net.minecraft.world.item.Items;

import static pam.pamhc2crops.init.ItemRegistry.*;

public class ModGrainTag extends ModTags{
    public ModGrainTag() {
        super("grain");
        createTagWithItem(amaranthitem.get());
        createTagWithItem(barleyitem.get());
        createTagWithItem(beanitem.get());
        createTagWithItem(chickpeaitem.get());
        createTagWithItem(cornitem.get());
        createTagWithItem(lentilitem.get());
        createTagWithItem("oat", oatsitem.get());
        createTagWithItem(oatsitem.get());
        createTagWithItem(quinoaitem.get());
        createTagWithItem(riceitem.get());
        createTagWithItem(ryeitem.get());
        createTagWithItem(soybeanitem.get());
        createTagWithItem(Items.WHEAT);
    }
}
