package com.megathirio.shinsei.items;

import com.megathirio.shinsei.core.ShinseiTabs;
import net.minecraft.item.ItemSword;

public class ShinseiSword extends ItemSword{

    public ShinseiSword(String unlocalizedName, ToolMaterial material){
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(ShinseiTabs.TOOLS_TAB);
    }
}
