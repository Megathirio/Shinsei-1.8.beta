package com.megathirio.shinsei.blocks;

import com.megathirio.shinsei.core.ShinseiTabs;
import com.megathirio.shinsei.items.ShinseiItems;
import com.megathirio.shinsei.utilities.Names;
import com.megathirio.shinsei.utilities.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

import java.util.HashMap;
import java.util.Map;

public class ShinseiAlloys {
    public static HashMap<Block, Item[]> basicAlloyMap = new HashMap<Block, Item[]>();
    public static HashMap<Item, String> itemOreDict = new HashMap<Item, String>();
    public static HashMap<Block, String> blockOreDict = new HashMap<Block, String>();
    public static HashMap<String, Block> alloyMap = new HashMap<String, Block>();

    public static void addAlloy(){
        alloyMap.put("brass_block", new BaseBlock("brass_block", Material.rock, 4.0f, 6.5f));
        alloyMap.put("bronze_block", new BaseBlock("bronze_block"));
    }

    public ShinseiAlloys(){
        //Ore Dictionary Maps
            //Alloys
                blockOreDict.put(ShinseiBlocks.getBlock("brass_block"), "blockBrass");
                itemOreDict.put(ShinseiItems.getItem("brass_dust"), "dustBrass");
                itemOreDict.put(ShinseiItems.getItem("brass_nugget"), "nuggetBrass");
                itemOreDict.put(ShinseiItems.getItem("brass_ingot"), "ingotBrass");

                blockOreDict.put(ShinseiBlocks.getBlock("bronze_block"), "blockBronze");
                itemOreDict.put(ShinseiItems.getItem("bronze_dust"), "dustBronze");
                itemOreDict.put(ShinseiItems.getItem("bronze_nugget"), "nuggetBronze");
                itemOreDict.put(ShinseiItems.getItem("bronze_ingot"), "ingotBronze");

            //Basic Alloy Map
                basicAlloyMap.put(alloyMap.get("brass_block"), new Item[]{ShinseiItems.getItem("brass_dust"), ShinseiItems.getItem("brass_nugget"), ShinseiItems.getItem("brass_ingot")});
                basicAlloyMap.put(alloyMap.get("bronze_block"), new Item[]{ShinseiItems.getItem("bronze_dust"), ShinseiItems.getItem("bronze_nugget"), ShinseiItems.getItem("bronze_ingot")});
    }

    public static void createAlloys(){
        addAlloy();
        for(Map.Entry<String, Block> oreEntry : alloyMap.entrySet()){
            GameRegistry.registerBlock(oreEntry.getValue(), oreEntry.getKey());
        }
    }

    public static void registerBlockRenderer(){
        for (Map.Entry<Block, Item[]> mapEntry : basicAlloyMap.entrySet()) {
            Block block = mapEntry.getKey();

            reg(block);
        }
    }

    public static void oreDictBlocks(){
        for(Map.Entry<Block, String> oreDictEntry : blockOreDict.entrySet()){
            OreDictionary.registerOre(oreDictEntry.getValue(), oreDictEntry.getKey());
        }
    }

    public static void oreDictItems(){
        for(Map.Entry<Item, String> oreDictEntry : itemOreDict.entrySet()){
            OreDictionary.registerOre(oreDictEntry.getValue(), oreDictEntry.getKey());
        }
    }

    public static String modid = Reference.MOD_ID;

    public static void reg(Block block){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
                .register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(modid + ":" + block.getUnlocalizedName().substring(5), "inventory"));
    }

    public static Block getBlock(String blockName){
        return alloyMap.get(blockName);
    }

    public static HashMap<Block, Item[]> getBasicAlloyMap() {
        return basicAlloyMap;
    }

    public static HashMap<Block,String> getBlockOreDict() {
        return blockOreDict;
    }

    public static HashMap<Item, String> getItemOreDict() {
        return itemOreDict;
    }

    public static HashMap<String, Block> getAlloyMap() {
        return alloyMap;
    }
}
