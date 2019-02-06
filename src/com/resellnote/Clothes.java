package com.resellnote;

public class Clothes extends Item {

    private String color;
    private String size;

    public Clothes(String name, int price, int condition, String color, String size) {

        this.name = name;
        this.price = price;
        this.condition = condition;
        this.color = color;
        this.size = size;
        this.id = nextId.getAndIncrement();
    }
}
