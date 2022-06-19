package pam.pamhc2crops.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.FarmBlock;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.ItemLike;
import net.minecraft.core.NonNullList;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;

public class BlockPamCrop extends CropBlock {
	@SuppressWarnings("unused")
	private String name;
	public static final IntegerProperty AGE = BlockStateProperties.AGE_7;

	public BlockPamCrop(Block.Properties builder, String name) {
		super(builder);
		this.name = name;
		this.registerDefaultState(this.getStateDefinition().any().setValue(this.getAgeProperty(), Integer.valueOf(0)));
	}

	protected boolean isValidGround(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return state.getBlock() instanceof FarmBlock;
	}

	@Override
	protected ItemLike getBaseSeedId() {
		return this.asItem();
	}


	@Override
	public void fillItemCategory(CreativeModeTab group, NonNullList<ItemStack> items) {
	      items.add(new ItemStack(this));
	   }


}