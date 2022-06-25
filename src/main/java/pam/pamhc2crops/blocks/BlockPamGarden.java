package pam.pamhc2crops.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.BushBlock;
import net.minecraft.pathfinding.PathType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

public class BlockPamGarden extends BushBlock{
	protected static final VoxelShape SHAPE = Block.makeCuboidShape(2.0D, 0.0D, 2.0D, 14.0D, 13.0D, 14.0D);
	@SuppressWarnings("unused")
	private String name;
	
	public BlockPamGarden(Block.Properties properties, String name) {
		super(properties);
		this.name = name;
		
	}
	
	@Override
	public net.minecraftforge.common.PlantType getPlantType(IBlockReader world, BlockPos pos) {
			return net.minecraftforge.common.PlantType.PLAINS;
		
	}

	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		return SHAPE;
	}

	public Block.OffsetType getOffsetType() {
		return Block.OffsetType.XZ;
	}
	
	@Override
	public boolean allowsMovement(BlockState state, IBlockReader worldIn, BlockPos pos, PathType type) {
	      return true;
	   }
}
