package com.megathirio.shinsei.core;

import com.megathirio.shinsei.blocks.GemBlocks;
import com.megathirio.shinsei.blocks.MetalBlocks;
import com.megathirio.shinsei.items.GemItems;
import com.megathirio.shinsei.items.MetalItems;
import com.megathirio.shinsei.world.ShinseiWorldGen;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e){
        GemItems.createGemItems();
        GemBlocks.createGemBlocks();
        MetalItems.createMetalItems();
        MetalBlocks.createMetalBlocks();
    }

    public void init(FMLInitializationEvent e){
        GameRegistry.registerWorldGenerator(new ShinseiWorldGen(), 0);
    }

    public void postInit(FMLPostInitializationEvent e){

    }

}
