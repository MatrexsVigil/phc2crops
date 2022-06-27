package pam.pamhc2crops.items;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.animal.Chicken;
import net.minecraft.world.entity.animal.Parrot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.core.NonNullList;

public class ItemPamSeed extends ItemNameBlockItem {

	public ItemPamSeed(Block blockIn, Properties properties) {
		super(blockIn, properties);
	}
	
	public void fillItemCategory(CreativeModeTab group, NonNullList<ItemStack> items) {
	      if (this.allowdedIn(group)) {
	         items.add(new ItemStack(this));
	      }

	   }
	

	public InteractionResult itemInteractionForEntity(ItemStack itemstack, Player player,
			LivingEntity entity, InteractionHand hand) {

		ItemStack stack = player.getItemInHand(hand);

		if (!entity.getLevel().isClientSide() && !entity.isBaby() && entity instanceof AgeableMob && (int) ((AgeableMob) entity).getAge() == 0) {
			if (entity instanceof Chicken) {
				if (((Chicken) entity).isInLove()) {
					return InteractionResult.FAIL;
				} else {
					((Chicken) entity).setInLove(player);
					if (!player.isCreative())
						stack.shrink(1);
					return InteractionResult.PASS;
				}
			}

			if (entity instanceof Parrot)
				if (!entity.getLevel().isClientSide()) {
					if (!((Parrot) entity).isTame())
						if (Math.random() <= 0.33) {
							((Parrot) entity).tame(player);
							((Parrot) entity).setInLove(player);
						}
					if (!player.isCreative())
						stack.shrink(1);
				}
		}

		if (entity.isBaby()) {
			if (!player.isCreative())
				stack.shrink(1);
			((AgeableMob) entity).ageUp((int) ((float) (-((AgeableMob) entity).getAge() / 20) * 0.1F),
					true);
			return InteractionResult.PASS;
		}
		return InteractionResult.FAIL;
	}

}
