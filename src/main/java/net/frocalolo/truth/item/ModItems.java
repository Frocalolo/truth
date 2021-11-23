package net.frocalolo.truth.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.frocalolo.truth.Truth;
import net.frocalolo.truth.entity.ModEntityType;
import net.frocalolo.truth.item.custom.ModArmorItem;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

import java.util.List;

public class ModItems {

    public static final Item FLOWER_OF_TRUTH = registerItem("flower_of_truth", new SwordItem(ModToolMaterial.FLOWER, 8, 1f, new FabricItemSettings().group(ModItemGroup.TRUTH)));
    public static final Item ANCIENT_ROSE = registerItem("ancient_rose", new Item(new FabricItemSettings().group(ModItemGroup.TRUTH)));

    public static final Item SHADOW_SHARD = registerItem("shadow_shard", new Item(new FabricItemSettings().group(ModItemGroup.TRUTH)));
    public static final Item SHADOW_ASSASSIN_HELMET = registerItem("shadow_assassin_helmet", new ModArmorItem(ModArmorMaterial.SHADOW_ASSASSIN, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.TRUTH)));
    public static final Item SHADOW_ASSASSIN_CHESTPLATE = registerItem("shadow_assassin_chestplate", new ArmorItem(ModArmorMaterial.SHADOW_ASSASSIN, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.TRUTH)));
    public static final Item SHADOW_ASSASSIN_LEGGINGS = registerItem("shadow_assassin_leggings", new ArmorItem(ModArmorMaterial.SHADOW_ASSASSIN, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.TRUTH)));
    public static final Item SHADOW_ASSASSIN_BOOTS = registerItem("shadow_assassin_boots", new ArmorItem(ModArmorMaterial.SHADOW_ASSASSIN, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.TRUTH)));

    public static final Item WIGGLEAR_SPAWN_EGG = registerItem("wigglear_spawn_egg", new SpawnEggItem(Truth.WIGGLEAR, 0, 16777215, new FabricItemSettings().group(ModItemGroup.TRUTH)));
    public static final Item WIGGLEARA_SPAWN_EGG = registerItem("wiggeara_spawn_egg", new SpawnEggItem(Truth.WIGGLEARA, 0, 16777215, new FabricItemSettings().group(ModItemGroup.TRUTH)));




    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Truth.MOD_ID, name), item);
    }
    private static Item registerSpawnEggItem(String name, SpawnEggItem spawnEggItem) {
        return Registry.register(Registry.ITEM, new Identifier(Truth.MOD_ID, name), spawnEggItem);
    }

    public static void registerModItems() {
        System.out.println("Registering Mod Items for " + Truth.MOD_ID);
    }
}
