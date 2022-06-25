package pam.pamhc2crops;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pam.pamhc2crops.init.ItemRegistry;
import pam.pamhc2crops.worldgen.GardenGeneration;
import pam.pamhc2crops.worldgen.PamConfiguredFeatures;

import javax.annotation.Nonnull;

@Mod("pamhc2crops")
public class Pamhc2crops {
	public static final String MOD_ID = "pamhc2crops";
	public static final Logger LOGGER = LogManager.getLogger();
	public static final ItemGroup ITEM_GROUP = new ItemGroup("pamhc2crops") {
		public ItemStack createIcon() {
			return new ItemStack(ItemRegistry.barleyitem);
		}

	};

	public Pamhc2crops() {
		// Done here to just get them working lol.
		// You can move them to where the belong on your proxies if you prefer them there
		FMLJavaModLoadingContext.get().getModEventBus().addListener(PamConfiguredFeatures::registerConfiguredFeatures);
		MinecraftForge.EVENT_BUS.addListener(GardenGeneration::addFeaturesToBiomes);

		// Cleaned up proxies and swapped depreciated method for safeRunForDist
		DistExecutor.safeRunForDist(() -> SideProxy.Client::new, () -> SideProxy.Server::new);
	}

	@Nonnull
	public static ResourceLocation getId(String path) {
		return new ResourceLocation(MOD_ID, path);
	}

}
