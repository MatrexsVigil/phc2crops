package pam.pamhc2crops.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;
import pam.pamhc2crops.Pamhc2crops;
import pam.pamhc2crops.datagen.client.ModBlockStates;
import pam.pamhc2crops.datagen.client.ModItemModels;
import pam.pamhc2crops.datagen.client.ModLanguageProvfider;
import pam.pamhc2crops.datagen.common.*;

@Mod.EventBusSubscriber(modid = Pamhc2crops.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){
        DataGenerator generator = event.getGenerator();

        if(event.includeServer()){
           generator.addProvider(new GlobalLootModifier(generator));
            ModBlockTags blockTags = new ModBlockTags(generator, event.getExistingFileHelper());
            generator.addProvider(blockTags);
           generator.addProvider(new ModItemTags(generator, blockTags, event.getExistingFileHelper()));
           generator.addProvider(new ModLootTableProvider(generator));
           generator.addProvider(new ModRecipes(generator));
        }

        if(event.includeClient()){
            generator.addProvider(new ModBlockStates(generator, event.getExistingFileHelper()));
            generator.addProvider(new ModItemModels(generator, event.getExistingFileHelper()));
            generator.addProvider(new ModLanguageProvfider(generator, "en_us"));
        }
    }
}
