package pam.pamhc2crops.datagen.common.tags;

import net.minecraft.world.item.Items;

import static pam.pamhc2crops.init.ItemRegistry.*;

public class ModFruitsTag extends ModTags {
    public ModFruitsTag() {
        super("fruits");
        createTagWithItem("blackberries", blackberryitem.get());
        createTagWithItem(blackberryitem.get());
        createTagWithItem("blueberries", blueberryitem.get());
        createTagWithItem(blueberryitem.get());
        createTagWithItem("cactus_fruit", cactusfruititem.get());
        createTagWithItem(cactusfruititem.get());
        createTagWithItem(candleberryitem.get());
        createTagWithItem(cantaloupeitem.get());
        createTagWithItem(cranberryitem.get());
        createTagWithItem(elderberryitem.get());
        createTagWithItem(grapeitem.get());
        createTagWithItem("grapes", grapeitem.get());
        createTagWithItem(greengrapeitem.get());
        createTagWithItem(huckleberryitem.get());
        createTagWithItem(juniperberryitem.get());
        createTagWithItem(kiwiitem.get());
        createTagWithItem("melon", Items.MELON_SLICE);
        createTagWithItem(mulberryitem.get());
        createTagWithItem(pineappleitem.get());
        createTagWithItem("raspberries", raspberryitem.get());
        createTagWithItem(raspberryitem.get());
        createTagWithItem("strawberries", strawberryitem.get());
        createTagWithItem(strawberryitem.get());
        createTagWithItem(Items.SWEET_BERRIES);
    }
}
