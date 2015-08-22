package com.megathirio.shinsei.blocks;

import com.megathirio.shinsei.ref.Ref;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.HashMap;
import java.util.Map;

public class GemBlocks {

    public static HashMap<BaseGem, String> gemMap = new GemMap().getGemMap();

    public static void createGemBlocks(){
        GemMap.addGems();
        for(Map.Entry<BaseGem, String> mapEntry : gemMap.entrySet()) {
            GameRegistry.registerBlock(mapEntry.getKey(), mapEntry.getValue());
        }
    }

    public static void registerBlockRenderer(){
        for (Map.Entry<BaseGem, String> mapEntry : gemMap.entrySet()) {
            String unlocalizedName = mapEntry.getValue();
            Block block = mapEntry.getKey();

            Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
                    .register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(Ref.RESOURCE_PREFIX + unlocalizedName, "inventory"));
        }
    }

    public static Block getBlock(String blockName){
        BaseGem key = null;
        String value = blockName;

        for (Map.Entry<BaseGem, String> mapEntry : gemMap.entrySet()) {
            if(value.equals(mapEntry.getValue())){
                key = mapEntry.getKey();
                break;
            }
        }
        return key;
    }
}