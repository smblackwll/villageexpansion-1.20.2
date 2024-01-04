package ninjadude75.villageexapansion;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.block.v1.FabricBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import ninjadude75.villageexapansion.util.ModCustomTrades;
import ninjadude75.villageexapansion.villager.ModVillagers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VillageExpansion implements ModInitializer {
	public static final String MOD_ID = "villageexpansion";
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("villageexpansion");

	//adding blocks with no functionality here (just decoration)
	public static final Block HUNTER_BLOCK = new Block(FabricBlockSettings.create().strength(4.0f));

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");
		//Loading all basic blocks here
		Registry.register(Registries.BLOCK, new Identifier("villageexpansion","hunter_block"), HUNTER_BLOCK);



		//Loading all items here
		Registry.register(Registries.ITEM, new Identifier("villageexpansion", "hunter_block"), new BlockItem(HUNTER_BLOCK, new FabricItemSettings()));



		//Loading all villages/villager stuff here

		ModCustomTrades.registerCustomTrades();


		ModVillagers.registerVillagers();



	}
}