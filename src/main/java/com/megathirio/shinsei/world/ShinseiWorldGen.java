package com.megathirio.shinsei.world;

import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ShinseiWorldGen implements IWorldGenerator{

    public static HashMap<WorldGenerator, Integer[]> worldGenMap = new WorldGenMap().getWorldGenMap();

    public ShinseiWorldGen(){
    WorldGenMap.addWorldGen();
    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider){
        switch (world.provider.getDimensionId()){
            case 0: //Overworld
                for (Map.Entry<WorldGenerator, Integer[]> mapEntry : worldGenMap.entrySet()){
                    WorldGenerator worldGen = mapEntry.getKey();
                    int chance = mapEntry.getValue()[0];
                    int min = mapEntry.getValue()[1];
                    int max = mapEntry.getValue()[2];

                    this.runGenerator(worldGen, world, random, chunkX, chunkZ, chance, min, max);
                }
                break;
            case -1: //Nether
//                this.runGenerator(this.gen_acanthite_net, world, random, chunkX, chunkZ, 15, 0, 256);
                break;
            case 1: //End

                break;
        }
    }
    private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {
        if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
            throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

        int heightDiff = maxHeight - minHeight + 1;
        for (int i = 0; i < chancesToSpawn; i ++) {
            int x = chunk_X * 16 + rand.nextInt(16);
            int y = minHeight + rand.nextInt(heightDiff);
            int z = chunk_Z * 16 + rand.nextInt(16);
            generator.generate(world, rand, new BlockPos(x, y, z));
        }
    }
}