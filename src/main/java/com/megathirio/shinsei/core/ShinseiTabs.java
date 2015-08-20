package com.megathirio.shinsei.core;

import com.megathirio.shinsei.blocks.Gems;
import com.megathirio.shinsei.init.Metals;
import com.megathirio.shinsei.init.Minerals;
import com.megathirio.shinsei.utilities.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class ShinseiTabs {
    public static final CreativeTabs METALS_TAB = new CreativeTabs(Reference.RESOURCE_PREFIX + "metals_tab") {
        @Override
        public Item getTabIconItem() {
            return Item.getItemFromBlock(Metals.getBlock("acanthite_ore"));
        }
    };

    public static final CreativeTabs MINERALS_TAB = new CreativeTabs(Reference.RESOURCE_PREFIX + "minerals_tab") {
        @Override
        public Item getTabIconItem() {
            return Item.getItemFromBlock(Minerals.getBlock("halite_ore"));
        }
    };

    public static final CreativeTabs BLOCKS_TAB = new CreativeTabs(Reference.RESOURCE_PREFIX + "Blocks_tab") {
        @Override
        public Item getTabIconItem() {
            return Item.getItemFromBlock(Metals.getBlock("copper_block"));
        }
    };

    public static final CreativeTabs ALLOYS_TAB = new CreativeTabs(Reference.RESOURCE_PREFIX + "alloys_tab") {
        @Override
        public Item getTabIconItem() {
            return Item.getItemFromBlock(Metals.getBlock("silver_block"));
        }
    };

    public static final CreativeTabs GEMS_TAB = new CreativeTabs(Reference.RESOURCE_PREFIX + "gems_tab") {
        @Override
        public Item getTabIconItem() {
            return Gems.getItem("amethyst_gem");
        }
    };

    public static final CreativeTabs TOOLS_TAB = new CreativeTabs(Reference.RESOURCE_PREFIX + "tools_tab") {
        @Override
        public Item getTabIconItem() {
            return Items.carrot;
        }
    };

    public static final CreativeTabs FOOD_TAB = new CreativeTabs(Reference.RESOURCE_PREFIX + "food_tab") {
        @Override
        public Item getTabIconItem() {
            return Items.diamond;
        }
    };

    public static final CreativeTabs ITEMS_TAB = new CreativeTabs(Reference.RESOURCE_PREFIX + "items_tab") {
        @Override
        public Item getTabIconItem() {
            return Metals.getItem("silver_ingot");
        }
    };
}
