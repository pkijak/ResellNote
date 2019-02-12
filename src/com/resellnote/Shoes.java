package com.resellnote;

public class Shoes extends Item {

    private int size;
    private String color;


    public Shoes(String name, int price, int condition, String color, int size) {
        this.name = name;
        this.price = price;
        this.condition = condition;
        this.color = color;
        this.size = size;
    }
}
