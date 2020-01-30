package pam.pamhc2crops.items;

import net.minecraft.block.Block;
import net.minecraft.item.BlockNamedItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class ItemPamFoodSeed extends BlockNamedItem {
	public ItemPamFoodSeed(Block blockIn, Properties properties) {
		super(blockIn, properties);

	}
	
	public void fillItemGroup(ItemGroup group, NonNullList<ItemStack> items) {
	      if (this.isInGroup(group)) {
	         items.add(new ItemStack(this));
	      }

	   }
	
}
