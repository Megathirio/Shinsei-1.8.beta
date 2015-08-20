package com.megathirio.shinsei.init;

import com.megathirio.shinsei.blocks.BaseBlock;
import com.megathirio.shinsei.blocks.BaseMetal;
import com.megathirio.shinsei.core.ShinseiTabs;
import com.megathirio.shinsei.items.BaseItem;
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

public class Metals {
    public static HashMap<Block[], Item[]> metalMap = new HashMap<Block[], Item[]>();
    public static HashMap<Block[], Item[]> advMetalMap = new HashMap<Block[], Item[]>();
    public static HashMap<Item, String> itemOreDict = new HashMap<Item, String>();
    public static HashMap<Block, String> blockOreDict = new HashMap<Block, String>();
    public static HashMap<String, Block> metalBlocksMap = new HashMap<String, Block>();
    public static HashMap<String, Item> metalItemsMap = new HashMap<String, Item>();

    //Initialize Blocks and Items
    public static void addMetalBlocks(){
/*
        metalBlocksMap.put("acanthite_ore", new BaseMetal("acanthite_ore", Material.rock, 2.0f, 3.2f));
*/
        metalBlocksMap.put("silver_block", new BaseMetal("silver_block", Material.rock, 2.0f, 3.2f));

        metalBlocksMap.put("barite_ore", new BaseMetal("barite_ore", Material.rock, 3.5f, 5.7f));
        metalBlocksMap.put("barium_block", new BaseMetal("barium_block", Material.rock, 3.5f, 5.7f));

        metalBlocksMap.put("bauxite_ore", new BaseMetal("bauxite_ore", Material.rock, 2.0f, 3.2f));
        metalBlocksMap.put("aluminum_block", new BaseMetal("aluminum_block", Material.rock, 2.0f, 3.2f));

        metalBlocksMap.put("bismuth_ore", new BaseMetal("bismuth_ore", Material.rock, 2.25f, 3.6f));
        metalBlocksMap.put("bismuth_block", new BaseMetal("bismuth_block", Material.rock, 2.25f, 3.6f));

        metalBlocksMap.put("bornite_ore", new BaseMetal("bornite_ore", Material.rock, 3.0f, 4.9f));
        metalBlocksMap.put("chalcopyrite_ore", new BaseMetal("chalcopyrite_ore", Material.rock, 3.5f, 5.7f));
        metalBlocksMap.put("copper_block", new BaseMetal("copper_block"));

        metalBlocksMap.put("cassiterite_ore", new BaseMetal("cassiterite_ore", Material.rock, 7.0f, 11.3f));
        metalBlocksMap.put("tin_block", new BaseMetal("tin_block"));

        metalBlocksMap.put("galena_ore", new BaseMetal("galena_ore", Material.rock, 2.5f, 6.5f));
        metalBlocksMap.put("lead_block", new BaseMetal("lead_block"));

        metalBlocksMap.put("ilmenite_ore", new BaseMetal("ilmenite_ore", Material.rock, 6.0f, 9.7f));
        metalBlocksMap.put("titanium_block", new BaseMetal("titanium_block"));

        metalBlocksMap.put("sphalerite_ore", new BaseMetal("sphalerite_ore", Material.rock, 3.5f, 4.9f));
        metalBlocksMap.put("zinc_block", new BaseMetal("zinc_block"));

        metalBlocksMap.put("stibnite_ore", new BaseMetal("stibnite_ore", Material.rock, 2.0f, 3.2f));
        metalBlocksMap.put("antimony_block", new BaseMetal("antimony_block", Material.rock, 2.0f, 3.2f));
    }

