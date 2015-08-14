package com.megathirio.shinsei.crafting;

import com.megathirio.shinsei.blocks.ShinseiAlloys;
import com.megathirio.shinsei.init.Metals;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MetalRecipes {
    public static HashMap<Block[], Item[]> metalMap = new Metals().getMetalMap();
    public static HashMap<Block[], Item[]> advMetalMap = new Metals().getAdvMetalMap();

    public static void initRecipes(){
        for (Map.Entry<Block[], Item[]> metalEntry : metalMap.entrySet()) {
            Block ore = metalEntry.getKey()[0];
            Block block = metalEntry.getKey()[1];
            Item dust = metalEntry.getValue()[0];
            Item nugget = metalEntry.getValue()[1];
            Item ingot = metalEntry.getValue()[2];

            GameRegistry.addRecipe(new ItemStack(block), "!!!", "!!!", "!!!", '!', ingot);
            GameRegistry.addRecipe(new ItemStack(ingot), "!!!", "!!!", "!!!", '!', nugget);
            GameRegistry.addShapelessRecipe(new ItemStack(ingot, 9), block);
            GameRegistry.addShapelessRecipe(new ItemStack(nugget, 9), ingot);
            GameRegistry.addSmelting(dust, new ItemStack(ingot), 0.7F);
            GameRegistry.addSmelting(ore, new ItemStack(ingot), 0.7F);
        }

        for (Map.Entry<Block[], Item[]> advMetalEntry : advMetalMap.entrySet()) {
            Block ore = advMetalEntry.getKey()[0];
            Block block = advMetalEntry.getKey()[1];
            Item dust = advMetalEntry.getValue()[0];
            Item nugget = advMetalEntry.getValue()[1];
            Item ingot = advMetalEntry.getValue()[2];

            GameRegistry.addRecipe(new ItemStack(block), "!!!", "!!!", "!!!", '!', ingot);
            GameRegistry.addRecipe(new ItemStack(ingot), "!!!", "!!!", "!!!", '!', nugget);
            GameRegistry.addShapelessRecipe(new ItemStack(ingot, 9), block);
            GameRegistry.addShapelessRecipe(new ItemStack(nugget, 9), ingot);
            GameRegistry.addSmelting(dust, new ItemStack(ingot), 0.7F);
        }
    }
}
