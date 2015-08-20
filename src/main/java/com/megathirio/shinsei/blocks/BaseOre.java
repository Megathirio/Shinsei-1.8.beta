package com.megathirio.shinsei.blocks;

import com.megathirio.shinsei.core.ShinseiTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BaseOre extends Block{


    private String name;
    private Material material;
    private float hardness;
    private float resistance;
    private String toolClass;
    private int toolLevel;
    private float lightLevel;
    private int lightOpacity;
    private CreativeTabs creativeTab;
    private String block;
    private String ingot;
    private String nugget;
    private String dust;
    private String plate;

    public BaseOre(String name, Material material, float hardness, float resistance, String toolClass, int toolLevel, float lightLevel, int lightOpacity, CreativeTabs creativeTab, String metal) {
        super(material);
        this.name = name + "_ore";
        this.material = material;
        this.hardness = hardness;
        this.resistance = resistance;
        this.toolClass = toolClass;
        this.toolLevel = toolLevel;
        this.lightLevel = lightLevel;
        this.lightOpacity = lightOpacity;
        this.creativeTab = creativeTab;
        this.block = metal + "_block";
        this.ingot = metal + "_ingot";
        this.nugget = metal + "_nugget";
        this.dust = metal + "_dust";
        this.plate = metal + "_plate";
    }

    public BaseOre(String name, String metal){
        this(name + "_ore", Material.rock, 3.0f, 5.0f, "pickaxe", 1, 0.0f, 0, ShinseiTabs.BLOCKS_TAB, metal);
        this.block = metal + "_block";
        this.ingot = metal + "_ingot";
        this.nugget = metal + "_nugget";
        this.dust = metal + "_dust";
        this.plate = metal + "_plate";
    }

    public String getName() {
        return name;
    }

    @Override
    public Material getMaterial() {
        return material;
    }

    public float getHardness() {
        return hardness;
    }

    public float getResistance() {
        return resistance;
    }

    public String getToolClass() {
        return toolClass;
    }

    public int getToolLevel() {
        return toolLevel;
    }

    public float getLightLevel() {
        return lightLevel;
    }

    @Override
    public int getLightOpacity() {
        return lightOpacity;
    }

    public CreativeTabs getCreativeTab() {
        return creativeTab;
    }

    public String getBlock() {
        return block;
    }

    public String getIngot() {
        return ingot;
    }

    public String getNugget() {
        return nugget;
    }

    public String getDust() {
        return dust;
    }

    public String getPlate() {
        return plate;
    }
}
