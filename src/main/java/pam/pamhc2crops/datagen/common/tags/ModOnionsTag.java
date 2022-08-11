package pam.pamhc2crops.datagen.common.tags;

import static pam.pamhc2crops.init.ItemRegistry.*;

public class ModOnionsTag extends ModTags{
    public ModOnionsTag() {
        super("onions");
        createTagWithItem(onionitem.get());
        createTagWithItem(scallionitem.get());
    }
}
