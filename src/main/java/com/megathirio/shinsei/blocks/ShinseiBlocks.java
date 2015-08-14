package com.megathirio.shinsei.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.HashMap;
import java.util.Map;

public class ShinseiBlocks {
    public static HashMap<String, Block> blockEntries = new HashMap<String, Block>();

    public static void addBlock(){
/*
        blockEntries.put("aluminum_block", new BaseBlock("aluminum_block", Material.rock, 2.0f, 3.2f));
        blockEntries.put("antimony_block", new BaseBlock("antimony_block", Material.rock, 2.0f, 3.2f));
        blockEntries.put("barium_block", new BaseBlock("barium_block", Material.rock, 3.5f, 5.7f));
        blockEntries.put("bismuth_block", new BaseBlock("bismuth_block", Material.rock, 2.25f, 3.6f));
        blockEntries.put("copper_block", new BaseBlock("copper_block"));
        blockEntries.put("silver_block", new BaseBlock("silver_block", Material.rock, 2.0f, 3.2f));
        blockEntries.put("tin_block", new BaseBlock("tin_block"));
        blockEntries.put("zinc_block", new BaseBlock("zinc_block"));
*/
    }

    public static void createBlocks(){
        addBlock();
        for(Map.Entry<String, Block> blockEntry : blockEntries.entrySet()){
            GameRegistry.registerBlock(blockEntry.getValue(), blockEntry.getKey());
        }
    }

    public static Block getBlock(String blockName){
        return blockEntries.get(blockName);
    }

}
