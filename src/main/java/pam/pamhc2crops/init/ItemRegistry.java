package pam.pamhc2crops.init;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import pam.pamhc2crops.Pamhc2crops;
import pam.pamhc2crops.items.*;

public class ItemRegistry {

	public static RegistryObject<Item> aridgarden;
	public static RegistryObject<Item> frostgarden;
	public static RegistryObject<Item> shadedgarden;
	public static RegistryObject<Item> soggygarden;
	public static RegistryObject<Item> tropicalgarden;
	public static RegistryObject<Item> windygarden;

	public static RegistryObject<Item> agaveitem;
	public static RegistryObject<Item> amaranthitem;
	public static RegistryObject<Item> arrowrootitem;
	public static RegistryObject<Item> artichokeitem;
	public static RegistryObject<Item> asparagusitem;
	public static RegistryObject<Item> barleyitem;
	public static RegistryObject<Item> beanitem;
	public static RegistryObject<Item> bellpepperitem;
	public static RegistryObject<Item> blackberryitem;
	public static RegistryObject<Item> blueberryitem;
	public static RegistryObject<Item> broccoliitem;
	public static RegistryObject<Item> brusselsproutitem;
	public static RegistryObject<Item> cabbageitem;
	public static RegistryObject<Item> cactusfruititem;
	public static RegistryObject<Item> candleberryitem;
	public static RegistryObject<Item> cantaloupeitem;
	public static RegistryObject<Item> cassavaitem;
	public static RegistryObject<Item> caulifloweritem;
	public static RegistryObject<Item> celeryitem;
	public static RegistryObject<Item> chickpeaitem;
	public static RegistryObject<Item> chilipepperitem;
	public static RegistryObject<Item> coffeebeanitem;
	public static RegistryObject<Item> cornitem;
	public static RegistryObject<Item> cottonitem;
	public static RegistryObject<Item> cranberryitem;
	public static RegistryObject<Item> cucumberitem;
	public static RegistryObject<Item> eggplantitem;
	public static RegistryObject<Item> elderberryitem;
	public static RegistryObject<Item> flaxitem;
	public static RegistryObject<Item> garlicitem;
	public static RegistryObject<Item> gingeritem;
	public static RegistryObject<Item> grapeitem;
	public static RegistryObject<Item> greengrapeitem;
	public static RegistryObject<Item> huckleberryitem;
	public static RegistryObject<Item> jicamaitem;
	public static RegistryObject<Item> juniperberryitem;
	public static RegistryObject<Item> juteitem;
	public static RegistryObject<Item> kaleitem;
	public static RegistryObject<Item> kenafitem;
	public static RegistryObject<Item> kiwiitem;
	public static RegistryObject<Item> kohlrabiitem;
	public static RegistryObject<Item> leekitem;
	public static RegistryObject<Item> lentilitem;
	public static RegistryObject<Item> lettuceitem;
	public static RegistryObject<Item> milletitem;
	public static RegistryObject<Item> mulberryitem;
	public static RegistryObject<Item> mustardseedsitem;
	public static RegistryObject<Item> oatsitem;
	public static RegistryObject<Item> okraitem;
	public static RegistryObject<Item> onionitem;
	public static RegistryObject<Item> parsnipitem;
	public static RegistryObject<Item> peanutitem;
	public static RegistryObject<Item> peasitem;
	public static RegistryObject<Item> pineappleitem;
	public static RegistryObject<Item> quinoaitem;
	public static RegistryObject<Item> radishitem;
	public static RegistryObject<Item> raspberryitem;
	public static RegistryObject<Item> rhubarbitem;
	public static RegistryObject<Item> riceitem;
	public static RegistryObject<Item> rutabagaitem;
	public static RegistryObject<Item> ryeitem;
	public static RegistryObject<Item> scallionitem;
	public static RegistryObject<Item> sesameseedsitem;
	public static RegistryObject<Item> sisalitem;
	public static RegistryObject<Item> soybeanitem;
	public static RegistryObject<Item> spiceleafitem;
	public static RegistryObject<Item> spinachitem;
	public static RegistryObject<Item> strawberryitem;
	public static RegistryObject<Item> sweetpotatoitem;
	public static RegistryObject<Item> taroitem;
	public static RegistryObject<Item> tealeafitem;
	public static RegistryObject<Item> tomatilloitem;
	public static RegistryObject<Item> tomatoitem;
	public static RegistryObject<Item> turnipitem;
	public static RegistryObject<Item> waterchestnutitem;
	public static RegistryObject<Item> whitemushroomitem;
	public static RegistryObject<Item> wintersquashitem;
	public static RegistryObject<Item> zucchiniitem;

