package com.megathirio.shinsei.blocks;

import com.megathirio.shinsei.items.ShinseiFoods;
import com.megathirio.shinsei.items.ShinseiItems;
import com.megathirio.shinsei.utilities.Names;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ShinseiOres {

    public static BaseOre acanthiteOre;
    public static Block amethystOre;
    public static BaseOre bauxiteOre;
    public static Block haliteOre;
    public static Block marble;
    public static Block granite;

    public static Block meteorite;

/*
    public static HashMap<Block, String> testMap = new HashMap<Block, String>();

    public static void addOre(){
        testMap.put(ShinseiOres.acanthiteOre, "acanthite_ore");
        testMap.put(ShinseiOres.bauxiteOre, "bauxite_ore");

    }
*/

    public static void createOres(){
/*
        Set<Map.Entry<Block, String>> testSet = testMap.entrySet();

        for (Map.Entry<Block, String> mapEntry : testSet) {
            Block block = mapEntry.getKey();
            String name = mapEntry.getValue();

            GameRegistry.registerBlock(block = new BaseOre(name, Material.rock, Item.getItemFromBlock(block)), name);
        }
*/


        GameRegistry.registerBlock(acanthiteOre = new BaseOre("acanthite_ore", Material.rock, Item.getItemFromBlock(ShinseiOres.acanthiteOre)), "acanthite_ore");
        GameRegistry.registerBlock(amethystOre = new BaseOre(Names.materials.AMETHYST + "_ore", Material.rock, ShinseiItems.amethystGem, 1, 3), Names.materials.AMETHYST + "_ore");
        GameRegistry.registerBlock(bauxiteOre = new BaseOre("bauxite_ore", Material.rock, Item.getItemFromBlock(ShinseiOres.bauxiteOre)), "bauxite_ore");
        GameRegistry.registerBlock(haliteOre = new BaseOre("halite_ore", Material.rock, ShinseiFoods.salt, 2, 4), "halite_ore");
        GameRegistry.registerBlock(marble = new BlockProperties("marble"), ItemBlockMeta.class, "marble");
        GameRegistry.registerBlock(granite = new BlockProperties("granite", Material.rock, 7.0f, 11.3f), ItemBlockMeta.class, "granite");

        GameRegistry.registerBlock(meteorite = new BaseOre("meteorite", Material.rock, ShinseiItems.silverNugget, 1, 3), "meteorite");
    }
}
