package com.megathirio.shinsei.crafting;

import com.megathirio.shinsei.items.ShinseiItems;
import com.megathirio.shinsei.items.ShinseiTools;
import com.megathirio.shinsei.utilities.hashmaps.HashMaps;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ToolRecipes {
    public static HashMap<Item, Item[]> toolMap = new HashMap<Item, Item[]>();
    public static Set<Map.Entry<Item, Item[]>> toolEntries = toolMap.entrySet();
    public static HashMap<Item, Item> bookMap = new HashMaps().getBookMap();
    public static Set<Map.Entry<Item, Item>> bookEntries = bookMap.entrySet();

    public static void initRecipes(){
        for (Map.Entry<Item, Item[]> mapEntry : toolEntries) {
            Item tool = mapEntry.getKey();
            Item head = mapEntry.getValue()[0];
            Item handle = mapEntry.getValue()[1];
            Item book = mapEntry.getValue()[2];
            Item workTool = mapEntry.getValue()[3];
            Item material = mapEntry.getValue()[4];

            GameRegistry.addShapelessRecipe(new ItemStack(head, 1), material, book, new ItemStack(workTool, 1, OreDictionary.WILDCARD_VALUE));
            GameRegistry.addShapelessRecipe(new ItemStack(tool, 1), head, handle, book);
        }

        for (Map.Entry<Item, Item> mapEntry : bookEntries) {
            Item book = mapEntry.getKey();
            Item item = mapEntry.getValue();
            GameRegistry.addShapelessRecipe(new ItemStack(book, 1), Items.book, item, new ItemStack(ShinseiTools.boneAxe, 1, OreDictionary.WILDCARD_VALUE));
            GameRegistry.addShapelessRecipe(new ItemStack(book, 1), Items.book, item, new ItemStack(ShinseiTools.flintAxe, 1, OreDictionary.WILDCARD_VALUE));
        }

        GameRegistry.addShapelessRecipe(new ItemStack(ShinseiTools.flintAxe, 1), Items.flint, Items.stick);
        GameRegistry.addShapelessRecipe(new ItemStack(ShinseiTools.boneAxe, 1), Items.bone,  Items.stick);
        GameRegistry.addShapelessRecipe(new ItemStack(ShinseiTools.ironHammer, 1), Items.iron_ingot, ShinseiTools.woodToolHandle, ShinseiItems.bookShinsei);
        GameRegistry.addShapelessRecipe(new ItemStack(ShinseiTools.woodToolHandle, 1), Items.stick, Items.stick);
    }
}
