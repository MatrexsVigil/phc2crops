package pam.pamhc2crops.init;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.ForgeRegistries;
import pam.pamhc2crops.Pamhc2crops;
import pam.pamhc2crops.blocks.BlockPamCrop;

public class BlockRegistry {
	// Crops
	public static Block barley_crop;
	public static Block tomato_crop;

	

	public static void registerAll(RegistryEvent.Register<Block> event) {
		if (!event.getName().equals(ForgeRegistries.BLOCKS.getRegistryName()))
			return;


		barley_crop = register("barley_crop", new BlockPamCrop(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0).sound(SoundType.CROP), "barley"));


		tomato_crop = register("tomato_crop", new BlockPamCrop(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0).sound(SoundType.CROP), "tomato"));

		
	}

	private static <T extends Block> T register(String name, T block) {
		BlockItem item = new BlockItem(block, new Item.Properties().group(Pamhc2crops.ITEM_GROUP));
		return register(name, block, item);
	}

	private static <T extends Block> T register(String name, T block, @Nullable BlockItem item) {
		ResourceLocation id = Pamhc2crops.getId(name);
		block.setRegistryName(id);
		ForgeRegistries.BLOCKS.register(block);
		return block;
	}

}