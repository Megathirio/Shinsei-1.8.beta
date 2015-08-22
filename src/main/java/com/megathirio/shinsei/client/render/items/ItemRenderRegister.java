package com.megathirio.shinsei.client.render.items;


import com.megathirio.shinsei.items.GemItems;
import com.megathirio.shinsei.items.MetalItems;

public class ItemRenderRegister {
    public static void registerItemRenderer() {
        GemItems.registerItemRenderer();
        MetalItems.registerItemRenderer();
    }
}