    public static void addMetalItems(){
        metalItemsMap.put("aluminum_dust", new BaseItem("aluminum_dust"));
        metalItemsMap.put("aluminum_nugget", new BaseItem("aluminum_nugget"));
        metalItemsMap.put("aluminum_ingot", new BaseItem("aluminum_ingot"));

        metalItemsMap.put("antimony_dust", new BaseItem("antimony_dust"));
        metalItemsMap.put("antimony_nugget", new BaseItem("antimony_nugget"));
        metalItemsMap.put("antimony_ingot", new BaseItem("antimony_ingot"));

        metalItemsMap.put("barium_dust", new BaseItem("barium_dust"));
        metalItemsMap.put("barium_nugget", new BaseItem("barium_nugget"));
        metalItemsMap.put("barium_ingot", new BaseItem("barium_ingot"));

        metalItemsMap.put("bismuth_dust", new BaseItem("barium_dust"));
        metalItemsMap.put("bismuth_nugget", new BaseItem("bismuth_nugget"));
        metalItemsMap.put("bismuth_ingot", new BaseItem("bismuth_ingot"));

        metalItemsMap.put("copper_dust", new BaseItem("copper_dust"));
        metalItemsMap.put("copper_nugget", new BaseItem("copper_nugget"));
        metalItemsMap.put("copper_ingot", new BaseItem("copper_ingot"));

        metalItemsMap.put("lead_dust", new BaseItem("lead_dust"));
        metalItemsMap.put("lead_nugget", new BaseItem("lead_nugget"));
        metalItemsMap.put("lead_ingot", new BaseItem("lead_ingot"));

        metalItemsMap.put("silver_dust", new BaseItem("silver_dust"));
        metalItemsMap.put("silver_nugget", new BaseItem("silver_nugget"));
        metalItemsMap.put("silver_ingot", new BaseItem("silver_ingot"));

        metalItemsMap.put("tin_dust", new BaseItem("tin_dust"));
        metalItemsMap.put("tin_nugget", new BaseItem("tin_nugget"));
        metalItemsMap.put("tin_ingot", new BaseItem("tin_ingot"));

        metalItemsMap.put("titanium_dust", new BaseItem("titanium_dust"));
        metalItemsMap.put("titanium_nugget", new BaseItem("titanium_nugget"));
        metalItemsMap.put("titanium_ingot", new BaseItem("titanium_ingot"));

        metalItemsMap.put("zinc_dust", new BaseItem("zinc_dust"));
        metalItemsMap.put("zinc_nugget", new BaseItem("zinc_nugget"));
        metalItemsMap.put("zinc_ingot", new BaseItem("zinc_ingot"));
    }

