package net.justmili.fabric;

import net.fabricmc.api.ModInitializer;

import net.justmili.AlwaysShield;

public final class AlwaysShieldFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        AlwaysShield.init();
    }
}