	public static RegistryObject<Item> bakedarrowrootitem;
	public static RegistryObject<Item> bakedcassavaitem;
	public static RegistryObject<Item> roastedgarlicitem;
	public static RegistryObject<Item> bakedjicamaitem;
	public static RegistryObject<Item> roastedleekitem;
	public static RegistryObject<Item> roastedkohlrabiitem;
	public static RegistryObject<Item> roastedonionitem;
	public static RegistryObject<Item> bakedparsnipitem;
	public static RegistryObject<Item> roastedpeanutitem;
	public static RegistryObject<Item> roastedradishitem;
	public static RegistryObject<Item> roastedrhubarbitem;
	public static RegistryObject<Item> bakedrutabagaitem;
	public static RegistryObject<Item> roastedscallionitem;
	public static RegistryObject<Item> bakedsweetpotatoitem;
	public static RegistryObject<Item> bakedtaroitem;
	public static RegistryObject<Item> bakedturnipitem;
	public static RegistryObject<Item> bakedwaterchestnutitem;
	public static RegistryObject<Item> roastedmushroomitem;
	public static RegistryObject<Item> hotteaitem;
	public static RegistryObject<Item> hotcoffeeitem;


	public static RegistryObject<Item> agaveseeditem;
	public static RegistryObject<Item> amaranthseeditem;
	public static RegistryObject<Item> arrowrootseeditem;
	public static RegistryObject<Item> artichokeseeditem;
	public static RegistryObject<Item> asparagusseeditem;
	public static RegistryObject<Item> barleyseeditem;
	public static RegistryObject<Item> beanseeditem;
	public static RegistryObject<Item> bellpepperseeditem;
	public static RegistryObject<Item> blackberryseeditem;
	public static RegistryObject<Item> blueberryseeditem;
	public static RegistryObject<Item> broccoliseeditem;
	public static RegistryObject<Item> brusselsproutseeditem;
	public static RegistryObject<Item> cabbageseeditem;
	public static RegistryObject<Item> cactusfruitseeditem;
	public static RegistryObject<Item> candleberryseeditem;
	public static RegistryObject<Item> cantaloupeseeditem;
	public static RegistryObject<Item> cassavaseeditem;
	public static RegistryObject<Item> cauliflowerseeditem;
	public static RegistryObject<Item> celeryseeditem;
	public static RegistryObject<Item> chickpeaseeditem;
	public static RegistryObject<Item> chilipepperseeditem;
	public static RegistryObject<Item> coffeebeanseeditem;
	public static RegistryObject<Item> cornseeditem;
	public static RegistryObject<Item> cottonseeditem;
	public static RegistryObject<Item> cranberryseeditem;
	public static RegistryObject<Item> cucumberseeditem;
	public static RegistryObject<Item> eggplantseeditem;
	public static RegistryObject<Item> elderberryseeditem;
	public static RegistryObject<Item> flaxseeditem;
	public static RegistryObject<Item> garlicseeditem;
	public static RegistryObject<Item> gingerseeditem;
	public static RegistryObject<Item> grapeseeditem;
	public static RegistryObject<Item> greengrapeseeditem;
	public static RegistryObject<Item> huckleberryseeditem;
	public static RegistryObject<Item> jicamaseeditem;
	public static RegistryObject<Item> juniperberryseeditem;
	public static RegistryObject<Item> juteseeditem;
	public static RegistryObject<Item> kaleseeditem;
	public static RegistryObject<Item> kenafseeditem;
	public static RegistryObject<Item> kiwiseeditem;
	public static RegistryObject<Item> kohlrabiseeditem;
	public static RegistryObject<Item> leekseeditem;
	public static RegistryObject<Item> lentilseeditem;
	public static RegistryObject<Item> lettuceseeditem;
	public static RegistryObject<Item> milletseeditem;
	public static RegistryObject<Item> mulberryseeditem;
	public static RegistryObject<Item> mustardseedsseeditem;
	public static RegistryObject<Item> oatsseeditem;
	public static RegistryObject<Item> okraseeditem;
	public static RegistryObject<Item> onionseeditem;
	public static RegistryObject<Item> parsnipseeditem;
	public static RegistryObject<Item> peanutseeditem;
	public static RegistryObject<Item> peasseeditem;
	public static RegistryObject<Item> pineappleseeditem;
	public static RegistryObject<Item> quinoaseeditem;
	public static RegistryObject<Item> radishseeditem;
	public static RegistryObject<Item> raspberryseeditem;
	public static RegistryObject<Item> rhubarbseeditem;
	public static RegistryObject<Item> riceseeditem;
	public static RegistryObject<Item> rutabagaseeditem;
	public static RegistryObject<Item> ryeseeditem;
	public static RegistryObject<Item> scallionseeditem;
	public static RegistryObject<Item> sesameseedsseeditem;
	public static RegistryObject<Item> sisalseeditem;
	public static RegistryObject<Item> soybeanseeditem;
	public static RegistryObject<Item> spiceleafseeditem;
	public static RegistryObject<Item> spinachseeditem;
	public static RegistryObject<Item> strawberryseeditem;
	public static RegistryObject<Item> sweetpotatoseeditem;
	public static RegistryObject<Item> taroseeditem;
	public static RegistryObject<Item> tealeafseeditem;
	public static RegistryObject<Item> tomatilloseeditem;
	public static RegistryObject<Item> tomatoseeditem;
	public static RegistryObject<Item> turnipseeditem;
	public static RegistryObject<Item> waterchestnutseeditem;
	public static RegistryObject<Item> whitemushroomseeditem;
	public static RegistryObject<Item> wintersquashseeditem;
	public static RegistryObject<Item> zucchiniseeditem;
	
	
	
	

