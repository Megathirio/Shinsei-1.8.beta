package com.megathirio.shinsei.items;

import com.megathirio.shinsei.blocks.GemMap;
import com.megathirio.shinsei.blocks.MetalMap;
import com.megathirio.shinsei.ref.Ref;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.HashMap;
import java.util.Map;

public class MetalItems {

    public static HashMap<String, Item> metalItemMap = new MetalMap().getMetalItemMap();

    public static void createMetalItems(){
        MetalMap.addMetalItems();
        for(Map.Entry<String, Item> mapEntry : metalItemMap.entrySet()) {
            GameRegistry.registerItem(mapEntry.getValue(), mapEntry.getKey());
        }
    }

    public static void registerItemRenderer(){
        for (Map.Entry<String, Item> mapEntry : metalItemMap.entrySet()) {
            String unlocalizedName = mapEntry.getKey();
            Item item = mapEntry.getValue();

            Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
                    .register(item, 0, new ModelResourceLocation(Ref.RESOURCE_PREFIX + unlocalizedName, "inventory"));
        }
    }

    public static Item getItem(String itemName){
        return metalItemMap.get(itemName);
    }
}
