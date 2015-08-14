package com.megathirio.shinsei.blocks;

import com.megathirio.shinsei.core.ShinseiTabs;
import com.megathirio.shinsei.utilities.EnumColors;
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

public class BlockProperties extends Block implements IMetaBlockName{

    private int meta;
    public static final PropertyEnum TYPE = PropertyEnum.create("type", EnumColors.class);

    public BlockProperties(String unlocalizedName){
        super(Material.rock);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(ShinseiTabs.ALLOYS_TAB);
        this.setHardness(4.0f);
        this.setResistance(6.5f);
        this.setDefaultState(this.blockState.getBaseState().withProperty(TYPE, EnumColors.WHITE));
    }

    public BlockProperties(String unlocalizedName, Material material, float hardness, float resistance){
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(ShinseiTabs.ALLOYS_TAB);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setDefaultState(this.blockState.getBaseState().withProperty(TYPE, EnumColors.WHITE));
    }

    @Override
    public IBlockState getStateFromMeta(int meta){
        //conditionA ? doA : (conditionB ? doB : doC);
            this.meta = meta;
            return this.getDefaultState().withProperty(TYPE, meta == 0 ? EnumColors.WHITE : (meta == 1 ? EnumColors.ORANGE : (meta == 2 ? EnumColors.MAGENTA :
                    (meta == 3 ? EnumColors.LTBLUE : (meta == 4 ? EnumColors.YELLOW : (meta == 5 ? EnumColors.LIME : (meta == 6 ? EnumColors.PINK :
                            (meta == 7 ? EnumColors.GRAY : (meta == 8 ? EnumColors.SILVER : (meta == 9 ? EnumColors.CYAN : (meta == 10 ? EnumColors.PURPLE :
                                    (meta == 11 ? EnumColors.BLUE : (meta == 12 ? EnumColors.BROWN : (meta == 13 ? EnumColors.GREEN : (meta == 14 ? EnumColors.RED :
                                            EnumColors.BLACK)))))))))))))));
    }

    @Override
   public int getMetaFromState(IBlockState state){
        EnumColors type = (EnumColors) state.getValue(TYPE);
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
        list.add(new ItemStack(itemIn, 1, 5));
        list.add(new ItemStack(itemIn, 1, 6));
        list.add(new ItemStack(itemIn, 1, 7));
        list.add(new ItemStack(itemIn, 1, 8));
        list.add(new ItemStack(itemIn, 1, 9));
        list.add(new ItemStack(itemIn, 1, 10));
        list.add(new ItemStack(itemIn, 1, 11));
        list.add(new ItemStack(itemIn, 1, 12));
        list.add(new ItemStack(itemIn, 1, 13));
        list.add(new ItemStack(itemIn, 1, 14));
        list.add(new ItemStack(itemIn, 1, 15));
    }

    @Override
    public String getSpecialName(ItemStack stack){
        String color = "white";
        switch (stack.getItemDamage()){
            case 0:
                color = "white";
                break;
            case 1:
                color = "orange";
                break;
            case 2:
                color = "magenta";
                break;
            case 3:
                color = "ltblue";
                break;
            case 4:
                color = "yellow";
                break;
            case 5:
                color = "lime";
                break;
            case 6:
                color = "pink";
                break;
            case 7:
                color = "gray";
                break;
            case 8:
                color = "silver";
                break;
            case 9:
                color = "cyan";
                break;
            case 10:
                color = "purple";
                break;
            case 11:
                color = "blue";
                break;
            case 12:
                color = "brown";
                break;
            case 13:
                color = "green";
                break;
            case 14:
                color = "red";
                break;
            case 15:
                color = "black";
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
