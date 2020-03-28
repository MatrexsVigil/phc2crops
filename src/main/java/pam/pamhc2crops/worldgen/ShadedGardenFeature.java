package pam.pamhc2crops.worldgen;

import java.util.Random;
import java.util.function.Function;

import com.mojang.datafixers.Dynamic;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.GenerationSettings;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import pam.pamhc2crops.config.ChanceConfig;
import pam.pamhc2crops.config.DimensionConfig;
import pam.pamhc2crops.init.BlockRegistry;

public class ShadedGardenFeature extends Feature<NoFeatureConfig> {
	public ShadedGardenFeature(Function<Dynamic<?>, ? extends NoFeatureConfig> configFactory) {
		super(configFactory);
	}

	public boolean check(IWorld world, BlockPos pos) {
		if (isValidGround(world.getBlockState(pos.down()), world, pos)
				&& world.getBlockState(pos).getMaterial().isReplaceable()
				&& world.getBlockState(pos) != Blocks.WATER.getDefaultState()
				&& world.getBlockState(pos) != Blocks.LAVA.getDefaultState())
			return true;
		else
			return false;
	}
	
	private boolean isValidGround(BlockState state, IBlockReader worldIn, BlockPos pos) {
		Block block = state.getBlock();
		return block == Blocks.GRASS_BLOCK || block == Blocks.DIRT || block == Blocks.COARSE_DIRT
				|| block == Blocks.PODZOL;
	}


	@Override
	public boolean place(IWorld world, ChunkGenerator<? extends GenerationSettings> generator, Random random,
			BlockPos pos, NoFeatureConfig config) {

		if (random.nextInt(ChanceConfig.garden_chance.get()) != 0
				|| DimensionConfig.blacklist.get().contains(world.getDimension().getType().getId())
				|| !DimensionConfig.whitelist.get().contains(world.getDimension().getType().getId()))
			return false;
		int type = (int) ((Math.random() * 4) + 1);
		for (int i = 0; i < type; i++) {
			if (i == 0) {
				int initial = (int) ((Math.random() * 2) + 1);
				int offset = (int) ((Math.random() * 2) + 1);
				if (check(world, pos.north(initial).west(offset)))
					generateGarden(world, pos.north(initial).west(offset), random, type);
			}
			if (i == 1) {
				int initial = (int) ((Math.random() * 2) + 1);
				int offset = (int) ((Math.random() * 2) + 1);
				if (check(world, pos.south(initial).east(offset)))
					generateGarden(world, pos.south(initial).east(offset), random, type);
			}
			if (i == 2) {
				int initial = (int) ((Math.random() * 2) + 1);
				int offset = (int) ((Math.random() * 2) + 1);
				if (check(world, pos.north(initial).east(offset)))
					generateGarden(world, pos.north(initial).east(offset), random, type);
			} else {
				int initial = (int) ((Math.random() * 2) + 1);
				int offset = (int) ((Math.random() * 2) + 1);
				if (check(world, pos.south(initial).west(offset)))
					generateGarden(world, pos.south(initial).west(offset), random, type);
			}
		}
		return true;
	}

	public void generateGarden(IWorld world, BlockPos pos, Random random, int type) {
			world.setBlockState(pos, getGarden(type), 2);
	}

	private BlockState getGarden(int type) {
			return BlockRegistry.shadedgarden.getDefaultState();
		
	}
}
