package com.megathirio.shinsei.items;

import com.megathirio.shinsei.core.ShinseiTabs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BaseItem extends Item{

    public BaseItem(String name, CreativeTabs tab){
        super();
        this.setUnlocalizedName(name);
        this.setCreativeTab(tab);
    }

    public BaseItem(String name){
        this(name, ShinseiTabs.ITEMS_TAB);
    }
}
