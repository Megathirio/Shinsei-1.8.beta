package com.megathirio.shinsei.blocks;

import java.util.Random;

import com.megathirio.shinsei.core.ShinseiTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BaseOre extends Block {

    private Item drop;
    private int meta;
    private int least_quantity;
    private int most_quantity;

    protected BaseOre(String unlocalizedName, Material material, Item drop, int meta, int least_quantity, int most_quantity) {
        super(material);
        this.drop = drop;
        this.meta = meta;
        this.least_quantity = least_quantity;
        this.most_quantity = most_quantity;
        this.setHarvestLevel("pickaxe", 1);
        this.setHardness(1.0f);
        this.setResistance(3.0f);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(ShinseiTabs.ORES_TAB);
    }

    protected BaseOre(String unlocalizedName, Material material, Item drop, int least_quantity, int most_quantity) {
        this(unlocalizedName, material, drop, 0, least_quantity, most_quantity);
        this.setCreativeTab(ShinseiTabs.ORES_TAB);
    }

    protected BaseOre(String unlocalizedName, Material material, Item drop) {
        this(unlocalizedName, material, drop, 1, 1);
        this.setCreativeTab(ShinseiTabs.ORES_TAB);
    }

    @Override
    public Item getItemDropped(IBlockState blockstate, Random random, int fortune) {
        return this.drop;
    }

    @Override
    public int damageDropped(IBlockState blockstate) {
        return this.meta;
    }

    @Override
    public int quantityDropped(IBlockState blockstate, int fortune, Random random) {
        if (this.least_quantity >= this.most_quantity)
            return this.least_quantity;
        return this.least_quantity + random.nextInt(this.most_quantity - this.least_quantity + fortune + 1);
    }
}