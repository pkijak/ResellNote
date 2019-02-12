package com.resellnote;

public class Accessories extends Item {

    private int size;

    public Accessories(String name, int price, int condition, int size) {
        this.name = name;
        this.price = price;
        this.condition = condition;
        this.size = size;
    }
}
