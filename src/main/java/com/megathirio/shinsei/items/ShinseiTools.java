package com.megathirio.shinsei.items;

import com.megathirio.shinsei.core.ShinseiTabs;
import com.megathirio.shinsei.utilities.Names;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ShinseiTools {

    public static Item bookAxe;
    public static Item bookHoe;
    public static Item bookPickaxe;
    public static Item bookShovel;
    public static Item bookSword;
    public static Item boneAxe;
    public static Item flintAxe;
    public static Item silverAxe;
    public static Item silverHoe;
    public static Item silverPickaxe;
    public static Item silverShovel;
    public static Item silverSword;

    public static Item silverAxeBlade;
    public static Item silverHoeBlade;
    public static Item silverPickaxeBlade;
    public static Item silverShovelBlade;
    public static Item silverSwordBlade;

    public static Item woodToolHandle;

    public static Item ironHammer;

    public static void createItems(){
        GameRegistry.registerItem(bookAxe = new ContainerItem("book_axe").setCreativeTab(ShinseiTabs.TOOLS_TAB), "book_axe");
        GameRegistry.registerItem(bookHoe = new ContainerItem("book_hoe").setCreativeTab(ShinseiTabs.TOOLS_TAB), "book_hoe");
        GameRegistry.registerItem(bookPickaxe = new ContainerItem("book_pickaxe").setCreativeTab(ShinseiTabs.TOOLS_TAB), "book_pickaxe");
        GameRegistry.registerItem(bookShovel = new ContainerItem("book_shovel").setCreativeTab(ShinseiTabs.TOOLS_TAB), "book_shovel");
        GameRegistry.registerItem(bookSword = new ContainerItem("book_sword").setCreativeTab(ShinseiTabs.TOOLS_TAB), "book_sword");
        GameRegistry.registerItem(boneAxe = new PrimitiveAxe("bone_axe", ShinseiMaterials.materialBone), "bone_axe");
        GameRegistry.registerItem(flintAxe = new PrimitiveAxe("flint_axe", ShinseiMaterials.materialFlint), "flint_axe");
        GameRegistry.registerItem(silverAxe = new ShinseiAxe(Names.metals.SILVER + "_axe", ShinseiMaterials.materialSilver), Names.metals.SILVER + "_axe");
        GameRegistry.registerItem(silverHoe = new ShinseiHoe(Names.metals.SILVER + "_hoe", ShinseiMaterials.materialSilver), Names.metals.SILVER + "_hoe");
        GameRegistry.registerItem(silverPickaxe = new ShinseiPickaxe(Names.metals.SILVER + "_pickaxe", ShinseiMaterials.materialSilver), Names.metals.SILVER + "_pickaxe");
        GameRegistry.registerItem(silverShovel = new ShinseiShovel(Names.metals.SILVER + "_shovel", ShinseiMaterials.materialSilver), Names.metals.SILVER + "_shovel");
        GameRegistry.registerItem(silverSword = new ShinseiSword(Names.metals.SILVER + "_sword", ShinseiMaterials.materialSilver), Names.metals.SILVER + "_sword");

        GameRegistry.registerItem(silverAxeBlade = new BaseItem(Names.metals.SILVER + "_axe_blade").setCreativeTab(ShinseiTabs.TOOLS_TAB), Names.metals.SILVER + "_axe_blade");
        GameRegistry.registerItem(silverHoeBlade = new BaseItem(Names.metals.SILVER + "_hoe_blade").setCreativeTab(ShinseiTabs.TOOLS_TAB), Names.metals.SILVER + "_hoe_blade");
        GameRegistry.registerItem(silverPickaxeBlade = new BaseItem(Names.metals.SILVER + "_pickaxe_blade").setCreativeTab(ShinseiTabs.TOOLS_TAB), Names.metals.SILVER + "_pickaxe_blade");
        GameRegistry.registerItem(silverShovelBlade = new BaseItem(Names.metals.SILVER + "_shovel_blade").setCreativeTab(ShinseiTabs.TOOLS_TAB), Names.metals.SILVER + "_shovel_blade");
        GameRegistry.registerItem(silverSwordBlade = new BaseItem(Names.metals.SILVER + "_sword_blade").setCreativeTab(ShinseiTabs.TOOLS_TAB), Names.metals.SILVER + "_sword_blade");

        GameRegistry.registerItem(woodToolHandle = new BaseItem("tool_handle_wood"), "tool_handle_wood");

        GameRegistry.registerItem(ironHammer = new ShinseiPickaxe(Names.metals.IRON + "_hammer", Item.ToolMaterial.STONE), Names.metals.IRON + "_hammer");

    }
}
