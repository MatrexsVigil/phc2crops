package pam.pamhc2crops.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.ForgeRegistries;
import pam.pamhc2crops.Pamhc2crops;
import pam.pamhc2crops.blocks.BlockPamAridGarden;
import pam.pamhc2crops.blocks.BlockPamCrop;
import pam.pamhc2crops.blocks.BlockPamGarden;

import javax.annotation.Nullable;

public class BlockRegistry {

	public static Block pamagavecrop;
	public static Block pamamaranthcrop;
	public static Block pamarrowrootcrop;
	public static Block pamartichokecrop;
	public static Block pamasparaguscrop;
	public static Block pambarleycrop;
	public static Block pambeancrop;
	public static Block pambellpeppercrop;
	public static Block pamblackberrycrop;
	public static Block pamblueberrycrop;
	public static Block pambroccolicrop;
	public static Block pambrusselsproutcrop;
	public static Block pamcabbagecrop;
	public static Block pamcactusfruitcrop;
	public static Block pamcandleberrycrop;
	public static Block pamcantaloupecrop;
	public static Block pamcassavacrop;
	public static Block pamcauliflowercrop;
	public static Block pamcelerycrop;
	public static Block pamchickpeacrop;
	public static Block pamchilipeppercrop;
	public static Block pamcoffeebeancrop;
	public static Block pamcorncrop;
	public static Block pamcottoncrop;
	public static Block pamcranberrycrop;
	public static Block pamcucumbercrop;
	public static Block pameggplantcrop;
	public static Block pamelderberrycrop;
	public static Block pamflaxcrop;
	public static Block pamgarliccrop;
	public static Block pamgingercrop;
	public static Block pamgrapecrop;
	public static Block pamgreengrapecrop;
	public static Block pamhuckleberrycrop;
	public static Block pamjicamacrop;
	public static Block pamjuniperberrycrop;
	public static Block pamjutecrop;
	public static Block pamkalecrop;
	public static Block pamkenafcrop;
	public static Block pamkiwicrop;
	public static Block pamkohlrabicrop;
	public static Block pamleekcrop;
	public static Block pamlentilcrop;
	public static Block pamlettucecrop;
	public static Block pammilletcrop;
	public static Block pammulberrycrop;
	public static Block pammustardseedscrop;
	public static Block pamoatscrop;
	public static Block pamokracrop;
	public static Block pamonioncrop;
	public static Block pamparsnipcrop;
	public static Block pampeanutcrop;
	public static Block pampeascrop;
	public static Block pampineapplecrop;
	public static Block pamquinoacrop;
	public static Block pamradishcrop;
	public static Block pamraspberrycrop;
	public static Block pamrhubarbcrop;
	public static Block pamricecrop;
	public static Block pamrutabagacrop;
	public static Block pamryecrop;
	public static Block pamscallioncrop;
	public static Block pamsesameseedscrop;
	public static Block pamsisalcrop;
	public static Block pamsoybeancrop;
	public static Block pamspiceleafcrop;
	public static Block pamspinachcrop;
	public static Block pamstrawberrycrop;
	public static Block pamsweetpotatocrop;
	public static Block pamtarocrop;
	public static Block pamtealeafcrop;
	public static Block pamtomatillocrop;
	public static Block pamtomatocrop;
	public static Block pamturnipcrop;
	public static Block pamwaterchestnutcrop;
	public static Block pamwhitemushroomcrop;
	public static Block pamwintersquashcrop;
	public static Block pamzucchinicrop;
	
	public static Block aridgarden;
	public static Block frostgarden;
	public static Block tropicalgarden;
	public static Block windygarden;
	public static Block shadedgarden;
	public static Block soggygarden;
	
