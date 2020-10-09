package pam.pamhc2crops.init;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.ForgeRegistries;
import pam.pamhc2crops.Pamhc2crops;
import pam.pamhc2crops.items.*;

public class ItemRegistry {

	public static Item aridgarden;
	public static Item frostgarden;
	public static Item shadedgarden;
	public static Item soggygarden;
	public static Item tropicalgarden;
	public static Item windygarden;
	
	public static Item agaveitem;
	public static Item amaranthitem;
	public static Item arrowrootitem;
	public static Item artichokeitem;
	public static Item asparagusitem;
	public static Item barleyitem;
	public static Item beanitem;
	public static Item bellpepperitem;
	public static Item blackberryitem;
	public static Item blueberryitem;
	public static Item broccoliitem;
	public static Item brusselsproutitem;
	public static Item cabbageitem;
	public static Item cactusfruititem;
	public static Item candleberryitem;
	public static Item cantaloupeitem;
	public static Item cassavaitem;
	public static Item caulifloweritem;
	public static Item celeryitem;
	public static Item chickpeaitem;
	public static Item chilipepperitem;
	public static Item coffeebeanitem;
	public static Item cornitem;
	public static Item cottonitem;
	public static Item cranberryitem;
	public static Item cucumberitem;
	public static Item curryleafitem;
	public static Item eggplantitem;
	public static Item elderberryitem;
	public static Item flaxitem;
	public static Item garlicitem;
	public static Item gingeritem;
	public static Item grapeitem;
	public static Item greengrapeitem;
	public static Item huckleberryitem;
	public static Item jicamaitem;
	public static Item juniperberryitem;
	public static Item juteitem;
	public static Item kaleitem;
	public static Item kenafitem;
	public static Item kiwiitem;
	public static Item kohlrabiitem;
	public static Item leekitem;
	public static Item lentilitem;
	public static Item lettuceitem;
	public static Item milletitem;
	public static Item mulberryitem;
	public static Item mustardseedsitem;
	public static Item oatsitem;
	public static Item okraitem;
	public static Item onionitem;
	public static Item parsnipitem;
	public static Item peanutitem;
	public static Item peasitem;
	public static Item pineappleitem;
	public static Item quinoaitem;
	public static Item radishitem;
	public static Item raspberryitem;
	public static Item rhubarbitem;
	public static Item riceitem;
	public static Item rutabagaitem;
	public static Item ryeitem;
	public static Item scallionitem;
	public static Item sesameseedsitem;
	public static Item sisalitem;
	public static Item soybeanitem;
	public static Item spiceleafitem;
	public static Item spinachitem;
	public static Item strawberryitem;
	public static Item sweetpotatoitem;
	public static Item taroitem;
	public static Item tealeafitem;
	public static Item tomatilloitem;
	public static Item tomatoitem;
	public static Item turnipitem;
	public static Item waterchestnutitem;
	public static Item whitemushroomitem;
	public static Item wintersquashitem;
	public static Item zucchiniitem;
	
