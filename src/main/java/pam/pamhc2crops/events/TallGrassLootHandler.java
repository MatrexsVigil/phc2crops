package pam.pamhc2crops.events;

import net.minecraft.loot.LootPool;
import net.minecraft.loot.TableLootEntry;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import pam.pamhc2crops.Pamhc2crops;

public class TallGrassLootHandler {
	private static ResourceLocation tall_grass_drops = new ResourceLocation("minecraft", "blocks/tall_grass");

	@SubscribeEvent
	public void lootTableLoad(LootTableLoadEvent event) {
		if (event.getName().equals(tall_grass_drops))
			event.getTable().addPool(LootPool.builder()
					.addEntry(TableLootEntry.builder(new ResourceLocation(Pamhc2crops.MOD_ID, "blocks/tall_grass_drops")))
					.name("sf_grass_drops").build());


		

	}

}
