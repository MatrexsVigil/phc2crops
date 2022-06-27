package pam.pamhc2crops.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import pam.pamhc2crops.Pamhc2crops;
import pam.pamhc2crops.blocks.BlockPamAridGarden;
import pam.pamhc2crops.blocks.BlockPamCrop;
import pam.pamhc2crops.blocks.BlockPamGarden;

import javax.annotation.Nullable;

public class BlockRegistry {

	public static RegistryObject<Block> pamagavecrop;
	public static RegistryObject<Block> pamamaranthcrop;
	public static RegistryObject<Block> pamarrowrootcrop;
	public static RegistryObject<Block> pamartichokecrop;
	public static RegistryObject<Block> pamasparaguscrop;
	public static RegistryObject<Block> pambarleycrop;
	public static RegistryObject<Block> pambeancrop;
	public static RegistryObject<Block> pambellpeppercrop;
	public static RegistryObject<Block> pamblackberrycrop;
	public static RegistryObject<Block> pamblueberrycrop;
	public static RegistryObject<Block> pambroccolicrop;
	public static RegistryObject<Block> pambrusselsproutcrop;
	public static RegistryObject<Block> pamcabbagecrop;
	public static RegistryObject<Block> pamcactusfruitcrop;
	public static RegistryObject<Block> pamcandleberrycrop;
	public static RegistryObject<Block> pamcantaloupecrop;
	public static RegistryObject<Block> pamcassavacrop;
	public static RegistryObject<Block> pamcauliflowercrop;
	public static RegistryObject<Block> pamcelerycrop;
	public static RegistryObject<Block> pamchickpeacrop;
	public static RegistryObject<Block> pamchilipeppercrop;
	public static RegistryObject<Block> pamcoffeebeancrop;
	public static RegistryObject<Block> pamcorncrop;
	public static RegistryObject<Block> pamcottoncrop;
	public static RegistryObject<Block> pamcranberrycrop;
	public static RegistryObject<Block> pamcucumbercrop;
	public static RegistryObject<Block> pameggplantcrop;
	public static RegistryObject<Block> pamelderberrycrop;
	public static RegistryObject<Block> pamflaxcrop;
	public static RegistryObject<Block> pamgarliccrop;
	public static RegistryObject<Block> pamgingercrop;
	public static RegistryObject<Block> pamgrapecrop;
	public static RegistryObject<Block> pamgreengrapecrop;
	public static RegistryObject<Block> pamhuckleberrycrop;
	public static RegistryObject<Block> pamjicamacrop;
	public static RegistryObject<Block> pamjuniperberrycrop;
	public static RegistryObject<Block> pamjutecrop;
	public static RegistryObject<Block> pamkalecrop;
	public static RegistryObject<Block> pamkenafcrop;
	public static RegistryObject<Block> pamkiwicrop;
	public static RegistryObject<Block> pamkohlrabicrop;
	public static RegistryObject<Block> pamleekcrop;
	public static RegistryObject<Block> pamlentilcrop;
	public static RegistryObject<Block> pamlettucecrop;
	public static RegistryObject<Block> pammilletcrop;
	public static RegistryObject<Block> pammulberrycrop;
	public static RegistryObject<Block> pammustardseedscrop;
	public static RegistryObject<Block> pamoatscrop;
	public static RegistryObject<Block> pamokracrop;
	public static RegistryObject<Block> pamonioncrop;
	public static RegistryObject<Block> pamparsnipcrop;
	public static RegistryObject<Block> pampeanutcrop;
	public static RegistryObject<Block> pampeascrop;
	public static RegistryObject<Block> pampineapplecrop;
	public static RegistryObject<Block> pamquinoacrop;
	public static RegistryObject<Block> pamradishcrop;
	public static RegistryObject<Block> pamraspberrycrop;
	public static RegistryObject<Block> pamrhubarbcrop;
	public static RegistryObject<Block> pamricecrop;
	public static RegistryObject<Block> pamrutabagacrop;
	public static RegistryObject<Block> pamryecrop;
	public static RegistryObject<Block> pamscallioncrop;
	public static RegistryObject<Block> pamsesameseedscrop;
	public static RegistryObject<Block> pamsisalcrop;
	public static RegistryObject<Block> pamsoybeancrop;
	public static RegistryObject<Block> pamspiceleafcrop;
	public static RegistryObject<Block> pamspinachcrop;
	public static RegistryObject<Block> pamstrawberrycrop;
	public static RegistryObject<Block> pamsweetpotatocrop;
	public static RegistryObject<Block> pamtarocrop;
	public static RegistryObject<Block> pamtealeafcrop;
	public static RegistryObject<Block> pamtomatillocrop;
	public static RegistryObject<Block> pamtomatocrop;
	public static RegistryObject<Block> pamturnipcrop;
	public static RegistryObject<Block> pamwaterchestnutcrop;
	public static RegistryObject<Block> pamwhitemushroomcrop;
	public static RegistryObject<Block> pamwintersquashcrop;
	public static RegistryObject<Block> pamzucchinicrop;

