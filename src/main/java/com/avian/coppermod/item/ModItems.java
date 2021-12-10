package com.avian.coppermod.item;

import com.avian.coppermod.CopperMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CopperMod.MOD_ID);

    public static final RegistryObject<Item> COBBER_INGOT = ITEMS.register( "cobber_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.COPPER_TAB)));

    public static final RegistryObject<Item> RAW_COBBER = ITEMS.register( "raw_cobber",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.COPPER_TAB)));

    public static final RegistryObject<Item> COBBER_NUGGET = ITEMS.register( "cobber_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.COPPER_TAB)));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
