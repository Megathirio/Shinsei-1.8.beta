package com.megathirio.shinsei.blocks;

import com.megathirio.shinsei.core.ShinseiTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

public class BaseGem extends Block{

    private Item drop;
    private int meta;
    private int min_qty;
    private int max_qty;

    protected BaseGem(String name, Material mat, float hard, float resist, Item drop, int meta, int min_qty, int max_qty, float lightLevel){
        super(mat);
        this.drop = drop;
        this.meta = meta;
        this.min_qty = min_qty;
        this.max_qty = max_qty;
        this.setHarvestLevel("pickaxe", 1);
        this.setHardness(hard);
        this.setResistance(resist);
        this.setLightLevel(lightLevel);
        this.setUnlocalizedName(name);
        this.setCreativeTab(ShinseiTabs.GEMS_TAB);
    }

    protected BaseGem(String name, Material mat, Item drop, float hard, float resist, int min_qty, int max_qty){
        this(name, mat, hard, resist, drop, 0, min_qty, max_qty, .5f);
    }

    protected BaseGem(String name, Material mat, Item drop, int min_qty, int max_qty){
        this(name, mat, 7.0f, 11.3f, drop, 0, min_qty, max_qty, 0.5f);
    }

    protected BaseGem(String name, Material mat, Item drop){
        this(name, mat, 7.0f, 11.3f, drop, 0, 1, 1, .5f);
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
        if (this.min_qty >= this.max_qty)
            return this.min_qty;
        return this.min_qty + random.nextInt(this.max_qty - this.min_qty + fortune + 1);
    }
}
