package pam.pamhc2crops.datagen.common.tags;

import static pam.pamhc2crops.init.ItemRegistry.*;

public class ModRootVegetablesTag extends ModTags{
    public ModRootVegetablesTag() {
        super("rootvegetables");
        createTagWithItem(arrowrootitem.get());
        createTagWithItem(cassavaitem.get());
        createTagWithItem(garlicitem.get());
        createTagWithItem(jicamaitem.get());
        createTagWithItem(kohlrabiitem.get());
        createTagWithItem(leekitem.get());
        createTagWithItem(onionitem.get());
        createTagWithItem(parsnipitem.get());
        createTagWithItem(peanutitem.get());
        createTagWithItem(radishitem.get());
        createTagWithItem(rhubarbitem.get());
        createTagWithItem(rutabagaitem.get());
        createTagWithItem(scallionitem.get());
        createTagWithItem("sweet_potato", sweetpotatoitem.get());
        createTagWithItem(sweetpotatoitem.get());
        createTagWithItem(taroitem.get());
        createTagWithItem(turnipitem.get());
        createTagWithItem(waterchestnutitem.get());
    }
}
