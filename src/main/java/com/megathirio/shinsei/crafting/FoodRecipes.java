package com.megathirio.shinsei.crafting;

import com.megathirio.shinsei.blocks.ShinseiOres;
import com.megathirio.shinsei.items.ShinseiFoods;
import com.megathirio.shinsei.items.ShinseiItems;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import java.util.HashMap;
import java.util.Map;

public class FoodRecipes {

    public static void initRecipes(){
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiFoods.curedBeef), "!!!", "!@!", "!!!", '!', "dustSalt", '@', Items.beef));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiFoods.curedPork), "!!!", "!@!", "!!!", '!', "dustSalt", '@', Items.porkchop));
    }
}
