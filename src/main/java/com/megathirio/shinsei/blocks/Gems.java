package com.megathirio.shinsei.blocks;

import com.megathirio.shinsei.blocks.BaseBlock;
import com.megathirio.shinsei.blocks.BaseGem;
import com.megathirio.shinsei.core.ShinseiTabs;
import com.megathirio.shinsei.init.Metals;
import com.megathirio.shinsei.items.BaseItem;
import com.megathirio.shinsei.utilities.Reference;
import com.megathirio.shinsei.utilities.hashmaps.HashMaps;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

import java.util.HashMap;
import java.util.Map;

public class Gems {
    public static HashMap<Block[], Item[]> gemMap = new HashMap<Block[], Item[]>();
    public static HashMap<Item, String> itemOreDict = new HashMap<Item, String>();
    public static HashMap<Block, String> blockOreDict = new HashMap<Block, String>();
    public static HashMap<String, Block> gemBlocksMap = new HashMap<String, Block>();
    public static HashMap<String, Item> gemItemsMap = new HashMap<String, Item>();

    //Initialize Blocks and Items
    public static void addGemBlocks(){
        gemBlocksMap.put("amethyst_ore", new BaseGem("amethyst_ore", Material.rock, Items.acacia_door, 2, 4));
        gemBlocksMap.put("amethyst_block", new BaseBlock("amethyst_block", 7.0f, 11.3f, .5f, 5, ShinseiTabs.GEMS_TAB));
        gemBlocksMap.put("amethyst_lamp", new BaseBlock("amethyst_lamp", Material.iron, 7.0f, 11.3f, ShinseiTabs.GEMS_TAB));
        gemBlocksMap.put("amethyst_stone", new BaseBlock("amethyst_stone", 9.0f, 14.6f, 1.0f, 5, ShinseiTabs.GEMS_TAB));

        gemBlocksMap.put("apatite_ore", new BaseBlock("apatite_ore", 5.0f, 8.1f, .5f, 5, ShinseiTabs.GEMS_TAB));
        gemBlocksMap.put("apatite_block", new BaseBlock("apatite_block", 5.0f, 10.0f, .5f, 5, ShinseiTabs.GEMS_TAB));
        gemBlocksMap.put("apatite_lamp", new BaseBlock("apatite_lamp", Material.iron, 7.0f, 11.3f, ShinseiTabs.GEMS_TAB));
        gemBlocksMap.put("apatite_stone", new BaseBlock("apatite_stone", 9.0f, 14.6f, 1.0f, 5, ShinseiTabs.GEMS_TAB));
    }

    public static void addGemItems(){
        gemItemsMap.put("amethyst_dust", new BaseItem("amethyst_dust"));
        gemItemsMap.put("amethyst_dust_charged", new BaseItem("amethyst_dust_charged"));
        gemItemsMap.put("amethyst_dust_infused", new BaseItem("amethyst_dust_infused"));
        gemItemsMap.put("amethyst_gem", new BaseItem("amethyst_gem"));

        gemItemsMap.put("apatite_dust", new BaseItem("apatite_dust"));
        gemItemsMap.put("apatite_dust_charged", new BaseItem("apatite_dust_charged"));
        gemItemsMap.put("apatite_dust_infused", new BaseItem("apatite_dust_infused"));
        gemItemsMap.put("apatite_gem", new BaseItem("apatite_gem"));
    }

    public Gems(){
        //Ore Dictionary Maps
            //Gems
            blockOreDict.put(gemBlocksMap.get("amethyst_ore"), "oreAmethyst");
            blockOreDict.put(gemBlocksMap.get("amethyst_block"), "blockAmethyst");
            blockOreDict.put(gemBlocksMap.get("amethyst_lamp"), "lampAmethyst");
            blockOreDict.put(gemBlocksMap.get("amethyst_stone"), "stoneAmethyst");
            itemOreDict.put(gemItemsMap.get("amethyst_dust"), "dustAmethyst");
            itemOreDict.put(gemItemsMap.get("amethyst_dust_charged"), "dustChargedAmethyst");
            itemOreDict.put(gemItemsMap.get("amethyst_dust_infused"), "dustInfusedAmethyst");
            itemOreDict.put(gemItemsMap.get("amethyst_gem"), "gemAmethyst");

            blockOreDict.put(gemBlocksMap.get("apatite_ore"), "oreApatite");
            blockOreDict.put(gemBlocksMap.get("apatite_block"), "blockApatite");
            blockOreDict.put(gemBlocksMap.get("apatite_lamp"), "lampApatite");
            blockOreDict.put(gemBlocksMap.get("apatite_stone"), "stoneApatite");
            itemOreDict.put(gemItemsMap.get("apatite_dust"), "dustApatite");
            itemOreDict.put(gemItemsMap.get("apatite_dust_charged"), "dustChargedApatite");
            itemOreDict.put(gemItemsMap.get("apatite_dust_infused"), "dustInfusedApatite");
            itemOreDict.put(gemItemsMap.get("apatite_gem"), "gemApatite");

        //Basic Gem Map
        gemMap.put(new Block[]{gemBlocksMap.get("amethyst_ore"), gemBlocksMap.get("amethyst_block"),
                        gemBlocksMap.get("amethyst_lamp"), gemBlocksMap.get("amethyst_stone")},
                new Item[]{gemItemsMap.get("amethyst_dust"), gemItemsMap.get("amethyst_dust_charged"),
                        gemItemsMap.get("amethyst_dust_infused"), gemItemsMap.get("amethyst_gem")});

        gemMap.put(new Block[]{gemBlocksMap.get("apatite_ore"), gemBlocksMap.get("apatite_block"),
                        gemBlocksMap.get("apatite_lamp"), gemBlocksMap.get("apatite_stone")},
                new Item[]{gemItemsMap.get("apatite_dust"), gemItemsMap.get("apatite_dust_charged"),
                        gemItemsMap.get("apatite_dust_infused"), gemItemsMap.get("apatite_gem")});
    }

    public static void createGems(){
        addGemBlocks();
        addGemItems();
        //Register Blocks
        for(Map.Entry<String, Block> blockEntry : gemBlocksMap.entrySet()){
            GameRegistry.registerBlock(blockEntry.getValue(), blockEntry.getKey());
        }
        //Register Items
        for(Map.Entry<String, Item> itemEntry : gemItemsMap.entrySet()){
            GameRegistry.registerItem(itemEntry.getValue(), itemEntry.getKey());
        }
    }

    //Register Block Textures
    public static void registerBlockRenderer(){
        for (Map.Entry<String, Block> mapEntry : gemBlocksMap.entrySet()) {
            String unlocalizedName = mapEntry.getKey();
            Block block = mapEntry.getValue();

            Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
                    .register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(Reference.RESOURCE_PREFIX + unlocalizedName, "inventory"));
        }
    }

    //Register Item Textures
    public static void registerItemRenderer() {
        for (Map.Entry<String, Item> mapEntry : gemItemsMap.entrySet()) {
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
        return gemBlocksMap.get(blockName);
    }

    public static Item getItem(String itemName){
        return gemItemsMap.get(itemName);
    }

    public static HashMap<Block[], Item[]> getGemMap() {
        return gemMap;
    }

    public static HashMap<Block, String> getBlockOreDict() {
        return blockOreDict;
    }

    public static HashMap<Item, String> getItemOreDict() {
        return itemOreDict;
    }

    public static HashMap<String, Block> getGemBlocksMap() {
        return gemBlocksMap;
    }
}
