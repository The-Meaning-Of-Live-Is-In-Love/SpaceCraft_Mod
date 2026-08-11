package net.foldwind.spacecraftmod.datagen;

import net.foldwind.spacecraftmod.SpaceCraftMod;
import net.foldwind.spacecraftmod.block.ModBlocks;
import net.foldwind.spacecraftmod.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, SpaceCraftMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.TITANIUM_ORE.get())
                .add(ModBlocks.DEEPSLATE_TITANIUM_ORE.get())
                .add(ModBlocks.URANIUM_ORE.get())
                .add(ModBlocks.DEEPSLATE_URANIUM_ORE.get());
        tag(ModTags.Blocks.NEEDS_TITANIUM_TOOL)
                .add(ModBlocks.URANIUM_ORE.get())
                .add(ModBlocks.DEEPSLATE_URANIUM_ORE.get());
        tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
                .add(ModBlocks.TITANIUM_ORE.get())
                .add(ModBlocks.DEEPSLATE_TITANIUM_ORE.get())
                .add(ModBlocks.URANIUM_ORE.get())
                .add(ModBlocks.DEEPSLATE_URANIUM_ORE.get());
        tag(BlockTags.INCORRECT_FOR_STONE_TOOL)
                .add(ModBlocks.TITANIUM_ORE.get())
                .add(ModBlocks.DEEPSLATE_TITANIUM_ORE.get())
                .add(ModBlocks.URANIUM_ORE.get())
                .add(ModBlocks.DEEPSLATE_URANIUM_ORE.get());
        tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
                .add(ModBlocks.TITANIUM_ORE.get())
                .add(ModBlocks.DEEPSLATE_TITANIUM_ORE.get())
                .add(ModBlocks.URANIUM_ORE.get())
                .add(ModBlocks.DEEPSLATE_URANIUM_ORE.get());
        tag(BlockTags.INCORRECT_FOR_IRON_TOOL)
                .add(ModBlocks.TITANIUM_ORE.get())
                .add(ModBlocks.DEEPSLATE_TITANIUM_ORE.get())
                .add(ModBlocks.URANIUM_ORE.get())
                .add(ModBlocks.DEEPSLATE_URANIUM_ORE.get());
        tag(BlockTags.INCORRECT_FOR_DIAMOND_TOOL)
                .add(ModBlocks.TITANIUM_ORE.get())
                .add(ModBlocks.DEEPSLATE_TITANIUM_ORE.get())
                .add(ModBlocks.URANIUM_ORE.get())
                .add(ModBlocks.DEEPSLATE_URANIUM_ORE.get());
        tag(BlockTags.INCORRECT_FOR_NETHERITE_TOOL)
                .add(ModBlocks.URANIUM_ORE.get())
                .add(ModBlocks.DEEPSLATE_URANIUM_ORE.get());
    }
}
