package pam.pamhc2crops.datagen.common.tags;

import static pam.pamhc2crops.init.ItemRegistry.*;

public class ModProteinTag extends ModTags{
    public ModProteinTag() {
        super("protein");
        createTagWithItem(cornitem.get());
        createTagWithItem(peanutitem.get());
        createTagWithItem(quinoaitem.get());
        createTagWithItem(riceitem.get());
        createTagWithItem(spinachitem.get());
        createTagWithItem("sweet_potato", sweetpotatoitem.get());
        createTagWithItem(sweetpotatoitem.get());
    }
}
