package com.avian.coppermod.item.custom;

import com.avian.coppermod.item.ModItems;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;

public class ModTiers {
    public static final ForgeTier COPPER = new ForgeTier(2, 200, 5.0f,
            1.5f, 10, Tags.Blocks.NEEDS_GOLD_TOOL,
            () -> Ingredient.of(Items.COPPER_INGOT));

    public static final ForgeTier COBBER = new ForgeTier(3, 2000, 7.0f,
            3.0f, 14, Tags.Blocks.NEEDS_GOLD_TOOL,
            () -> Ingredient.of(ModItems.COBBER_INGOT.get()));

}
