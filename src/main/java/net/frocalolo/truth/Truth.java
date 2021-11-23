package net.frocalolo.truth;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.frocalolo.truth.entity.ShadowAssassinEntity;
import net.frocalolo.truth.entity.ShadowAssassinGuardEntity;
import net.frocalolo.truth.item.ModItems;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static net.frocalolo.truth.item.ModItems.WIGGLEAR_SPAWN_EGG;

public class Truth implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LogManager.getLogger("modid");
	public static final String MOD_ID = "truth";


	public static final EntityType<ShadowAssassinEntity> WIGGLEAR = Registry.register(Registry.ENTITY_TYPE, new Identifier("truth", "wigglear"), FabricEntityTypeBuilder.create(SpawnGroup.CREATURE,
			ShadowAssassinEntity::new).dimensions(EntityDimensions.fixed(1, 2)).build());
	public static final EntityType<ShadowAssassinGuardEntity> WIGGLEARA = Registry.register(Registry.ENTITY_TYPE, new Identifier("truth", "wiggleara"), FabricEntityTypeBuilder.create(SpawnGroup.CREATURE,
			ShadowAssassinGuardEntity::new).dimensions(EntityDimensions.fixed(1, 2)).build());


	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		ModItems.registerModItems();
		FabricDefaultAttributeRegistry.register(WIGGLEAR, ShadowAssassinEntity.createShadowAttributes());
		FabricDefaultAttributeRegistry.register(WIGGLEARA, ShadowAssassinEntity.createShadowAttributes());

		LOGGER.info("Hello Fabric world!");
	}
}
