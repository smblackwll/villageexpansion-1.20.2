package ninjadude75.villageexapansion;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.block.v1.FabricBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
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
	public static final Block GUARD_POST = new Block(FabricBlockSettings.create().strength(5.0f));

	public static final Block MERCHANT_BLOCK = new Block(FabricBlockSettings.create().strength(4.0f));

	private static final ItemGroup WORKSTATION_GROUP = FabricItemGroup.builder()
			.icon(() -> new ItemStack(VillageExpansion.MERCHANT_BLOCK))
			.displayName(Text.translatable("itemGroup.villageexpansion.workstation_group"))
			.entries((context, entries) -> {
				entries.add(VillageExpansion.MERCHANT_BLOCK);
				entries.add(VillageExpansion.GUARD_POST);
				entries.add(VillageExpansion.HUNTER_BLOCK);
			})
			.build();

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");
		//Loading all basic blocks here
		Registry.register(Registries.BLOCK, new Identifier("villageexpansion","hunter_block"), HUNTER_BLOCK);
		Registry.register(Registries.BLOCK, new Identifier("villageexpansion","guard_post"), GUARD_POST);
		Registry.register(Registries.BLOCK, new Identifier("villageexpansion","merchant_block"), MERCHANT_BLOCK);




		//Loading all items here
		Registry.register(Registries.ITEM, new Identifier("villageexpansion", "hunter_block"), new BlockItem(HUNTER_BLOCK, new FabricItemSettings()));
		Registry.register(Registries.ITEM, new Identifier("villageexpansion","guard_post"), new BlockItem(GUARD_POST, new FabricItemSettings()));
		Registry.register(Registries.ITEM, new Identifier("villageexpansion","merchant_block"), new BlockItem(MERCHANT_BLOCK, new FabricItemSettings()));


		//Registering item groups (creative mode tabs)

		Registry.register(Registries.ITEM_GROUP, new Identifier(VillageExpansion.MOD_ID, "workstation_group"), WORKSTATION_GROUP);








		//Loading all villages/villager stuff here

		ModCustomTrades.registerCustomTrades();


		ModVillagers.registerVillagers();



	}
}