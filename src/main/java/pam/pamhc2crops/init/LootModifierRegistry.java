package pam.pamhc2crops.init;

import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import pam.pamhc2crops.Pamhc2crops;
import pam.pamhc2crops.datagen.common.lootmodifiers.PlantAdditionModifier;

public class LootModifierRegistry {
    private static final DeferredRegister<GlobalLootModifierSerializer<?>> GLM = DeferredRegister.create(
            ForgeRegistries.Keys.LOOT_MODIFIER_SERIALIZERS, Pamhc2crops.MOD_ID);

    public static final RegistryObject<PlantAdditionModifier.Serializer> PLANT_ADDITION = GLM.register("additional_plant_drops", PlantAdditionModifier.Serializer::new);

    public static void registerLootModifiers(IEventBus bus){
        GLM.register(bus);
    }
}
