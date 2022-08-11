package pam.pamhc2crops.datagen.common.tags;

import static pam.pamhc2crops.init.ItemRegistry.*;


public class ModFiberTag extends ModTags{
    public ModFiberTag() {
        super("fiber");
        createTagWithItem(cottonitem.get());
        createTagWithItem(flaxitem.get());
        createTagWithItem(juteitem.get());
        createTagWithItem(kenafitem.get());
        createTagWithItem(sisalitem.get());
    }
}
