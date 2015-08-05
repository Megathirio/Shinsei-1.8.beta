package com.megathirio.shinsei.items;

import com.megathirio.shinsei.core.ShinseiTabs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class DurableItem extends Item{

    public DurableItem(String unlocalizedName, int maxDamage){
        super();
        this.setMaxDamage(maxDamage);
        this.setMaxStackSize(1);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(ShinseiTabs.ITEMS_TAB);
    }

    @Override
    public boolean hasContainerItem(ItemStack itemstack) {
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemstack) {
        itemstack.attemptDamageItem(1, this.itemRand);
        return itemstack;
    }

}
