package com.megathirio.shinsei.items;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.megathirio.shinsei.core.ShinseiTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

import java.util.Set;

public class PrimitiveAxe extends ItemPickaxe{
    protected  PrimitiveAxe(String unlocalizedName, ToolMaterial material){
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(ShinseiTabs.TOOLS_TAB);
    }

    @Override
    public Set<String> getToolClasses(ItemStack stack){
        return ImmutableSet.of("pickaxe", "spade", "axe");
    }

    private static Set<Block> effectiveAgainst = Sets.newHashSet(new Block[] {
            Blocks.grass, Blocks.dirt, Blocks.sand, Blocks.gravel,
            Blocks.snow_layer, Blocks.snow, Blocks.clay, Blocks.farmland,
            Blocks.soul_sand, Blocks.mycelium, Blocks.planks,
            Blocks.bookshelf, Blocks.log, Blocks.log2, Blocks.chest,
            Blocks.pumpkin, Blocks.lit_pumpkin, Blocks.stone,
            Blocks.cobblestone, Blocks.sandstone});

    @Override
    public boolean canHarvestBlock(Block block){
        return effectiveAgainst.contains(block) ? true : super.canHarvestBlock(block);
    }

    @Override
    public float getStrVsBlock(ItemStack stack, Block block){
        if (block.getMaterial() == Material.wood || block.getMaterial() == Material.vine || block.getMaterial() == Material.plants)
            return this.efficiencyOnProperMaterial;
        return effectiveAgainst.contains(block) ? this.efficiencyOnProperMaterial : super.getStrVsBlock(stack, block);
    }

}
