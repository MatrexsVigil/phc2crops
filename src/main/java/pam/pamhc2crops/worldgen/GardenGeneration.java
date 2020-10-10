package pam.pamhc2crops.worldgen;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.Features;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.*;
import pam.pamhc2crops.Pamhc2crops;
import pam.pamhc2crops.config.ChanceConfig;
import pam.pamhc2crops.config.EnableConfig;
import pam.pamhc2crops.init.BlockRegistry;

@Mod.EventBusSubscriber(modid = Pamhc2crops.MOD_ID)
public final class GardenGeneration {
    
    private GardenGeneration() {}

    public static void registerPlacements(RegistryEvent.Register<Placement<?>> event) {
    }
    

    @SubscribeEvent
    public static void addFeaturesToBiomes(BiomeLoadingEvent biome) {
        
    	if (biome.getCategory() == Biome.Category.DESERT || biome.getCategory() == Biome.Category.MESA) {
    		if (EnableConfig.enable_aridgarden.get())
    		{
    			addAridGarden(biome);
    		}
    	}
    		
    	if (biome.getCategory() == Biome.Category.ICY || biome.getCategory() == Biome.Category.EXTREME_HILLS) {
        	if (EnableConfig.enable_frostgarden.get())
        	{
        		addFrostGarden(biome);
        	}
            
        }
    	
    	if (biome.getCategory() == Biome.Category.FOREST || biome.getCategory() == Biome.Category.TAIGA) {
    		if (EnableConfig.enable_shadedgarden.get())
    		{
    			addShadedGarden(biome);
    		}
            
        }
    	
    	if (biome.getCategory() == Biome.Category.SWAMP || biome.getCategory() == Biome.Category.RIVER) {
    		if (EnableConfig.enable_soggygarden.get())
    		{
    			addSoggyGarden(biome);
    		}
            
        }
    	
    	if (biome.getCategory() == Biome.Category.BEACH || biome.getCategory() == Biome.Category.OCEAN) {
    		if (EnableConfig.enable_tropicalgarden.get())
    		{
    			addTropicalGarden(biome);
    		}
            
        }
    	
    	if (biome.getCategory() == Biome.Category.PLAINS || biome.getCategory() == Biome.Category.SAVANNA) {
    		if (EnableConfig.enable_windygarden.get())
    		{
    			addWindyGarden(biome);
    		}
            
        }   

    }
    
    private static void addAridGarden(BiomeLoadingEvent biome) {
        biome.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.FLOWER
                .withConfiguration(new BlockClusterFeatureConfig.Builder(
                        new SimpleBlockStateProvider(BlockRegistry.aridgarden.getDefaultState()),
                        SimpleBlockPlacer.PLACER
                )/*.tries(1)*/.build())
                .withPlacement(Features.Placements.VEGETATION_PLACEMENT)
                .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                .func_242731_b(1)
                .func_242729_a(ChanceConfig.garden_chance.get()));
    }
    
    private static void addFrostGarden(BiomeLoadingEvent biome) {
        biome.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.FLOWER
                .withConfiguration(new BlockClusterFeatureConfig.Builder(
                        new SimpleBlockStateProvider(BlockRegistry.frostgarden.getDefaultState()),
                        SimpleBlockPlacer.PLACER
                )/*.tries(1)*/.build())
                .withPlacement(Features.Placements.VEGETATION_PLACEMENT)
                .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                .func_242731_b(1)
                .func_242729_a(ChanceConfig.garden_chance.get()));
    }
    
    private static void addShadedGarden(BiomeLoadingEvent biome) {
        biome.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.FLOWER
                .withConfiguration(new BlockClusterFeatureConfig.Builder(
                        new SimpleBlockStateProvider(BlockRegistry.shadedgarden.getDefaultState()),
                        SimpleBlockPlacer.PLACER
                )/*.tries(1)*/.build())
                .withPlacement(Features.Placements.VEGETATION_PLACEMENT)
                .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                .func_242731_b(1)
                .func_242729_a(ChanceConfig.garden_chance.get()));
    }
    
    private static void addSoggyGarden(BiomeLoadingEvent biome) {
        biome.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.FLOWER
                .withConfiguration(new BlockClusterFeatureConfig.Builder(
                        new SimpleBlockStateProvider(BlockRegistry.soggygarden.getDefaultState()),
                        SimpleBlockPlacer.PLACER
                )/*.tries(1)*/.build())
                .withPlacement(Features.Placements.VEGETATION_PLACEMENT)
                .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                .func_242731_b(1)
                .func_242729_a(ChanceConfig.garden_chance.get()));
    }
    
    private static void addTropicalGarden(BiomeLoadingEvent biome) {
        biome.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.FLOWER
                .withConfiguration(new BlockClusterFeatureConfig.Builder(
                        new SimpleBlockStateProvider(BlockRegistry.tropicalgarden.getDefaultState()),
                        SimpleBlockPlacer.PLACER
                )/*.tries(1)*/.build())
                .withPlacement(Features.Placements.VEGETATION_PLACEMENT)
                .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                .func_242731_b(1)
                .func_242729_a(ChanceConfig.garden_chance.get()));
    }
    
    private static void addWindyGarden(BiomeLoadingEvent biome) {
        biome.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.FLOWER
                .withConfiguration(new BlockClusterFeatureConfig.Builder(
                        new SimpleBlockStateProvider(BlockRegistry.windygarden.getDefaultState()),
                        SimpleBlockPlacer.PLACER
                )/*.tries(1)*/.build())
                .withPlacement(Features.Placements.VEGETATION_PLACEMENT)
                .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                .func_242731_b(1)
                .func_242729_a(ChanceConfig.garden_chance.get()));
    }

    /*private static void addAridGarden(BiomeLoadingEvent biome) {
        
        biome.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, 
        		Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.ARID_GARDEN_CONFIG)
        		.withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT).func_242729_a(ChanceConfig.garden_chance.get()));
        
    }
    
      private static void addFrostGarden(BiomeLoadingEvent biome) {
        
    	biome.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, 
        		Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.FROST_GARDEN_CONFIG)
        		.withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT).func_242729_a(ChanceConfig.garden_chance.get()));
    }
    
    private static void addShadedGarden(BiomeLoadingEvent biome) {
        
    	biome.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, 
        		Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.SHADED_GARDEN_CONFIG)
        		.withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT).func_242729_a(ChanceConfig.garden_chance.get()));
    }
    
    
    private static void addSoggyGarden(BiomeLoadingEvent biome) {
        
    	biome.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, 
        		Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.SOGGY_GARDEN_CONFIG)
        		.withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT).func_242729_a(ChanceConfig.garden_chance.get()));
    }

    private static void addTropicalGarden(BiomeLoadingEvent biome) {
        
    	biome.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, 
        		Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.TROPICAL_GARDEN_CONFIG)
        		.withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT).func_242729_a(ChanceConfig.garden_chance.get()));
    }
    
    private static void addWindyGarden(BiomeLoadingEvent biome) {
        
    	biome.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, 
        		Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.WINDY_GARDEN_CONFIG)
        		.withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT).func_242729_a(ChanceConfig.garden_chance.get()));
    }   */
}