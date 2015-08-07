package com.megathirio.shinsei.utilities.hashmaps;

import com.megathirio.shinsei.blocks.BaseStone;
import com.megathirio.shinsei.blocks.ShinseiBlocks;
import com.megathirio.shinsei.blocks.ShinseiOres;
import com.megathirio.shinsei.items.ShinseiItems;
import com.megathirio.shinsei.items.ShinseiTools;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import java.util.HashMap;

public class HashMaps {
    public static HashMap<String, Integer> colorMap = new HashMap<String, Integer>();
    public static HashMap<String, Integer> brickMap = new HashMap<String, Integer>();

/*
    public static HashMap<Block[], Item[]> basicOreMap = new HashMap<Block[], Item[]>();
    public static HashMap<Block[], Item[]> advOreMap = new HashMap<Block[], Item[]>();
*/
    public static HashMap<Item, Item[]> toolMap = new HashMap<Item, Item[]>();
    public static HashMap<Item, Item> bookMap = new HashMap<Item, Item>();
    public static HashMap<String, Block> blockOreDict = new HashMap<String, Block>();
    public static HashMap<String, Item> itemOreDict = new HashMap<String, Item>();

    public HashMaps(){
        //Colors
        colorMap.put("_white", 0);
        colorMap.put("_orange", 1);
        colorMap.put("_magenta", 2);
        colorMap.put("_ltblue", 3);
        colorMap.put("_yellow", 4);
        colorMap.put("_lime", 5);
        colorMap.put("_pink", 6);
        colorMap.put("_gray", 7);
        colorMap.put("_silver", 8);
        colorMap.put("_cyan", 9);
        colorMap.put("_purple", 10);
        colorMap.put("_blue", 11);
        colorMap.put("_brown", 12);
        colorMap.put("_green", 13);
        colorMap.put("_red",14);
        colorMap.put("_black", 15);

        //Bricks
        brickMap.put("_gray", 0);
        brickMap.put("_tan", 1);
        brickMap.put("_vari", 2);
        brickMap.put("_basalt", 3);
        brickMap.put("_graphite", 4);

/*
        //Basic Ores
        basicOreMap.put(new Block[]{ShinseiOres.getBlock("acanthite_ore"), ShinseiBlocks.getBlock("silver_block")}, new Item[]{ShinseiItems.getItem("silver_dust"), ShinseiItems.getItem("silver_nugget"), ShinseiItems.getItem("silver_ingot")});
        basicOreMap.put(new Block[]{ShinseiOres.getBlock("stibnite_ore"), ShinseiBlocks.getBlock("antimony_block")}, new Item[]{ShinseiItems.getItem("antimony_dust"), ShinseiItems.getItem("antimony_nugget"), ShinseiItems.getItem("antimony_ingot")});

        //Advanced Ores
        advOreMap.put(new Block[]{ShinseiOres.getBlock("bauxite_ore"), ShinseiBlocks.getBlock("aluminum_block")}, new Item[]{ShinseiItems.getItem("aluminum_dust"), ShinseiItems.getItem("aluminum_nugget"), ShinseiItems.getItem("aluminum_ingot")});

*/
        //Tool Heads
        toolMap.put(ShinseiTools.silverAxe, new Item[]{ShinseiTools.silverAxeBlade, ShinseiTools.woodToolHandle, ShinseiTools.bookAxe, ShinseiTools.ironHammer, ShinseiItems.getItem("silverIngot")});
        toolMap.put(ShinseiTools.silverHoe, new Item[]{ShinseiTools.silverHoeBlade, ShinseiTools.woodToolHandle, ShinseiTools.bookHoe, ShinseiTools.ironHammer, ShinseiItems.getItem("silverIngot")});
        toolMap.put(ShinseiTools.silverPickaxe, new Item[]{ShinseiTools.silverPickaxeBlade, ShinseiTools.woodToolHandle, ShinseiTools.bookPickaxe, ShinseiTools.ironHammer, ShinseiItems.getItem("silverIngot")});
        toolMap.put(ShinseiTools.silverShovel, new Item[]{ShinseiTools.silverShovelBlade, ShinseiTools.woodToolHandle, ShinseiTools.bookShovel, ShinseiTools.ironHammer, ShinseiItems.getItem("silverIngot")});
        toolMap.put(ShinseiTools.silverSword, new Item[]{ShinseiTools.silverSwordBlade, ShinseiTools.woodToolHandle, ShinseiTools.bookSword, ShinseiTools.ironHammer, ShinseiItems.getItem("silverIngot")});

        //Books
        bookMap.put(ShinseiTools.bookAxe, Items.stick);
        bookMap.put(ShinseiTools.bookHoe, Items.wheat_seeds);
        bookMap.put(ShinseiTools.bookPickaxe, Item.getItemFromBlock(Blocks.cobblestone));
        bookMap.put(ShinseiTools.bookShovel, Item.getItemFromBlock(Blocks.dirt));
        bookMap.put(ShinseiTools.bookSword, Items.rotten_flesh);


        //Ore Dictionary Blocks
        blockOreDict.put("oreAluminum", ShinseiOres.getBlock("bauxite_ore"));
        blockOreDict.put("oreAntimony", ShinseiOres.getBlock("stibnite_ore"));
        blockOreDict.put("oreSilver", ShinseiOres.getBlock("acanthite_ore"));
        blockOreDict.put("oreSalt", ShinseiOres.getBlock("halite_ore"));

        //Ore Dictionary Items
        itemOreDict.put("dustAluminum", ShinseiItems.getItem("aluminum_dust"));
        itemOreDict.put("nuggetAluminum", ShinseiItems.getItem("aluminum_nugget"));
        itemOreDict.put("ingotAluminum", ShinseiItems.getItem("aluminum_ingot"));
        itemOreDict.put("dustAntimony", ShinseiItems.getItem("antimony_dust"));
        itemOreDict.put("nuggetAntimony", ShinseiItems.getItem("antimony_nugget"));
        itemOreDict.put("ingotAntimony", ShinseiItems.getItem("antimony_ingot"));
        itemOreDict.put("dustSilver", ShinseiItems.getItem("silver_dust"));
        itemOreDict.put("nuggetSilver", ShinseiItems.getItem("silver_nugget"));
        itemOreDict.put("ingotSilver", ShinseiItems.getItem("silver_ingot"));
//        itemOreDict.put("dustSalt", ShinseiItems.getItem("salt"));
    }

    public static HashMap<String, Integer> getColorMap() {
        return colorMap;
    }

    public static HashMap<String, Block> getBlockOreDict() {
        return blockOreDict;
    }

    public static HashMap<String, Item> getItemOreDict() {
        return itemOreDict;
    }

/*
    public static HashMap<Block[], Item[]> getBasicOreMap() {
        return basicOreMap;
    }

    public static HashMap<Block[], Item[]> getAdvOreMap() {
        return advOreMap;
    }

*/
    public static HashMap<String, Integer> getBrickMap() {
        return brickMap;
    }

    public static HashMap<Item, Item[]> getToolMap() {
        return toolMap;
    }

    public static HashMap<Item, Item> getBookMap() {
        return bookMap;
    }

}