	public static RegistryObject<Block> aridgarden;
	public static RegistryObject<Block> frostgarden;
	public static RegistryObject<Block> tropicalgarden;
	public static RegistryObject<Block> windygarden;
	public static RegistryObject<Block> shadedgarden;
	public static RegistryObject<Block> soggygarden;
	
	public static void registerAll(IEventBus eventBus) {
		DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Pamhc2crops.MOD_ID);

			pamagavecrop = BLOCKS.register("pamagavecrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "agave"));
			pamamaranthcrop = BLOCKS.register("pamamaranthcrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "amaranth"));
			pamarrowrootcrop = BLOCKS.register("pamarrowrootcrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "arrowroot"));
			pamartichokecrop = BLOCKS.register("pamartichokecrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "artichoke"));
			pamasparaguscrop = BLOCKS.register("pamasparaguscrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "asparagus"));
			pambarleycrop = BLOCKS.register("pambarleycrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "barley"));
			pambeancrop = BLOCKS.register("pambeancrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "bean"));
			pambellpeppercrop = BLOCKS.register("pambellpeppercrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "bellpepper"));
			pamblackberrycrop = BLOCKS.register("pamblackberrycrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "blackberry"));
			pamblueberrycrop = BLOCKS.register("pamblueberrycrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "blueberry"));
			pambroccolicrop = BLOCKS.register("pambroccolicrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "broccoli"));
			pambrusselsproutcrop = BLOCKS.register("pambrusselsproutcrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "brusselsprout"));
			pamcabbagecrop = BLOCKS.register("pamcabbagecrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "cabbage"));
			pamcactusfruitcrop = BLOCKS.register("pamcactusfruitcrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "cactusfruit"));
			pamcandleberrycrop = BLOCKS.register("pamcandleberrycrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "candleberry"));
			pamcantaloupecrop = BLOCKS.register("pamcantaloupecrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "cantaloupe"));
			pamcassavacrop = BLOCKS.register("pamcassavacrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "cassava"));
			pamcauliflowercrop = BLOCKS.register("pamcauliflowercrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "cauliflower"));
			pamcelerycrop = BLOCKS.register("pamcelerycrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "celery"));
			pamchickpeacrop = BLOCKS.register("pamchickpeacrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "chilipepper"));
			pamchilipeppercrop = BLOCKS.register("pamchilipeppercrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "chilipepper"));
			pamcoffeebeancrop = BLOCKS.register("pamcoffeebeancrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "coffeebean"));
			pamcorncrop = BLOCKS.register("pamcorncrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "corn"));
			pamcottoncrop = BLOCKS.register("pamcottoncrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "cotton"));
			pamcranberrycrop = BLOCKS.register("pamcranberrycrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "cranberry"));
			pamcucumbercrop = BLOCKS.register("pamcucumbercrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "cucumber"));
			pameggplantcrop = BLOCKS.register("pameggplantcrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "eggplant"));
			pamelderberrycrop = BLOCKS.register("pamelderberrycrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "elderberry"));
			pamflaxcrop = BLOCKS.register("pamflaxcrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "flax"));
			pamgarliccrop = BLOCKS.register("pamgarliccrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "garlic"));
			pamgingercrop = BLOCKS.register("pamgingercrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "ginger"));
			pamgrapecrop = BLOCKS.register("pamgrapecrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "grape"));
			pamgreengrapecrop = BLOCKS.register("pamgreengrapecrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "greengrape"));
			pamhuckleberrycrop = BLOCKS.register("pamhuckleberrycrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "huckleberry"));
			pamjicamacrop = BLOCKS.register("pamjicamacrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "jicama"));
			pamjuniperberrycrop = BLOCKS.register("pamjuniperberrycrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "juniperberry"));
			pamjutecrop = BLOCKS.register("pamjutecrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "jute"));
			pamkalecrop = BLOCKS.register("pamkalecrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "kale"));
			pamkenafcrop = BLOCKS.register("pamkenafcrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "kenaf"));
			pamkiwicrop = BLOCKS.register("pamkiwicrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "kiwi"));
			pamkohlrabicrop = BLOCKS.register("pamkohlrabicrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "kohlrabi"));
			pamleekcrop = BLOCKS.register("pamleekcrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "leek"));
			pamlentilcrop = BLOCKS.register("pamlentilcrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "lentil"));
			pamlettucecrop = BLOCKS.register("pamlettucecrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "lettuce"));
			pammilletcrop = BLOCKS.register("pammilletcrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "millet"));
			pammulberrycrop = BLOCKS.register("pammulberrycrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "mulberry"));
			pammustardseedscrop = BLOCKS.register("pammustardseedscrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "mustardseeds"));
			pamoatscrop = BLOCKS.register("pamoatscrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "oats"));
			pamokracrop = BLOCKS.register("pamokracrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "okra"));
			pamonioncrop = BLOCKS.register("pamonioncrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "onion"));
			pamparsnipcrop = BLOCKS.register("pamparsnipcrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "parsnip"));
			pampeanutcrop = BLOCKS.register("pampeanutcrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "peanut"));
			pampeascrop = BLOCKS.register("pampeascrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "peas"));
			pampineapplecrop = BLOCKS.register("pampineapplecrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "pineapple"));
			pamquinoacrop = BLOCKS.register("pamquinoacrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "quinoa"));
			pamradishcrop = BLOCKS.register("pamradishcrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "radish"));
			pamraspberrycrop = BLOCKS.register("pamraspberrycrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "raspberry"));
			pamrhubarbcrop = BLOCKS.register("pamrhubarbcrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "rhubarb"));
			pamricecrop = BLOCKS.register("pamricecrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "rice"));
			pamrutabagacrop = BLOCKS.register("pamrutabagacrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "rutabaga"));
			pamryecrop = BLOCKS.register("pamryecrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "rye"));
			pamscallioncrop = BLOCKS.register("pamscallioncrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "scallion"));
			pamsesameseedscrop = BLOCKS.register("pamsesameseedscrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "sesameseeds"));
			pamsisalcrop = BLOCKS.register("pamsisalcrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "sisal"));
			pamsoybeancrop = BLOCKS.register("pamsoybeancrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "soybean"));
			pamspiceleafcrop = BLOCKS.register("pamspiceleafcrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "spiceleaf"));
			pamspinachcrop = BLOCKS.register("pamspinachcrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "spinach"));
			pamstrawberrycrop = BLOCKS.register("pamstrawberrycrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "strawberry"));
			pamsweetpotatocrop = BLOCKS.register("pamsweetpotatocrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "sweetpotato"));
			pamtarocrop = BLOCKS.register("pamtarocrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "taro"));
			pamtealeafcrop = BLOCKS.register("pamtealeafcrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "tealeaf"));
			pamtomatillocrop = BLOCKS.register("pamtomatillocrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "tomatillo"));
			pamtomatocrop = BLOCKS.register("pamtomatocrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "tomato"));
			pamturnipcrop = BLOCKS.register("pamturnipcrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "turnip"));
			pamwaterchestnutcrop = BLOCKS.register("pamwaterchestnutcrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "waterchestnut"));
			pamwhitemushroomcrop = BLOCKS.register("pamwhitemushroomcrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "whitemushroom"));
			pamwintersquashcrop = BLOCKS.register("pamwintersquashcrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "wintersquash"));
			pamzucchinicrop = BLOCKS.register("pamzucchinicrop", () -> new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "zucchini"));

			aridgarden = BLOCKS.register("aridgarden", () -> new BlockPamAridGarden(Block.Properties.of(Material.PLANT)
					.noCollission().strength(0).sound(SoundType.CROP), "aridgarden"));
			frostgarden = BLOCKS.register("frostgarden", () -> new BlockPamGarden(Block.Properties.of(Material.PLANT)
					.noCollission().strength(0).sound(SoundType.CROP), "frostgarden"));
			tropicalgarden = BLOCKS.register("tropicalgarden", () -> new BlockPamGarden(Block.Properties.of(Material.PLANT)
					.noCollission().strength(0).sound(SoundType.CROP), "tropicalgarden"));
			windygarden = BLOCKS.register("windygarden", () -> new BlockPamGarden(Block.Properties.of(Material.PLANT)
					.noCollission().strength(0).sound(SoundType.CROP), "windygarden"));
			shadedgarden = BLOCKS.register("shadedgarden", () -> new BlockPamGarden(Block.Properties.of(Material.PLANT)
					.noCollission().strength(0).sound(SoundType.CROP), "shadedgarden"));
			soggygarden = BLOCKS.register("soggygarden", () -> new BlockPamGarden(Block.Properties.of(Material.PLANT)
					.noCollission().strength(0).sound(SoundType.CROP), "soggygarden"));

		BLOCKS.register(eventBus);

	}




	

}