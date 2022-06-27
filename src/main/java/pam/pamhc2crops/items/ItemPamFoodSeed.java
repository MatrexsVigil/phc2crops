package pam.pamhc2crops.items;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.NonNullList;

public class ItemPamFoodSeed extends ItemNameBlockItem {
	public ItemPamFoodSeed(Block blockIn, Properties properties) {
		super(blockIn, properties);

	}
	
	public void fillItemCategory(CreativeModeTab group, NonNullList<ItemStack> items) {
	      if (this.allowdedIn(group)) {
	         items.add(new ItemStack(this));
	      }

	   }
	
}
