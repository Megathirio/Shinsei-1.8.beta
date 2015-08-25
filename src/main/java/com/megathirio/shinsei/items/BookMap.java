package com.megathirio.shinsei.items;

import com.megathirio.shinsei.ref.Names;
import net.minecraft.item.Item;

import java.util.HashMap;

public class BookMap {
    public static HashMap<String, Item> bookMap = new HashMap<String, Item>();

    public static void addBooks() {
        bookMap.put(Names.books.AXE, new BookAxe(Names.books.AXE));
        bookMap.put(Names.books.CHISEL, new BookChisel(Names.books.CHISEL));
        bookMap.put(Names.books.HOE, new BookHoe(Names.books.HOE));
        bookMap.put(Names.books.PICKAXE, new BookPickaxe(Names.books.PICKAXE));
        bookMap.put(Names.books.SHOVEL, new BookShovel(Names.books.SHOVEL));
        bookMap.put(Names.books.SWORD, new BookSword(Names.books.SWORD));
        bookMap.put(Names.books.SHINSEI, new BookShinsei(Names.books.SHINSEI));
    }

    public static HashMap<String, Item> getBookMap() {
        return bookMap;
    }
}
