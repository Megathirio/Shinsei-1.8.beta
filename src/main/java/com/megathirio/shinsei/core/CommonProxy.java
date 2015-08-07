package com.megathirio.shinsei.core;

import com.megathirio.shinsei.blocks.ShinseiBlocks;
import com.megathirio.shinsei.blocks.ShinseiOres;
import com.megathirio.shinsei.blocks.ShinseiStones;
import com.megathirio.shinsei.crafting.ShinseiCrafting;
import com.megathirio.shinsei.items.ShinseiItems;
import com.megathirio.shinsei.world.ShinseiWorldGen;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e){
        ShinseiItems.createItems();
        ShinseiBlocks.createBlocks();
/*
        ShinseiStones.registerStones();
*/
        ShinseiOres.createOres();
    }

    public void init(FMLInitializationEvent e){
        ShinseiOreDict.blocks();
        ShinseiCrafting.initRecipes();
        GameRegistry.registerWorldGenerator(new ShinseiWorldGen(), 0);
    }

    public void postInit(FMLPostInitializationEvent e){

    }

}
