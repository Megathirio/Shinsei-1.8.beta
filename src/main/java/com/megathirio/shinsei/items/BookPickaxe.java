package com.megathirio.shinsei.items;

import com.megathirio.shinsei.core.ShinseiTabs;
import com.megathirio.shinsei.guis.GuiPickaxeBook;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BookPickaxe extends Item{
    public BookPickaxe(String name){
        super();
        this.setMaxStackSize(1);
        this.setUnlocalizedName(name);
        this.setCreativeTab(ShinseiTabs.TOOLS_TAB);
    }

    @Override
    public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn){
        if (!worldIn.isRemote)
        {
            Minecraft.getMinecraft().displayGuiScreen(
                    new GuiPickaxeBook());
        }
        return itemStackIn;
    }

    @Override
    public boolean hasContainerItem(ItemStack itemstack) {
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemstack) {
        itemstack.attemptDamageItem(0, this.itemRand);
        return itemstack;
    }

}
