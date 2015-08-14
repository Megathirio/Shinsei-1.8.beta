package com.megathirio.shinsei.blocks;

import com.megathirio.shinsei.core.ShinseiTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BaseMetal extends Block {



    public BaseMetal(String unlocalizedName, Material material, float hardness, float resistance,
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


    public BaseMetal(String unlocalizedName, Material material, float hardness, float resistance,
                     float lightLevel, int lightOpacity, CreativeTabs creativeTab) {
        this(unlocalizedName, material, hardness, resistance, "pickaxe", 1, lightLevel, lightOpacity, creativeTab);
    }

    public BaseMetal(String unlocalizedName, Material material, float hardness, float resistance,
                     float lightLevel, int lightOpacity) {
        this(unlocalizedName, material, hardness, resistance, "pickaxe", 1, lightLevel, lightOpacity, ShinseiTabs.METALS_TAB);
    }

    public BaseMetal(String unlocalizedName, Material material, float hardness, float resistance, CreativeTabs creativeTab) {
        this(unlocalizedName, material, hardness, resistance, "pickaxe", 1, 0.f, 0, creativeTab);
    }

    public BaseMetal(String unlocalizedName, Material material, float hardness, float resistance) {
        this(unlocalizedName, material, hardness, resistance, "pickaxe", 1, 0.f, 0, ShinseiTabs.METALS_TAB);
    }

    public BaseMetal(String unlocalizedName, Material material, CreativeTabs creativeTab) {
        this(unlocalizedName, material, 3.0f, 5.0f,"pickaxe", 1, 0.f, 0, creativeTab);
    }

    public BaseMetal(String unlocalizedName, CreativeTabs creativeTab) {
        this(unlocalizedName, Material.rock, 3.0f, 5.0f,"pickaxe", 1, 0.f, 0, creativeTab);
    }

    public BaseMetal(String unlocalizedName, Material material) {
        this(unlocalizedName, material, 3.0f, 5.0f, "pickaxe", 1, 0.f, 0, ShinseiTabs.METALS_TAB);
    }

    public BaseMetal(String unlocalizedName, float hardness, float resistance, String toolClass, int toolLevel) {
        this(unlocalizedName, Material.rock, hardness, resistance, toolClass, toolLevel, 0.f, 0, ShinseiTabs.METALS_TAB);
    }

    public BaseMetal(String unlocalizedName, String toolClass, int toolLevel) {
        this(unlocalizedName, Material.rock, 3.0f, 5.0f,toolClass, toolLevel, 0.f, 0, ShinseiTabs.METALS_TAB);
    }

    public BaseMetal(String unlocalizedName) {
        this(unlocalizedName, Material.rock, 3.0f, 5.0f, "pickaxe", 1, 0.f, 0, ShinseiTabs.METALS_TAB);
    }
}
