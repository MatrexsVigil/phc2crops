package pam.pamhc2crops.items;

import net.minecraft.block.Block;
import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.PigEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockNamedItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.NonNullList;

public class ItemPamPig extends BlockNamedItem {
	public ItemPamPig(Block blockIn, Properties properties) {
		super(blockIn, properties);

	}

	public void fillItemGroup(ItemGroup group, NonNullList<ItemStack> items) {
	      if (this.isInGroup(group)) {
	         items.add(new ItemStack(this));
	      }

	   }
	
	public boolean itemInteractionForEntity(ItemStack itemstack, PlayerEntity player,
			LivingEntity entity, Hand hand) {

		if (entity instanceof AgeableEntity) {
			ItemStack stack = player.getHeldItem(hand);

			if (!entity.world.isRemote && !entity.isChild() && (int) ((AgeableEntity) entity).getGrowingAge() == 0) {
				if (entity instanceof PigEntity) {
					if (((PigEntity) entity).isInLove()) {
						return false;
					} else {
						((PigEntity) entity).setInLove(player);
						if (!player.isCreative())
							stack.shrink(1);
						return true;
					}

				}

			}

			if (entity.isChild()) {
				if (!player.isCreative())
					stack.shrink(1);
				((AgeableEntity) entity).ageUp((int) ((float) (-((AgeableEntity) entity).getGrowingAge() / 20) * 0.1F),
						true);
				return true;
			}
		}

		return false;

	}

}
