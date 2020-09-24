package pam.pamhc2crops.worldgen;

import java.util.Random;
import com.mojang.serialization.Codec;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import pam.pamhc2crops.init.BlockRegistry;

public class WindyGardenFeature extends Feature<NoFeatureConfig> {
    public WindyGardenFeature(Codec<NoFeatureConfig> config) {
        super(config);
	}

	public boolean check(IWorld world, BlockPos pos) {
		if (world.getBlockState(pos.down()).getBlock().isIn(BlockTags.SAND)
				&& world.getBlockState(pos).getMaterial().isReplaceable()
				&& world.getBlockState(pos) != Blocks.WATER.getDefaultState()
				&& world.getBlockState(pos) != Blocks.LAVA.getDefaultState())
			return true;
		else
			return false;
	}


	@Override
	public boolean func_241855_a(ISeedReader worldIn, ChunkGenerator generator, Random rand, BlockPos pos, NoFeatureConfig config) {

		int type = (int) ((Math.random() * 4) + 1);
		for (int i = 0; i < type; i++) {
			if (i == 0) {
				int initial = (int) ((Math.random() * 2) + 1);
				int offset = (int) ((Math.random() * 2) + 1);
				if (check(worldIn, pos.north(initial).west(offset)))
					generateGarden(worldIn, pos.north(initial).west(offset), rand, type);
			}
			if (i == 1) {
				int initial = (int) ((Math.random() * 2) + 1);
				int offset = (int) ((Math.random() * 2) + 1);
				if (check(worldIn, pos.south(initial).east(offset)))
					generateGarden(worldIn, pos.south(initial).east(offset), rand, type);
			}
			if (i == 2) {
				int initial = (int) ((Math.random() * 2) + 1);
				int offset = (int) ((Math.random() * 2) + 1);
				if (check(worldIn, pos.north(initial).east(offset)))
					generateGarden(worldIn, pos.north(initial).east(offset), rand, type);
			} else {
				int initial = (int) ((Math.random() * 2) + 1);
				int offset = (int) ((Math.random() * 2) + 1);
				if (check(worldIn, pos.south(initial).west(offset)))
					generateGarden(worldIn, pos.south(initial).west(offset), rand, type);
			}
		}
		return true;
	}

	public void generateGarden(IWorld world, BlockPos pos, Random random, int type) {
			world.setBlockState(pos, getGarden(type), 2);
	}

	private BlockState getGarden(int type) {
			return BlockRegistry.windygarden.getDefaultState();
		
	}
}