	public static Item bakedarrowrootitem;
	public static Item bakedcassavaitem;
	public static Item roastedgarlicitem;
	public static Item bakedjicamaitem;
	public static Item roastedleekitem;
	public static Item roastedkohlrabiitem;
	public static Item roastedonionitem;
	public static Item bakedparsnipitem;
	public static Item roastedpeanutitem;
	public static Item roastedradishitem;
	public static Item roastedrhubarbitem;
	public static Item bakedrutabagaitem;
	public static Item roastedscallionitem;
	public static Item bakedsweetpotatoitem;
	public static Item bakedtaroitem;
	public static Item bakedturnipitem;
	public static Item bakedwaterchestnutitem;
	public static Item roastedmushroomitem;
	public static Item hotteaitem;
	public static Item hotcoffeeitem;

	
	public static Item agaveseeditem;
	public static Item amaranthseeditem;
	public static Item arrowrootseeditem;
	public static Item artichokeseeditem;
	public static Item asparagusseeditem;
	public static Item barleyseeditem;
	public static Item beanseeditem;
	public static Item bellpepperseeditem;
	public static Item blackberryseeditem;
	public static Item blueberryseeditem;
	public static Item broccoliseeditem;
	public static Item brusselsproutseeditem;
	public static Item cabbageseeditem;
	public static Item cactusfruitseeditem;
	public static Item candleberryseeditem;
	public static Item cantaloupeseeditem;
	public static Item cassavaseeditem;
	public static Item cauliflowerseeditem;
	public static Item celeryseeditem;
	public static Item chickpeaseeditem;
	public static Item chilipepperseeditem;
	public static Item coffeebeanseeditem;
	public static Item cornseeditem;
	public static Item cottonseeditem;
	public static Item cranberryseeditem;
	public static Item cucumberseeditem;
	public static Item curryleafseeditem;
	public static Item eggplantseeditem;
	public static Item elderberryseeditem;
	public static Item flaxseeditem;
	public static Item garlicseeditem;
	public static Item gingerseeditem;
	public static Item grapeseeditem;
	public static Item greengrapeseeditem;
	public static Item huckleberryseeditem;
	public static Item jicamaseeditem;
	public static Item juniperberryseeditem;
	public static Item juteseeditem;
	public static Item kaleseeditem;
	public static Item kenafseeditem;
	public static Item kiwiseeditem;
	public static Item kohlrabiseeditem;
	public static Item leekseeditem;
	public static Item lentilseeditem;
	public static Item lettuceseeditem;
	public static Item milletseeditem;
	public static Item mulberryseeditem;
	public static Item mustardseedsseeditem;
	public static Item oatsseeditem;
	public static Item okraseeditem;
	public static Item onionseeditem;
	public static Item parsnipseeditem;
	public static Item peanutseeditem;
	public static Item peasseeditem;
	public static Item pineappleseeditem;
	public static Item quinoaseeditem;
	public static Item radishseeditem;
	public static Item raspberryseeditem;
	public static Item rhubarbseeditem;
	public static Item riceseeditem;
	public static Item rutabagaseeditem;
	public static Item ryeseeditem;
	public static Item scallionseeditem;
	public static Item sesameseedsseeditem;
	public static Item sisalseeditem;
	public static Item soybeanseeditem;
	public static Item spiceleafseeditem;
	public static Item spinachseeditem;
	public static Item strawberryseeditem;
	public static Item sweetpotatoseeditem;
	public static Item taroseeditem;
	public static Item tealeafseeditem;
	public static Item tomatilloseeditem;
	public static Item tomatoseeditem;
	public static Item turnipseeditem;
	public static Item waterchestnutseeditem;
	public static Item whitemushroomseeditem;
	public static Item wintersquashseeditem;
	public static Item zucchiniseeditem;
	
	
	
	

