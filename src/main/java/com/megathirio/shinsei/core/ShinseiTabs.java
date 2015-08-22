package com.megathirio.shinsei.core;

import com.megathirio.shinsei.blocks.GemBlocks;
import com.megathirio.shinsei.blocks.MetalBlocks;
import com.megathirio.shinsei.items.GemItems;
import com.megathirio.shinsei.ref.Names;
import com.megathirio.shinsei.ref.Ref;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ShinseiTabs {
    public static final CreativeTabs METALS_TAB = new CreativeTabs(Ref.RESOURCE_PREFIX + "metals_tab") {
        @Override
        public Item getTabIconItem() {
            return Item.getItemFromBlock(MetalBlocks.getBlock(Names.ores.ACANTHITE));
        }
    };

    public static final CreativeTabs GEMS_TAB = new CreativeTabs(Ref.RESOURCE_PREFIX + "gems_tab") {
        @Override
        public Item getTabIconItem() {
            return Item.getItemFromBlock(GemBlocks.getBlock(Names.ores.AMETHYST));
        }
    };

    public static final CreativeTabs ITEMS_TAB = new CreativeTabs(Ref.RESOURCE_PREFIX + "items_tab") {
        @Override
        public Item getTabIconItem() {
            return GemItems.getItem(Names.gems.AMETHYST);
        }
    };
}