    public Metals(){
        //Ore Dictionary Maps
        //Metals
        blockOreDict.put(metalBlocksMap.get("bauxite_ore"), "oreAluminum");
        blockOreDict.put(metalBlocksMap.get("aluminum_block"), "blockAluminum");
        itemOreDict.put(metalItemsMap.get("aluminum_dust"), "dustAluminum");
        itemOreDict.put(metalItemsMap.get("aluminum_nugget"), "nuggetAluminum");
        itemOreDict.put(metalItemsMap.get("aluminum_ingot"), "ingotAluminum");

        blockOreDict.put(metalBlocksMap.get("stibnite_ore"), "oreAntimony");
        blockOreDict.put(metalBlocksMap.get("antimony_block"), "blockAntimony");
        itemOreDict.put(metalItemsMap.get("antimony_dust"), "dustAntimony");
        itemOreDict.put(metalItemsMap.get("antimony_nugget"), "nuggetAntimony");
        itemOreDict.put(metalItemsMap.get("antimony_ingot"), "ingotAntimony");

        blockOreDict.put(metalBlocksMap.get("barite_ore"), "oreBarium");
        blockOreDict.put(metalBlocksMap.get("barium_block"), "blockBarium");
        itemOreDict.put(metalItemsMap.get("barium_dust"), "dustBarium");
        itemOreDict.put(metalItemsMap.get("barium_nugget"), "nuggetBarium");
        itemOreDict.put(metalItemsMap.get("barium_ingot"), "ingotBarium");

        blockOreDict.put(metalBlocksMap.get("bismuth_ore"), "oreBismuth");
        blockOreDict.put(metalBlocksMap.get("bismuth_block"), "blockBismuth");
        itemOreDict.put(metalItemsMap.get("bismuth_dust"),"dustBismuth");
        itemOreDict.put(metalItemsMap.get("bismuth_nugget"), "nuggetBismuth");
        itemOreDict.put(metalItemsMap.get("bismuth_ingot"), "ingotBismuth");

        blockOreDict.put(metalBlocksMap.get("bornite_ore"), "oreCopper");
        blockOreDict.put(metalBlocksMap.get("chalcopyrite_ore"), "oreCopper");
        blockOreDict.put(metalBlocksMap.get("copper_block"), "blockCopper");
        itemOreDict.put(metalItemsMap.get("copper_dust"), "dustCopper");
        itemOreDict.put(metalItemsMap.get("copper_nugget"), "nuggetCopper");
        itemOreDict.put(metalItemsMap.get("copper_ingot"), "ingotCopper");

        blockOreDict.put(metalBlocksMap.get("galena_ore"), "oreLead");
        blockOreDict.put(metalBlocksMap.get("lead_block"), "blockLead");
        itemOreDict.put(metalItemsMap.get("lead_dust"), "dustLead");
        itemOreDict.put(metalItemsMap.get("lead_nugget"), "nuggetLead");
        itemOreDict.put(metalItemsMap.get("lead_ingot"), "ingotLead");

/*
        blockOreDict.put(metalBlocksMap.get("acanthite_ore"), "oreSilver");
*/
        blockOreDict.put(metalBlocksMap.get("silver_block"), "blockSilver");
        itemOreDict.put(metalItemsMap.get("silver_dust"), "dustSilver");
        itemOreDict.put(metalItemsMap.get("silver_nugget"), "nuggetSilver");
        itemOreDict.put(metalItemsMap.get("silver_ingot"), "ingotSilver");

        blockOreDict.put(metalBlocksMap.get("cassiterite_ore"), "oreTin");
        blockOreDict.put(metalBlocksMap.get("tin_block"), "blockTin");
        itemOreDict.put(metalItemsMap.get("tin_dust"), "dustTin");
        itemOreDict.put(metalItemsMap.get("tin_nugget"), "nuggetTin");
        itemOreDict.put(metalItemsMap.get("tin_ingot"), "ingotTin");

        blockOreDict.put(metalBlocksMap.get("ilmenite_ore"), "oreTitanium");
        blockOreDict.put(metalBlocksMap.get("titanium_block"), "blockTitanium");
        itemOreDict.put(metalItemsMap.get("titanium_dust"), "dustTitanium");
        itemOreDict.put(metalItemsMap.get("titanium_nugget"), "nuggetTitanium");
        itemOreDict.put(metalItemsMap.get("titanium_ingot"), "ingotTitanium");

        blockOreDict.put(metalBlocksMap.get("sphalerite_ore"), "oreZinc");
        blockOreDict.put(metalBlocksMap.get("zinc_block"), "blockZinc");
        itemOreDict.put(metalItemsMap.get("zinc_dust"), "dustZinc");
        itemOreDict.put(metalItemsMap.get("zinc_nugget"), "nuggetZinc");
        itemOreDict.put(metalItemsMap.get("zinc_ingot"), "ingotZinc");

        //Basic Ore Map
/*
        metalMap.put(new Block[]{metalBlocksMap.get("acanthite_ore"), metalBlocksMap.get("silver_block")}, new Item[]{metalItemsMap.get("silver_dust"), metalItemsMap.get("silver_nugget"), metalItemsMap.get("silver_ingot")});
*/
        metalMap.put(new Block[]{metalBlocksMap.get("stibnite_ore"), metalBlocksMap.get("antimony_block")}, new Item[]{metalItemsMap.get("antimony_dust"), metalItemsMap.get("antimony_nugget"), metalItemsMap.get("antimony_ingot")});
        metalMap.put(new Block[]{metalBlocksMap.get("bornite_ore"), metalBlocksMap.get("copper_block")}, new Item[]{metalItemsMap.get("copper_dust"), metalItemsMap.get("copper_nugget"), metalItemsMap.get("copper_ingot")});
        metalMap.put(new Block[]{metalBlocksMap.get("chalcopyrite_ore"), metalBlocksMap.get("copper_block")}, new Item[]{metalItemsMap.get("copper_dust"), metalItemsMap.get("copper_nugget"), metalItemsMap.get("copper_ingot")});
        metalMap.put(new Block[]{metalBlocksMap.get("cassiterite_ore"), metalBlocksMap.get("tin_block")}, new Item[]{metalItemsMap.get("tin_dust"), metalItemsMap.get("tin_nugget"), metalItemsMap.get("tin_ingot")});
        metalMap.put(new Block[]{metalBlocksMap.get("galena_ore"), metalBlocksMap.get("lead_block")}, new Item[]{metalItemsMap.get("lead_dust"), metalItemsMap.get("lead_nugget"), metalItemsMap.get("lead_ingot")});

        //Advanced Ore Map
        advMetalMap.put(new Block[]{metalBlocksMap.get("bauxite_ore"), metalBlocksMap.get("aluminum_block")}, new Item[]{metalItemsMap.get("aluminum_dust"), metalItemsMap.get("aluminum_nugget"), metalItemsMap.get("aluminum_ingot")});
        advMetalMap.put(new Block[]{metalBlocksMap.get("barite_ore"), metalBlocksMap.get("barium_block")}, new Item[]{metalItemsMap.get("barium_dust"), metalItemsMap.get("barium_nugget"), metalItemsMap.get("barium_ingot")});
        advMetalMap.put(new Block[]{metalBlocksMap.get("bismuth_ore"), metalBlocksMap.get("bismuth_block")}, new Item[]{metalItemsMap.get("bismuth_dust"), metalItemsMap.get("bismuth_nugget"), metalItemsMap.get("bismuth_ingot")});
        advMetalMap.put(new Block[]{metalBlocksMap.get("ilmenite_ore"), metalBlocksMap.get("titanium_block")}, new Item[]{metalItemsMap.get("titanium_dust"), metalItemsMap.get("titanium_nugget"), metalItemsMap.get("titanium_ingot")});
        advMetalMap.put(new Block[]{metalBlocksMap.get("sphalerite_ore"), metalBlocksMap.get("zinc_block")}, new Item[]{metalItemsMap.get("zinc_dust"), metalItemsMap.get("zinc_nugget"), metalItemsMap.get("zinc_ingot")});
    }

