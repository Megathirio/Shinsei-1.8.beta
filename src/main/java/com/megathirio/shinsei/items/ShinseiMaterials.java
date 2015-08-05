package com.megathirio.shinsei.items;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class ShinseiMaterials {

//  public static Item.ToolMaterial materialName = EnumHelper.addToolMaterial("NAME", harvestLevel, durability, miningSpeed, damageVsEntities, enchantability);
    public static Item.ToolMaterial materialBone = EnumHelper.addToolMaterial("BONE", 0, 12, 1.5F, 0.5F, 0);
    public static Item.ToolMaterial materialFlint = EnumHelper.addToolMaterial("FLINT", 0, 12, 2.0F, 1.0F, 0);
    public static Item.ToolMaterial materialSilver = EnumHelper.addToolMaterial("SILVER", 1, 100, 5.0F, 1.25F, 22);
}
