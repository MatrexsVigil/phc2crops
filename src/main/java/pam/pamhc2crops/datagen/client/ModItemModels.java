package pam.pamhc2crops.datagen.client;

import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import pam.pamhc2crops.Pamhc2crops;
import pam.pamhc2crops.init.BlockRegistry;

import static pam.pamhc2crops.init.ItemRegistry.*;

public class ModItemModels extends ItemModelProvider {
    public ModItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Pamhc2crops.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        registerCrops();
        registerGardens();
    }

    private void registerGardens(){
        withExistingParentFromItem(aridgarden.get());
        withExistingParentFromItem(frostgarden.get());
        withExistingParentFromItem(shadedgarden.get());
        withExistingParentFromItem(soggygarden.get());
        withExistingParentFromItem(tropicalgarden.get());
        withExistingParentFromItem(windygarden.get());
    }

    private void withExistingParentFromItem(Item item){
        withExistingParent(item.getRegistryName().getPath(), modLoc("block/" + item.toString()));
    }

    private void registerCrops(){
        singleTextureFromItem(agaveitem.get());
        singleTextureFromItem(amaranthitem.get());
        singleTextureFromItem(arrowrootitem.get());
        singleTextureFromItem(artichokeitem.get());
        singleTextureFromItem(asparagusitem.get());
        singleTextureFromItem(barleyitem.get());
        singleTextureFromItem(beanitem.get());
        singleTextureFromItem(bellpepperitem.get());
        singleTextureFromItem(blackberryitem.get());
        singleTextureFromItem(blueberryitem.get());
        singleTextureFromItem(broccoliitem.get());
        singleTextureFromItem(brusselsproutitem.get());
        singleTextureFromItem(cabbageitem.get());
        singleTextureFromItem(cactusfruititem.get());
        singleTextureFromItem(candleberryitem.get());
        singleTextureFromItem(cantaloupeitem.get());
        singleTextureFromItem(cassavaitem.get());
        singleTextureFromItem(caulifloweritem.get());
        singleTextureFromItem(celeryitem.get());
        singleTextureFromItem(chickpeaitem.get());
        singleTextureFromItem(chilipepperitem.get());
        singleTextureFromItem(coffeebeanitem.get());
        singleTextureFromItem(cornitem.get());
        singleTextureFromItem(cottonitem.get());
        singleTextureFromItem(cranberryitem.get());
        singleTextureFromItem(cucumberitem.get());
        singleTextureFromItem(eggplantitem.get());
        singleTextureFromItem(elderberryitem.get());
        singleTextureFromItem(flaxitem.get());
        singleTextureFromItem(garlicitem.get());
        singleTextureFromItem(gingeritem.get());
        singleTextureFromItem(grapeitem.get());
        singleTextureFromItem(greengrapeitem.get());
        singleTextureFromItem(huckleberryitem.get());
        singleTextureFromItem(jicamaitem.get());
        singleTextureFromItem(juniperberryitem.get());
        singleTextureFromItem(juteitem.get());
        singleTextureFromItem(kaleitem.get());
        singleTextureFromItem(kenafitem.get());
        singleTextureFromItem(kiwiitem.get());
        singleTextureFromItem(kohlrabiitem.get());
        singleTextureFromItem(leekitem.get());
        singleTextureFromItem(lentilitem.get());
        singleTextureFromItem(lettuceitem.get());
        singleTextureFromItem(milletitem.get());
        singleTextureFromItem(mulberryitem.get());
        singleTextureFromItem(mustardseedsitem.get());
        singleTextureFromItem(oatsitem.get());
        singleTextureFromItem(okraitem.get());
        singleTextureFromItem(onionitem.get());
        singleTextureFromItem(parsnipitem.get());
        singleTextureFromItem(peanutitem.get());
        singleTextureFromItem(peasitem.get());
        singleTextureFromItem(pineappleitem.get());
        singleTextureFromItem(quinoaitem.get());
        singleTextureFromItem(radishitem.get());
        singleTextureFromItem(raspberryitem.get());
        singleTextureFromItem(rhubarbitem.get());
        singleTextureFromItem(riceitem.get());
        singleTextureFromItem(rutabagaitem.get());
        singleTextureFromItem(ryeitem.get());
        singleTextureFromItem(scallionitem.get());
        singleTextureFromItem(sesameseedsitem.get());
        singleTextureFromItem(sisalitem.get());
        singleTextureFromItem(soybeanitem.get());
        singleTextureFromItem(spiceleafitem.get());
        singleTextureFromItem(spinachitem.get());
        singleTextureFromItem(strawberryitem.get());
        singleTextureFromItem(sweetpotatoitem.get());
        singleTextureFromItem(taroitem.get());
        singleTextureFromItem(tealeafitem.get());
        singleTextureFromItem(tomatilloitem.get());
        singleTextureFromItem(tomatoitem.get());
        singleTextureFromItem(turnipitem.get());
        singleTextureFromItem(waterchestnutitem.get());
        singleTextureFromItem(whitemushroomitem.get());
        singleTextureFromItem(wintersquashitem.get());
        singleTextureFromItem(zucchiniitem.get());

        singleTextureFromItem(bakedarrowrootitem.get());
        singleTextureFromItem(bakedcassavaitem.get());
        singleTextureFromItem(roastedgarlicitem.get());
        singleTextureFromItem(bakedjicamaitem.get());
        singleTextureFromItem(roastedleekitem.get());
        singleTextureFromItem(roastedkohlrabiitem.get());
        singleTextureFromItem(roastedonionitem.get());
        singleTextureFromItem(bakedparsnipitem.get());
        singleTextureFromItem(roastedpeanutitem.get());
        singleTextureFromItem(roastedradishitem.get());
        singleTextureFromItem(roastedrhubarbitem.get());
        singleTextureFromItem(bakedrutabagaitem.get());
        singleTextureFromItem(roastedscallionitem.get());
        singleTextureFromItem(bakedsweetpotatoitem.get());
        singleTextureFromItem(bakedtaroitem.get());
        singleTextureFromItem(bakedturnipitem.get());
        singleTextureFromItem(bakedwaterchestnutitem.get());
        singleTextureFromItem(roastedmushroomitem.get());
        singleTextureFromItem(hotteaitem.get());
        singleTextureFromItem(hotcoffeeitem.get());


        singleTextureFromItem(agaveseeditem.get());
        singleTextureFromItem(amaranthseeditem.get());
        singleTextureFromItem(arrowrootseeditem.get());
        singleTextureFromItem(artichokeseeditem.get());
        singleTextureFromItem(asparagusseeditem.get());
        singleTextureFromItem(barleyseeditem.get());
        singleTextureFromItem(beanseeditem.get());
        singleTextureFromItem(bellpepperseeditem.get());
        singleTextureFromItem(blackberryseeditem.get());
        singleTextureFromItem(blueberryseeditem.get());
        singleTextureFromItem(broccoliseeditem.get());
        singleTextureFromItem(brusselsproutseeditem.get());
        singleTextureFromItem(cabbageseeditem.get());
        singleTextureFromItem(cactusfruitseeditem.get());
        singleTextureFromItem(candleberryseeditem.get());
        singleTextureFromItem(cantaloupeseeditem.get());
        singleTextureFromItem(cassavaseeditem.get());
        singleTextureFromItem(cauliflowerseeditem.get());
        singleTextureFromItem(celeryseeditem.get());
        singleTextureFromItem(chickpeaseeditem.get());
        singleTextureFromItem(chilipepperseeditem.get());
        singleTextureFromItem(coffeebeanseeditem.get());
        singleTextureFromItem(cornseeditem.get());
        singleTextureFromItem(cottonseeditem.get());
        singleTextureFromItem(cranberryseeditem.get());
        singleTextureFromItem(cucumberseeditem.get());
        singleTextureFromItem(eggplantseeditem.get());
        singleTextureFromItem(elderberryseeditem.get());
        singleTextureFromItem(flaxseeditem.get());
        singleTextureFromItem(garlicseeditem.get());
        singleTextureFromItem(gingerseeditem.get());
        singleTextureFromItem(grapeseeditem.get());
        singleTextureFromItem(greengrapeseeditem.get());
        singleTextureFromItem(huckleberryseeditem.get());
        singleTextureFromItem(jicamaseeditem.get());
        singleTextureFromItem(juniperberryseeditem.get());
        singleTextureFromItem(juteseeditem.get());
        singleTextureFromItem(kaleseeditem.get());
        singleTextureFromItem(kenafseeditem.get());
        singleTextureFromItem(kiwiseeditem.get());
        singleTextureFromItem(kohlrabiseeditem.get());
        singleTextureFromItem(leekseeditem.get());
        singleTextureFromItem(lentilseeditem.get());
        singleTextureFromItem(lettuceseeditem.get());
        singleTextureFromItem(milletseeditem.get());
        singleTextureFromItem(mulberryseeditem.get());
        singleTextureFromItem(mustardseedsseeditem.get());
        singleTextureFromItem(oatsseeditem.get());
        singleTextureFromItem(okraseeditem.get());
        singleTextureFromItem(onionseeditem.get());
        singleTextureFromItem(parsnipseeditem.get());
        singleTextureFromItem(peanutseeditem.get());
        singleTextureFromItem(peasseeditem.get());
        singleTextureFromItem(pineappleseeditem.get());
        singleTextureFromItem(quinoaseeditem.get());
        singleTextureFromItem(radishseeditem.get());
        singleTextureFromItem(raspberryseeditem.get());
        singleTextureFromItem(rhubarbseeditem.get());
        singleTextureFromItem(riceseeditem.get());
        singleTextureFromItem(rutabagaseeditem.get());
        singleTextureFromItem(ryeseeditem.get());
        singleTextureFromItem(scallionseeditem.get());
        singleTextureFromItem(sesameseedsseeditem.get());
        singleTextureFromItem(sisalseeditem.get());
        singleTextureFromItem(soybeanseeditem.get());
        singleTextureFromItem(spiceleafseeditem.get());
        singleTextureFromItem(spinachseeditem.get());
        singleTextureFromItem(strawberryseeditem.get());
        singleTextureFromItem(sweetpotatoseeditem.get());
        singleTextureFromItem(taroseeditem.get());
        singleTextureFromItem(tealeafseeditem.get());
        singleTextureFromItem(tomatilloseeditem.get());
        singleTextureFromItem(tomatoseeditem.get());
        singleTextureFromItem(turnipseeditem.get());
        singleTextureFromItem(waterchestnutseeditem.get());
        singleTextureFromItem(whitemushroomseeditem.get());
        singleTextureFromItem(wintersquashseeditem.get());
        singleTextureFromItem(zucchiniseeditem.get());
    }

    private void singleTextureFromItem(Item item){
        singleTexture(item.getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0",
                modLoc("item/" + item.toString()));
    }
}
