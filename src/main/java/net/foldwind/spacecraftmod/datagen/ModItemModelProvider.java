package net.foldwind.spacecraftmod.datagen;

import net.foldwind.spacecraftmod.SpaceCraftMod;
import net.foldwind.spacecraftmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, SpaceCraftMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.RAW_TITANIUM.get());
        basicItem(ModItems.RAW_URANIUM.get());
        basicItem(ModItems.TITANIUM_INGOT.get());
        handheldItem(ModItems.IRON_STICK);
        handheldItem(ModItems.TITANIUM_SWORD);
        handheldItem(ModItems.TITANIUM_PICKAXE);
        handheldItem(ModItems.TITANIUM_AXE);
        handheldItem(ModItems.TITANIUM_SHOVEL);
        handheldItem(ModItems.TITANIUM_HOE);
    }
    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(SpaceCraftMod.MOD_ID,"item/" + item.getId().getPath()));
    }

}
