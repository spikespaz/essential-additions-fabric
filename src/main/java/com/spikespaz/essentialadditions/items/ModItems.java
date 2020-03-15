package com.spikespaz.essentialadditions.items;

import com.spikespaz.essentialadditions.EssentialAdditions;
import com.spikespaz.essentialadditions.blocks.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public final class ModItems {
    public static final Item OBSIDIAN_SHARD = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item SULFUR = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item CHARCOAL_DUST = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item RUBY = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item IRON_PLATING = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item GOLD_PLATING = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item CHAIN_LINK = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

    public static void registerModItems() throws IllegalAccessException {
        Field[] fields = ModBlocks.class.getDeclaredFields();

        for (Field field : fields) {
            Class type = field.getType();

            if (type != Item.class)
                continue;

            Item item = (Item) field.get(null);

            Registry.register(Registry.ITEM, new Identifier(EssentialAdditions.MODID, field.getName().toLowerCase()), item);
        }
    }
}