package net.foldwind.spacecraftmod.item;

import net.foldwind.spacecraftmod.SpaceCraftMod;
import net.foldwind.spacecraftmod.sound.ModSounds;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SpaceCraftMod.MOD_ID);
    public static final RegistryObject<Item> RAW_LEAD = ITEMS.register("raw_lead", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SULPHUR = ITEMS.register("raw_sulphur", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_TITANIUM = ITEMS.register("raw_titanium", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_URANIUM = ITEMS.register("raw_uranium", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IRON_STICK = ITEMS.register("iron_stick", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TITANIUM_SWORD = ITEMS.register("titanium_sword", () -> new SwordItem(ModToolTiers.TITANIUM, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.TITANIUM, 3, -2.4f))));
    public static final RegistryObject<Item> TITANIUM_PICKAXE = ITEMS.register("titanium_pickaxe", () -> new PickaxeItem(ModToolTiers.TITANIUM, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.TITANIUM, 1, -2.8f))));
    public static final RegistryObject<Item> TITANIUM_AXE = ITEMS.register("titanium_axe", () -> new AxeItem(ModToolTiers.TITANIUM, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.TITANIUM, 5, -3.0f))));
    public static final RegistryObject<Item> TITANIUM_SHOVEL = ITEMS.register("titanium_shovel", () -> new ShovelItem(ModToolTiers.TITANIUM, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.TITANIUM, 1.5f, -3.0f))));
    public static final RegistryObject<Item> TITANIUM_HOE = ITEMS.register("titanium_hoe", () -> new SwordItem(ModToolTiers.TITANIUM, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.TITANIUM, -5, 0.0f))));
    public static final RegistryObject<Item> TITANIUM_HELMET = ITEMS.register("titanium_helmet", () -> new ArmorItem(ModArmorMaterials.TITANIUM_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(50))));
    public static final RegistryObject<Item> TITANIUM_CHESTPLATE = ITEMS.register("titanium_chestplate", () -> new ArmorItem(ModArmorMaterials.TITANIUM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(50))));
    public static final RegistryObject<Item> TITANIUM_LEGGINGS = ITEMS.register("titanium_leggings", () -> new ArmorItem(ModArmorMaterials.TITANIUM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(50))));
    public static final RegistryObject<Item> TITANIUM_BOOTS = ITEMS.register("titanium_boots", () -> new ArmorItem(ModArmorMaterials.TITANIUM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(50))));
    public static final RegistryObject<Item> MUSIC_DISC_INTERSTELLAR = ITEMS.register("music_disc_interstellar", () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.INTERSTELLAR_KEY).stacksTo(1)));
    public static final RegistryObject<Item> MUSIC_DISC_INTERSTELLAR_PIANO = ITEMS.register("music_disc_interstellar_piano", () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.INTERSTELLAR_PIANO_KEY).stacksTo(1)));
    public static final RegistryObject<Item> MUSIC_DISC_LANDS_UNKNOWN = ITEMS.register("music_disc_lands_unknown", () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.LANDS_UNKNOWN_KEY).stacksTo(1)));
    public static final RegistryObject<Item> MUSIC_DISC_SHOOTING_STARS_INSTRUMENTAL = ITEMS.register("music_disc_shooting_stars_instrumental", () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.SHOOTING_STARS_INSTRUMENTAL_KEY).stacksTo(1)));
    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
