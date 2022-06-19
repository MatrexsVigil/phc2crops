package pam.pamhc2crops.events.harvest;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.NetherWartBlock;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.Level;
import net.minecraft.server.level.ServerLevel;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.RightClickBlock;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.util.ObfuscationReflectionHelper;
import pam.pamhc2crops.Pamhc2crops;
import pam.pamhc2crops.config.RightClickConfig;

import java.lang.reflect.Method;
import java.util.List;

public class CropHarvest {

	private static final Method seedDrops;

	static {
		seedDrops = ObfuscationReflectionHelper.findMethod(CropBlock.class, "func_199772_f");
	}

	private Item getCropSeed(Block block) {
		try {
			return (Item) seedDrops.invoke(block);
		}

		catch (Exception e) {
			Pamhc2crops.LOGGER.error("Where the heck is the seed", e.getLocalizedMessage());
		}

		return null;
	}

	@SubscribeEvent
	public void onCropHarvest(RightClickBlock event) {
		if (event.getPlayer().getItemBySlot(EquipmentSlot.MAINHAND).getItem() != Items.BONE_MEAL) {
			List<ItemStack> drops;
			if (event.getWorld().getBlockState(event.getPos()).getBlock() instanceof CropBlock) {
				if (!event.getPlayer().getItemBySlot(EquipmentSlot.MAINHAND).isEmpty())
					event.setCanceled(true); // prevents blocks from being placed
				CropBlock crop = (CropBlock) event.getWorld().getBlockState(event.getPos()).getBlock();
				if (crop.isMaxAge(event.getWorld().getBlockState(event.getPos()))) {
					if (!event.getWorld().isClientSide()) {
						drops = Block.getDrops(event.getWorld().getBlockState(event.getPos()),
								(ServerLevel) event.getWorld(), event.getPos(),
								event.getWorld().getBlockEntity(event.getPos()));
						for (int i = 0; i < drops.size(); i++) {
							if (drops.get(i).getItem() != getCropSeed(crop))
								event.getWorld()
										.addFreshEntity(new ItemEntity((Level) event.getWorld(), event.getPos().getX(),
												event.getPos().getY(), event.getPos().getZ(),
												(ItemStack) drops.get(i)));
						}
						for (int i = 0; i < drops.size(); i++) {
							if (drops.stream().distinct().limit(2).count() <= 1 || crop == Blocks.POTATOES
									|| crop == Blocks.CARROTS) {
								drops.remove(0);
								event.getWorld()
										.addFreshEntity(new ItemEntity((Level) event.getWorld(), event.getPos().getX(),
												event.getPos().getY(), event.getPos().getZ(),
												(ItemStack) drops.get(i)));
							}

						}
						event.getPlayer().causeFoodExhaustion(.05F);
						event.getWorld().playSound((Player) null, event.getPos(), SoundEvents.CROP_BREAK,
								SoundSource.BLOCKS, 1.0F, 0.8F + event.getWorld().random.nextFloat() * 0.4F);
						event.getWorld().setBlock(event.getPos(), crop.defaultBlockState(), 2);

					}
					event.getPlayer().swing(InteractionHand.MAIN_HAND);
				}
			}

			if (RightClickConfig.crop_right_click.get())
				if (event.getWorld().getBlockState(event.getPos()).getBlock() instanceof NetherWartBlock) {
					if (!event.getPlayer().getItemBySlot(EquipmentSlot.MAINHAND).isEmpty())
						event.setCanceled(true);
					NetherWartBlock nether = (NetherWartBlock) event.getWorld().getBlockState(event.getPos())
							.getBlock();

					if (event.getWorld().getBlockState(event.getPos()).getValue(NetherWartBlock.AGE) == 3) {
						if (!event.getWorld().isClientSide()) {
							drops = Block.getDrops(event.getWorld().getBlockState(event.getPos()),
									(ServerLevel) event.getWorld(), event.getPos(),
									event.getWorld().getBlockEntity(event.getPos()));
							for (int i = 0; i < drops.size(); i++) {
								event.getWorld()
										.addFreshEntity(new ItemEntity((Level) event.getWorld(), event.getPos().getX(),
												event.getPos().getY(), event.getPos().getZ(),
												(ItemStack) drops.get(i)));
							}
							event.getPlayer().causeFoodExhaustion(.05F);
							event.getWorld().playSound((Player) null, event.getPos(),
									SoundEvents.NETHER_WART_BREAK, SoundSource.BLOCKS, 1.0F,
									0.8F + event.getWorld().random.nextFloat() * 0.4F);
							event.getWorld().setBlock(event.getPos(), nether.defaultBlockState(), 2);
						}
						event.getPlayer().swing(InteractionHand.MAIN_HAND);
					}

				}
		}
	}

}