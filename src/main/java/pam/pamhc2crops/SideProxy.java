package pam.pamhc2crops;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.placement.IPlacementConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import pam.pamhc2crops.config.Config;
import pam.pamhc2crops.config.FeatureConfig;
import pam.pamhc2crops.config.RightClickConfig;
import pam.pamhc2crops.events.FernLootHandler;
import pam.pamhc2crops.events.GrassLootHandler;
import pam.pamhc2crops.events.TallGrassLootHandler;
import pam.pamhc2crops.events.TemptationTask;
import pam.pamhc2crops.events.harvest.CropHarvest;
import pam.pamhc2crops.init.BlockRegistry;
import pam.pamhc2crops.init.CompostRegistry;
import pam.pamhc2crops.init.ItemRegistry;
import pam.pamhc2crops.init.WorldGenRegistry;

public class SideProxy {
	SideProxy() {
		ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, Config.CONFIG, "pamhc2crops.toml");
		FMLJavaModLoadingContext.get().getModEventBus().addListener(SideProxy::commonSetup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(SideProxy::enqueueIMC);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(SideProxy::processIMC);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(BlockRegistry::registerAll);
		
		FMLJavaModLoadingContext.get().getModEventBus().addListener(ItemRegistry::registerAll);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(WorldGenRegistry::registerAll);
		
		Config.loadConfig(Config.CONFIG, FMLPaths.CONFIGDIR.get().resolve("pamhc2crops.toml").toString());

		MinecraftForge.EVENT_BUS.addListener(SideProxy::serverStarting);
	}

	
	private static void commonSetup(FMLCommonSetupEvent event) {
		Pamhc2crops.LOGGER.debug("common setup");
		
		MinecraftForge.EVENT_BUS.register(new TemptationTask());

		if (FeatureConfig.rightclick_harvest.get()) {
			if (RightClickConfig.crop_right_click.get())
				MinecraftForge.EVENT_BUS.register(new CropHarvest());
		}
		
		if (FeatureConfig.grass_drop_seeds.get()) {
				MinecraftForge.EVENT_BUS.register(new GrassLootHandler());
		}
		
		if (FeatureConfig.tallgrass_drop_seeds.get()) {
				MinecraftForge.EVENT_BUS.register(new TallGrassLootHandler());
		}
		
		if (FeatureConfig.fern_drop_seeds.get()) {
				MinecraftForge.EVENT_BUS.register(new FernLootHandler());
		}

		
		
		CompostRegistry.register();

		
		//Arid
		if (WorldGenRegistry.arid_worldgen != null) {
			BiomeDictionary.getBiomes(BiomeDictionary.Type.SANDY).forEach((biome) -> {
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						Biome.createDecoratedFeature(WorldGenRegistry.arid_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
			});

		}
		if (WorldGenRegistry.arid_worldgen != null) {
			BiomeDictionary.getBiomes(BiomeDictionary.Type.MESA).forEach((biome) -> {
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						Biome.createDecoratedFeature(WorldGenRegistry.arid_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
			});

		}
		//Frost
		if (WorldGenRegistry.frost_worldgen != null) {
			BiomeDictionary.getBiomes(BiomeDictionary.Type.SNOWY).forEach((biome) -> {
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						Biome.createDecoratedFeature(WorldGenRegistry.frost_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
			});

		}
		if (WorldGenRegistry.frost_worldgen != null) {
			BiomeDictionary.getBiomes(BiomeDictionary.Type.CONIFEROUS).forEach((biome) -> {
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						Biome.createDecoratedFeature(WorldGenRegistry.frost_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
			});

		}
		//Shaded
		if (WorldGenRegistry.shaded_worldgen != null) {
			BiomeDictionary.getBiomes(BiomeDictionary.Type.FOREST).forEach((biome) -> {
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						Biome.createDecoratedFeature(WorldGenRegistry.shaded_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
			});

		}
		if (WorldGenRegistry.shaded_worldgen != null) {
			BiomeDictionary.getBiomes(BiomeDictionary.Type.HILLS).forEach((biome) -> {
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						Biome.createDecoratedFeature(WorldGenRegistry.shaded_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
			});

		}
		if (WorldGenRegistry.shaded_worldgen != null) {
			BiomeDictionary.getBiomes(BiomeDictionary.Type.SPOOKY).forEach((biome) -> {
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						Biome.createDecoratedFeature(WorldGenRegistry.shaded_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
			});

		}
		//Soggy
		if (WorldGenRegistry.soggy_worldgen != null) {
			BiomeDictionary.getBiomes(BiomeDictionary.Type.SWAMP).forEach((biome) -> {
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						Biome.createDecoratedFeature(WorldGenRegistry.soggy_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
			});

		}
		if (WorldGenRegistry.soggy_worldgen != null) {
			BiomeDictionary.getBiomes(BiomeDictionary.Type.RIVER).forEach((biome) -> {
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						Biome.createDecoratedFeature(WorldGenRegistry.soggy_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
			});

		}
		//Windy
		if (WorldGenRegistry.windy_worldgen != null) {
			BiomeDictionary.getBiomes(BiomeDictionary.Type.PLAINS).forEach((biome) -> {
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						Biome.createDecoratedFeature(WorldGenRegistry.windy_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
			});

		}
		if (WorldGenRegistry.windy_worldgen != null) {
			BiomeDictionary.getBiomes(BiomeDictionary.Type.SAVANNA).forEach((biome) -> {
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						Biome.createDecoratedFeature(WorldGenRegistry.windy_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
			});

		}
		//Tropical
		if (WorldGenRegistry.tropical_worldgen != null) {
			BiomeDictionary.getBiomes(BiomeDictionary.Type.JUNGLE).forEach((biome) -> {
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						Biome.createDecoratedFeature(WorldGenRegistry.tropical_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
			});

		}
		if (WorldGenRegistry.tropical_worldgen != null) {
			BiomeDictionary.getBiomes(BiomeDictionary.Type.OCEAN).forEach((biome) -> {
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						Biome.createDecoratedFeature(WorldGenRegistry.tropical_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
			});

		}
		
	}

	private static void enqueueIMC(final InterModEnqueueEvent event) {
	}

	private static void processIMC(final InterModProcessEvent event) {
	}

	private static void serverStarting(FMLServerStartingEvent event) {
	}

	static class Client extends SideProxy {
		Client() {
			FMLJavaModLoadingContext.get().getModEventBus().addListener(Client::clientSetup);
		}

		private static void clientSetup(FMLClientSetupEvent event) {

		}
	}

	static class Server extends SideProxy {
		Server() {
			FMLJavaModLoadingContext.get().getModEventBus().addListener(Server::serverSetup);

		}

		private static void serverSetup(FMLDedicatedServerSetupEvent event) {

		}
	}

}