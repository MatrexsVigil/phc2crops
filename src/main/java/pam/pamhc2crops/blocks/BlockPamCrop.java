package pam.pamhc2crops.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropsBlock;
import net.minecraft.block.FarmlandBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import pam.pamhc2crops.init.ItemRegistry;

public class BlockPamCrop extends CropsBlock {
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

	protected IItemProvider getSeedsItem() {
		switch (name) {
		case "barley":
			return ItemRegistry.barleyseeditem;	
		case "tomato":
			return ItemRegistry.tomatoseeditem;
		default:
			return Items.WHEAT_SEEDS;
		}
	}

	public ItemStack getItem(IBlockReader worldIn, BlockPos pos, BlockState state) {
		switch (name) {
		case "barley":
			return new ItemStack(ItemRegistry.barleyitem);
		case "tomato":
			return new ItemStack(ItemRegistry.tomatoitem);
		default:
			return new ItemStack(Items.WHEAT);
		}
	}

}