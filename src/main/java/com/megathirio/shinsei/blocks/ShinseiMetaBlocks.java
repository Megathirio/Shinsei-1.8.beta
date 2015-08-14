package com.megathirio.shinsei.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ShinseiMetaBlocks {

    public static Block marble;
    public static Block granite;
    public static Block siding;
    public static Block bricks;

    public static void createMetaBlocks(){

        GameRegistry.registerBlock(marble = new BlockProperties("marble"), ItemBlockMeta.class, "marble");
        GameRegistry.registerBlock(granite = new BlockProperties("granite", Material.rock, 7.0f, 11.3f), ItemBlockMeta.class, "granite");
        GameRegistry.registerBlock(siding = new BlockProperties("siding", Material.wood, 4, 15), ItemBlockMeta.class, "siding");
        GameRegistry.registerBlock(bricks = new BrickProperties("bricks", Material.rock, 4.0f, 6.5f), ItemBlockMeta.class, "bricks");
    }
}
