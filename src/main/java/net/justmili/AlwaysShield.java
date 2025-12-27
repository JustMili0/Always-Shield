package net.justmili;

import net.fabricmc.api.ModInitializer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AlwaysShield implements ModInitializer {
	public static final String MOD_ID = "alwaysshield";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);
	@Override
	public void onInitialize() {
        LOGGER.warn("Always Shield for Snapshots is present! It may not fully work.");
    }
}