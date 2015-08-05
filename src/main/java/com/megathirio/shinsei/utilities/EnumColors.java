package com.megathirio.shinsei.utilities;

import net.minecraft.util.IStringSerializable;

public enum EnumColors implements IStringSerializable{
    WHITE(0, "white"),
    ORANGE(1, "orange"),
    MAGENTA(2, "magenta"),
    LTBLUE(3, "ltblue"),
    YELLOW(4, "yellow"),
    LIME(5, "lime"),
    PINK(6, "pink"),
    GRAY(7, "gray"),
    SILVER(8, "silver"),
    CYAN(9, "cyan"),
    PURPLE(10, "purple"),
    BLUE(11, "blue"),
    BROWN(12, "brown"),
    GREEN(13, "green"),
    RED(14, "red"),
    BLACK(15, "black");

    private int ID;
    private String name;

    private EnumColors(int ID, String name) {
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
