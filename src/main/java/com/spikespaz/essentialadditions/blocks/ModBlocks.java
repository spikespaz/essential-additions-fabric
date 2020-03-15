package com.spikespaz.essentialadditions.blocks;

import com.spikespaz.essentialadditions.EssentialAdditions;
import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public final class ModBlocks {
    public static final Block SULFUR_BLOCK = new Block(FabricBlockSettings.of(Material.SAND).build());
    public static final Block EYE_ORE = new Block(FabricBlockSettings.of(Material.STONE).build());
    public static final Block RUBY_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).build());
    public static final Block RUBY_ORE = new Block(FabricBlockSettings.of(Material.STONE).build());
    public static final Block CHARCOAL_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).build());
    public static final Block FOREST_MULCH = new ForestMulch(FabricBlockSettings.of(Material.LEAVES, MaterialColor.BROWN).ticksRandomly().strength(0.1F, 0F).sounds(BlockSoundGroup.GRASS).breakByHand(true).breakInstantly().noCollision().build());

    private static final HashMap<String, ItemGroup> CREATIVE_TAB_MAP = new HashMap<>();

    static {
        CREATIVE_TAB_MAP.put("sulfur_block", ItemGroup.BUILDING_BLOCKS);
        CREATIVE_TAB_MAP.put("eye_ore", ItemGroup.BUILDING_BLOCKS);
        CREATIVE_TAB_MAP.put("ruby_block", ItemGroup.BUILDING_BLOCKS);
        CREATIVE_TAB_MAP.put("ruby_ore", ItemGroup.BUILDING_BLOCKS);
        CREATIVE_TAB_MAP.put("charcoal_block", ItemGroup.BUILDING_BLOCKS);
        CREATIVE_TAB_MAP.put("forest_mulch", ItemGroup.BUILDING_BLOCKS);
    }

    public static void registerModBlocks() throws IllegalAccessException {
        Field[] fields = ModBlocks.class.getDeclaredFields();

        for (Field field : fields) {
            Class type = field.getType();

            if (type != Block.class)
                continue;

            Block block = (Block) field.get(null);

            Registry.register(Registry.BLOCK, new Identifier(EssentialAdditions.MODID, field.getName().toLowerCase()), block);
        }
    }

    public static void registerModBlockItems() throws NoSuchFieldException, IllegalAccessException {
        for (Map.Entry<String, ItemGroup> entry : CREATIVE_TAB_MAP.entrySet()) {
            Block block = (Block) ModBlocks.class.getDeclaredField(entry.getKey().toUpperCase()).get(null);

            Registry.register(Registry.ITEM, new Identifier(EssentialAdditions.MODID, entry.getKey()), new BlockItem(block, new Item.Settings().group(entry.getValue())));
        }
    }
}
