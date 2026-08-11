package net.foldwind.spacecraftmod.item;

import net.foldwind.spacecraftmod.block.ModBlocks;
import net.foldwind.spacecraftmod.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModToolTiers {
    public static final Tier TITANIUM = new ForgeTier(3000, 15, 5f,30, ModTags.Blocks.NEEDS_TITANIUM_TOOL, () -> Ingredient.of(ModItems.TITANIUM_INGOT.get()), ModTags.Blocks.INCORRECT_FOR_TITANIUM_TOOL);
}
