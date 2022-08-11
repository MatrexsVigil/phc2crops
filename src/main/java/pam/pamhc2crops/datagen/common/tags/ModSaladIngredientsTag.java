package pam.pamhc2crops.datagen.common.tags;

import static pam.pamhc2crops.init.ItemRegistry.*;

public class ModSaladIngredientsTag extends ModTags{
    public ModSaladIngredientsTag() {
        super("salad_ingredients");
        createTagWithItem(artichokeitem.get());
        createTagWithItem(asparagusitem.get());
        createTagWithItem(broccoliitem.get());
        createTagWithItem(brusselsproutitem.get());
        createTagWithItem(cabbageitem.get());
        createTagWithItem(caulifloweritem.get());
        createTagWithItem(cucumberitem.get());
        createTagWithItem(kaleitem.get());
        createTagWithItem(lettuceitem.get());
        createTagWithItem("pea", peasitem.get());
        createTagWithItem(peasitem.get());
        createTagWithItem(spinachitem.get());
        createTagWithItem(tomatilloitem.get());
        createTagWithItem(tomatoitem.get());
        createTagWithItem(zucchiniitem.get());
    }
}
