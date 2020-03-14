package com.spikespaz.essentialadditions.items;

import com.spikespaz.essentialadditions.EssentialAdditions;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public final class ModItems {
    public static final Item OBSIDIAN_SHARD = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item SULFUR = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item CHARCOAL_DUST = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item RUBY = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item IRON_PLATING = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item GOLD_PLATING = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item CHAIN_LINK = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

    public static void registerModItems() {
        Registry.register(Registry.ITEM, new Identifier(EssentialAdditions.MODID, "obsidian_shard"), OBSIDIAN_SHARD);
        Registry.register(Registry.ITEM, new Identifier(EssentialAdditions.MODID, "sulfur"), SULFUR);
        Registry.register(Registry.ITEM, new Identifier(EssentialAdditions.MODID, "charcoal_dust"), CHARCOAL_DUST);
        Registry.register(Registry.ITEM, new Identifier(EssentialAdditions.MODID, "ruby"), RUBY);
        Registry.register(Registry.ITEM, new Identifier(EssentialAdditions.MODID, "iron_plating"), IRON_PLATING);
        Registry.register(Registry.ITEM, new Identifier(EssentialAdditions.MODID, "gold_plating"), GOLD_PLATING);
        Registry.register(Registry.ITEM, new Identifier(EssentialAdditions.MODID, "chain_link"), CHAIN_LINK);
    }
}