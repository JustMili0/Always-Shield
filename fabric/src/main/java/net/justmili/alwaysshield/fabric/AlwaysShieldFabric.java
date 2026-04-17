package net.justmili.alwaysshield.fabric;

import net.justmili.alwaysshield.AlwaysShield;

import net.fabricmc.api.ModInitializer;

public class AlwaysShieldFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        AlwaysShield.init();
    }
}
