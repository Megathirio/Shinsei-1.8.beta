package com.megathirio.shinsei.blocks;

import com.megathirio.shinsei.items.ShinseiItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ShinseiBlocks {

    public static Block aluminumBlock;
    public static Block silverBlock;
    public static Block siding;
    public static Block bricks;

    public static Block woodCrateCache;

    //Metals
    public static Block antimonyBlock;
    public static Block bariumBlock;
    public static Block bismuthBlock;
    public static Block brassBlock;
    public static Block bronzeBlock;
    public static Block chromiumBlock;
    public static Block cobaltBlock;
    public static Block copperBlock;
    public static Block leadBlock;
    public static Block magnesiumBlock;
    public static Block manganeseBlock;
    public static Block molybdenumBlock;
    public static Block nickelBlock;
    public static Block platinumBlock;
    public static Block stainlessSteelBlock;
    public static Block steelBlock;
    public static Block tantalumBlock;
    public static Block tinBlock;
    public static Block titaniumBlock;
    public static Block tungstenBlock;
    public static Block vanadiumBlock;
    public static Block zincBlock;

    //Gems/Crystals
    public static Block amethystBlock;
    public static Block apatiteBlock;
    public static Block aquamarineBlock;
    public static Block fluoriteBlock;
    public static Block jadeBlock;
    public static Block opalBlock;
    public static Block onyxBlock;
    public static Block peridotBlock;
    public static Block rubyBlock;
    public static Block sapphireBlock;
    public static Block scarletEmeraldBlock;
    public static Block topazBlock;
    public static Block turquoiseBlock;

    //Minerals
    public static Block chalkBlock;
    public static Block basaltBlock;
    public static Block basaltCobble;
    public static Block boraxBlock;
    public static Block limestoneBlock;
    public static Block siltstoneBlock;
    public static Block gypsumBlock;
    public static Block haliteBlock;

    public static void createBlocks(){
        GameRegistry.registerBlock(aluminumBlock = new BaseBlock("aluminum_block"), "aluminum_block");
        GameRegistry.registerBlock(antimonyBlock = new BaseBlock("antimony_block"), "antimony_block");
        GameRegistry.registerBlock(bariumBlock = new BaseBlock("barium_block"), "barium_block");
        GameRegistry.registerBlock(bismuthBlock = new BaseBlock("bismuth_block"), "bismuth_block");
        GameRegistry.registerBlock(brassBlock = new BaseBlock("brass_block"), "brass_block");
        GameRegistry.registerBlock(bronzeBlock = new BaseBlock("bronze_block"), "bronze_block");
        GameRegistry.registerBlock(chromiumBlock = new BaseBlock("chromium_block"), "chromium_block");
        GameRegistry.registerBlock(cobaltBlock = new BaseBlock("cobalt_block"), "cobalt_block");
        GameRegistry.registerBlock(copperBlock = new BaseBlock("copper_block"), "copper_block");
        GameRegistry.registerBlock(leadBlock = new BaseBlock("lead_block"), "lead_block");
        GameRegistry.registerBlock(magnesiumBlock = new BaseBlock("magnesium_block"), "magnesium_block");
        GameRegistry.registerBlock(manganeseBlock = new BaseBlock("manganese_block"), "manganese_block");
        GameRegistry.registerBlock(molybdenumBlock = new BaseBlock("molybdenum_block"), "molybdenum_block");
        GameRegistry.registerBlock(nickelBlock = new BaseBlock("nickel_block"), "nickel_block");
        GameRegistry.registerBlock(platinumBlock = new BaseBlock("platinum_block"), "platinum_block");
        GameRegistry.registerBlock(silverBlock = new BaseBlock("silver_block"), "silver_block");
        GameRegistry.registerBlock(stainlessSteelBlock = new BaseBlock("stainless_steel_block"), "stainless_steel_block");
        GameRegistry.registerBlock(steelBlock = new BaseBlock("steel_block"), "steel_block");
        GameRegistry.registerBlock(tantalumBlock = new BaseBlock("tantalum_block"), "tantalum_block");
        GameRegistry.registerBlock(tinBlock = new BaseBlock("tin_block"), "tin_block");
        GameRegistry.registerBlock(titaniumBlock = new BaseBlock("titanium_block"), "titanium_block");
        GameRegistry.registerBlock(tungstenBlock = new BaseBlock("tungsten_block"), "tungsten_block");
        GameRegistry.registerBlock(vanadiumBlock = new BaseBlock("vanadium_block"), "vanadium_block");
        GameRegistry.registerBlock(zincBlock = new BaseBlock("zinc_block"), "zinc_block");
        GameRegistry.registerBlock(amethystBlock = new BaseBlock("amethyst_block"), "amethyst_block");
        GameRegistry.registerBlock(apatiteBlock = new BaseBlock("apatite_block"), "apatite_block");
        GameRegistry.registerBlock(aquamarineBlock = new BaseBlock("aquamarine_block"), "aquamarine_block");
        GameRegistry.registerBlock(fluoriteBlock = new BaseBlock("fluorite_block"), "fluorite_block");
        GameRegistry.registerBlock(jadeBlock = new BaseBlock("jade_block"), "jade_block");
        GameRegistry.registerBlock(opalBlock = new BaseBlock("opal_block"), "opal_block");
        GameRegistry.registerBlock(onyxBlock = new BaseBlock("onyx_block"), "onyx_block");
        GameRegistry.registerBlock(peridotBlock = new BaseBlock("peridot_block"), "peridot_block");
        GameRegistry.registerBlock(rubyBlock = new BaseBlock("ruby_block"), "ruby_block");
        GameRegistry.registerBlock(sapphireBlock = new BaseBlock("sapphire_block"), "sapphire_block");
        GameRegistry.registerBlock(scarletEmeraldBlock = new BaseBlock("scarlet_emerald_block"), "scarlet_emerald_block");
        GameRegistry.registerBlock(topazBlock = new BaseBlock("topaz_block"), "topaz_block");
        GameRegistry.registerBlock(turquoiseBlock = new BaseBlock("turquoise_block"), "turquoise_block");
        GameRegistry.registerBlock(chalkBlock = new BaseBlock("chalk_block"), "chalk_block");
        GameRegistry.registerBlock(basaltBlock = new BaseBlock("basalt_block"), "basalt_block");
        GameRegistry.registerBlock(basaltCobble = new BaseBlock("basalt_cobble"), "basalt_cobble");
        GameRegistry.registerBlock(boraxBlock = new BaseBlock("borax_block"), "borax_block");
        GameRegistry.registerBlock(limestoneBlock = new BaseBlock("limestone_block"), "limestone_block");
        GameRegistry.registerBlock(siltstoneBlock = new BaseBlock("siltstone_block"), "siltstone_block");
        GameRegistry.registerBlock(gypsumBlock = new BaseBlock("gypsum_block"), "gypsum_block");
        GameRegistry.registerBlock(haliteBlock = new BaseBlock("halite_block"), "halite_block");
        GameRegistry.registerBlock(woodCrateCache = new BaseBlock("wood_crate_cache"), "wood_crate_cache");

        GameRegistry.registerBlock(siding = new BlockProperties("siding", Material.wood, 4, 15), ItemBlockMeta.class, "siding");
        GameRegistry.registerBlock(bricks = new BrickProperties("bricks", Material.rock, 4.0f, 6.5f), ItemBlockMeta.class, "bricks");
    }
}
