package com.megathirio.shinsei.crafting;

import com.megathirio.shinsei.utilities.HashMaps;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.HashMap;
import java.util.Set;

public class MetalRecipes {
    public static HashMap<Block[], Item[]> basicOreMap = new HashMaps().getBasicOreMap();
    public static Set<Block[]> compSet = basicOreMap.keySet();

    public static void initRecipes(){
        for (Block[] set : compSet) {
            Block ore = set[0];
            Block block = set[1];
            Item dust = basicOreMap.get(set)[0];
            Item nugget = basicOreMap.get(set)[1];
            Item ingot = basicOreMap.get(set)[2];

            GameRegistry.addRecipe(new ItemStack(block), "!!!", "!!!", "!!!", '!', ingot);
            GameRegistry.addRecipe(new ItemStack(ingot), "!!!", "!!!", "!!!", '!', nugget);
            GameRegistry.addShapelessRecipe(new ItemStack(ingot, 9), block);
            GameRegistry.addShapelessRecipe(new ItemStack(nugget, 9), ingot);
            GameRegistry.addSmelting(dust, new ItemStack(ingot), 0.7F);
            GameRegistry.addSmelting(ore, new ItemStack(ingot), 0.7F);
        }
    }
}
