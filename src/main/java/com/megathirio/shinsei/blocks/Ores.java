package com.megathirio.shinsei.blocks;

import com.megathirio.shinsei.utilities.Names;
import com.megathirio.shinsei.utilities.Reference;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.Map;

public class Ores {

    public static void addOre(){
        //Register Blocks
        GameRegistry.registerBlock(new BaseOre(Names.ores.ACANTHITE, Names.materials.SILVER), Names.ores.ACANTHITE);
    }
}