    public static void createMetals(){
        addMetalBlocks();
        addMetalItems();
        //Register Blocks
        for(Map.Entry<String, Block> blockEntry : metalBlocksMap.entrySet()){
            GameRegistry.registerBlock(blockEntry.getValue(), blockEntry.getKey());
        }
        //Register Items
        for(Map.Entry<String, Item> itemEntry : metalItemsMap.entrySet()){
            GameRegistry.registerItem(itemEntry.getValue(), itemEntry.getKey());
        }
    }

    //Register Block Textures
    public static void registerBlockRenderer(){
        for (Map.Entry<String, Block> mapEntry : metalBlocksMap.entrySet()) {
            String unlocalizedName = mapEntry.getKey();
            Block block = mapEntry.getValue();

            Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
                    .register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(Reference.RESOURCE_PREFIX + unlocalizedName, "inventory"));
        }
    }

    //Register Item Textures
    public static void registerItemRenderer() {
        for (Map.Entry<String, Item> mapEntry : metalItemsMap.entrySet()) {
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
        return metalBlocksMap.get(blockName);
    }

    public static Item getItem(String itemName){
        return metalItemsMap.get(itemName);
    }

    public static HashMap<Block[], Item[]> getMetalMap() {
        return metalMap;
    }

    public static HashMap<Block[], Item[]> getAdvMetalMap() {
        return advMetalMap;
    }

    public static HashMap<Block, String> getBlockOreDict() {
        return blockOreDict;
    }

    public static HashMap<Item, String> getItemOreDict() {
        return itemOreDict;
    }

    public static HashMap<String, Block> getMetalBlocksMap() {
        return metalBlocksMap;
    }
}
