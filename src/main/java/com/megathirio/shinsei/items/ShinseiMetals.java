package com.megathirio.shinsei.items;

import com.megathirio.shinsei.utilities.Names;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ShinseiMetals {

    public static Item aluminumDust;
    public static Item aluminumIngot;
    public static Item silverDust;
    public static Item silverNugget;
    public static Item silverIngot;

    public static void createItems(){
        GameRegistry.registerItem(aluminumDust = new BaseItem(Names.metals.ALUMINUM + "_dust"), Names.metals.ALUMINUM + "_dust");
        GameRegistry.registerItem(aluminumIngot = new BaseItem(Names.metals.ALUMINUM + "_ingot"), Names.metals.ALUMINUM + "_ingot");
        GameRegistry.registerItem(silverDust = new BaseItem(Names.metals.SILVER + "_dust"), Names.metals.SILVER + "_dust");
        GameRegistry.registerItem(silverNugget = new BaseItem(Names.metals.SILVER + "_nugget"), Names.metals.SILVER + "_nugget");
        GameRegistry.registerItem(silverIngot = new BaseItem(Names.metals.SILVER + "_ingot"), Names.metals.SILVER + "_ingot");
    }
}
