package com.megathirio.shinsei.blocks;

import com.megathirio.shinsei.items.ShinseiFoods;
import com.megathirio.shinsei.items.ShinseiItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ShinseiOres {

    public static Block acanthiteOre;
    public static Block bauxiteOre;
    public static Block haliteOre;
    public static Block marble;
    public static Block granite;

    public static Block meteorite;


    public static void createOres(){
        GameRegistry.registerBlock(acanthiteOre = new BaseOre("acanthite_ore", Material.rock, Item.getItemFromBlock(ShinseiOres.acanthiteOre)), "acanthite_ore");
        GameRegistry.registerBlock(bauxiteOre = new BaseOre("bauxite_ore", Material.rock, Item.getItemFromBlock(ShinseiOres.bauxiteOre)), "bauxite_ore");
        GameRegistry.registerBlock(haliteOre = new BaseOre("halite_ore", Material.rock, ShinseiFoods.salt, 2, 4), "halite_ore");
        GameRegistry.registerBlock(marble = new BlockProperties("marble"), ItemBlockMeta.class, "marble");
        GameRegistry.registerBlock(granite = new BlockProperties("granite", Material.rock, 7.0f, 11.3f), ItemBlockMeta.class, "granite");

        GameRegistry.registerBlock(meteorite = new BaseOre("meteorite", Material.rock, ShinseiItems.silverNugget, 1, 3), "meteorite");
    }
}