	public static void registerAll(IEventBus eventBus) {
		DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Pamhc2crops.MOD_ID);
		
		//Garden Item Blocks
		aridgarden = ITEMS.register("aridgarden",() -> new BlockItem(BlockRegistry.aridgarden.get(), new Item.Properties().tab(Pamhc2crops.ITEM_GROUP)));
		frostgarden = ITEMS.register("frostgarden",() -> new BlockItem(BlockRegistry.frostgarden.get(), new Item.Properties().tab(Pamhc2crops.ITEM_GROUP)));
		shadedgarden = ITEMS.register("shadedgarden",() -> new BlockItem(BlockRegistry.shadedgarden.get(), new Item.Properties().tab(Pamhc2crops.ITEM_GROUP)));
		soggygarden = ITEMS.register("soggygarden",() -> new BlockItem(BlockRegistry.soggygarden.get(), new Item.Properties().tab(Pamhc2crops.ITEM_GROUP)));
		tropicalgarden = ITEMS.register("tropicalgarden",() -> new BlockItem(BlockRegistry.tropicalgarden.get(), new Item.Properties().tab(Pamhc2crops.ITEM_GROUP)));
		windygarden = ITEMS.register("windygarden",() -> new BlockItem(BlockRegistry.windygarden.get(), new Item.Properties().tab(Pamhc2crops.ITEM_GROUP)));