	public static void registerAll(RegistryEvent.Register<Item> event) {
		if (!event.getName().equals(ForgeRegistries.ITEMS.getRegistryName()))
			return;
		
		//Garden Item Blocks
		aridgarden = register("aridgarden",new BlockItem(BlockRegistry.aridgarden, new Item.Properties().group(Pamhc2crops.ITEM_GROUP)));
		frostgarden = register("frostgarden",new BlockItem(BlockRegistry.frostgarden, new Item.Properties().group(Pamhc2crops.ITEM_GROUP)));
		shadedgarden = register("shadedgarden",new BlockItem(BlockRegistry.shadedgarden, new Item.Properties().group(Pamhc2crops.ITEM_GROUP)));
		soggygarden = register("soggygarden",new BlockItem(BlockRegistry.soggygarden, new Item.Properties().group(Pamhc2crops.ITEM_GROUP)));
		tropicalgarden = register("tropicalgarden",new BlockItem(BlockRegistry.tropicalgarden, new Item.Properties().group(Pamhc2crops.ITEM_GROUP)));
		windygarden = register("windygarden",new BlockItem(BlockRegistry.windygarden, new Item.Properties().group(Pamhc2crops.ITEM_GROUP)));

		//Grains
		amaranthitem = register("amaranthitem", new ItemPamGrain(BlockRegistry.pamamaranthcrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		barleyitem = register("barleyitem", new ItemPamGrain(BlockRegistry.pambarleycrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		beanitem = register("beanitem", new ItemPamGrain(BlockRegistry.pambeancrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		chickpeaitem = register("chickpeaitem", new ItemPamGrain(BlockRegistry.pamchickpeacrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		cornitem = register("cornitem", new ItemPamGrain(BlockRegistry.pamcorncrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		lentilitem = register("lentilitem", new ItemPamGrain(BlockRegistry.pamlentilcrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		milletitem = register("milletitem", new ItemPamGrain(BlockRegistry.pammilletcrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		oatsitem = register("oatsitem", new ItemPamGrain(BlockRegistry.pamoatscrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		quinoaitem = register("quinoaitem", new ItemPamGrain(BlockRegistry.pamquinoacrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		riceitem = register("riceitem", new ItemPamGrain(BlockRegistry.pamricecrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		ryeitem = register("ryeitem", new ItemPamGrain(BlockRegistry.pamryecrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		soybeanitem = register("soybeanitem", new ItemPamGrain(BlockRegistry.pamsoybeancrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		
		//Fiber
		cottonitem = register("cottonitem", new ItemPamFoodSeed(BlockRegistry.pamcottoncrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		flaxitem = register("flaxitem", new ItemPamFoodSeed(BlockRegistry.pamflaxcrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		kenafitem = register("kenafitem", new ItemPamFoodSeed(BlockRegistry.pamkenafcrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		juteitem = register("juteitem", new ItemPamFoodSeed(BlockRegistry.pamjutecrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		sisalitem = register("sisalitem", new ItemPamFoodSeed(BlockRegistry.pamsisalcrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		
		//Vegetables
		artichokeitem = register("artichokeitem", new ItemPamPig(BlockRegistry.pamartichokecrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.ARTICHOKEITEM)));
		asparagusitem = register("asparagusitem", new ItemPamPig(BlockRegistry.pamasparaguscrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.ASPARAGUSITEM)));
		bellpepperitem = register("bellpepperitem", new ItemPamPig(BlockRegistry.pambellpeppercrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.BELLPEPPERITEM)));
		broccoliitem = register("broccoliitem", new ItemPamPig(BlockRegistry.pambroccolicrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.BROCCOLIITEM)));
		brusselsproutitem = register("brusselsproutitem", new ItemPamPig(BlockRegistry.pambrusselsproutcrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.BRUSSELSPROUTITEM)));
		cabbageitem = register("cabbageitem", new ItemPamPig(BlockRegistry.pamcabbagecrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.CABBAGEITEM)));
		caulifloweritem = register("caulifloweritem", new ItemPamPig(BlockRegistry.pamcauliflowercrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.CAULIFLOWERITEM)));
		celeryitem = register("celeryitem", new ItemPamPig(BlockRegistry.pamcelerycrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.CELERYITEM)));
		chilipepperitem = register("chilipepperitem", new ItemPamPig(BlockRegistry.pamchilipeppercrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.CHILIPEPPERITEM)));
		cucumberitem = register("cucumberitem", new ItemPamPig(BlockRegistry.pamcucumbercrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.CUCUMBERITEM)));
		eggplantitem = register("eggplantitem", new ItemPamPig(BlockRegistry.pameggplantcrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.EGGPLANTITEM)));
		kaleitem = register("kaleitem", new ItemPamPig(BlockRegistry.pamkalecrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.KALEITEM)));	
		lettuceitem = register("lettuceitem", new ItemPamPig(BlockRegistry.pamlettucecrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.LETTUCEITEM)));
		okraitem = register("okraitem", new ItemPamPig(BlockRegistry.pamokracrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.OKRAITEM)));
		peasitem = register("peasitem", new ItemPamPig(BlockRegistry.pampeascrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.PEASITEM)));
		spinachitem	= register("spinachitem", new ItemPamPig(BlockRegistry.pamspinachcrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.SPINACHITEM)));	
		tomatilloitem = register("tomatilloitem", new ItemPamPig(BlockRegistry.pamtomatillocrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.TOMATILLOITEM)));
		tomatoitem = register("tomatoitem", new ItemPamPig(BlockRegistry.pamtomatocrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.TOMATOITEM)));	
		wintersquashitem = register("wintersquashitem", new ItemPamPig(BlockRegistry.pamwintersquashcrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.WINTERSQUASHITEM)));
		zucchiniitem = register("zucchiniitem", new ItemPamPig(BlockRegistry.pamzucchinicrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.ZUCCHINIITEM)));
		
		//Root Vegetable
		arrowrootitem = register("arrowrootitem", new ItemPamPig(BlockRegistry.pamarrowrootcrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.ARROWROOTITEM)));
		cassavaitem = register("cassavaitem", new ItemPamPig(BlockRegistry.pamcassavacrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.CASSAVAITEM)));
		garlicitem = register("garlicitem", new ItemPamPig(BlockRegistry.pamgarliccrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.GARLICITEM)));
		jicamaitem = register("jicamaitem", new ItemPamPig(BlockRegistry.pamjicamacrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.JICAMAITEM)));
		leekitem = register("leekitem", new ItemPamPig(BlockRegistry.pamleekcrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.LEEKITEM)));
		kohlrabiitem = register("kohlrabiitem", new ItemPamPig(BlockRegistry.pamkohlrabicrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.KOHLRABIITEM)));
		onionitem = register("onionitem", new ItemPamPig(BlockRegistry.pamonioncrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.ONIONITEM)));
		parsnipitem = register("parsnipitem", new ItemPamPig(BlockRegistry.pamparsnipcrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.PARSNIPITEM)));
		peanutitem = register("peanutitem", new ItemPamPig(BlockRegistry.pampeanutcrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.PEANUTITEM)));
		radishitem = register("radishitem", new ItemPamPig(BlockRegistry.pamradishcrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.RADISHITEM)));
		rhubarbitem	 = register("rhubarbitem", new ItemPamPig(BlockRegistry.pamrhubarbcrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.RHUBARBITEM)));
		rutabagaitem = register("rutabagaitem", new ItemPamPig(BlockRegistry.pamrutabagacrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.RUTABAGAITEM)));
		scallionitem = register("scallionitem", new ItemPamPig(BlockRegistry.pamscallioncrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.SCALLIONITEM)));
		sweetpotatoitem = register("sweetpotatoitem", new ItemPamPig(BlockRegistry.pamsweetpotatocrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.SWEETPOTATOITEM)));
		taroitem = register("taroitem", new ItemPamPig(BlockRegistry.pamtarocrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.TAROITEM)));
		turnipitem = register("turnipitem", new ItemPamPig(BlockRegistry.pamturnipcrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.TURNIPITEM)));
		waterchestnutitem = register("waterchestnutitem", new ItemPamPig(BlockRegistry.pamwaterchestnutcrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.WATERCHESTNUTITEM)));
		
		//Fruits
		blackberryitem = register("blackberryitem", new ItemPamRabbit(BlockRegistry.pamblackberrycrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.BLACKBERRYITEM)));
		blueberryitem = register("blueberryitem", new ItemPamRabbit(BlockRegistry.pamblueberrycrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.BLUEBERRYITEM)));
		cactusfruititem = register("cactusfruititem", new ItemPamRabbit(BlockRegistry.pamcactusfruitcrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.CACTUSFRUITITEM)));
		candleberryitem = register("candleberryitem", new ItemPamRabbit(BlockRegistry.pamcandleberrycrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.CANDLEBERRYITEM)));
		cantaloupeitem = register("cantaloupeitem", new ItemPamRabbit(BlockRegistry.pamcantaloupecrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.CANTALOUPEITEM)));
		cranberryitem = register("cranberryitem", new ItemPamRabbit(BlockRegistry.pamcranberrycrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.CRANBERRYITEM)));
		elderberryitem = register("elderberryitem", new ItemPamRabbit(BlockRegistry.pamelderberrycrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.ELDERBERRYITEM)));
		grapeitem = register("grapeitem", new ItemPamRabbit(BlockRegistry.pamgrapecrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.GRAPEITEM)));
		greengrapeitem = register("greengrapeitem", new ItemPamRabbit(BlockRegistry.pamgreengrapecrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.GREENGRAPEITEM)));
		huckleberryitem = register("huckleberryitem", new ItemPamRabbit(BlockRegistry.pamhuckleberrycrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.HUCKLEBERRYITEM)));
		juniperberryitem = register("juniperberryitem", new ItemPamRabbit(BlockRegistry.pamjuniperberrycrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.JUNIPERBERRYITEM)));
		kiwiitem = register("kiwiitem", new ItemPamRabbit(BlockRegistry.pamkiwicrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.KIWIITEM)));
		mulberryitem = register("mulberryitem", new ItemPamRabbit(BlockRegistry.pammulberrycrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.MULBERRYITEM)));
		pineappleitem = register("pineappleitem", new ItemPamRabbit(BlockRegistry.pampineapplecrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.PINEAPPLEITEM)));
		raspberryitem = register("raspberryitem", new ItemPamRabbit(BlockRegistry.pamraspberrycrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.RASPBERRYITEM)));
		strawberryitem = register("strawberryitem", new ItemPamRabbit(BlockRegistry.pamstrawberrycrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.STRAWBERRYITEM)));
		
		//Misc
		
		//Drink
		coffeebeanitem = register("coffeebeanitem", new ItemPamFoodSeed(BlockRegistry.pamcoffeebeancrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		tealeafitem = register("tealeafitem", new ItemPamFoodSeed(BlockRegistry.pamtealeafcrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		//Sugar
		agaveitem = register("agaveitem", new ItemPamFoodSeed(BlockRegistry.pamagavecrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		//Mushroom
		whitemushroomitem = register("whitemushroomitem", new ItemPamFoodSeed(BlockRegistry.pamwhitemushroomcrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.WHITEMUSHROOMITEM)));//EDIBLE
		//Spice
		gingeritem = register("gingeritem", new ItemPamFoodSeed(BlockRegistry.pamgingercrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		sesameseedsitem = register("sesameseedsitem", new ItemPamFoodSeed(BlockRegistry.pamsesameseedscrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		spiceleafitem = register("spiceleafitem", new ItemPamRabbit(BlockRegistry.pamspiceleafcrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.SPICELEAF)));//EDIBLE
		mustardseedsitem = register("mustardseedsitem", new ItemPamGrain(BlockRegistry.pammustardseedscrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));

		//Foods
		bakedarrowrootitem = register("bakedarrowrootitem", new Item((new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.BAKEDARROWROOTITEM)));
		bakedcassavaitem = register("bakedcassavaitem", new Item((new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.BAKEDCASSAVAITEM)));
		roastedgarlicitem = register("roastedgarlicitem", new Item((new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.ROASTEDGARLICITEM)));
		bakedjicamaitem = register("bakedjicamaitem", new Item((new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.BAKEDJICAMAITEM)));
		roastedleekitem = register("roastedleekitem", new Item((new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.ROASTEDLEEKITEM)));
		roastedkohlrabiitem = register("roastedkohlrabiitem", new Item((new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.ROASTEDKOHLRABIITEM)));
		roastedonionitem = register("roastedonionitem", new Item((new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.ROASTEDONIONITEM)));
		bakedparsnipitem = register("bakedparsnipitem", new Item((new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.BAKEDPARSNIPITEM)));
		roastedpeanutitem = register("roastedpeanutitem", new Item((new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.ROASTEDPEANUTITEM)));
		roastedradishitem = register("roastedradishitem", new Item((new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.ROASTEDRADISHITEM)));
		roastedrhubarbitem = register("roastedrhubarbitem", new Item((new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.ROASTEDRHUBARBITEM)));
		bakedrutabagaitem = register("bakedrutabagaitem", new Item((new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.BAKEDRUTABAGAITEM)));
		roastedscallionitem = register("roastedscallionitem", new Item((new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.ROASTEDSCALLIONITEM)));
		bakedsweetpotatoitem = register("bakedsweetpotatoitem", new Item((new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.BAKEDSWEETPOTATOITEM)));
		bakedtaroitem = register("bakedtaroitem", new Item((new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.BAKEDTAROITEM)));
		bakedturnipitem = register("bakedturnipitem", new Item((new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.BAKEDTURNIPITEM)));
		bakedwaterchestnutitem = register("bakedwaterchestnutitem", new Item((new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.BAKEDWATERCHESTNUTITEM)));
		roastedmushroomitem = register("roastedmushroomitem", new Item((new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.ROASTEDMUSHROOMITEM)));
		hotteaitem = register("hotteaitem", new Item((new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.HOTTEAITEM)));
		hotcoffeeitem = register("hotcoffeeitem", new Item((new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.HOTCOFFEEITEM)));
		
		//Seeds
		agaveseeditem = register("agaveseeditem", new ItemPamSeed(BlockRegistry.pamagavecrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		amaranthseeditem = register("amaranthseeditem", new ItemPamSeed(BlockRegistry.pamamaranthcrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		arrowrootseeditem = register("arrowrootseeditem", new ItemPamSeed(BlockRegistry.pamarrowrootcrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		artichokeseeditem = register("artichokeseeditem", new ItemPamSeed(BlockRegistry.pamartichokecrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		asparagusseeditem = register("asparagusseeditem", new ItemPamSeed(BlockRegistry.pamasparaguscrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		barleyseeditem = register("barleyseeditem", new ItemPamSeed(BlockRegistry.pambarleycrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		beanseeditem = register("beanseeditem", new ItemPamSeed(BlockRegistry.pambeancrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		bellpepperseeditem = register("bellpepperseeditem", new ItemPamSeed(BlockRegistry.pambellpeppercrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		blackberryseeditem = register("blackberryseeditem", new ItemPamSeed(BlockRegistry.pamblackberrycrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		blueberryseeditem = register("blueberryseeditem", new ItemPamSeed(BlockRegistry.pamblueberrycrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		broccoliseeditem = register("broccoliseeditem", new ItemPamSeed(BlockRegistry.pambroccolicrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		brusselsproutseeditem = register("brusselsproutseeditem", new ItemPamSeed(BlockRegistry.pambrusselsproutcrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		cabbageseeditem = register("cabbageseeditem", new ItemPamSeed(BlockRegistry.pamcabbagecrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		cactusfruitseeditem = register("cactusfruitseeditem", new ItemPamSeed(BlockRegistry.pamcactusfruitcrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		candleberryseeditem = register("candleberryseeditem", new ItemPamSeed(BlockRegistry.pamcandleberrycrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		cantaloupeseeditem = register("cantaloupeseeditem", new ItemPamSeed(BlockRegistry.pamcantaloupecrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		cassavaseeditem = register("cassavaseeditem", new ItemPamSeed(BlockRegistry.pamcassavacrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		cauliflowerseeditem = register("cauliflowerseeditem", new ItemPamSeed(BlockRegistry.pamcauliflowercrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		celeryseeditem = register("celeryseeditem", new ItemPamSeed(BlockRegistry.pamcelerycrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		chickpeaseeditem = register("chickpeaseeditem", new ItemPamSeed(BlockRegistry.pamchickpeacrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		chilipepperseeditem = register("chilipepperseeditem", new ItemPamSeed(BlockRegistry.pamchilipeppercrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		coffeebeanseeditem = register("coffeebeanseeditem", new ItemPamSeed(BlockRegistry.pamcoffeebeancrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		cornseeditem = register("cornseeditem", new ItemPamSeed(BlockRegistry.pamcorncrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		cottonseeditem = register("cottonseeditem", new ItemPamSeed(BlockRegistry.pamcottoncrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		cranberryseeditem = register("cranberryseeditem", new ItemPamSeed(BlockRegistry.pamcranberrycrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		cucumberseeditem = register("cucumberseeditem", new ItemPamSeed(BlockRegistry.pamcucumbercrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		eggplantseeditem = register("eggplantseeditem", new ItemPamSeed(BlockRegistry.pameggplantcrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		elderberryseeditem = register("elderberryseeditem", new ItemPamSeed(BlockRegistry.pamelderberrycrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		flaxseeditem = register("flaxseeditem", new ItemPamSeed(BlockRegistry.pamflaxcrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		garlicseeditem = register("garlicseeditem", new ItemPamSeed(BlockRegistry.pamgarliccrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		gingerseeditem = register("gingerseeditem", new ItemPamSeed(BlockRegistry.pamgingercrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		grapeseeditem = register("grapeseeditem", new ItemPamSeed(BlockRegistry.pamgrapecrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		greengrapeseeditem = register("greengrapeseeditem", new ItemPamSeed(BlockRegistry.pamgreengrapecrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		huckleberryseeditem = register("huckleberryseeditem", new ItemPamSeed(BlockRegistry.pamhuckleberrycrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		jicamaseeditem = register("jicamaseeditem", new ItemPamSeed(BlockRegistry.pamjicamacrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		juniperberryseeditem = register("juniperberryseeditem", new ItemPamSeed(BlockRegistry.pamjuniperberrycrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		juteseeditem = register("juteseeditem", new ItemPamSeed(BlockRegistry.pamjutecrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		kaleseeditem = register("kaleseeditem", new ItemPamSeed(BlockRegistry.pamkalecrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		kenafseeditem = register("kenafseeditem", new ItemPamSeed(BlockRegistry.pamkenafcrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		kiwiseeditem = register("kiwiseeditem", new ItemPamSeed(BlockRegistry.pamkiwicrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		kohlrabiseeditem = register("kohlrabiseeditem", new ItemPamSeed(BlockRegistry.pamkohlrabicrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		leekseeditem = register("leekseeditem", new ItemPamSeed(BlockRegistry.pamleekcrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		lentilseeditem = register("lentilseeditem", new ItemPamSeed(BlockRegistry.pamlentilcrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		lettuceseeditem = register("lettuceseeditem", new ItemPamSeed(BlockRegistry.pamlettucecrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		milletseeditem = register("milletseeditem", new ItemPamSeed(BlockRegistry.pammilletcrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		mulberryseeditem = register("mulberryseeditem", new ItemPamSeed(BlockRegistry.pammulberrycrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		mustardseedsseeditem = register("mustardseedsseeditem", new ItemPamSeed(BlockRegistry.pammustardseedscrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		oatsseeditem = register("oatsseeditem", new ItemPamSeed(BlockRegistry.pamoatscrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		okraseeditem = register("okraseeditem", new ItemPamSeed(BlockRegistry.pamokracrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		onionseeditem = register("onionseeditem", new ItemPamSeed(BlockRegistry.pamonioncrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		parsnipseeditem = register("parsnipseeditem", new ItemPamSeed(BlockRegistry.pamparsnipcrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		peanutseeditem = register("peanutseeditem", new ItemPamSeed(BlockRegistry.pampeanutcrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		peasseeditem = register("peasseeditem", new ItemPamSeed(BlockRegistry.pampeascrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		pineappleseeditem = register("pineappleseeditem", new ItemPamSeed(BlockRegistry.pampineapplecrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		quinoaseeditem = register("quinoaseeditem", new ItemPamSeed(BlockRegistry.pamquinoacrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		radishseeditem = register("radishseeditem", new ItemPamSeed(BlockRegistry.pamradishcrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		raspberryseeditem = register("raspberryseeditem", new ItemPamSeed(BlockRegistry.pamraspberrycrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		rhubarbseeditem = register("rhubarbseeditem", new ItemPamSeed(BlockRegistry.pamrhubarbcrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		riceseeditem = register("riceseeditem", new ItemPamSeed(BlockRegistry.pamricecrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		rutabagaseeditem = register("rutabagaseeditem", new ItemPamSeed(BlockRegistry.pamrutabagacrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		ryeseeditem = register("ryeseeditem", new ItemPamSeed(BlockRegistry.pamryecrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		scallionseeditem = register("scallionseeditem", new ItemPamSeed(BlockRegistry.pamscallioncrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		sesameseedsseeditem = register("sesameseedsseeditem", new ItemPamSeed(BlockRegistry.pamsesameseedscrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		sisalseeditem = register("sisalseeditem", new ItemPamSeed(BlockRegistry.pamsisalcrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		soybeanseeditem = register("soybeanseeditem", new ItemPamSeed(BlockRegistry.pamsoybeancrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		spiceleafseeditem = register("spiceleafseeditem", new ItemPamSeed(BlockRegistry.pamspiceleafcrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		spinachseeditem = register("spinachseeditem", new ItemPamSeed(BlockRegistry.pamspinachcrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		strawberryseeditem = register("strawberryseeditem", new ItemPamSeed(BlockRegistry.pamstrawberrycrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		sweetpotatoseeditem = register("sweetpotatoseeditem", new ItemPamSeed(BlockRegistry.pamsweetpotatocrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		taroseeditem = register("taroseeditem", new ItemPamSeed(BlockRegistry.pamtarocrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		tealeafseeditem = register("tealeafseeditem", new ItemPamSeed(BlockRegistry.pamtealeafcrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		tomatilloseeditem = register("tomatilloseeditem", new ItemPamSeed(BlockRegistry.pamtomatillocrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		tomatoseeditem = register("tomatoseeditem", new ItemPamSeed(BlockRegistry.pamtomatocrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		turnipseeditem = register("turnipseeditem", new ItemPamSeed(BlockRegistry.pamturnipcrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		waterchestnutseeditem = register("waterchestnutseeditem", new ItemPamSeed(BlockRegistry.pamwaterchestnutcrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		whitemushroomseeditem = register("whitemushroomseeditem", new ItemPamSeed(BlockRegistry.pamwhitemushroomcrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		wintersquashseeditem = register("wintersquashseeditem", new ItemPamSeed(BlockRegistry.pamwintersquashcrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		zucchiniseeditem = register("zucchiniseeditem", new ItemPamSeed(BlockRegistry.pamzucchinicrop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		
		
		
	}

	
	private static <T extends Item> T register(String name, T item) {
		ResourceLocation id = Pamhc2crops.getId(name);
		item.setRegistryName(id);
		ForgeRegistries.ITEMS.register(item);
		return item;
	}

	

	
}
