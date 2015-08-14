package com.megathirio.shinsei.utilities.hashmaps;

import com.megathirio.shinsei.items.ShinseiItems;
import com.megathirio.shinsei.items.ShinseiTools;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import java.util.HashMap;

public class HashMaps {
    public static HashMap<String, Integer> colorMap = new HashMap<String, Integer>();
    public static HashMap<String, Integer> brickMap = new HashMap<String, Integer>();

    public static HashMap<Item, Item[]> toolMap = new HashMap<Item, Item[]>();
    public static HashMap<Item, Item> bookMap = new HashMap<Item, Item>();

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
    }

    public static HashMap<String, Integer> getColorMap() {
        return colorMap;
    }

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
