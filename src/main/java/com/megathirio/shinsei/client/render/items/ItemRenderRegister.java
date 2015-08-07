package com.megathirio.shinsei.client.render.items;

import com.megathirio.shinsei.items.ShinseiFoods;
import com.megathirio.shinsei.items.ShinseiItems;
import com.megathirio.shinsei.items.ShinseiTools;
import com.megathirio.shinsei.utilities.hashmaps.HashMaps;
import com.megathirio.shinsei.utilities.Reference;
import com.megathirio.shinsei.utilities.hashmaps.Metals;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ItemRenderRegister {

    public static HashMap<Block[], Item[]> basicOreMap = new Metals().getBasicOreMap();
    public static Set<Map.Entry<Block[], Item[]>> basicOreSet = basicOreMap.entrySet();
    public static HashMap<Block[], Item[]> advOreMap = new Metals().getAdvOreMap();
    public static Set<Map.Entry<Block[], Item[]>> advOreSet = advOreMap.entrySet();

    public static String modid = Reference.MOD_ID;

    public static void registerItemRenderer(){
        for (Map.Entry<Block[], Item[]> mapEntry : basicOreSet) {
            Item dust = mapEntry.getValue()[0];
            Item nugget = mapEntry.getValue()[1];
            Item ingot = mapEntry.getValue()[2];

            reg(dust);
            reg(nugget);
            reg(ingot);
        }

        for (Map.Entry<Block[], Item[]> mapEntry : advOreSet) {
            Item dust = mapEntry.getValue()[0];
            Item nugget = mapEntry.getValue()[1];
            Item ingot = mapEntry.getValue()[2];

            reg(dust);
            reg(nugget);
            reg(ingot);
        }

        reg(ShinseiItems.amethystDust);
        reg(ShinseiItems.amethystDustCharged);
        reg(ShinseiItems.amethystDustInfused);
        reg(ShinseiItems.amethystGem);

        reg(ShinseiItems.bookShinsei);
        reg(ShinseiTools.bookAxe);
        reg(ShinseiTools.bookHoe);
        reg(ShinseiTools.bookPickaxe);
        reg(ShinseiTools.bookShovel);
        reg(ShinseiTools.bookSword);
        reg(ShinseiTools.boneAxe);
        reg(ShinseiTools.flintAxe);
        reg(ShinseiTools.silverAxe);
        reg(ShinseiTools.silverHoe);
        reg(ShinseiTools.silverPickaxe);
        reg(ShinseiTools.silverShovel);
        reg(ShinseiTools.silverSword);

        reg(ShinseiTools.ironHammer);

        reg(ShinseiTools.silverAxeBlade);
        reg(ShinseiTools.silverHoeBlade);
        reg(ShinseiTools.silverPickaxeBlade);
        reg(ShinseiTools.silverShovelBlade);
        reg(ShinseiTools.silverSwordBlade);

        reg(ShinseiTools.woodToolHandle);

        reg(ShinseiFoods.poisonApple);
        reg(ShinseiFoods.curedBeef);
        reg(ShinseiFoods.curedPork);

        reg(ShinseiFoods.salt);

        reg(ShinseiItems.splitWood);
    }

    public static void reg(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
                .register(item, 0, new ModelResourceLocation(modid + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
