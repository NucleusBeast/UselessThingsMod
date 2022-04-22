package net.nucleusbeast.uselessthings;

import net.fabricmc.api.ModInitializer;
import net.nucleusbeast.uselessthings.block.ModBlocks;
import net.nucleusbeast.uselessthings.blockentity.ModBlockEntity;
import net.nucleusbeast.uselessthings.blockentity.SimpleGeneratorEntity;
import net.nucleusbeast.uselessthings.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import team.reborn.energy.api.EnergyStorage;

public class UselessThings implements ModInitializer {
	//
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	//
	public static final String MOD_ID =	"uselessthings";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModBlockEntity.registerModBlockEntities();

		//Registering energy entities
		EnergyStorage.SIDED.registerForBlockEntity((simpleGenerator, direction) -> simpleGenerator.getEnergy(), ModBlockEntity.SIMPLE_GENERATOR_ENTITY);
	}
}
