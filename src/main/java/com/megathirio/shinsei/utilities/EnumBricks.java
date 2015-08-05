package com.megathirio.shinsei.utilities;

import net.minecraft.util.IStringSerializable;

public enum EnumBricks implements IStringSerializable{
    GRAY(0, "gray"),
    TAN(1, "tan"),
    VARI(2, "vari"),
    BASALT(3, "basalt"),
    GRAPHITE(4, "graphite");

    private int ID;
    private String name;

    private EnumBricks(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public int getID() {
        return this.ID;
    }

    @Override
    public String toString(){
        return this.getName();
    }
}
