package com.megathirio.shinsei.client.render.blocks;

import com.megathirio.shinsei.blocks.ShinseiBlocks;
import com.megathirio.shinsei.blocks.ShinseiMetaBlocks;
import com.megathirio.shinsei.utilities.hashmaps.HashMaps;
import com.megathirio.shinsei.utilities.Reference;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

import java.util.HashMap;
import java.util.Set;

public final class MetaBlockRenderRegister {

    public static HashMap<String, Integer> colorMap = new HashMaps().getColorMap();
    public static Set<String> colorSet = colorMap.keySet();
    public static HashMap<String, Integer> brickMap = new HashMaps().getBrickMap();
    public static Set<String> brickSet = brickMap.keySet();
    public static void preInit() {

        // Modelbakery for color Metablocks.
        for (String color : colorSet) {
            ModelBakery.addVariantName(Item.getItemFromBlock(ShinseiMetaBlocks.marble), "shinsei:marble" + color);
            ModelBakery.addVariantName(Item.getItemFromBlock(ShinseiMetaBlocks.granite), "shinsei:granite" + color);
            ModelBakery.addVariantName(Item.getItemFromBlock(ShinseiMetaBlocks.siding), "shinsei:siding" + color);
        }

        // Modelbakery for brick Metablocks.
        for (String brick : brickSet) {
            ModelBakery.addVariantName(Item.getItemFromBlock(ShinseiMetaBlocks.bricks), "shinsei:bricks" + brick);
        }
    }

    public static void registerBlockRenderer(){

        // Register color Metablocks.
        for (String color : colorSet) {
            reg(ShinseiMetaBlocks.marble, colorMap.get(color), "marble" + color);
            reg(ShinseiMetaBlocks.granite, colorMap.get(color), "granite" + color);
            reg(ShinseiMetaBlocks.siding, colorMap.get(color), "siding" + color);
        }

        // Register brick Metablocks.
        for (String brick : brickSet) {
            reg(ShinseiMetaBlocks.bricks, brickMap.get(brick), "bricks" + brick);
        }
    }

    public static String modid = Reference.MOD_ID;

    public static void reg(Block block){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
                .register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(modid + ":" + block.getUnlocalizedName().substring(5), "inventory"));
    }

    public static void reg(Block block, int meta, String file) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), meta, new ModelResourceLocation(modid + ":" + file, "inventory"));
    }
}
