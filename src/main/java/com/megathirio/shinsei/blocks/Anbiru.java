package com.megathirio.shinsei.blocks;

import com.megathirio.shinsei.Main;
import com.megathirio.shinsei.core.ShinseiTabs;
import com.megathirio.shinsei.guis.GuiID;
import com.megathirio.shinsei.ref.Names;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class Anbiru extends Block {
    public static final PropertyDirection FACING = PropertyDirection.create(
           "facing", EnumFacing.Plane.HORIZONTAL);

    protected Anbiru(){
        super(Material.iron);
        this.setHarvestLevel("pickaxe", 1);
        this.setHardness(2.0f);
        this.setResistance(3.2f);
        this.setUnlocalizedName(Names.machines.ANBIRU);
        this.setCreativeTab(ShinseiTabs.MACHINES_TAB);
        this.enableStats = true;
    }

    @Override
    public boolean onBlockActivated(World parWorld, BlockPos parBlockPos, IBlockState parIBlockState, EntityPlayer parPlayer,
        EnumFacing parSide, float hitX, float hitY, float hitZ){
        if(!parWorld.isRemote){
            // DEBUG
            System.out.println("BaseMachine onBlockActivated");
             parPlayer.openGui(Main.instance, GuiID.ANBIRU.ordinal(),
                    parWorld,
                    parBlockPos.getX(),
                    parBlockPos.getY(),
                    parBlockPos.getZ()
            );
        }
        return true;
    }

    @Override
    public void onBlockAdded(
            World parWorld,
            BlockPos parBlockPos,
            IBlockState parIBlockState
    )
    {
        if (!parWorld.isRemote)
        {
            // Rotate block if the front side is blocked
            Block blockToNorth = parWorld.getBlockState(parBlockPos.north()).getBlock();
            Block blockToSouth = parWorld.getBlockState(parBlockPos.south()).getBlock();
            Block blockToWest = parWorld.getBlockState(parBlockPos.west()).getBlock();
            Block blockToEast = parWorld.getBlockState(parBlockPos.east()).getBlock();
            EnumFacing enumfacing = (EnumFacing)parIBlockState.getValue(FACING);
             if (enumfacing == EnumFacing.NORTH && blockToNorth.isFullBlock()
                    && !blockToSouth.isFullBlock())
            {
                enumfacing = EnumFacing.SOUTH;
            }
            else if (enumfacing == EnumFacing.SOUTH && blockToSouth.isFullBlock()
                    && !blockToNorth.isFullBlock())
            {
                enumfacing = EnumFacing.NORTH;
            }
            else if (enumfacing == EnumFacing.WEST && blockToWest.isFullBlock()
                    && !blockToEast.isFullBlock())
            {
                enumfacing = EnumFacing.EAST;
            }
            else if (enumfacing == EnumFacing.EAST && blockToEast.isFullBlock()
                    && !blockToWest.isFullBlock())
            {
                enumfacing = EnumFacing.WEST;
            }
             parWorld.setBlockState(parBlockPos, parIBlockState.withProperty(
                   FACING, enumfacing), 2);
        }
    }

        /**
         * Possibly modify the given BlockState before rendering it on an Entity
         * (Minecarts, Endermen, ...)
         */
        @Override
        @SideOnly(Side.CLIENT)
        public IBlockState getStateForEntityRender(IBlockState state)
        {
            return getDefaultState().withProperty(FACING, EnumFacing.SOUTH);
        }

        /**
         * Convert the given metadata into a BlockState for this Block
         */
        @Override
        public IBlockState getStateFromMeta(int meta)
        {
            EnumFacing enumfacing = EnumFacing.getFront(meta);

            if (enumfacing.getAxis() == EnumFacing.Axis.Y)
            {
                enumfacing = EnumFacing.NORTH;
            }

            return getDefaultState().withProperty(FACING, enumfacing);
        }

        /**
         * Convert the BlockState into the correct metadata value
         */
        @Override
        public int getMetaFromState(IBlockState state)
        {
            return ((EnumFacing)state.getValue(FACING)).getIndex();
        }

        @Override
        protected BlockState createBlockState()
        {
            return new BlockState(this, new IProperty[] {FACING});
        }

        @SideOnly(Side.CLIENT)
        static final class SwitchEnumFacing
        {
            static final int[] enumFacingArray = new int[EnumFacing.values().length];

            static
            {
                try
                {
                    enumFacingArray[EnumFacing.WEST.ordinal()] = 1;
                }
                catch (NoSuchFieldError var4)
                {
                    ;
                }

                try
                {
                    enumFacingArray[EnumFacing.EAST.ordinal()] = 2;
                }
                catch (NoSuchFieldError var3)
                {
                    ;
                }

                try
                {
                    enumFacingArray[EnumFacing.NORTH.ordinal()] = 3;
                }
                catch (NoSuchFieldError var2)
                {
                    ;
                }

                try
                {
                    enumFacingArray[EnumFacing.SOUTH.ordinal()] = 4;
                }
                catch (NoSuchFieldError var1)
                {
                    ;
                }
            }
        }
    }