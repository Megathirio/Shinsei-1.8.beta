package com.megathirio.shinsei.core;

import com.megathirio.shinsei.blocks.ShinseiBlocks;
import com.megathirio.shinsei.blocks.ShinseiOres;
import com.megathirio.shinsei.items.ShinseiFoods;
import com.megathirio.shinsei.items.ShinseiItems;
import com.megathirio.shinsei.items.ShinseiTools;
import com.megathirio.shinsei.utilities.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ShinseiTabs {
    public static final CreativeTabs ORES_TAB = new CreativeTabs(Reference.RESOURCE_PREFIX + "ore_tab") {
        @Override
        public Item getTabIconItem() {
            return Item.getItemFromBlock(ShinseiOres.acanthiteOre);
        }
    };

    public static final CreativeTabs BLOCKS_TAB = new CreativeTabs(Reference.RESOURCE_PREFIX + "blocks_tab") {
        @Override
        public Item getTabIconItem() {
            return Item.getItemFromBlock(ShinseiBlocks.siding);
        }
    };

    public static final CreativeTabs TOOLS_TAB = new CreativeTabs(Reference.RESOURCE_PREFIX + "tools_tab") {
        @Override
        public Item getTabIconItem() {
            return ShinseiTools.bookAxe;
        }
    };

    public static final CreativeTabs FOOD_TAB = new CreativeTabs(Reference.RESOURCE_PREFIX + "food_tab") {
        @Override
        public Item getTabIconItem() {
            return ShinseiFoods.curedBeef;
        }
    };

    public static final CreativeTabs ITEMS_TAB = new CreativeTabs(Reference.RESOURCE_PREFIX + "items_tab") {
        @Override
        public Item getTabIconItem() {
            return ShinseiItems.aluminumDust;
        }
    };
}
