package com.megathirio.shinsei.crafting;

import com.megathirio.shinsei.items.ShinseiFoods;
import com.megathirio.shinsei.items.ShinseiItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class FoodRecipes {
    public static void initRecipes(){
        GameRegistry.addShapedRecipe(new ItemStack(ShinseiFoods.curedBeef), "!!!", "!@!", "!!!", '!', ShinseiFoods.salt, '@', Items.beef);
        GameRegistry.addShapedRecipe(new ItemStack(ShinseiFoods.curedPork), "!!!", "!@!", "!!!", '!', ShinseiFoods.salt, '@', Items.porkchop);
    }
}
