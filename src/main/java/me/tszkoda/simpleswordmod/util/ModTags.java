package me.tszkoda.simpleswordmod.util;

import me.tszkoda.simpleswordmod.SimpleSwordMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {

        public static final TagKey<Block> NEEDS_STURDY_GEM_TOOL = tag("needs_sturdy_gem_tool");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(SimpleSwordMod.MOD_ID, name));
        }
    }


    public static class Items {

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(SimpleSwordMod.MOD_ID, name));
        }
    }
}
