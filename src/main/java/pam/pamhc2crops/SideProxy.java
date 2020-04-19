package pam.pamhc2crops;

import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.placement.FrequencyConfig;
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
import pam.pamhc2crops.events.EventSetup;
import pam.pamhc2crops.events.FernLootHandler;
import pam.pamhc2crops.events.GrassLootHandler;
import pam.pamhc2crops.events.TallGrassLootHandler;
import pam.pamhc2crops.events.TemptationTask;
import pam.pamhc2crops.events.harvest.CropHarvest;
import pam.pamhc2crops.init.BlockRegistry;
import pam.pamhc2crops.init.CompostRegistry;
import pam.pamhc2crops.init.ItemRegistry;
import pam.pamhc2crops.init.ModRenderers;
import pam.pamhc2crops.init.WorldGenRegistry;
import pam.pamhc2crops.worldgen.GardenGeneration;

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
		EventSetup.setupEvents();
		GardenGeneration.registerWorldGen();
		CompostRegistry.register();

		
		
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
			ModRenderers.registerBlocks();

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