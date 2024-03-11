package me.tszkoda.simpleswordmod.item;

import me.tszkoda.simpleswordmod.SimpleSwordMod;
import me.tszkoda.simpleswordmod.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier STURDY_GEM = TierSortingRegistry.registerTier(
            new ForgeTier(5, 3072, 9f, 5f, 32,
                    ModTags.Blocks.NEEDS_STURDY_GEM_TOOL, () -> Ingredient.of(ModItems.STURDY_GEM.get())),
            new ResourceLocation(SimpleSwordMod.MOD_ID, "sturdy_gem"), List.of(Tiers.NETHERITE), List.of());
}
