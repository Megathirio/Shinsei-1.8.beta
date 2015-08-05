package com.megathirio.shinsei.crafting;

import com.megathirio.shinsei.blocks.ShinseiBlocks;
import com.megathirio.shinsei.blocks.ShinseiOres;
import com.megathirio.shinsei.items.ShinseiItems;
import com.megathirio.shinsei.items.ShinseiTools;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class ShinseiCrafting {
    public static void initRecipes(){
        MetalRecipes.initRecipes();
        ToolRecipes.initRecipes();
        FoodRecipes.initRecipes();
        FuelRecipes.initRecipes();
    }
}