	public static void registerAll(RegistryEvent.Register<Block> event) {
		if (!event.getName().equals(ForgeRegistries.BLOCKS.getRegistryName()))
			return;

			pamagavecrop = register("pamagavecrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "agave"));
			pamamaranthcrop = register("pamamaranthcrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "amaranth"));
			pamarrowrootcrop = register("pamarrowrootcrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "arrowroot"));
			pamartichokecrop = register("pamartichokecrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "artichoke"));
			pamasparaguscrop = register("pamasparaguscrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "asparagus"));
			pambarleycrop = register("pambarleycrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "barley"));
			pambeancrop = register("pambeancrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "bean"));
			pambellpeppercrop = register("pambellpeppercrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "bellpepper"));
			pamblackberrycrop = register("pamblackberrycrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "blackberry"));
			pamblueberrycrop = register("pamblueberrycrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "blueberry"));
			pambroccolicrop = register("pambroccolicrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "broccoli"));
			pambrusselsproutcrop = register("pambrusselsproutcrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "brusselsprout"));
			pamcabbagecrop = register("pamcabbagecrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "cabbage"));
			pamcactusfruitcrop = register("pamcactusfruitcrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "cactusfruit"));
			pamcandleberrycrop = register("pamcandleberrycrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "candleberry"));
			pamcantaloupecrop = register("pamcantaloupecrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "cantaloupe"));
			pamcassavacrop = register("pamcassavacrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "cassava"));
			pamcauliflowercrop = register("pamcauliflowercrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "cauliflower"));
			pamcelerycrop = register("pamcelerycrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "celery"));
			pamchickpeacrop = register("pamchickpeacrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "chilipepper"));
			pamchilipeppercrop = register("pamchilipeppercrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "chilipepper"));
			pamcoffeebeancrop = register("pamcoffeebeancrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "coffeebean"));
			pamcorncrop = register("pamcorncrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "corn"));
			pamcottoncrop = register("pamcottoncrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "cotton"));
			pamcranberrycrop = register("pamcranberrycrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "cranberry"));
			pamcucumbercrop = register("pamcucumbercrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "cucumber"));
			pameggplantcrop = register("pameggplantcrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "eggplant"));
			pamelderberrycrop = register("pamelderberrycrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "elderberry"));
			pamflaxcrop = register("pamflaxcrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "flax"));
			pamgarliccrop = register("pamgarliccrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "garlic"));
			pamgingercrop = register("pamgingercrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "ginger"));
			pamgrapecrop = register("pamgrapecrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "grape"));
			pamgreengrapecrop = register("pamgreengrapecrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "greengrape"));
			pamhuckleberrycrop = register("pamhuckleberrycrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "huckleberry"));
			pamjicamacrop = register("pamjicamacrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "jicama"));
			pamjuniperberrycrop = register("pamjuniperberrycrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "juniperberry"));
			pamjutecrop = register("pamjutecrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "jute"));
			pamkalecrop = register("pamkalecrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "kale"));
			pamkenafcrop = register("pamkenafcrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "kenaf"));
			pamkiwicrop = register("pamkiwicrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "kiwi"));
			pamkohlrabicrop = register("pamkohlrabicrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "kohlrabi"));
			pamleekcrop = register("pamleekcrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "leek"));
			pamlentilcrop = register("pamlentilcrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "lentil"));
			pamlettucecrop = register("pamlettucecrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "lettuce"));
			pammilletcrop = register("pammilletcrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "millet"));
			pammulberrycrop = register("pammulberrycrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "mulberry"));
			pammustardseedscrop = register("pammustardseedscrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "mustardseeds"));
			pamoatscrop = register("pamoatscrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "oats"));
			pamokracrop = register("pamokracrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "okra"));
			pamonioncrop = register("pamonioncrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "onion"));
			pamparsnipcrop = register("pamparsnipcrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "parsnip"));
			pampeanutcrop = register("pampeanutcrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "peanut"));
			pampeascrop = register("pampeascrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "peas"));
			pampineapplecrop = register("pampineapplecrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "pineapple"));
			pamquinoacrop = register("pamquinoacrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "quinoa"));
			pamradishcrop = register("pamradishcrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "radish"));
			pamraspberrycrop = register("pamraspberrycrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "raspberry"));
			pamrhubarbcrop = register("pamrhubarbcrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "rhubarb"));
			pamricecrop = register("pamricecrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "rice"));
			pamrutabagacrop = register("pamrutabagacrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "rutabaga"));
			pamryecrop = register("pamryecrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "rye"));
			pamscallioncrop = register("pamscallioncrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "scallion"));
			pamsesameseedscrop = register("pamsesameseedscrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "sesameseeds"));
			pamsisalcrop = register("pamsisalcrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "sisal"));
			pamsoybeancrop = register("pamsoybeancrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "soybean"));
			pamspiceleafcrop = register("pamspiceleafcrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "spiceleaf"));
			pamspinachcrop = register("pamspinachcrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "spinach"));
			pamstrawberrycrop = register("pamstrawberrycrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "strawberry"));
			pamsweetpotatocrop = register("pamsweetpotatocrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "sweetpotato"));
			pamtarocrop = register("pamtarocrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "taro"));
			pamtealeafcrop = register("pamtealeafcrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "tealeaf"));
			pamtomatillocrop = register("pamtomatillocrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "tomatillo"));
			pamtomatocrop = register("pamtomatocrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "tomato"));
			pamturnipcrop = register("pamturnipcrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "turnip"));
			pamwaterchestnutcrop = register("pamwaterchestnutcrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "waterchestnut"));
			pamwhitemushroomcrop = register("pamwhitemushroomcrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "whitemushroom"));
			pamwintersquashcrop = register("pamwintersquashcrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "wintersquash"));
			pamzucchinicrop = register("pamzucchinicrop", new BlockPamCrop(Block.Properties.of(Material.PLANT)
					.noCollission().randomTicks().strength(0).sound(SoundType.CROP), "zucchini"));
			
			aridgarden = register("aridgarden", new BlockPamAridGarden(Block.Properties.of(Material.PLANT)
					.noCollission().strength(0).sound(SoundType.CROP), "aridgarden"));
			frostgarden = register("frostgarden", new BlockPamGarden(Block.Properties.of(Material.PLANT)
					.noCollission().strength(0).sound(SoundType.CROP), "frostgarden"));
			tropicalgarden = register("tropicalgarden", new BlockPamGarden(Block.Properties.of(Material.PLANT)
					.noCollission().strength(0).sound(SoundType.CROP), "tropicalgarden"));
			windygarden = register("windygarden", new BlockPamGarden(Block.Properties.of(Material.PLANT)
					.noCollission().strength(0).sound(SoundType.CROP), "windygarden"));
			shadedgarden = register("shadedgarden", new BlockPamGarden(Block.Properties.of(Material.PLANT)
					.noCollission().strength(0).sound(SoundType.CROP), "shadedgarden"));
			soggygarden = register("soggygarden", new BlockPamGarden(Block.Properties.of(Material.PLANT)
					.noCollission().strength(0).sound(SoundType.CROP), "soggygarden"));
			
			
			
	}
	
	

	private static <T extends Block> T register(String name, T block) {
		BlockItem item = new BlockItem(block, new Item.Properties().tab(Pamhc2crops.ITEM_GROUP));
		return register(name, block, item);
	}
	

	private static <T extends Block> T register(String name, T block, @Nullable BlockItem item) {
		ResourceLocation id = Pamhc2crops.getId(name);
		block.setRegistryName(id);
		ForgeRegistries.BLOCKS.register(block);
		return block;
	}
	

}