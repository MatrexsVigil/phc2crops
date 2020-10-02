package pam.pamhc2crops.worldgen.configs;

import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.BlockClusterFeatureConfig;
import pam.pamhc2crops.config.ClusterConfig;
import pam.pamhc2crops.init.BlockRegistry;

public class FeatureConfigs {
	
	public static final BlockClusterFeatureConfig ARID_GARDEN_CONFIG = (new BlockClusterFeatureConfig.Builder
			(new SimpleBlockStateProvider(BlockRegistry.aridgarden.getDefaultState()), 
					new SimpleBlockPlacer())).tries(ClusterConfig.garden_cluster_amount.get()).func_227317_b_().build();
	
	public static final BlockClusterFeatureConfig FROST_GARDEN_CONFIG = (new BlockClusterFeatureConfig.Builder
			(new SimpleBlockStateProvider(BlockRegistry.frostgarden.getDefaultState()), 
					new SimpleBlockPlacer())).tries(ClusterConfig.garden_cluster_amount.get()).build();
	
	public static final BlockClusterFeatureConfig TROPICAL_GARDEN_CONFIG = (new BlockClusterFeatureConfig.Builder
			(new SimpleBlockStateProvider(BlockRegistry.tropicalgarden.getDefaultState()), 
					new SimpleBlockPlacer())).tries(ClusterConfig.garden_cluster_amount.get()).build();
	
	public static final BlockClusterFeatureConfig WINDY_GARDEN_CONFIG = (new BlockClusterFeatureConfig.Builder
			(new SimpleBlockStateProvider(BlockRegistry.windygarden.getDefaultState()), 
					new SimpleBlockPlacer())).tries(ClusterConfig.garden_cluster_amount.get()).build();
	
	public static final BlockClusterFeatureConfig SHADED_GARDEN_CONFIG = (new BlockClusterFeatureConfig.Builder
			(new SimpleBlockStateProvider(BlockRegistry.shadedgarden.getDefaultState()), 
					new SimpleBlockPlacer())).tries(ClusterConfig.garden_cluster_amount.get()).build();
	
	public static final BlockClusterFeatureConfig SOGGY_GARDEN_CONFIG = (new BlockClusterFeatureConfig.Builder
			(new SimpleBlockStateProvider(BlockRegistry.soggygarden.getDefaultState()), 
					new SimpleBlockPlacer())).tries(ClusterConfig.garden_cluster_amount.get()).build();
	

}
