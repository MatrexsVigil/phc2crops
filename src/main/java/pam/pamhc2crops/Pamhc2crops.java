package pam.pamhc2crops;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pam.pamhc2crops.init.ItemRegistry;
import pam.pamhc2crops.worldgen.GardenGeneration;
import pam.pamhc2crops.init.FeatureRegistry;

import javax.annotation.Nonnull;

@Mod("pamhc2crops")
public class Pamhc2crops {
	public static final String MOD_ID = "pamhc2crops";
	public static final Logger LOGGER = LogManager.getLogger();
	public static final CreativeModeTab ITEM_GROUP = new CreativeModeTab("pamhc2crops") {
		public ItemStack makeIcon() {
			return new ItemStack(ItemRegistry.barleyitem.get());
		}

	};

	public Pamhc2crops() {
		// Cleaned up proxies and swapped depreciated method for safeRunForDist
		DistExecutor.safeRunForDist(() -> SideProxy.Client::new, () -> SideProxy.Server::new);
	}

	@Nonnull
	public static ResourceLocation getId(String path) {
		return new ResourceLocation(MOD_ID, path);
	}

}
