package pam.pamhc2crops.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropsBlock;
import net.minecraft.block.FarmlandBlock;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class BlockPamCrop extends CropsBlock {
	@SuppressWarnings("unused")
	private String name;
	public static final IntegerProperty AGE = BlockStateProperties.AGE_0_7;

	public BlockPamCrop(Block.Properties builder, String name) {
		super(builder);
		this.name = name;
		this.setDefaultState(this.stateContainer.getBaseState().with(this.getAgeProperty(), Integer.valueOf(0)));
	}

	protected boolean isValidGround(BlockState state, IBlockReader worldIn, BlockPos pos) {
		return state.getBlock() instanceof FarmlandBlock;
	}

	@Override
	protected IItemProvider getSeedsItem() {
		return this.asItem();
	}


	@Override
	public void fillItemGroup(ItemGroup group, NonNullList<ItemStack> items) {
	      items.add(new ItemStack(this));
	   }


}