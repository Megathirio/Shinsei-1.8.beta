package com.megathirio.shinsei.blocks;

import com.megathirio.shinsei.core.ShinseiTabs;
import com.megathirio.shinsei.items.ShinseiFoods;
import com.megathirio.shinsei.items.ShinseiItems;
import com.megathirio.shinsei.utilities.hashmaps.HashMaps;
import com.megathirio.shinsei.utilities.Names;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

import java.util.HashMap;
import java.util.Map;

public class ShinseiOres {

    public static HashMap<String, Block> oreEntries = new HashMap<String, Block>();
    public static HashMap<String, Block> oreDictEntries = HashMaps.getBlockOreDict();

    public static Block marble;
    public static Block granite;

    public static void addOre(){
        oreEntries.put("acanthite_ore", new BaseBlock("acanthite_ore", Material.rock, 2.0f,3.2f).setCreativeTab(ShinseiTabs.ORES_TAB));
        oreEntries.put("amethyst_ore", new BaseOre(Names.materials.AMETHYST + "_ore", Material.rock, ShinseiItems.amethystGem, 1, 3));
        oreEntries.put("bauxite_ore", new BaseBlock("bauxite_ore", Material.rock, 2.0f,3.2f).setCreativeTab(ShinseiTabs.ORES_TAB));
        oreEntries.put("halite_ore", new BaseOre("halite_ore", Material.rock, ShinseiFoods.salt, 2, 4));
        oreEntries.put("meteorite", new BaseOre("meteorite", Material.rock, ShinseiItems.getItem("silver_nugget"), 1, 3));
        oreEntries.put("stibnite_ore", new BaseBlock("stibnite_ore", Material.rock, 2.0f,3.2f).setCreativeTab(ShinseiTabs.ORES_TAB));
    }

    public static void createOres(){
        addOre();
        for(Map.Entry<String, Block> oreEntry : oreEntries.entrySet()){
            GameRegistry.registerBlock(oreEntry.getValue(), oreEntry.getKey());
        }

        GameRegistry.registerBlock(marble = new BlockProperties("marble"), ItemBlockMeta.class, "marble");
        GameRegistry.registerBlock(granite = new BlockProperties("granite", Material.rock, 7.0f, 11.3f), ItemBlockMeta.class, "granite");
    }

    public static void oreDict(){
        for(Map.Entry<String, Block> oreDictEntry : oreDictEntries.entrySet()){
            OreDictionary.registerOre(oreDictEntry.getKey(), oreDictEntry.getValue());
        }
    }

    public static Block getBlock(String blockName){
        return oreEntries.get(blockName);
    }
}
