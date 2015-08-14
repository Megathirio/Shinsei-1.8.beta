package com.megathirio.shinsei.client.render.items;

import com.megathirio.shinsei.init.Gems;
import com.megathirio.shinsei.init.Metals;
import com.megathirio.shinsei.init.Minerals;

public class ItemRenderRegister {

/*
    public static HashMap<Block[], Item[]> basicOreMap = new Ores().getBasicOreMap();
    public static Set<Map.Entry<Block[], Item[]>> basicOreSet = basicOreMap.entrySet();
    public static HashMap<Block[], Item[]> advOreMap = new Ores().getAdvOreMap();
    public static Set<Map.Entry<Block[], Item[]>> advOreSet = advOreMap.entrySet();
*/
/*
    public static HashMap<Block, Item> basicMineralMap = new Ores().getBasicMineralMap();
    public static Set<Map.Entry<Block, Item>> basicMineralSet = basicMineralMap.entrySet();
    public static HashMap<Block, Item[]> basicAlloyMap = new ShinseiAlloys().getBasicAlloyMap();
    public static Set<Map.Entry<Block, Item[]>> basicAlloySet = basicAlloyMap.entrySet();
*/

/*
    public static String modid = Reference.MOD_ID;
*/

    public static void registerItemRenderer(){
        Gems.registerItemRenderer();
        Metals.registerItemRenderer();
        Minerals.registerItemRenderer();

/*
        for (Map.Entry<Block, Item> mapEntry : basicMineralSet) {
            Item item = mapEntry.getValue();

            reg(item);
        }
*/

/*
        for (Map.Entry<Block[], Item[]> mapEntry : basicOreSet) {
            Item dust = mapEntry.getValue()[0];
            Item nugget = mapEntry.getValue()[1];
            Item ingot = mapEntry.getValue()[2];

            reg(dust);
            reg(nugget);
            reg(ingot);
        }
*/

/*
        for (Map.Entry<Block[], Item[]> mapEntry : advOreSet) {
            Item dust = mapEntry.getValue()[0];
            Item nugget = mapEntry.getValue()[1];
            Item ingot = mapEntry.getValue()[2];

            reg(dust);
            reg(nugget);
            reg(ingot);
        }
*/

/*
        for (Map.Entry<Block, Item[]> mapEntry : basicAlloySet) {
            Item dust = mapEntry.getValue()[0];
            Item nugget = mapEntry.getValue()[1];
            Item ingot = mapEntry.getValue()[2];

            reg(dust);
            reg(nugget);
            reg(ingot);
        }
*/

/*
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

        reg(ShinseiItems.splitWood);
*/
    }

/*
    public static void reg(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
                .register(item, 0, new ModelResourceLocation(modid + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
*/
}
