package com.megathirio.shinsei.crafting;

import com.megathirio.shinsei.items.ShinseiItems;
import com.megathirio.shinsei.items.ShinseiTools;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class FuelRecipes {
    public static void initRecipes(){
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.splitWood, 2), "logWood", new ItemStack(ShinseiTools.silverAxe, 1, OreDictionary.WILDCARD_VALUE)));
    }
}
