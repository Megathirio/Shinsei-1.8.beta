package com.megathirio.shinsei.crafting;

import com.megathirio.shinsei.init.Gems;
import com.megathirio.shinsei.init.Metals;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.HashMap;
import java.util.Map;

public class GemRecipes {
    public static HashMap<Block[], Item[]> gemMap = new Gems().getGemMap();

    public static void initRecipes(){
        for (Map.Entry<Block[], Item[]> gemEntry : gemMap.entrySet()) {
            Block ore = gemEntry.getKey()[0];
            Block block = gemEntry.getKey()[1];
            Block lamp = gemEntry.getKey()[2];
            Block stone = gemEntry.getKey()[3];
            Item dust = gemEntry.getValue()[0];
            Item dust_charged = gemEntry.getValue()[1];
            Item dust_infused = gemEntry.getValue()[2];
            Item gem = gemEntry.getValue()[3];

            GameRegistry.addRecipe(new ItemStack(block), "!!!", "!!!", "!!!", '!', gem);
            GameRegistry.addRecipe(new ItemStack(lamp), "!@!", "@#@", "!@!", '!', Metals.getItem("lead_ingot"), '@', Blocks.glass_pane, '#', dust_charged);
            GameRegistry.addRecipe(new ItemStack(stone), "!@!", "@#@", "!@!", '!', Metals.getItem("titanium_ingot"), '@', Blocks.glass_pane, '#', dust_infused);
            GameRegistry.addShapelessRecipe(new ItemStack(gem, 9), block);
            GameRegistry.addShapelessRecipe(new ItemStack(dust_charged, 1), dust, Items.redstone);
            GameRegistry.addShapelessRecipe(new ItemStack(dust_infused, 1), dust, Items.glowstone_dust);
            GameRegistry.addSmelting(dust, new ItemStack(gem), 0.7F);
        }
    }
}
