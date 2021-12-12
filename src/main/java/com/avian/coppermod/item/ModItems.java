package com.avian.coppermod.item;

import com.avian.coppermod.CopperMod;
import com.avian.coppermod.item.custom.ModTiers;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
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

    public static final RegistryObject<Item> RAW_GCB = ITEMS.register( "raw_gcb",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.COPPER_TAB)
                    .food(new FoodProperties.Builder().nutrition(1).saturationMod(1.5f).effect(() -> new MobEffectInstance(MobEffects.POISON, 100, 1), 0.25f).build())));

    public static final RegistryObject<Item> COOKED_GCB = ITEMS.register( "cooked_gcb",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.COPPER_TAB)
                    .food(new FoodProperties.Builder().nutrition(8).saturationMod(15f).effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1200, 2), 1.0f).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 200, 1), 1.0f).build())));

    public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register( "copper_sword",
            () -> new SwordItem(ModTiers.COPPER, 2, 3f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> COPPER_PICKAXE = ITEMS.register( "copper_pickaxe",
            () -> new PickaxeItem(ModTiers.COPPER, 0, 1f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> COPPER_SHOVEL = ITEMS.register( "copper_shovel",
            () -> new ShovelItem(ModTiers.COPPER, 2, 3f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> COPPER_AXE = ITEMS.register( "copper_axe",
            () -> new AxeItem(ModTiers.COPPER, 3, -2f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> COPPER_HOE = ITEMS.register( "copper_hoe",
            () -> new HoeItem(ModTiers.COPPER, 2, 3f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
