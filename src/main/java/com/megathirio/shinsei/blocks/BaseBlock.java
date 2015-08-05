package com.megathirio.shinsei.blocks;

import com.megathirio.shinsei.core.ShinseiTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BaseBlock extends Block {

    public BaseBlock(String unlocalizedName, Material material, float hardness, float resistance){
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(ShinseiTabs.BLOCKS_TAB);
        this.setHardness(hardness);
        this.setResistance(resistance);
    }

    public BaseBlock(String unlocalizedName, float hardness, float resistance){
        this(unlocalizedName, Material.rock, hardness, resistance);
        this.setCreativeTab(ShinseiTabs.BLOCKS_TAB);
    }

    public BaseBlock(String unlocalizedName){
        this(unlocalizedName, 3.0f, 5.0f);
        this.setCreativeTab(ShinseiTabs.BLOCKS_TAB);
    }

}
