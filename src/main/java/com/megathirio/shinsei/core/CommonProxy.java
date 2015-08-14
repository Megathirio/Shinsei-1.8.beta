package com.megathirio.shinsei.core;

import com.megathirio.shinsei.blocks.*;
import com.megathirio.shinsei.crafting.ShinseiCrafting;
import com.megathirio.shinsei.init.Metals;
import com.megathirio.shinsei.init.Minerals;
import com.megathirio.shinsei.init.Gems;
import com.megathirio.shinsei.items.ShinseiItems;
import com.megathirio.shinsei.world.ShinseiWorldGen;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e){
        Gems.createGems();
        Minerals.createMinerals();
        Metals.createMetals();
        ShinseiItems.createItems();
        ShinseiBlocks.createBlocks();
        ShinseiMetaBlocks.createMetaBlocks();
        ShinseiAlloys.createAlloys();
    }

    public void init(FMLInitializationEvent e){
        ShinseiOreDict.items();
        ShinseiOreDict.blocks();
        ShinseiCrafting.initRecipes();
        GameRegistry.registerWorldGenerator(new ShinseiWorldGen(), 0);
    }

    public void postInit(FMLPostInitializationEvent e){

    }

}
