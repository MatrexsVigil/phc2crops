package pam.pamhc2crops.events;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import pam.pamhc2crops.Pamhc2crops;
import pam.pamhc2crops.config.FeatureConfig;
import pam.pamhc2crops.config.RightClickConfig;
import pam.pamhc2crops.events.harvest.CropHarvest;

@Mod.EventBusSubscriber(modid = Pamhc2crops.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class EventSetup {
	public static void setupEvents() {
	MinecraftForge.EVENT_BUS.register(new TemptationTask());

	if (FeatureConfig.rightclick_harvest.get()) {
		if (RightClickConfig.crop_right_click.get())
			MinecraftForge.EVENT_BUS.register(new CropHarvest());
	}
}

	@SubscribeEvent
	public static void registerLootModifierSerializers (final RegistryEvent.Register<GlobalLootModifierSerializer<?>> event) {
		event.getRegistry().registerAll(
				new PamLootHandler.PamLootSerializer().setRegistryName(
						Pamhc2crops.getId("fern_drops")
				),
				new PamLootHandler.PamLootSerializer().setRegistryName(
						Pamhc2crops.getId("grass_drops")
				),
				new PamLootHandler.PamLootSerializer().setRegistryName(
						Pamhc2crops.getId("tall_grass_drops")
				)
		);
	}
}
