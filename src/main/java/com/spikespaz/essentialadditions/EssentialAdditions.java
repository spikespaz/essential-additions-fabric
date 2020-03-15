package com.spikespaz.essentialadditions;

import com.spikespaz.essentialadditions.blocks.ModBlocks;
import com.spikespaz.essentialadditions.items.ModItems;
import net.fabricmc.api.ModInitializer;

public class EssentialAdditions implements ModInitializer {
	public static final String MODID = "essentialadditions";

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		try {
			ModItems.registerModItems();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		try {
			ModBlocks.registerModBlocks();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		try {
			ModBlocks.registerModBlockItems();
		} catch (NoSuchFieldException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
