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
        output.accept(ModBlocks.TITANIUM_ORE.get());
        output.accept(ModBlocks.URANIUM_ORE.get());
        output.accept(ModBlocks.DEEPSLATE_TITANIUM_ORE.get());
        output.accept(ModBlocks.DEEPSLATE_URANIUM_ORE.get());
        output.accept(ModItems.RAW_TITANIUM.get());
        output.accept(ModItems.RAW_URANIUM.get());
    }).build());
    public static final RegistryObject<CreativeModeTab> RESOURCES_TAB = CREATIVE_MODE_TABS.register("resources_tab", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TITANIUM_INGOT.get())).title(Component.translatable("creativetab.spacecraftmod.resources")).displayItems((parameters, output) -> {
        output.accept(ModItems.TITANIUM_INGOT.get());
    }).build());
    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
