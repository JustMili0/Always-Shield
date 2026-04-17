package net.justmili.alwaysshield.forge;

import net.justmili.alwaysshield.AlwaysShield;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(AlwaysShield.MOD_ID)
public class AlwaysShieldForge {
    public AlwaysShieldForge(FMLJavaModLoadingContext context) {
        AlwaysShield.init();

        FMLClientSetupEvent.getBus(context.getModBusGroup()).addListener(AlwaysShieldForge::onInitializeClient);
    }

    public static void onInitializeClient(FMLClientSetupEvent event) {
        AlwaysShield.init();
    }
}
