package pam.pamhc2crops.datagen.common.tags;

import static pam.pamhc2crops.init.ItemRegistry.*;

public class ModLeafyVegatablesTag extends ModTags{
    public ModLeafyVegatablesTag() {
        super("leafyvegetables");
        createTagWithItem(cabbageitem.get());
        createTagWithItem(kaleitem.get());
        createTagWithItem(lettuceitem.get());
        createTagWithItem(spinachitem.get());
    }
}
