package com.megathirio.shinsei.crafting;

import com.megathirio.shinsei.init.Minerals;
import com.megathirio.shinsei.items.ShinseiFoods;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class FoodRecipes {

    public static void initRecipes(){
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiFoods.curedBeef), "!!!", "!@!", "!!!", '!', Minerals.getItem("salt"), '@', Items.beef));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiFoods.curedPork), "!!!", "!@!", "!!!", '!', Minerals.getItem("salt"), '@', Items.porkchop));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiFoods.curedBeef), Minerals.getBlock("halite_ore"), Items.beef));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiFoods.curedPork), Minerals.getBlock("halite_ore"), Items.porkchop));
    }
}
