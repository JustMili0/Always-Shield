package net.justmili.neoforge;

import net.neoforged.fml.common.Mod;

import net.justmili.ExampleMod;

@Mod(ExampleMod.MOD_ID)
public final class ExampleModNeoForge {
    public ExampleModNeoForge() {
        // Run our common setup.
        ExampleMod.init();
    }
}
