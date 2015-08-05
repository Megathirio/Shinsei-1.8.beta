package com.megathirio.shinsei.items;

import com.megathirio.shinsei.core.ShinseiTabs;
import net.minecraft.item.ItemHoe;

public class ShinseiHoe extends ItemHoe{

    public ShinseiHoe(String unlocalizedName, ToolMaterial material){
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(ShinseiTabs.TOOLS_TAB);
    }
}
