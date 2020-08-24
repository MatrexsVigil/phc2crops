package pam.pamhc2crops;

import javax.annotation.Nonnull;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import pam.pamhc2crops.init.ItemRegistry;

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
		DistExecutor.runForDist(() -> () -> new SideProxy.Client(), () -> () -> new SideProxy.Server());
	}

	@Nonnull
	public static ResourceLocation getId(String path) {
		return new ResourceLocation(MOD_ID, path);
	}

}
