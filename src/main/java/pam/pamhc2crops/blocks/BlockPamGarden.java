package pam.pamhc2crops.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.level.BlockGetter;

public class BlockPamGarden extends BushBlock{
	protected static final VoxelShape SHAPE = Block.box(2.0D, 0.0D, 2.0D, 14.0D, 13.0D, 14.0D);
	@SuppressWarnings("unused")
	private String name;
	
	public BlockPamGarden(Block.Properties properties, String name) {
		super(properties);
		this.name = name;
		
	}
	
	@Override
	public net.minecraftforge.common.PlantType getPlantType(BlockGetter world, BlockPos pos) {
			return net.minecraftforge.common.PlantType.PLAINS;
		
	}

	public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context) {
		return SHAPE;
	}

	public Block.OffsetType getOffsetType() {
		return Block.OffsetType.XZ;
	}
	
	@Override
	public boolean isPathfindable(BlockState state, BlockGetter worldIn, BlockPos pos, PathComputationType type) {
	      return true;
	   }
}
