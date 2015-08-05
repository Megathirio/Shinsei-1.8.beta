package com.megathirio.shinsei.client.render.items;

import com.megathirio.shinsei.items.ShinseiFoods;
import com.megathirio.shinsei.items.ShinseiItems;
import com.megathirio.shinsei.items.ShinseiTools;
import com.megathirio.shinsei.utilities.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ItemRenderRegister {

    public static String modid = Reference.MOD_ID;

    public static void registerItemRenderer(){
        reg(ShinseiItems.aluminumDust);
        reg(ShinseiItems.aluminumNugget);
        reg(ShinseiItems.aluminumIngot);
        reg(ShinseiItems.silverDust);
        reg(ShinseiItems.silverNugget);
        reg(ShinseiItems.silverIngot);

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
