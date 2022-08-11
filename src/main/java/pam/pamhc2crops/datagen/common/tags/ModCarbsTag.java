package pam.pamhc2crops.datagen.common.tags;

import static pam.pamhc2crops.init.ItemRegistry.*;

public class ModCarbsTag extends ModTags{
    public ModCarbsTag() {
        super("carbs");
        createTagWithItem(barleyitem.get());
        createTagWithItem(cornitem.get());
        createTagWithItem(oatsitem.get());
        createTagWithItem("oat", oatsitem.get());
        createTagWithItem(riceitem.get());
        createTagWithItem(ryeitem.get());
        createTagWithItem(sweetpotatoitem.get());
        createTagWithItem("sweet_potato", sweetpotatoitem.get());
    }
}
