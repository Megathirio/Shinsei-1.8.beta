package com.megathirio.shinsei.client.render.blocks;

import com.megathirio.shinsei.blocks.ShinseiBlocks;
import com.megathirio.shinsei.blocks.ShinseiOres;
import com.megathirio.shinsei.utilities.HashMaps;
import com.megathirio.shinsei.utilities.Reference;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public final class BlockRenderRegister {

    public static HashMap<Block[], Item[]> basicBlockMap = new HashMaps().getBasicOreMap();
    public static Set<Map.Entry<Block[], Item[]>> basicBlockSet = basicBlockMap.entrySet();
    public static HashMap<Block[], Item[]> advBlockMap = new HashMaps().getAdvOreMap();
    public static Set<Map.Entry<Block[], Item[]>> advBlockSet = advBlockMap.entrySet();
    public static HashMap<Block[], Item[]> gemsMap = new HashMaps().getGemsMap();
    public static Set<Map.Entry<Block[], Item[]>> gemsSet = gemsMap.entrySet();

    public static void preInit() {
        MetaBlockRenderRegister.preInit();
    }

    public static void registerBlockRenderer(){
        MetaBlockRenderRegister.registerBlockRenderer();

        for (Map.Entry<Block[], Item[]> mapEntry : basicBlockSet) {
            Block ore = mapEntry.getKey()[0];
            Block block = mapEntry.getKey()[1];

            reg(ore);
            reg(block);
        }

        for (Map.Entry<Block[], Item[]> mapEntry : advBlockSet) {
            Block ore = mapEntry.getKey()[0];
            Block block = mapEntry.getKey()[1];

            reg(ore);
            reg(block);
        }

        for (Map.Entry<Block[], Item[]> mapEntry : gemsSet) {
            Block block = mapEntry.getKey()[0];
            Block ore = mapEntry.getKey()[1];

            reg(block);
            reg(ore);
        }

        reg(ShinseiOres.haliteOre);
        reg(ShinseiOres.meteorite);
        reg(ShinseiBlocks.antimonyBlock);
/*
        reg(ShinseiBlocks.amethystBlock);
*/
        reg(ShinseiBlocks.apatiteBlock);
        reg(ShinseiBlocks.aquamarineBlock);
        reg(ShinseiBlocks.bariumBlock);
        reg(ShinseiBlocks.basaltBlock);
        reg(ShinseiBlocks.bismuthBlock);
        reg(ShinseiBlocks.boraxBlock);
        reg(ShinseiBlocks.brassBlock);
        reg(ShinseiBlocks.bronzeBlock);
        reg(ShinseiBlocks.basaltCobble);
        reg(ShinseiBlocks.chalkBlock);
        reg(ShinseiBlocks.chromiumBlock);
        reg(ShinseiBlocks.cobaltBlock);
        reg(ShinseiBlocks.copperBlock);
        reg(ShinseiBlocks.woodCrateCache);
        reg(ShinseiBlocks.fluoriteBlock);
        reg(ShinseiBlocks.gypsumBlock);
        reg(ShinseiBlocks.haliteBlock);
        reg(ShinseiBlocks.jadeBlock);
        reg(ShinseiBlocks.leadBlock);
        reg(ShinseiBlocks.limestoneBlock);
        reg(ShinseiBlocks.magnesiumBlock);
        reg(ShinseiBlocks.manganeseBlock);
        reg(ShinseiBlocks.molybdenumBlock);
        reg(ShinseiBlocks.nickelBlock);
        reg(ShinseiBlocks.onyxBlock);
        reg(ShinseiBlocks.opalBlock);
        reg(ShinseiBlocks.peridotBlock);
        reg(ShinseiBlocks.platinumBlock);
        reg(ShinseiBlocks.rubyBlock);
        reg(ShinseiBlocks.sapphireBlock);
        reg(ShinseiBlocks.siltstoneBlock);
        reg(ShinseiBlocks.steelBlock);
        reg(ShinseiBlocks.scarletEmeraldBlock);
        reg(ShinseiBlocks.stainlessSteelBlock);
        reg(ShinseiBlocks.tantalumBlock);
        reg(ShinseiBlocks.tinBlock);
        reg(ShinseiBlocks.titaniumBlock);
        reg(ShinseiBlocks.topazBlock);
        reg(ShinseiBlocks.tungstenBlock);
        reg(ShinseiBlocks.turquoiseBlock);
        reg(ShinseiBlocks.vanadiumBlock);
        reg(ShinseiBlocks.zincBlock);
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