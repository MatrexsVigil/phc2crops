package pam.pamhc2crops.init;

import net.minecraft.block.ComposterBlock;

public class CompostRegistry {
	public static void register() {


		ComposterBlock.CHANCES.put(ItemRegistry.barleyitem, 0.65F);
		
		ComposterBlock.CHANCES.put(ItemRegistry.tomatoitem, 0.65F);

		ComposterBlock.CHANCES.put(ItemRegistry.barleyseeditem, 0.3F);
	
		ComposterBlock.CHANCES.put(ItemRegistry.tomatoseeditem, 0.3F);
	

		

	}

}
