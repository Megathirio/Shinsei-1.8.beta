package com.megathirio.shinsei.init;

import com.megathirio.shinsei.blocks.BaseBlock;
import com.megathirio.shinsei.core.ShinseiTabs;
import com.megathirio.shinsei.items.BaseItem;
import com.megathirio.shinsei.utilities.Reference;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

import java.util.HashMap;
import java.util.Map;

public class Minerals {
    public static HashMap<Block, Item> mineralMap = new HashMap<Block, Item>();
    public static HashMap<Item, String> itemOreDict = new HashMap<Item, String>();
    public static HashMap<Block, String> blockOreDict = new HashMap<Block, String>();
    public static HashMap<String, Block> mineralBlocksMap = new HashMap<String, Block>();
    public static HashMap<String, Item> mineralItemsMap = new HashMap<String, Item>();

    //Initialize Blocks and Items
    public static void addMineralBlocks(){
        mineralBlocksMap.put("halite_ore", new BaseBlock("halite_ore", 2.5f, 4.0f, ShinseiTabs.MINERALS_TAB));
    }

    public static void addMineralItems(){
        mineralItemsMap.put("salt", new BaseItem("salt"));
    }

    public Minerals(){
        //Ore Dictionary Maps
        //Minerals
        blockOreDict.put(mineralBlocksMap.get("halite_ore"), "oreSalt");
        itemOreDict.put(mineralItemsMap.get("salt"), "dustSalt");

        //Basic Mineral Map
        mineralMap.put(mineralBlocksMap.get("halite_ore"), mineralItemsMap.get("salt"));
    }

    public static void createMinerals(){
        addMineralBlocks();
        addMineralItems();
        //Register Blocks
        for(Map.Entry<String, Block> blockEntry : mineralBlocksMap.entrySet()){
            GameRegistry.registerBlock(blockEntry.getValue(), blockEntry.getKey());
        }
        //Register Items
        for(Map.Entry<String, Item> itemEntry : mineralItemsMap.entrySet()){
            GameRegistry.registerItem(itemEntry.getValue(), itemEntry.getKey());
        }
    }

    //Register Block Textures
    public static void registerBlockRenderer(){
        for (Map.Entry<String, Block> mapEntry : mineralBlocksMap.entrySet()) {
            String unlocalizedName = mapEntry.getKey();
            Block block = mapEntry.getValue();

            Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
                    .register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(Reference.RESOURCE_PREFIX + unlocalizedName, "inventory"));
        }
    }

    //Register Item Textures
    public static void registerItemRenderer() {
        for (Map.Entry<String, Item> mapEntry : mineralItemsMap.entrySet()) {
            String unlocalizedName = mapEntry.getKey();
            Item item = mapEntry.getValue();

            Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
                    .register(item, 0, new ModelResourceLocation(Reference.RESOURCE_PREFIX + unlocalizedName, "inventory"));
        }
    }

    //Register Blocks in Ore Dictionary
    public static void oreDictBlocks(){
        for(Map.Entry<Block, String> oreDictEntry : blockOreDict.entrySet()){
            OreDictionary.registerOre(oreDictEntry.getValue(), oreDictEntry.getKey());
        }
    }

    //Register Items in Ore Dictionary
    public static void oreDictItems(){
        for(Map.Entry<Item, String> oreDictEntry : itemOreDict.entrySet()){
            OreDictionary.registerOre(oreDictEntry.getValue(), oreDictEntry.getKey());
        }
    }

    public static Block getBlock(String blockName){
        return mineralBlocksMap.get(blockName);
    }

    public static Item getItem(String itemName){
        return mineralItemsMap.get(itemName);
    }

    public static HashMap<Block, Item> getMineralMap() {
        return mineralMap;
    }

    public static HashMap<Block, String> getBlockOreDict() {
        return blockOreDict;
    }

    public static HashMap<Item, String> getItemOreDict() {
        return itemOreDict;
    }

    public static HashMap<String, Block> getMineralBlocksMap() {
        return mineralBlocksMap;
    }
}
