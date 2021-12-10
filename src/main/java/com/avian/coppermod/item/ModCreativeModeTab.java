package com.avian.coppermod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab COPPER_TAB = new CreativeModeTab("copperModTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.COBBER_INGOT.get());
        }
    };
}
