package net.foldwind.spacecraftmod.item;

import net.foldwind.spacecraftmod.SpaceCraftMod;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SpaceCraftMod.MOD_ID);
    public static final RegistryObject<Item> RAW_TITANIUM = ITEMS.register("raw_titanium", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_URANIUM = ITEMS.register("raw_uranium", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IRON_STICK = ITEMS.register("iron_stick", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TITANIUM_SWORD = ITEMS.register("titanium_sword", () -> new SwordItem(ModToolTiers.TITANIUM, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.TITANIUM, 3, -2.4f))));
    public static final RegistryObject<Item> TITANIUM_PICKAXE = ITEMS.register("titanium_pickaxe", () -> new PickaxeItem(ModToolTiers.TITANIUM, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.TITANIUM, 1, -2.8f))));
    public static final RegistryObject<Item> TITANIUM_AXE = ITEMS.register("titanium_axe", () -> new AxeItem(ModToolTiers.TITANIUM, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.TITANIUM, 5, -3.0f))));
    public static final RegistryObject<Item> TITANIUM_SHOVEL = ITEMS.register("titanium_shovel", () -> new ShovelItem(ModToolTiers.TITANIUM, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.TITANIUM, 1.5f, -3.0f))));
    public static final RegistryObject<Item> TITANIUM_HOE = ITEMS.register("titanium_hoe", () -> new SwordItem(ModToolTiers.TITANIUM, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.TITANIUM, -5, 0.0f))));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
