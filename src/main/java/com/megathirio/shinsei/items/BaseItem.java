package com.megathirio.shinsei.items;

import com.megathirio.shinsei.core.ShinseiTabs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BaseItem extends Item{

    public BaseItem(String unlocalizedName){
        super();

        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(ShinseiTabs.ITEMS_TAB);
    }
}
