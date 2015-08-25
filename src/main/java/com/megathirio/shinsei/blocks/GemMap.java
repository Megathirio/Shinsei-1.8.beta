package com.megathirio.shinsei.blocks;

import com.megathirio.shinsei.core.ShinseiTabs;
import com.megathirio.shinsei.items.BaseItem;
import com.megathirio.shinsei.items.GemItems;
import com.megathirio.shinsei.ref.Names;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.HashMap;

public class GemMap {

    public static HashMap<String, Item> gemItemMap = new HashMap<String, Item>();
    public static HashMap<BaseGem, String> gemMap = new HashMap<BaseGem, String>();

    public static void addGems() {
        gemMap.put(new BaseGem(Names.ores.AMETHYST, Material.rock, GemItems.getItem(Names.gems.AMETHYST), 2, 4), Names.ores.AMETHYST);
        gemMap.put(new BaseGem(Names.ores.APATITE, Material.rock, GemItems.getItem(Names.gems.APATITE), 2, 4), Names.ores.APATITE);
/*
        gemMap.put(new BaseGem(Names.ores.BERYL, Material.rock, GemItems.getItem(Names.gems.AQUAMARINE), 7.5, 12.1, 2, 4), Names.ores.APATITE);
        gemMap.put(new BaseGem(Names.ores.APATITE, Material.rock, GemItems.getItem(Names.gems.APATITE), 2, 4), Names.ores.APATITE);
        gemMap.put(new BaseGem(Names.ores.APATITE, Material.rock, GemItems.getItem(Names.gems.APATITE), 2, 4), Names.ores.APATITE);
        gemMap.put(new BaseGem(Names.ores.APATITE, Material.rock, GemItems.getItem(Names.gems.APATITE), 2, 4), Names.ores.APATITE);
        gemMap.put(new BaseGem(Names.ores.APATITE, Material.rock, GemItems.getItem(Names.gems.APATITE), 2, 4), Names.ores.APATITE);
        gemMap.put(new BaseGem(Names.ores.APATITE, Material.rock, GemItems.getItem(Names.gems.APATITE), 2, 4), Names.ores.APATITE);
        gemMap.put(new BaseGem(Names.ores.APATITE, Material.rock, GemItems.getItem(Names.gems.APATITE), 2, 4), Names.ores.APATITE);
*/
    }

    public static void addGemItems() {
        gemItemMap.put(Names.gems.AMETHYST, new BaseItem(Names.gems.AMETHYST, ShinseiTabs.GEMS_TAB));
        gemItemMap.put(Names.gems.APATITE, new BaseItem(Names.gems.APATITE, ShinseiTabs.GEMS_TAB));
    }

    public static HashMap<String, Item> getGemItemMap() {
        return gemItemMap;
    }

    public static HashMap<BaseGem, String> getGemMap() {
        return gemMap;
    }
}