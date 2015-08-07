package com.megathirio.shinsei.client.render.blocks;

import com.megathirio.shinsei.blocks.ShinseiOres;
import com.megathirio.shinsei.utilities.hashmaps.HashMaps;
import com.megathirio.shinsei.utilities.Reference;
import com.megathirio.shinsei.utilities.hashmaps.Metals;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public final class BlockRenderRegister {

    public static HashMap<Block[], Item[]> basicOreMap = new Metals().getBasicOreMap();
    public static Set<Map.Entry<Block[], Item[]>> basicOreSet = basicOreMap.entrySet();
    public static HashMap<Block[], Item[]> advOreMap = new Metals().getAdvOreMap();
    public static Set<Map.Entry<Block[], Item[]>> advOreSet = advOreMap.entrySet();

    public static void preInit() {
        MetaBlockRenderRegister.preInit();
    }

    public static void registerBlockRenderer(){
        MetaBlockRenderRegister.registerBlockRenderer();
        for (Map.Entry<Block[], Item[]> mapEntry : basicOreSet) {
            Block ore = mapEntry.getKey()[0];
            Block block = mapEntry.getKey()[1];

            reg(ore);
            reg(block);
        }

        for (Map.Entry<Block[], Item[]> mapEntry : advOreSet) {
            Block ore = mapEntry.getKey()[0];
            Block block = mapEntry.getKey()[1];

            reg(ore);
            reg(block);
        }

        reg(ShinseiOres.getBlock("halite_ore"));
        reg(ShinseiOres.getBlock("meteorite"));

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