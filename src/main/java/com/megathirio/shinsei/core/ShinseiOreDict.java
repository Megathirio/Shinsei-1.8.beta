package com.megathirio.shinsei.core;

import com.megathirio.shinsei.blocks.ShinseiAlloys;
import com.megathirio.shinsei.init.Gems;
import com.megathirio.shinsei.init.Minerals;

public class ShinseiOreDict {
    public static void blocks(){
        Minerals.oreDictBlocks();
        ShinseiAlloys.oreDictBlocks();
        Gems.oreDictBlocks();
    }

    public static void items(){
        Minerals.oreDictItems();
        ShinseiAlloys.oreDictItems();
        Gems.oreDictItems();
    }
}
