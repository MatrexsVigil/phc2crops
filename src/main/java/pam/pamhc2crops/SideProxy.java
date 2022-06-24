package pam.pamhc2crops;

import net.minecraft.world.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.*;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import pam.pamhc2crops.config.Config;
import pam.pamhc2crops.events.EventSetup;
import pam.pamhc2crops.init.BlockRegistry;
import pam.pamhc2crops.init.CompostRegistry;
import pam.pamhc2crops.init.ItemRegistry;
import pam.pamhc2crops.init.ModRenderers;
import pam.pamhc2crops.worldgen.GardenGeneration;

public class SideProxy {
	SideProxy() {
		IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
		ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, Config.CONFIG, "pamhc2crops.toml");
		eventBus.addListener(SideProxy::commonSetup);
		eventBus.addListener(SideProxy::enqueueIMC);
		eventBus.addListener(SideProxy::processIMC);
		BlockRegistry.registerAll(eventBus);

		ItemRegistry.registerAll(eventBus);

		
		Config.loadConfig(Config.CONFIG, FMLPaths.CONFIGDIR.get().resolve("pamhc2crops.toml").toString());

		MinecraftForge.EVENT_BUS.addListener(SideProxy::serverStarting);
		MinecraftForge.EVENT_BUS.addListener(SideProxy::onBiomeLoad);
	}

	
	private static void commonSetup(FMLCommonSetupEvent event) {
		Pamhc2crops.LOGGER.debug("common setup");
		EventSetup.setupEvents();
		event.enqueueWork(() -> {
			CompostRegistry.register();
		});
	}

	private static void onBiomeLoad(BiomeLoadingEvent event) {
		GardenGeneration.addFeaturesToBiomes(event);
	}

	private static void enqueueIMC(final InterModEnqueueEvent event) {
	}

	private static void processIMC(final InterModProcessEvent event) {
	}

	private static void serverStarting(ServerStartingEvent event) {
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

		private static void serverSetup(ServerStartingEvent event) {
		}
	}

}