package com.megathirio.shinsei.items;

import com.megathirio.shinsei.utilities.Names;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ShinseiFoods {

    public static Item poisonApple;
    public static Item curedBeef;
    public static Item curedPork;

    public static Item salt;

    public static void createItems(){
        GameRegistry.registerItem(poisonApple = new BaseFood("apple", 4, 0.3f, false)
                .addPotionEffect(new PotionEffect(Potion.poison.id, 1200, 1))
                .setAlwaysEdible(), "apple");

        GameRegistry.registerItem(curedBeef = new BaseFood("cured_beef", 2, 0.8f, true)
                .setAlwaysEdible(), "cured_beef");
        GameRegistry.registerItem(curedPork = new BaseFood("cured_pork", 2, 0.8f, true)
                .setAlwaysEdible(), "cured_pork");

        GameRegistry.registerItem(salt = new BaseItem("salt"), "salt");
    }
}
