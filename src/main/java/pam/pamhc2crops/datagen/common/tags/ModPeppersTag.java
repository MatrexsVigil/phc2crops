package pam.pamhc2crops.datagen.common.tags;

import static pam.pamhc2crops.init.ItemRegistry.*;


public class ModPeppersTag extends ModTags{
    public ModPeppersTag() {
        super("peppers");
        createTagWithItem(bellpepperitem.get());
        createTagWithItem(chilipepperitem.get());
    }
}
