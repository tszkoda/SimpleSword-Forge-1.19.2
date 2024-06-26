package me.tszkoda.simpleswordmod.item;

import me.tszkoda.simpleswordmod.SimpleSwordMod;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SimpleSwordMod.MOD_ID);

    public static final RegistryObject<Item> STURDY_GEM = ITEMS.register("sturdy_gem",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SIMPLESWORD_TAB).fireResistant()));

    public static final RegistryObject<Item> STURDY_GEM_SWORD = ITEMS.register("sturdy_gem_sword",
            () -> new SwordItem(ModToolTiers.STURDY_GEM, 18, 12,
                    new Item.Properties().tab(ModCreativeModeTab.SIMPLESWORD_TAB).fireResistant().rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> GLASS_SWORD = ITEMS.register("glass_sword",
            () -> new SwordItem(Tiers.GOLD, 0, 0,
                    new Item.Properties().tab(ModCreativeModeTab.SIMPLESWORD_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
