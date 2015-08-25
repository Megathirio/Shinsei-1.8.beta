package com.megathirio.shinsei.items;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class Materials {
    //  public static Item.ToolMaterial materialName = EnumHelper.addToolMaterial("NAME", harvestLevel, durability, miningSpeed, damageVsEntities, enchantability);
    public static Item.ToolMaterial materialBone = EnumHelper.addToolMaterial("BONE", 0, 12, 1.5F, 0.5F, 0);
    public static Item.ToolMaterial materialBrass = EnumHelper.addToolMaterial("BRASS", 2, 225, 8.0F, 2.0F, 20);
    public static Item.ToolMaterial materialBronze = EnumHelper.addToolMaterial("BRONZE", 2, 200, 7.5F, 2.0F, 20);
    public static Item.ToolMaterial materialCopper = EnumHelper.addToolMaterial("COPPER", 2, 150, 7.0F, 1.5F, 20);
    public static Item.ToolMaterial materialFlint = EnumHelper.addToolMaterial("FLINT", 0, 12, 2.0F, 1.0F, 0);
    public static Item.ToolMaterial materialSilver = EnumHelper.addToolMaterial("SILVER", 1, 100, 5.0F, 1.25F, 22);
    public static Item.ToolMaterial materialStainlessSteel = EnumHelper.addToolMaterial("STAINLESS_STEEL", 3, 1000, 8.0F, 2.5F, 14);
    public static Item.ToolMaterial materialSteel = EnumHelper.addToolMaterial("STEEL", 2, 400, 7.0F, 1.75F, 12);
    public static Item.ToolMaterial materialTitanium = EnumHelper.addToolMaterial("TITANIUM", 3, 1000, 8.0F, 2.5F, 16);
}
