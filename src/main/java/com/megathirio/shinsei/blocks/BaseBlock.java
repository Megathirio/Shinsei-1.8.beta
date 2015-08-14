package com.megathirio.shinsei.blocks;

import com.megathirio.shinsei.core.ShinseiTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.Random;

public class BaseBlock extends Block {



    public BaseBlock(String unlocalizedName, Material material, float hardness, float resistance,
                     String toolClass, int toolLevel, float lightLevel, int lightOpacity, CreativeTabs creativeTab){
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setHarvestLevel(toolClass, toolLevel);
        this.setLightLevel(lightLevel);
        this.setLightOpacity(lightOpacity);
        this.setCreativeTab(creativeTab);
    }


    public BaseBlock(String unlocalizedName, Material material, float hardness, float resistance,
                     float lightLevel, int lightOpacity, CreativeTabs creativeTab) {
        this(unlocalizedName, material, hardness, resistance, "pickaxe", 1, lightLevel, lightOpacity, creativeTab);
    }

    public BaseBlock(String unlocalizedName, float hardness, float resistance,
                     float lightLevel, int lightOpacity, CreativeTabs creativeTab) {
        this(unlocalizedName, Material.rock, hardness, resistance, "pickaxe", 1, lightLevel, lightOpacity, creativeTab);
    }

    public BaseBlock(String unlocalizedName, Material material, float hardness, float resistance,
                     float lightLevel, int lightOpacity) {
        this(unlocalizedName, material, hardness, resistance, "pickaxe", 1, lightLevel, lightOpacity, ShinseiTabs.BLOCKS_TAB);
    }

    public BaseBlock(String unlocalizedName, Material material, float hardness, float resistance, CreativeTabs creativeTab) {
        this(unlocalizedName, material, hardness, resistance, "pickaxe", 1, 0.f, 0, creativeTab);
    }

    public BaseBlock(String unlocalizedName, Material material, float hardness, float resistance) {
        this(unlocalizedName, material, hardness, resistance, "pickaxe", 1, 0.f, 0, ShinseiTabs.BLOCKS_TAB);
    }

    public BaseBlock(String unlocalizedName, float hardness, float resistance, CreativeTabs creativeTab) {
        this(unlocalizedName, Material.rock, 2.5f, 4.0f,"pickaxe", 1, 0.f, 0, creativeTab);
    }

    public BaseBlock(String unlocalizedName, Material material, CreativeTabs creativeTab) {
        this(unlocalizedName, material, 3.0f, 5.0f,"pickaxe", 1, 0.f, 0, creativeTab);
    }

    public BaseBlock(String unlocalizedName, CreativeTabs creativeTab) {
        this(unlocalizedName, Material.rock, 3.0f, 5.0f,"pickaxe", 1, 0.f, 0, creativeTab);
    }

    public BaseBlock(String unlocalizedName, Material material) {
        this(unlocalizedName, material, 3.0f, 5.0f, "pickaxe", 1, 0.f, 0, ShinseiTabs.BLOCKS_TAB);
    }

    public BaseBlock(String unlocalizedName, float hardness, float resistance, String toolClass, int toolLevel) {
        this(unlocalizedName, Material.rock, hardness, resistance, toolClass, toolLevel, 0.f, 0, ShinseiTabs.BLOCKS_TAB);
    }

    public BaseBlock(String unlocalizedName, String toolClass, int toolLevel) {
        this(unlocalizedName, Material.rock, 3.0f, 5.0f,toolClass, toolLevel, 0.f, 0, ShinseiTabs.BLOCKS_TAB);
    }

    public BaseBlock(String unlocalizedName) {
        this(unlocalizedName, Material.rock, 3.0f, 5.0f,"pickaxe", 1, 0.f, 0, ShinseiTabs.BLOCKS_TAB);
    }
}
