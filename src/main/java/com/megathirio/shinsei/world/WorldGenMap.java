package com.megathirio.shinsei.world;

import com.megathirio.shinsei.blocks.MetalBlocks;
import com.megathirio.shinsei.ref.Names;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.HashMap;

public class WorldGenMap {

    public static HashMap<WorldGenerator, Integer[]> worldGenMap = new HashMap<WorldGenerator, Integer[]>();

    public static void addWorldGen() {
        worldGenMap.put(new WorldGenMinable(MetalBlocks.getBlock(Names.ores.ACANTHITE).getDefaultState(), 7), new Integer[]{20, 0, 256});
        worldGenMap.put(new WorldGenMinable(MetalBlocks.getBlock(Names.ores.BARITE).getDefaultState(), 7), new Integer[]{20, 0, 65});
        worldGenMap.put(new WorldGenMinable(MetalBlocks.getBlock(Names.ores.BAUXITE).getDefaultState(), 9), new Integer[]{25, 40, 75});
        worldGenMap.put(new WorldGenMinable(MetalBlocks.getBlock(Names.ores.BISMUTH).getDefaultState(), 7), new Integer[]{20, 0, 128});
        worldGenMap.put(new WorldGenMinable(MetalBlocks.getBlock(Names.ores.BORNITE).getDefaultState(), 7), new Integer[]{35, 0, 256});
        worldGenMap.put(new WorldGenMinable(MetalBlocks.getBlock(Names.ores.CASSITERITE).getDefaultState(), 7), new Integer[]{25, 0, 256});
        worldGenMap.put(new WorldGenMinable(MetalBlocks.getBlock(Names.ores.CHALCOPYRITE).getDefaultState(), 7), new Integer[]{40, 0, 256});
        worldGenMap.put(new WorldGenMinable(MetalBlocks.getBlock(Names.ores.CHROMITE).getDefaultState(), 7), new Integer[]{20, 0, 256});
        worldGenMap.put(new WorldGenMinable(MetalBlocks.getBlock(Names.ores.CINNABAR).getDefaultState(), 7), new Integer[]{15, 0, 256});
        worldGenMap.put(new WorldGenMinable(MetalBlocks.getBlock(Names.ores.COBALTITE).getDefaultState(), 4), new Integer[]{10, 0, 64});
        worldGenMap.put(new WorldGenMinable(MetalBlocks.getBlock(Names.ores.CRYOLITE).getDefaultState(), 7), new Integer[]{20, 0, 64});
        worldGenMap.put(new WorldGenMinable(MetalBlocks.getBlock(Names.ores.GALENA).getDefaultState(), 9), new Integer[]{25, 0, 256});
        worldGenMap.put(new WorldGenMinable(MetalBlocks.getBlock(Names.ores.HEMATITE).getDefaultState(), 9), new Integer[]{30, 0, 256});
        worldGenMap.put(new WorldGenMinable(MetalBlocks.getBlock(Names.ores.ILMENITE).getDefaultState(), 6), new Integer[]{20, 0, 64});
        worldGenMap.put(new WorldGenMinable(MetalBlocks.getBlock(Names.ores.MOLYBDENITE).getDefaultState(), 7), new Integer[]{40, 0, 256});
        worldGenMap.put(new WorldGenMinable(MetalBlocks.getBlock(Names.ores.PENTLANDITE).getDefaultState(), 8), new Integer[]{25, 0, 35});
        worldGenMap.put(new WorldGenMinable(MetalBlocks.getBlock(Names.ores.PYROLUSITE).getDefaultState(), 9), new Integer[]{20, 0, 128});
        worldGenMap.put(new WorldGenMinable(MetalBlocks.getBlock(Names.ores.REALGAR).getDefaultState(), 8), new Integer[]{25, 0, 64});
        worldGenMap.put(new WorldGenMinable(MetalBlocks.getBlock(Names.ores.RUTILE).getDefaultState(), 6), new Integer[]{20, 0, 64});
        worldGenMap.put(new WorldGenMinable(MetalBlocks.getBlock(Names.ores.SCHEELITE).getDefaultState(), 6), new Integer[]{15, 0, 35});
        worldGenMap.put(new WorldGenMinable(MetalBlocks.getBlock(Names.ores.SPERRYLITE).getDefaultState(), 4), new Integer[]{15, 0, 35});
        worldGenMap.put(new WorldGenMinable(MetalBlocks.getBlock(Names.ores.SPHALERITE).getDefaultState(), 9), new Integer[]{25, 0, 128});
        worldGenMap.put(new WorldGenMinable(MetalBlocks.getBlock(Names.ores.STIBNITE).getDefaultState(), 5), new Integer[]{25, 0, 128});
        worldGenMap.put(new WorldGenMinable(MetalBlocks.getBlock(Names.ores.SYLVITE).getDefaultState(), 8), new Integer[]{20, 0, 128});
        worldGenMap.put(new WorldGenMinable(MetalBlocks.getBlock(Names.ores.TANTALITE).getDefaultState(), 5), new Integer[]{20, 0, 64});
        worldGenMap.put(new WorldGenMinable(MetalBlocks.getBlock(Names.ores.URANINITE).getDefaultState(), 6), new Integer[]{10, 0, 45});
    }

    public static HashMap<WorldGenerator, Integer[]> getWorldGenMap() {
        return worldGenMap;
    }
}