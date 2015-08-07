package com.megathirio.shinsei.crafting;

import com.megathirio.shinsei.utilities.hashmaps.HashMaps;
import com.megathirio.shinsei.utilities.hashmaps.Metals;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MetalRecipes {
    public static HashMap<Block[], Item[]> basicOreMap = new Metals().getBasicOreMap();
    public static Set<Map.Entry<Block[], Item[]>> basicOreSet = basicOreMap.entrySet();
    public static HashMap<Block[], Item[]> advOreMap = new Metals().getAdvOreMap();
    public static Set<Map.Entry<Block[], Item[]>> advOreSet = advOreMap.entrySet();

    public static void initRecipes(){
        for (Map.Entry<Block[], Item[]> mapEntry : basicOreSet) {
            Block ore = mapEntry.getKey()[0];
            Block block = mapEntry.getKey()[1];
            Item dust = mapEntry.getValue()[0];
            Item nugget = mapEntry.getValue()[1];
            Item ingot = mapEntry.getValue()[2];

            GameRegistry.addRecipe(new ItemStack(block), "!!!", "!!!", "!!!", '!', ingot);
            GameRegistry.addRecipe(new ItemStack(ingot), "!!!", "!!!", "!!!", '!', nugget);
            GameRegistry.addShapelessRecipe(new ItemStack(ingot, 9), block);
            GameRegistry.addShapelessRecipe(new ItemStack(nugget, 9), ingot);
            GameRegistry.addSmelting(dust, new ItemStack(ingot), 0.7F);
            GameRegistry.addSmelting(ore, new ItemStack(ingot), 0.7F);
        }
    }
}
