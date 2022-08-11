package pam.pamhc2crops.datagen.common.tags;

import static pam.pamhc2crops.init.ItemRegistry.*;

public class ModVinegarIngredientsTag extends ModTags{
    public ModVinegarIngredientsTag() {
        super("vinegar_ingredients");
        createTagWithItem(agaveitem.get());
        createTagWithItem(barleyitem.get());
        createTagWithItem("grapes", grapeitem.get());
        createTagWithItem(grapeitem.get());
        createTagWithItem(greengrapeitem.get());
        createTagWithItem(kiwiitem.get());
        createTagWithItem(milletitem.get());
        createTagWithItem(oatsitem.get());
        createTagWithItem("oat", oatsitem.get());
        createTagWithItem(raspberryitem.get());
        createTagWithItem("raspberries", raspberryitem.get());
        createTagWithItem(riceitem.get());
        createTagWithItem(ryeitem.get());
        createTagWithItem(tomatoitem.get());

    }
}
