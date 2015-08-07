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
        itemEntries.put("aluminum_dust", new BaseItem("aluminum_dust"));
        itemEntries.put("aluminum_nugget", new BaseItem("aluminum_nugget"));
        itemEntries.put("aluminum_ingot", new BaseItem("aluminum_ingot"));
        itemEntries.put("antimony_dust", new BaseItem("antimony_dust"));
        itemEntries.put("antimony_nugget", new BaseItem("antimony_nugget"));
        itemEntries.put("antimony_ingot", new BaseItem("antimony_ingot"));
        itemEntries.put("silver_dust", new BaseItem("silver_dust"));
        itemEntries.put("silver_nugget", new BaseItem("silver_nugget"));
        itemEntries.put("silver_ingot", new BaseItem("silver_ingot"));
    }

    public static Item bookShinsei;
/*
    public static Item aluminumDust;
    public static Item aluminumNugget;
    public static Item aluminumIngot;
*/
    public static Item amethystDust;
    public static Item amethystDustCharged;
    public static Item amethystDustInfused;
    public static Item amethystGem;
/*
    public static Item silverDust;
    public static Item silverNugget;
    public static Item silverIngot;
*/

    public static Item splitWood;

    public static void createItems(){
        addItem();
        for(Map.Entry<String, Item> itemEntry : itemEntries.entrySet()){
            GameRegistry.registerItem(itemEntry.getValue(), itemEntry.getKey());
        }

        ShinseiFoods.createItems();
        ShinseiTools.createItems();

        GameRegistry.registerItem(bookShinsei = new ContainerItem("book_shinsei").setCreativeTab(ShinseiTabs.ITEMS_TAB), "book_shinsei");
/*
        GameRegistry.registerItem(aluminumDust = new BaseItem(Names.materials.ALUMINUM + "_dust"), Names.materials.ALUMINUM + "_dust");
        GameRegistry.registerItem(aluminumNugget = new BaseItem(Names.materials.ALUMINUM + "_nugget"), Names.materials.ALUMINUM + "_nugget");
        GameRegistry.registerItem(aluminumIngot = new BaseItem(Names.materials.ALUMINUM + "_ingot"), Names.materials.ALUMINUM + "_ingot");
*/
        GameRegistry.registerItem(amethystDust = new BaseItem(Names.materials.AMETHYST + "_dust"), Names.materials.AMETHYST + "_dust");
        GameRegistry.registerItem(amethystDustCharged = new BaseItem(Names.materials.AMETHYST + "_dust_charged"), Names.materials.AMETHYST + "_dust_charged");
        GameRegistry.registerItem(amethystDustInfused = new BaseItem(Names.materials.AMETHYST + "_dust_infused"), Names.materials.AMETHYST + "_dust_infused");
        GameRegistry.registerItem(amethystGem = new BaseItem(Names.materials.AMETHYST + "_gem"), Names.materials.AMETHYST + "_gem");
/*
        GameRegistry.registerItem(silverDust = new BaseItem(Names.materials.SILVER + "_dust"), Names.materials.SILVER + "_dust");
        GameRegistry.registerItem(silverNugget = new BaseItem(Names.materials.SILVER + "_nugget"), Names.materials.SILVER + "_nugget");
        GameRegistry.registerItem(silverIngot = new BaseItem(Names.materials.SILVER + "_ingot"), Names.materials.SILVER + "_ingot");
*/

        GameRegistry.registerItem(splitWood = new BaseItem("split_wood"), "split_wood");
    }

    public static Item getItem(String itemName){
        return itemEntries.get(itemName);
    }

}
