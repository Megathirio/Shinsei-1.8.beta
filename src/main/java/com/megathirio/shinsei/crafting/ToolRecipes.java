package com.megathirio.shinsei.crafting;

import com.megathirio.shinsei.blocks.BaseBlock;
import com.megathirio.shinsei.items.ShinseiItems;
import com.megathirio.shinsei.items.ShinseiTools;
import com.megathirio.shinsei.utilities.HashMaps;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ToolRecipes {
    public static HashMap<Item, Item[]> toolMap = new HashMaps().getToolMap();
    public static Set<Item> toolSet = toolMap.keySet();
    public static HashMap<Item, Item> bookMap = new HashMaps().getBookMap();
    public static Set<Map.Entry<Item, Item>> bookSet = bookMap.entrySet();

    public static void initRecipes(){
        for (Item tool : toolSet) {
            Item head = toolMap.get(tool)[0];
            Item handle = toolMap.get(tool)[1];
            Item book = toolMap.get(tool)[2];
            Item workTool = toolMap.get(tool)[3];
            Item material = toolMap.get(tool)[4];

            GameRegistry.addShapelessRecipe(new ItemStack(head, 1), material, book, new ItemStack(workTool, 1, OreDictionary.WILDCARD_VALUE));
            GameRegistry.addShapelessRecipe(new ItemStack(tool, 1), head, handle, book);
        }

        for (Map.Entry<Item, Item> mapEntry : bookSet) {
            Item book = mapEntry.getKey();
            Item item = mapEntry.getValue();
            GameRegistry.addShapelessRecipe(new ItemStack(book, 1), Items.book, item, new ItemStack(ShinseiTools.boneAxe, 1, OreDictionary.WILDCARD_VALUE));
            GameRegistry.addShapelessRecipe(new ItemStack(book, 1), Items.book, item, new ItemStack(ShinseiTools.flintAxe, 1, OreDictionary.WILDCARD_VALUE));
        }

        GameRegistry.addShapelessRecipe(new ItemStack(ShinseiTools.flintAxe, 1), Items.flint, Items.stick);
        GameRegistry.addShapelessRecipe(new ItemStack(ShinseiTools.boneAxe, 1), Items.bone,  Items.stick);
        GameRegistry.addShapelessRecipe(new ItemStack(ShinseiTools.ironHammer, 1), Items.iron_ingot, ShinseiTools.woodToolHandle, ShinseiItems.bookShinsei);
        GameRegistry.addShapelessRecipe(new ItemStack(ShinseiTools.woodToolHandle, 1), Items.stick, Items.stick);
//        GameRegistry.addShapelessRecipe(new ItemStack(ShinseiTools.silverAxeBlade, 1), ShinseiItems.silverIngot, new ItemStack(ShinseiTools.bookAxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ShinseiTools.ironHammer, 1, OreDictionary.WILDCARD_VALUE));
//        GameRegistry.addShapelessRecipe(new ItemStack(ShinseiTools.silverAxe, 1), ShinseiTools.silverAxeBlade, ShinseiTools.woodToolHandle);
    }
}
