package com.megathirio.shinsei.blocks;

import com.megathirio.shinsei.core.ShinseiTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BaseStone extends Block {

    public BaseStone(String unlocalizedName, Material material, float hardness, float resistance){
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(ShinseiTabs.METALS_TAB);
        this.setHardness(hardness);
        this.setResistance(resistance);
    }

    public BaseStone(String unlocalizedName, float hardness, float resistance){
        this(unlocalizedName, Material.rock, hardness, resistance);
        this.setCreativeTab(ShinseiTabs.METALS_TAB);
    }

    public BaseStone(String unlocalizedName){
        this(unlocalizedName, 3.0f, 5.0f);
        this.setCreativeTab(ShinseiTabs.METALS_TAB);
    }

}
