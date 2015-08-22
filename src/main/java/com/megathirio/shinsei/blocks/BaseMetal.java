package com.megathirio.shinsei.blocks;

import com.megathirio.shinsei.core.ShinseiTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

public class BaseMetal extends Block{

    protected BaseMetal(String name, Material mat, float hard, float resist, String toolClass, int harvestLevel){
        super(mat);
        this.setHarvestLevel("pickaxe", 1);
        this.setHardness(2.0f);
        this.setResistance(3.2f);
        this.setUnlocalizedName(name);
        this.setCreativeTab(ShinseiTabs.METALS_TAB);
        this.enableStats = true;
    }

    protected BaseMetal(String name, Material mat){
        this(name, mat, 1.0f, 3.0f, "pickaxe", 1);
    }

    protected BaseMetal(String name, float hard, float resist, String toolClass, int harvestLevel){
        this(name, Material.rock, hard, resist, toolClass, harvestLevel);
    }

    protected BaseMetal(String name, float hard, float resist){
        this(name, Material.rock, hard, resist, "pickaxe", 1);
    }

    protected BaseMetal(String name){
        this(name, Material.iron);
    }
}