		//Grains
		amaranthitem = ITEMS.register("amaranthitem", () -> new ItemPamGrain(BlockRegistry.pamamaranthcrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		barleyitem = ITEMS.register("barleyitem", () -> new ItemPamGrain(BlockRegistry.pambarleycrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		beanitem = ITEMS.register("beanitem", () -> new ItemPamGrain(BlockRegistry.pambeancrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		chickpeaitem = ITEMS.register("chickpeaitem", () -> new ItemPamGrain(BlockRegistry.pamchickpeacrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		cornitem = ITEMS.register("cornitem", () -> new ItemPamGrain(BlockRegistry.pamcorncrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		lentilitem = ITEMS.register("lentilitem", () -> new ItemPamGrain(BlockRegistry.pamlentilcrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		milletitem = ITEMS.register("milletitem", () -> new ItemPamGrain(BlockRegistry.pammilletcrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		oatsitem = ITEMS.register("oatsitem", () -> new ItemPamGrain(BlockRegistry.pamoatscrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		quinoaitem = ITEMS.register("quinoaitem", () -> new ItemPamGrain(BlockRegistry.pamquinoacrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		riceitem = ITEMS.register("riceitem", () -> new ItemPamGrain(BlockRegistry.pamricecrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		ryeitem = ITEMS.register("ryeitem", () -> new ItemPamGrain(BlockRegistry.pamryecrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		soybeanitem = ITEMS.register("soybeanitem", () -> new ItemPamGrain(BlockRegistry.pamsoybeancrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));

		//Fiber
		cottonitem = ITEMS.register("cottonitem", () -> new ItemPamFoodSeed(BlockRegistry.pamcottoncrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		flaxitem = ITEMS.register("flaxitem", () -> new ItemPamFoodSeed(BlockRegistry.pamflaxcrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		kenafitem = ITEMS.register("kenafitem", () -> new ItemPamFoodSeed(BlockRegistry.pamkenafcrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		juteitem = ITEMS.register("juteitem", () -> new ItemPamFoodSeed(BlockRegistry.pamjutecrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		sisalitem = ITEMS.register("sisalitem", () -> new ItemPamFoodSeed(BlockRegistry.pamsisalcrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));

		//Vegetables
		artichokeitem = ITEMS.register("artichokeitem", () -> new ItemPamPig(BlockRegistry.pamartichokecrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.ARTICHOKEITEM)));
		asparagusitem = ITEMS.register("asparagusitem", () -> new ItemPamPig(BlockRegistry.pamasparaguscrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.ASPARAGUSITEM)));
		bellpepperitem = ITEMS.register("bellpepperitem", () -> new ItemPamPig(BlockRegistry.pambellpeppercrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.BELLPEPPERITEM)));
		broccoliitem = ITEMS.register("broccoliitem", () -> new ItemPamPig(BlockRegistry.pambroccolicrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.BROCCOLIITEM)));
		brusselsproutitem = ITEMS.register("brusselsproutitem", () -> new ItemPamPig(BlockRegistry.pambrusselsproutcrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.BRUSSELSPROUTITEM)));
		cabbageitem = ITEMS.register("cabbageitem", () -> new ItemPamPig(BlockRegistry.pamcabbagecrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.CABBAGEITEM)));
		caulifloweritem = ITEMS.register("caulifloweritem", () -> new ItemPamPig(BlockRegistry.pamcauliflowercrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.CAULIFLOWERITEM)));
		celeryitem = ITEMS.register("celeryitem", () -> new ItemPamPig(BlockRegistry.pamcelerycrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.CELERYITEM)));
		chilipepperitem = ITEMS.register("chilipepperitem", () -> new ItemPamPig(BlockRegistry.pamchilipeppercrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.CHILIPEPPERITEM)));
		cucumberitem = ITEMS.register("cucumberitem", () -> new ItemPamPig(BlockRegistry.pamcucumbercrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.CUCUMBERITEM)));
		eggplantitem = ITEMS.register("eggplantitem", () -> new ItemPamPig(BlockRegistry.pameggplantcrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.EGGPLANTITEM)));
		kaleitem = ITEMS.register("kaleitem", () -> new ItemPamPig(BlockRegistry.pamkalecrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.KALEITEM)));
		lettuceitem = ITEMS.register("lettuceitem", () -> new ItemPamPig(BlockRegistry.pamlettucecrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.LETTUCEITEM)));
		okraitem = ITEMS.register("okraitem", () -> new ItemPamPig(BlockRegistry.pamokracrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.OKRAITEM)));
		peasitem = ITEMS.register("peasitem", () -> new ItemPamPig(BlockRegistry.pampeascrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.PEASITEM)));
		spinachitem	= ITEMS.register("spinachitem", () -> new ItemPamPig(BlockRegistry.pamspinachcrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.SPINACHITEM)));
		tomatilloitem = ITEMS.register("tomatilloitem", () -> new ItemPamPig(BlockRegistry.pamtomatillocrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.TOMATILLOITEM)));
		tomatoitem = ITEMS.register("tomatoitem", () -> new ItemPamPig(BlockRegistry.pamtomatocrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.TOMATOITEM)));
		wintersquashitem = ITEMS.register("wintersquashitem", () -> new ItemPamPig(BlockRegistry.pamwintersquashcrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.WINTERSQUASHITEM)));
		zucchiniitem = ITEMS.register("zucchiniitem", () -> new ItemPamPig(BlockRegistry.pamzucchinicrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.ZUCCHINIITEM)));

		//Root Vegetable
		arrowrootitem = ITEMS.register("arrowrootitem", () -> new ItemPamPig(BlockRegistry.pamarrowrootcrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.ARROWROOTITEM)));
		cassavaitem = ITEMS.register("cassavaitem", () -> new ItemPamPig(BlockRegistry.pamcassavacrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.CASSAVAITEM)));
		garlicitem = ITEMS.register("garlicitem", () -> new ItemPamPig(BlockRegistry.pamgarliccrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.GARLICITEM)));
		jicamaitem = ITEMS.register("jicamaitem", () -> new ItemPamPig(BlockRegistry.pamjicamacrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.JICAMAITEM)));
		leekitem = ITEMS.register("leekitem", () -> new ItemPamPig(BlockRegistry.pamleekcrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.LEEKITEM)));
		kohlrabiitem = ITEMS.register("kohlrabiitem", () -> new ItemPamPig(BlockRegistry.pamkohlrabicrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.KOHLRABIITEM)));
		onionitem = ITEMS.register("onionitem", () -> new ItemPamPig(BlockRegistry.pamonioncrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.ONIONITEM)));
		parsnipitem = ITEMS.register("parsnipitem", () -> new ItemPamPig(BlockRegistry.pamparsnipcrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.PARSNIPITEM)));
		peanutitem = ITEMS.register("peanutitem", () -> new ItemPamPig(BlockRegistry.pampeanutcrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.PEANUTITEM)));
		radishitem = ITEMS.register("radishitem", () -> new ItemPamPig(BlockRegistry.pamradishcrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.RADISHITEM)));
		rhubarbitem	 = ITEMS.register("rhubarbitem", () -> new ItemPamPig(BlockRegistry.pamrhubarbcrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.RHUBARBITEM)));
		rutabagaitem = ITEMS.register("rutabagaitem", () -> new ItemPamPig(BlockRegistry.pamrutabagacrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.RUTABAGAITEM)));
		scallionitem = ITEMS.register("scallionitem", () -> new ItemPamPig(BlockRegistry.pamscallioncrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.SCALLIONITEM)));
		sweetpotatoitem = ITEMS.register("sweetpotatoitem", () -> new ItemPamPig(BlockRegistry.pamsweetpotatocrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.SWEETPOTATOITEM)));
		taroitem = ITEMS.register("taroitem", () -> new ItemPamPig(BlockRegistry.pamtarocrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.TAROITEM)));
		turnipitem = ITEMS.register("turnipitem", () -> new ItemPamPig(BlockRegistry.pamturnipcrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.TURNIPITEM)));
		waterchestnutitem = ITEMS.register("waterchestnutitem", () -> new ItemPamPig(BlockRegistry.pamwaterchestnutcrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.WATERCHESTNUTITEM)));

		//Fruits
		blackberryitem = ITEMS.register("blackberryitem", () -> new ItemPamRabbit(BlockRegistry.pamblackberrycrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.BLACKBERRYITEM)));
		blueberryitem = ITEMS.register("blueberryitem", () -> new ItemPamRabbit(BlockRegistry.pamblueberrycrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.BLUEBERRYITEM)));
		cactusfruititem = ITEMS.register("cactusfruititem", () -> new ItemPamRabbit(BlockRegistry.pamcactusfruitcrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.CACTUSFRUITITEM)));
		candleberryitem = ITEMS.register("candleberryitem", () -> new ItemPamRabbit(BlockRegistry.pamcandleberrycrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.CANDLEBERRYITEM)));
		cantaloupeitem = ITEMS.register("cantaloupeitem", () -> new ItemPamRabbit(BlockRegistry.pamcantaloupecrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.CANTALOUPEITEM)));
		cranberryitem = ITEMS.register("cranberryitem", () -> new ItemPamRabbit(BlockRegistry.pamcranberrycrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.CRANBERRYITEM)));
		elderberryitem = ITEMS.register("elderberryitem", () -> new ItemPamRabbit(BlockRegistry.pamelderberrycrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.ELDERBERRYITEM)));
		grapeitem = ITEMS.register("grapeitem", () -> new ItemPamRabbit(BlockRegistry.pamgrapecrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.GRAPEITEM)));
		greengrapeitem = ITEMS.register("greengrapeitem", () -> new ItemPamRabbit(BlockRegistry.pamgreengrapecrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.GREENGRAPEITEM)));
		huckleberryitem = ITEMS.register("huckleberryitem", () -> new ItemPamRabbit(BlockRegistry.pamhuckleberrycrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.HUCKLEBERRYITEM)));
		juniperberryitem = ITEMS.register("juniperberryitem", () -> new ItemPamRabbit(BlockRegistry.pamjuniperberrycrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.JUNIPERBERRYITEM)));
		kiwiitem = ITEMS.register("kiwiitem", () -> new ItemPamRabbit(BlockRegistry.pamkiwicrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.KIWIITEM)));
		mulberryitem = ITEMS.register("mulberryitem", () -> new ItemPamRabbit(BlockRegistry.pammulberrycrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.MULBERRYITEM)));
		pineappleitem = ITEMS.register("pineappleitem", () -> new ItemPamRabbit(BlockRegistry.pampineapplecrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.PINEAPPLEITEM)));
		raspberryitem = ITEMS.register("raspberryitem", () -> new ItemPamRabbit(BlockRegistry.pamraspberrycrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.RASPBERRYITEM)));
		strawberryitem = ITEMS.register("strawberryitem", () -> new ItemPamRabbit(BlockRegistry.pamstrawberrycrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.STRAWBERRYITEM)));

		//Misc

		//Drink
		coffeebeanitem = ITEMS.register("coffeebeanitem", () -> new ItemPamFoodSeed(BlockRegistry.pamcoffeebeancrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		tealeafitem = ITEMS.register("tealeafitem", () -> new ItemPamFoodSeed(BlockRegistry.pamtealeafcrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		//Sugar
		agaveitem = ITEMS.register("agaveitem", () -> new ItemPamFoodSeed(BlockRegistry.pamagavecrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		//Mushroom
		whitemushroomitem = ITEMS.register("whitemushroomitem", () -> new ItemPamFoodSeed(BlockRegistry.pamwhitemushroomcrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.WHITEMUSHROOMITEM)));//EDIBLE
		//Spice
		gingeritem = ITEMS.register("gingeritem", () -> new ItemPamFoodSeed(BlockRegistry.pamgingercrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		sesameseedsitem = ITEMS.register("sesameseedsitem", () -> new ItemPamFoodSeed(BlockRegistry.pamsesameseedscrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		spiceleafitem = ITEMS.register("spiceleafitem", () -> new ItemPamRabbit(BlockRegistry.pamspiceleafcrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.SPICELEAF)));//EDIBLE
		mustardseedsitem = ITEMS.register("mustardseedsitem", () -> new ItemPamGrain(BlockRegistry.pammustardseedscrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));

		//Foods
		bakedarrowrootitem = ITEMS.register("bakedarrowrootitem", () -> new Item( (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.BAKEDARROWROOTITEM)));
		bakedcassavaitem = ITEMS.register("bakedcassavaitem", () -> new Item( (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.BAKEDCASSAVAITEM)));
		roastedgarlicitem = ITEMS.register("roastedgarlicitem", () -> new Item( (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.ROASTEDGARLICITEM)));
		bakedjicamaitem = ITEMS.register("bakedjicamaitem", () -> new Item( (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.BAKEDJICAMAITEM)));
		roastedleekitem = ITEMS.register("roastedleekitem", () -> new Item( (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.ROASTEDLEEKITEM)));
		roastedkohlrabiitem = ITEMS.register("roastedkohlrabiitem", () -> new Item( (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.ROASTEDKOHLRABIITEM)));
		roastedonionitem = ITEMS.register("roastedonionitem", () -> new Item( (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.ROASTEDONIONITEM)));
		bakedparsnipitem = ITEMS.register("bakedparsnipitem", () -> new Item( (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.BAKEDPARSNIPITEM)));
		roastedpeanutitem = ITEMS.register("roastedpeanutitem", () -> new Item( (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.ROASTEDPEANUTITEM)));
		roastedradishitem = ITEMS.register("roastedradishitem", () -> new Item( (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.ROASTEDRADISHITEM)));
		roastedrhubarbitem = ITEMS.register("roastedrhubarbitem", () -> new Item( (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.ROASTEDRHUBARBITEM)));
		bakedrutabagaitem = ITEMS.register("bakedrutabagaitem", () -> new Item( (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.BAKEDRUTABAGAITEM)));
		roastedscallionitem = ITEMS.register("roastedscallionitem", () -> new Item( (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.ROASTEDSCALLIONITEM)));
		bakedsweetpotatoitem = ITEMS.register("bakedsweetpotatoitem", () -> new Item( (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.BAKEDSWEETPOTATOITEM)));
		bakedtaroitem = ITEMS.register("bakedtaroitem", () -> new Item( (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.BAKEDTAROITEM)));
		bakedturnipitem = ITEMS.register("bakedturnipitem", () -> new Item( (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.BAKEDTURNIPITEM)));
		bakedwaterchestnutitem = ITEMS.register("bakedwaterchestnutitem", () -> new Item( (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.BAKEDWATERCHESTNUTITEM)));
		roastedmushroomitem = ITEMS.register("roastedmushroomitem", () -> new Item( (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.ROASTEDMUSHROOMITEM)));
		hotteaitem = ITEMS.register("hotteaitem", () -> new Item( (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.HOTTEAITEM)));
		hotcoffeeitem = ITEMS.register("hotcoffeeitem", () -> new Item( (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.HOTCOFFEEITEM)));

		//Seeds
		agaveseeditem = ITEMS.register("agaveseeditem", () -> new ItemPamSeed( BlockRegistry.pamagavecrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		amaranthseeditem = ITEMS.register("amaranthseeditem", () -> new ItemPamSeed( BlockRegistry.pamamaranthcrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		arrowrootseeditem = ITEMS.register("arrowrootseeditem", () -> new ItemPamSeed( BlockRegistry.pamarrowrootcrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		artichokeseeditem = ITEMS.register("artichokeseeditem", () -> new ItemPamSeed( BlockRegistry.pamartichokecrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		asparagusseeditem = ITEMS.register("asparagusseeditem", () -> new ItemPamSeed( BlockRegistry.pamasparaguscrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		barleyseeditem = ITEMS.register("barleyseeditem", () -> new ItemPamSeed( BlockRegistry.pambarleycrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		beanseeditem = ITEMS.register("beanseeditem", () -> new ItemPamSeed( BlockRegistry.pambeancrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		bellpepperseeditem = ITEMS.register("bellpepperseeditem", () -> new ItemPamSeed( BlockRegistry.pambellpeppercrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		blackberryseeditem = ITEMS.register("blackberryseeditem", () -> new ItemPamSeed( BlockRegistry.pamblackberrycrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		blueberryseeditem = ITEMS.register("blueberryseeditem", () -> new ItemPamSeed( BlockRegistry.pamblueberrycrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		broccoliseeditem = ITEMS.register("broccoliseeditem", () -> new ItemPamSeed( BlockRegistry.pambroccolicrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		brusselsproutseeditem = ITEMS.register("brusselsproutseeditem", () -> new ItemPamSeed( BlockRegistry.pambrusselsproutcrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		cabbageseeditem = ITEMS.register("cabbageseeditem", () -> new ItemPamSeed( BlockRegistry.pamcabbagecrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		cactusfruitseeditem = ITEMS.register("cactusfruitseeditem", () -> new ItemPamSeed( BlockRegistry.pamcactusfruitcrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		candleberryseeditem = ITEMS.register("candleberryseeditem", () -> new ItemPamSeed( BlockRegistry.pamcandleberrycrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		cantaloupeseeditem = ITEMS.register("cantaloupeseeditem", () -> new ItemPamSeed( BlockRegistry.pamcantaloupecrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		cassavaseeditem = ITEMS.register("cassavaseeditem", () -> new ItemPamSeed( BlockRegistry.pamcassavacrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		cauliflowerseeditem = ITEMS.register("cauliflowerseeditem", () -> new ItemPamSeed( BlockRegistry.pamcauliflowercrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		celeryseeditem = ITEMS.register("celeryseeditem", () -> new ItemPamSeed( BlockRegistry.pamcelerycrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		chickpeaseeditem = ITEMS.register("chickpeaseeditem", () -> new ItemPamSeed( BlockRegistry.pamchickpeacrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		chilipepperseeditem = ITEMS.register("chilipepperseeditem", () -> new ItemPamSeed( BlockRegistry.pamchilipeppercrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		coffeebeanseeditem = ITEMS.register("coffeebeanseeditem", () -> new ItemPamSeed( BlockRegistry.pamcoffeebeancrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		cornseeditem = ITEMS.register("cornseeditem", () -> new ItemPamSeed( BlockRegistry.pamcorncrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		cottonseeditem = ITEMS.register("cottonseeditem", () -> new ItemPamSeed( BlockRegistry.pamcottoncrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		cranberryseeditem = ITEMS.register("cranberryseeditem", () -> new ItemPamSeed( BlockRegistry.pamcranberrycrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		cucumberseeditem = ITEMS.register("cucumberseeditem", () -> new ItemPamSeed( BlockRegistry.pamcucumbercrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		eggplantseeditem = ITEMS.register("eggplantseeditem", () -> new ItemPamSeed( BlockRegistry.pameggplantcrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		elderberryseeditem = ITEMS.register("elderberryseeditem", () -> new ItemPamSeed( BlockRegistry.pamelderberrycrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		flaxseeditem = ITEMS.register("flaxseeditem", () -> new ItemPamSeed( BlockRegistry.pamflaxcrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		garlicseeditem = ITEMS.register("garlicseeditem", () -> new ItemPamSeed( BlockRegistry.pamgarliccrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		gingerseeditem = ITEMS.register("gingerseeditem", () -> new ItemPamSeed( BlockRegistry.pamgingercrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		grapeseeditem = ITEMS.register("grapeseeditem", () -> new ItemPamSeed( BlockRegistry.pamgrapecrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		greengrapeseeditem = ITEMS.register("greengrapeseeditem", () -> new ItemPamSeed( BlockRegistry.pamgreengrapecrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		huckleberryseeditem = ITEMS.register("huckleberryseeditem", () -> new ItemPamSeed( BlockRegistry.pamhuckleberrycrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		jicamaseeditem = ITEMS.register("jicamaseeditem", () -> new ItemPamSeed( BlockRegistry.pamjicamacrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		juniperberryseeditem = ITEMS.register("juniperberryseeditem", () -> new ItemPamSeed( BlockRegistry.pamjuniperberrycrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		juteseeditem = ITEMS.register("juteseeditem", () -> new ItemPamSeed( BlockRegistry.pamjutecrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		kaleseeditem = ITEMS.register("kaleseeditem", () -> new ItemPamSeed( BlockRegistry.pamkalecrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		kenafseeditem = ITEMS.register("kenafseeditem", () -> new ItemPamSeed( BlockRegistry.pamkenafcrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		kiwiseeditem = ITEMS.register("kiwiseeditem", () -> new ItemPamSeed( BlockRegistry.pamkiwicrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		kohlrabiseeditem = ITEMS.register("kohlrabiseeditem", () -> new ItemPamSeed( BlockRegistry.pamkohlrabicrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		leekseeditem = ITEMS.register("leekseeditem", () -> new ItemPamSeed( BlockRegistry.pamleekcrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		lentilseeditem = ITEMS.register("lentilseeditem", () -> new ItemPamSeed( BlockRegistry.pamlentilcrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		lettuceseeditem = ITEMS.register("lettuceseeditem", () -> new ItemPamSeed( BlockRegistry.pamlettucecrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		milletseeditem = ITEMS.register("milletseeditem", () -> new ItemPamSeed( BlockRegistry.pammilletcrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		mulberryseeditem = ITEMS.register("mulberryseeditem", () -> new ItemPamSeed( BlockRegistry.pammulberrycrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		mustardseedsseeditem = ITEMS.register("mustardseedsseeditem", () -> new ItemPamSeed( BlockRegistry.pammustardseedscrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		oatsseeditem = ITEMS.register("oatsseeditem", () -> new ItemPamSeed( BlockRegistry.pamoatscrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		okraseeditem = ITEMS.register("okraseeditem", () -> new ItemPamSeed( BlockRegistry.pamokracrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		onionseeditem = ITEMS.register("onionseeditem", () -> new ItemPamSeed( BlockRegistry.pamonioncrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		parsnipseeditem = ITEMS.register("parsnipseeditem", () -> new ItemPamSeed( BlockRegistry.pamparsnipcrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		peanutseeditem = ITEMS.register("peanutseeditem", () -> new ItemPamSeed( BlockRegistry.pampeanutcrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		peasseeditem = ITEMS.register("peasseeditem", () -> new ItemPamSeed( BlockRegistry.pampeascrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		pineappleseeditem = ITEMS.register("pineappleseeditem", () -> new ItemPamSeed( BlockRegistry.pampineapplecrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		quinoaseeditem = ITEMS.register("quinoaseeditem", () -> new ItemPamSeed( BlockRegistry.pamquinoacrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		radishseeditem = ITEMS.register("radishseeditem", () -> new ItemPamSeed( BlockRegistry.pamradishcrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		raspberryseeditem = ITEMS.register("raspberryseeditem", () -> new ItemPamSeed( BlockRegistry.pamraspberrycrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		rhubarbseeditem = ITEMS.register("rhubarbseeditem", () -> new ItemPamSeed( BlockRegistry.pamrhubarbcrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		riceseeditem = ITEMS.register("riceseeditem", () -> new ItemPamSeed( BlockRegistry.pamricecrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		rutabagaseeditem = ITEMS.register("rutabagaseeditem", () -> new ItemPamSeed( BlockRegistry.pamrutabagacrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		ryeseeditem = ITEMS.register("ryeseeditem", () -> new ItemPamSeed( BlockRegistry.pamryecrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		scallionseeditem = ITEMS.register("scallionseeditem", () -> new ItemPamSeed( BlockRegistry.pamscallioncrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		sesameseedsseeditem = ITEMS.register("sesameseedsseeditem", () -> new ItemPamSeed( BlockRegistry.pamsesameseedscrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		sisalseeditem = ITEMS.register("sisalseeditem", () -> new ItemPamSeed( BlockRegistry.pamsisalcrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		soybeanseeditem = ITEMS.register("soybeanseeditem", () -> new ItemPamSeed( BlockRegistry.pamsoybeancrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		spiceleafseeditem = ITEMS.register("spiceleafseeditem", () -> new ItemPamSeed( BlockRegistry.pamspiceleafcrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		spinachseeditem = ITEMS.register("spinachseeditem", () -> new ItemPamSeed( BlockRegistry.pamspinachcrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		strawberryseeditem = ITEMS.register("strawberryseeditem", () -> new ItemPamSeed( BlockRegistry.pamstrawberrycrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		sweetpotatoseeditem = ITEMS.register("sweetpotatoseeditem", () -> new ItemPamSeed( BlockRegistry.pamsweetpotatocrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		taroseeditem = ITEMS.register("taroseeditem", () -> new ItemPamSeed( BlockRegistry.pamtarocrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		tealeafseeditem = ITEMS.register("tealeafseeditem", () -> new ItemPamSeed( BlockRegistry.pamtealeafcrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		tomatilloseeditem = ITEMS.register("tomatilloseeditem", () -> new ItemPamSeed( BlockRegistry.pamtomatillocrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		tomatoseeditem = ITEMS.register("tomatoseeditem", () -> new ItemPamSeed( BlockRegistry.pamtomatocrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		turnipseeditem = ITEMS.register("turnipseeditem", () -> new ItemPamSeed( BlockRegistry.pamturnipcrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		waterchestnutseeditem = ITEMS.register("waterchestnutseeditem", () -> new ItemPamSeed( BlockRegistry.pamwaterchestnutcrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		whitemushroomseeditem = ITEMS.register("whitemushroomseeditem", () -> new ItemPamSeed( BlockRegistry.pamwhitemushroomcrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		wintersquashseeditem = ITEMS.register("wintersquashseeditem", () -> new ItemPamSeed( BlockRegistry.pamwintersquashcrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		zucchiniseeditem = ITEMS.register("zucchiniseeditem", () -> new ItemPamSeed( BlockRegistry.pamzucchinicrop.get(), (new Item.Properties()).tab(Pamhc2crops.ITEM_GROUP)));
		
		ITEMS.register(eventBus);
	}



	

	
}