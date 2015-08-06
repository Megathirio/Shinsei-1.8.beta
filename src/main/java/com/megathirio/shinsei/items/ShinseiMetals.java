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
        GameRegistry.registerItem(aluminumDust = new BaseItem(Names.materials.ALUMINUM + "_dust"), Names.materials.ALUMINUM + "_dust");
        GameRegistry.registerItem(aluminumIngot = new BaseItem(Names.materials.ALUMINUM + "_ingot"), Names.materials.ALUMINUM + "_ingot");
        GameRegistry.registerItem(silverDust = new BaseItem(Names.materials.SILVER + "_dust"), Names.materials.SILVER + "_dust");
        GameRegistry.registerItem(silverNugget = new BaseItem(Names.materials.SILVER + "_nugget"), Names.materials.SILVER + "_nugget");
        GameRegistry.registerItem(silverIngot = new BaseItem(Names.materials.SILVER + "_ingot"), Names.materials.SILVER + "_ingot");
    }
}
