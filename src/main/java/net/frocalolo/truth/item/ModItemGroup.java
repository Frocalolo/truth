package net.frocalolo.truth.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.frocalolo.truth.Truth;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup TRUTH = FabricItemGroupBuilder.build(new Identifier(Truth.MOD_ID, "truth"), () -> new ItemStack(ModItems.FLOWER_OF_TRUTH));
}
