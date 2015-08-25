package com.megathirio.shinsei.client.render.items;


import com.megathirio.shinsei.items.Books;
import com.megathirio.shinsei.items.GemItems;
import com.megathirio.shinsei.items.MetalItems;
import com.megathirio.shinsei.items.Tools;

public class ItemRenderRegister {
    public static void registerItemRenderer() {
        GemItems.registerItemRenderer();
        MetalItems.registerItemRenderer();
        Tools.registerItemRenderer();
        Books.registerItemRenderer();
    }
}
