package me.tszkoda.simpleswordmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab SIMPLESWORD_TAB = new CreativeModeTab("simpleswordtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.STURDY_GEM_SWORD.get());
        }
    };
}
