package pam.pamhc2crops.datagen.common.tags;

import static pam.pamhc2crops.init.ItemRegistry.peanutitem;

public class ModNutsTag extends ModTags{
    public ModNutsTag() {
        super("nuts");
        createTagWithItem(peanutitem.get());
    }
}
