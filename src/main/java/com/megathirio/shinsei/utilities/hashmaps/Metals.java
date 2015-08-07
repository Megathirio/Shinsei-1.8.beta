package com.megathirio.shinsei.utilities.hashmaps;

import com.megathirio.shinsei.blocks.ShinseiBlocks;
import com.megathirio.shinsei.blocks.ShinseiOres;
import com.megathirio.shinsei.items.ShinseiItems;
import com.megathirio.shinsei.items.ShinseiTools;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import java.util.HashMap;

public class Metals {
    public static HashMap<Block[], Item[]> basicOreMap = new HashMap<Block[], Item[]>();
    public static HashMap<Block[], Item[]> advOreMap = new HashMap<Block[], Item[]>();

    public Metals(){
        //Basic Ores
        basicOreMap.put(new Block[]{ShinseiOres.getBlock("acanthite_ore"), ShinseiBlocks.getBlock("silver_block")}, new Item[]{ShinseiItems.getItem("silver_dust"), ShinseiItems.getItem("silver_nugget"), ShinseiItems.getItem("silver_ingot")});
        basicOreMap.put(new Block[]{ShinseiOres.getBlock("stibnite_ore"), ShinseiBlocks.getBlock("antimony_block")}, new Item[]{ShinseiItems.getItem("antimony_dust"), ShinseiItems.getItem("antimony_nugget"), ShinseiItems.getItem("antimony_ingot")});

        //Advanced Ores
        advOreMap.put(new Block[]{ShinseiOres.getBlock("bauxite_ore"), ShinseiBlocks.getBlock("aluminum_block")}, new Item[]{ShinseiItems.getItem("aluminum_dust"), ShinseiItems.getItem("aluminum_nugget"), ShinseiItems.getItem("aluminum_ingot")});

    }

    public static HashMap<Block[], Item[]> getBasicOreMap() {
        return basicOreMap;
    }

    public static HashMap<Block[], Item[]> getAdvOreMap() {
        return advOreMap;
    }
}
