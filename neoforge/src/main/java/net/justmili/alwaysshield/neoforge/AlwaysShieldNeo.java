package net.justmili.alwaysshield.neoforge;

import net.justmili.alwaysshield.AlwaysShield;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

@Mod(AlwaysShield.MOD_ID)
public class AlwaysShieldNeo {
    public AlwaysShieldNeo(IEventBus bus, ModContainer container) {
        AlwaysShield.init();
    }
}
