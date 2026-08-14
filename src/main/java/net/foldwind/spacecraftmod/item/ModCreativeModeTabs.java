package net.foldwind.spacecraftmod.item;

import net.foldwind.spacecraftmod.SpaceCraftMod;
import net.foldwind.spacecraftmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SpaceCraftMod.MOD_ID);
    public static final RegistryObject<CreativeModeTab> ORES_TAB = CREATIVE_MODE_TABS.register("ores_tab", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.URANIUM_ORE.get())).title(Component.translatable("creativetab.spacecraftmod.ores")).displayItems((parameters, output) -> {
        output.accept(ModBlocks.LEAD_ORE.get());
        output.accept(ModBlocks.SULPHUR_ORE.get());
        output.accept(ModBlocks.TITANIUM_ORE.get());
        output.accept(ModBlocks.URANIUM_ORE.get());
        output.accept(ModBlocks.DEEPSLATE_LEAD_ORE.get());
        output.accept(ModBlocks.DEEPSLATE_SULPHUR_ORE.get());
        output.accept(ModBlocks.DEEPSLATE_TITANIUM_ORE.get());
        output.accept(ModBlocks.DEEPSLATE_URANIUM_ORE.get());
        output.accept(ModItems.RAW_LEAD.get());
        output.accept(ModItems.RAW_SULPHUR.get());
        output.accept(ModItems.RAW_TITANIUM.get());
        output.accept(ModItems.RAW_URANIUM.get());
    }).build());
    public static final RegistryObject<CreativeModeTab> RESOURCES_TAB = CREATIVE_MODE_TABS.register("resources_tab", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TITANIUM_INGOT.get())).title(Component.translatable("creativetab.spacecraftmod.resources")).displayItems((parameters, output) -> {
        output.accept(ModItems.TITANIUM_INGOT.get());
        output.accept(ModItems.IRON_STICK.get());
    }).build());
    public static final RegistryObject<CreativeModeTab> TOOLS_TAB = CREATIVE_MODE_TABS.register("tools_tab", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TITANIUM_PICKAXE.get())).title(Component.translatable("creativetab.spacecraftmod.tools")).displayItems((parameters, output) -> {
        output.accept(ModItems.TITANIUM_PICKAXE.get());
        output.accept(ModItems.TITANIUM_AXE.get());
        output.accept(ModItems.TITANIUM_SHOVEL.get());
        output.accept(ModItems.TITANIUM_HOE.get());
    }).build());
    public static final RegistryObject<CreativeModeTab> SWORDS_TAB = CREATIVE_MODE_TABS.register("swords_tab", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TITANIUM_SWORD.get())).title(Component.translatable("creativetab.spacecraftmod.swords")).displayItems((parameters, output) -> {
        output.accept(ModItems.TITANIUM_SWORD.get());
    }).build());
    public static final RegistryObject<CreativeModeTab> ARMOR_TAB = CREATIVE_MODE_TABS.register("armor_tab", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TITANIUM_CHESTPLATE.get())).title(Component.translatable("creativetab.spacecraftmod.armor")).displayItems((parameters, output) -> {
        output.accept(ModItems.TITANIUM_HELMET.get());
        output.accept(ModItems.TITANIUM_CHESTPLATE.get());
        output.accept(ModItems.TITANIUM_LEGGINGS.get());
        output.accept(ModItems.TITANIUM_BOOTS.get());
    }).build());
    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
