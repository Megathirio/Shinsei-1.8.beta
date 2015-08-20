package com.megathirio.shinsei.client.render.blocks;

import com.megathirio.shinsei.blocks.ShinseiAlloys;
import com.megathirio.shinsei.blocks.Gems;
import com.megathirio.shinsei.init.Metals;
import com.megathirio.shinsei.utilities.Reference;
import com.megathirio.shinsei.init.Minerals;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class BlockRenderRegister {

    public static void preInit() {
        MetaBlockRenderRegister.preInit();
    }

    public static void registerBlockRenderer(){
        MetaBlockRenderRegister.registerBlockRenderer();
        Minerals.registerBlockRenderer();
        ShinseiAlloys.registerBlockRenderer();
        Gems.registerBlockRenderer();
        Metals.registerBlockRenderer();
        Minerals.registerBlockRenderer();

/*
        reg(Minerals.getBlock("halite_ore"));
        reg(Minerals.getBlock("meteorite"));
*/
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