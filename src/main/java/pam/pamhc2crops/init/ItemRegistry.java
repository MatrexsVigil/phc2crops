package pam.pamhc2crops.init;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.ForgeRegistries;
import pam.pamhc2crops.Pamhc2crops;
import pam.pamhc2crops.items.ItemPamGrain;
import pam.pamhc2crops.items.ItemPamPig;
import pam.pamhc2crops.items.ItemPamSeed;

public class ItemRegistry {

	public static Item barleyitem;
	public static Item tomatoitem;

	public static Item barleyseeditem;
	public static Item tomatoseeditem;

	

	public static void registerAll(RegistryEvent.Register<Item> event) {
		if (!event.getName().equals(ForgeRegistries.ITEMS.getRegistryName()))
			return;


		
		
		barleyitem = register("barleyitem", new ItemPamGrain((new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		
		tomatoitem = register("tomatoitem",
				new ItemPamPig((new Item.Properties()).group(Pamhc2crops.ITEM_GROUP).food(FoodBuilderRegistry.TOMATO)));
		

		

		barleyseeditem = register("barleyseeditem",
				new ItemPamSeed(BlockRegistry.barley_crop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		
		tomatoseeditem = register("tomatoseeditem",
				new ItemPamSeed(BlockRegistry.tomato_crop, (new Item.Properties()).group(Pamhc2crops.ITEM_GROUP)));
		
		
		
	}

	private static <T extends Item> T register(String name, T item) {
		ResourceLocation id = Pamhc2crops.getId(name);
		item.setRegistryName(id);
		ForgeRegistries.ITEMS.register(item);
		return item;
	}

	private static <T extends BlockItem> T register(String name, T block_item) {
		ResourceLocation id = Pamhc2crops.getId(name);
		block_item.setRegistryName(id);
		ForgeRegistries.ITEMS.register(block_item);
		return block_item;
	}

}
