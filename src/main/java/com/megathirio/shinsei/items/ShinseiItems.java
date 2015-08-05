package com.megathirio.shinsei.items;

import com.megathirio.shinsei.core.ShinseiTabs;
import com.megathirio.shinsei.utilities.HashMaps;
import com.megathirio.shinsei.utilities.Names;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

import java.util.HashMap;
import java.util.Set;

public class ShinseiItems {

    public static Item bookShinsei;
    public static Item aluminumDust;
    public static Item aluminumNugget;
    public static Item aluminumIngot;
    public static Item silverDust;
    public static Item silverNugget;
    public static Item silverIngot;

    public static Item splitWood;

    public static void createItems(){
        ShinseiFoods.createItems();
        ShinseiTools.createItems();

        GameRegistry.registerItem(bookShinsei = new ContainerItem("book_shinsei").setCreativeTab(ShinseiTabs.ITEMS_TAB), "book_shinsei");
        GameRegistry.registerItem(aluminumDust = new BaseItem(Names.metals.ALUMINUM + "_dust"), Names.metals.ALUMINUM + "_dust");
        GameRegistry.registerItem(aluminumNugget = new BaseItem(Names.metals.ALUMINUM + "_nugget"), Names.metals.ALUMINUM + "_nugget");
        GameRegistry.registerItem(aluminumIngot = new BaseItem(Names.metals.ALUMINUM + "_ingot"), Names.metals.ALUMINUM + "_ingot");
        GameRegistry.registerItem(silverDust = new BaseItem(Names.metals.SILVER + "_dust"), Names.metals.SILVER + "_dust");
        GameRegistry.registerItem(silverNugget = new BaseItem(Names.metals.SILVER + "_nugget"), Names.metals.SILVER + "_nugget");
        GameRegistry.registerItem(silverIngot = new BaseItem(Names.metals.SILVER + "_ingot"), Names.metals.SILVER + "_ingot");

        GameRegistry.registerItem(splitWood = new BaseItem("split_wood"), "split_wood");
    }
}
