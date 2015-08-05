package com.megathirio.shinsei.items;

import com.megathirio.shinsei.core.ShinseiTabs;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

public class ShinseiAxe extends ItemAxe{

    public ShinseiAxe(String unlocalizedName, ToolMaterial material){
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(ShinseiTabs.TOOLS_TAB);
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
