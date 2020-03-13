package com.spikespaz.essentialadditions;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public final class ModBlocks {
    public static final Block SULFUR_BLOCK = new Block(FabricBlockSettings.of(Material.SAND).build());
    public static final Block EYE_ORE = new Block(FabricBlockSettings.of(Material.STONE).build());
    public static final Block RUBY_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).build());
    public static final Block RUBY_ORE = new Block(FabricBlockSettings.of(Material.STONE).build());
    public static final Block CHARCOAL_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).build());
    public static final Block FOREST_MULCH = new Block(FabricBlockSettings.of(Material.LEAVES).build());

    public static void registerModBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(EssentialAdditions.MODID, "sulfur_block"), SULFUR_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(EssentialAdditions.MODID, "eye_ore"), EYE_ORE);
        Registry.register(Registry.BLOCK, new Identifier(EssentialAdditions.MODID, "ruby_block"), RUBY_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(EssentialAdditions.MODID, "ruby_ore"), RUBY_ORE);
        Registry.register(Registry.BLOCK, new Identifier(EssentialAdditions.MODID, "charcoal_block"), CHARCOAL_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(EssentialAdditions.MODID, "forest_mulch"), FOREST_MULCH);
    }

    public static void registerModBlockItems() {
        Registry.register(Registry.ITEM, new Identifier(EssentialAdditions.MODID, "sulfur_block"), new BlockItem(SULFUR_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(EssentialAdditions.MODID, "eye_ore"), new BlockItem(EYE_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(EssentialAdditions.MODID, "ruby_block"), new BlockItem(RUBY_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(EssentialAdditions.MODID, "ruby_ore"), new BlockItem(RUBY_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(EssentialAdditions.MODID, "charcoal_block"), new BlockItem(CHARCOAL_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(EssentialAdditions.MODID, "forest_mulch"), new BlockItem(FOREST_MULCH, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
    }
}
