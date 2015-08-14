package com.megathirio.shinsei.items;

import com.megathirio.shinsei.core.ShinseiTabs;
import com.megathirio.shinsei.utilities.Names;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.HashMap;
import java.util.Map;

public class ShinseiItems {

    public static HashMap<String, Item> itemEntries = new HashMap<String, Item>();

    public static void addItem(){
/*
        itemEntries.put("aluminum_dust", new BaseItem("aluminum_dust"));
        itemEntries.put("aluminum_nugget", new BaseItem("aluminum_nugget"));
        itemEntries.put("aluminum_ingot", new BaseItem("aluminum_ingot"));

        itemEntries.put("antimony_dust", new BaseItem("antimony_dust"));
        itemEntries.put("antimony_nugget", new BaseItem("antimony_nugget"));
        itemEntries.put("antimony_ingot", new BaseItem("antimony_ingot"));

        itemEntries.put("barium_dust", new BaseItem("barium_dust"));
        itemEntries.put("barium_nugget", new BaseItem("barium_nugget"));
        itemEntries.put("barium_ingot", new BaseItem("barium_ingot"));

        itemEntries.put("bismuth_dust", new BaseItem("barium_dust"));
        itemEntries.put("bismuth_nugget", new BaseItem("bismuth_nugget"));
        itemEntries.put("bismuth_ingot", new BaseItem("bismuth_ingot"));

        itemEntries.put("brass_dust", new BaseItem("brass_dust"));
        itemEntries.put("brass_nugget", new BaseItem("brass_nugget"));
        itemEntries.put("brass_ingot", new BaseItem("brass_ingot"));

        itemEntries.put("bronze_dust", new BaseItem("bronze_dust"));
        itemEntries.put("bronze_nugget", new BaseItem("bronze_nugget"));
        itemEntries.put("bronze_ingot", new BaseItem("bronze_ingot"));

        itemEntries.put("copper_dust", new BaseItem("copper_dust"));
        itemEntries.put("copper_nugget", new BaseItem("copper_nugget"));
        itemEntries.put("copper_ingot", new BaseItem("copper_ingot"));

        itemEntries.put("silver_dust", new BaseItem("silver_dust"));
        itemEntries.put("silver_nugget", new BaseItem("silver_nugget"));
        itemEntries.put("silver_ingot", new BaseItem("silver_ingot"));

        itemEntries.put("tin_dust", new BaseItem("tin_dust"));
        itemEntries.put("tin_nugget", new BaseItem("tin_nugget"));
        itemEntries.put("tin_ingot", new BaseItem("tin_ingot"));

        itemEntries.put("zinc_dust", new BaseItem("zinc_dust"));
        itemEntries.put("zinc_nugget", new BaseItem("zinc_nugget"));
        itemEntries.put("zinc_ingot", new BaseItem("zinc_ingot"));

        itemEntries.put("salt", new BaseItem("salt").setCreativeTab(ShinseiTabs.FOOD_TAB));
*/
    }

    public static Item bookShinsei;

    public static Item splitWood;

    public static void createItems(){
        addItem();
        for(Map.Entry<String, Item> itemEntry : itemEntries.entrySet()){
            GameRegistry.registerItem(itemEntry.getValue(), itemEntry.getKey());
        }

        ShinseiFoods.createItems();
        ShinseiTools.createItems();

        GameRegistry.registerItem(bookShinsei = new ContainerItem("book_shinsei").setCreativeTab(ShinseiTabs.ITEMS_TAB), "book_shinsei");

        GameRegistry.registerItem(splitWood = new BaseItem("split_wood"), "split_wood");
    }

    public static Item getItem(String itemName){
        return itemEntries.get(itemName);
    }

}
