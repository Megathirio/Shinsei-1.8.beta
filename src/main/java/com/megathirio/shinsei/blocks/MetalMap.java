package com.megathirio.shinsei.blocks;

import com.megathirio.shinsei.core.ShinseiTabs;
import com.megathirio.shinsei.items.BaseItem;
import com.megathirio.shinsei.items.GemItems;
import com.megathirio.shinsei.ref.Names;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.HashMap;

public class MetalMap {

    public static HashMap<String, Item> metalItemMap = new HashMap<String, Item>();
    public static HashMap<BaseMetal, String> metalMap = new HashMap<BaseMetal, String>();

    public static void addMetals() {
        //new BaseMetal(name),name); - default hardess 2.0f and resistance 3.2f
        metalMap.put(new BaseMetal(Names.ores.ACANTHITE), Names.ores.ACANTHITE);
        metalMap.put(new BaseMetal(Names.ores.BAUXITE), Names.ores.BAUXITE);
        metalMap.put(new BaseMetal(Names.ores.CINNABAR), Names.ores.CINNABAR);
        metalMap.put(new BaseMetal(Names.ores.REALGAR), Names.ores.REALGAR);
        metalMap.put(new BaseMetal(Names.ores.STIBNITE), Names.ores.STIBNITE);
        metalMap.put(new BaseMetal(Names.ores.SYLVITE), Names.ores.SYLVITE);
        //new BaseMetal(name, hardness, resistance),name);
        metalMap.put(new BaseMetal(Names.ores.BARITE, 3.5f, 5.7f), Names.ores.BARITE);
        metalMap.put(new BaseMetal(Names.ores.BISMUTH, 2.25f, 3.6f), Names.ores.BISMUTH);
        metalMap.put(new BaseMetal(Names.ores.BORNITE, 3.0f, 4.9f), Names.ores.BORNITE);
        metalMap.put(new BaseMetal(Names.ores.CHALCOPYRITE, 3.5f, 5.7f), Names.ores.CHALCOPYRITE);
        metalMap.put(new BaseMetal(Names.ores.CRYOLITE, 2.5f, 4.0f), Names.ores.CRYOLITE);
        metalMap.put(new BaseMetal(Names.ores.GALENA, 2.5f, 6.5f), Names.ores.GALENA);
        metalMap.put(new BaseMetal(Names.ores.HEMATITE, 5.0f, 8.1f), Names.ores.HEMATITE);
        metalMap.put(new BaseMetal(Names.ores.PENTLANDITE, 4.0f, 6.5f), Names.ores.PENTLANDITE);
        metalMap.put(new BaseMetal(Names.ores.SPHALERITE, 3.5f, 4.9f), Names.ores.SPHALERITE);
        metalMap.put(new BaseMetal(Names.ores.URANINITE, 1.0f, 3.0f), Names.ores.URANINITE);
        //new BaseMetal(name, hardness, resistance, tool class, harvest level),name);
        metalMap.put(new BaseMetal(Names.ores.CASSITERITE, 7.0f, 11.3f, "pickaxe", 2), Names.ores.CASSITERITE);
        metalMap.put(new BaseMetal(Names.ores.CHROMITE, 8.5f, 13.8f, "pickaxe", 3), Names.ores.CHROMITE);
        metalMap.put(new BaseMetal(Names.ores.COBALTITE, 5.0f, 8.1f, "pickaxe", 2), Names.ores.COBALTITE);
        metalMap.put(new BaseMetal(Names.ores.ILMENITE, 6.0f, 9.7f, "pickaxe", 2), Names.ores.ILMENITE);
        metalMap.put(new BaseMetal(Names.ores.MOLYBDENITE, 1.5f, 2.4f, "pickaxe", 0), Names.ores.MOLYBDENITE);
        metalMap.put(new BaseMetal(Names.ores.PYROLUSITE, 6.0f, 9.7f, "pickaxe", 2), Names.ores.PYROLUSITE);
        metalMap.put(new BaseMetal(Names.ores.RUTILE, 6.0f, 9.7f, "pickaxe", 2), Names.ores.RUTILE);
        metalMap.put(new BaseMetal(Names.ores.SCHEELITE, 5.0f, 8.1f, "pickaxe", 2), Names.ores.SCHEELITE);
        metalMap.put(new BaseMetal(Names.ores.SPERRYLITE, 6.0f, 9.7f, "pickaxe", 2), Names.ores.SPERRYLITE);
        metalMap.put(new BaseMetal(Names.ores.TANTALITE, 6.5f, 10.5f, "pickaxe", 2), Names.ores.TANTALITE);
    }

    public static void addMetalItems() {
        metalItemMap.put(Names.ingots.SILVER, new BaseItem(Names.ingots.SILVER, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.ingots.ALUMINUM, new BaseItem(Names.ingots.ALUMINUM, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.nuggets.SILVER, new BaseItem(Names.nuggets.SILVER, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.nuggets.ALUMINUM, new BaseItem(Names.nuggets.ALUMINUM, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.dusts.SILVER, new BaseItem(Names.dusts.SILVER, ShinseiTabs.METALS_TAB));
        metalItemMap.put(Names.dusts.ALUMINUM, new BaseItem(Names.dusts.ALUMINUM, ShinseiTabs.METALS_TAB));
    }

    public static HashMap<String, Item> getMetalItemMap() {
        return metalItemMap;
    }

    public static HashMap<BaseMetal, String> getMetalMap() {
        return metalMap;
    }
}