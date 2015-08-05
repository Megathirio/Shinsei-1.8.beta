package com.megathirio.shinsei.blocks;

import com.megathirio.shinsei.core.ShinseiTabs;
import com.megathirio.shinsei.utilities.EnumBricks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

import java.util.List;

public class BrickProperties extends Block implements IMetaBlockName{

    private int meta;
    public static final PropertyEnum TYPE = PropertyEnum.create("type", EnumBricks.class);

    public BrickProperties(String unlocalizedName){
        super(Material.rock);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(ShinseiTabs.BLOCKS_TAB);
        this.setHardness(4.0f);
        this.setResistance(6.5f);
        this.setDefaultState(this.blockState.getBaseState().withProperty(TYPE, EnumBricks.GRAY));
    }

    public BrickProperties(String unlocalizedName, Material material, float hardness, float resistance){
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(ShinseiTabs.BLOCKS_TAB);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setDefaultState(this.blockState.getBaseState().withProperty(TYPE, EnumBricks.GRAY));
    }

    @Override
    public IBlockState getStateFromMeta(int meta){
        //conditionA ? doA : (conditionB ? doB : doC);
            this.meta = meta;
            return this.getDefaultState().withProperty(TYPE, meta == 0 ? EnumBricks.GRAY : (meta == 1 ? EnumBricks.TAN :
                   (meta == 2 ? EnumBricks.VARI : (meta == 3 ? EnumBricks.BASALT : EnumBricks.GRAPHITE))));
    }

    @Override
   public int getMetaFromState(IBlockState state){
        EnumBricks type = (EnumBricks) state.getValue(TYPE);
        return type.getID();
    }

    @Override
    protected BlockState createBlockState(){
        return new BlockState(this, new IProperty[] { TYPE });
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public void getSubBlocks(Item itemIn, CreativeTabs tab, List list){
        list.add(new ItemStack(itemIn, 1, 0));
        list.add(new ItemStack(itemIn, 1, 1));
        list.add(new ItemStack(itemIn, 1, 2));
        list.add(new ItemStack(itemIn, 1, 3));
        list.add(new ItemStack(itemIn, 1, 4));
    }

    @Override
    public String getSpecialName(ItemStack stack){
        String color = "gray";
        switch (stack.getItemDamage()){
            case 0:
                color = "gray";
                break;
            case 1:
                color = "tan";
                break;
            case 2:
                color = "vari";
                break;
            case 3:
                color = "basalt";
                break;
            case 4:
                color = "graphite";
                break;
        }
        return color;
    }

    @Override
    public ItemStack getPickBlock(MovingObjectPosition target, World world, BlockPos pos){
        return new ItemStack(Item.getItemFromBlock(this), 1, this.getMetaFromState(world.getBlockState(pos)));
    }

    @Override
    public int damageDropped(IBlockState blockstate) {
        return this.meta;
    }
}