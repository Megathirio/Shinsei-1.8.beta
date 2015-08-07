package com.megathirio.shinsei.world;

import com.megathirio.shinsei.blocks.ShinseiOres;
import net.minecraft.block.state.pattern.BlockHelper;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class ShinseiWorldGen implements IWorldGenerator{

    private WorldGenerator gen_halite_ovr; //Generates Halite Ore in Overworld
    private WorldGenerator gen_halite_net; //Generates Halite Ore in Nether
    private WorldGenerator gen_meteorite_ovr; //Generates Meteorites in Overworld
    private WorldGenerator gen_granite_ovr; //Generates Granite in Overworld
    private WorldGenerator gen_marble_ovr; //Generates Marble in Overworld

    public ShinseiWorldGen(){
        this.gen_halite_ovr = new WorldGenMinable(ShinseiOres.getBlock("halite_ore").getDefaultState(), 10);
        this.gen_halite_net = new WorldGenMinable(ShinseiOres.getBlock("halite_ore").getDefaultState(), 6, BlockHelper.forBlock(Blocks.netherrack));
        this.gen_granite_ovr = new WorldGenMinable(ShinseiOres.granite.getDefaultState(), 18);
        this.gen_marble_ovr = new WorldGenMinable(ShinseiOres.marble.getDefaultState(), 18);
        this.gen_meteorite_ovr = new WorldGenMinable(ShinseiOres.getBlock("meteorite").getDefaultState(), 6, BlockHelper.forBlock(Blocks.grass));
    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider){
        switch (world.provider.getDimensionId()){
            case 0: //Overworld
                this.runGenerator(this.gen_halite_ovr, world, random, chunkX, chunkZ, 15, 25, 75);
                this.runGenerator(this.gen_granite_ovr, world, random, chunkX, chunkZ, 25, 0, 256);
                this.runGenerator(this.gen_marble_ovr, world, random, chunkX, chunkZ, 25, 0, 256);
                this.runGenerator(this.gen_meteorite_ovr, world, random, chunkX, chunkZ, 15, 0, 256);
                break;
            case -1: //Nether
                this.runGenerator(this.gen_halite_net, world, random, chunkX, chunkZ, 15, 0, 256);
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
