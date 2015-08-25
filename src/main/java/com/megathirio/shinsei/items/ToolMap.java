package com.megathirio.shinsei.items;

import com.megathirio.shinsei.ref.Names;
import net.minecraft.item.Item;

import java.util.HashMap;

public class ToolMap {
    public static HashMap<String, Item> toolMap = new HashMap<String, Item>();

    public static void addTools() {
        toolMap.put(Names.tools.COPPER_PICK, new BasePickaxe(Names.tools.COPPER_PICK, Materials.materialCopper));
    }

    public static HashMap<String, Item> getToolMap() {
        return toolMap;
    }
}
