package com.resellnote;

public class Shoes extends Item{

    private int size;
    private String color;



    public Shoes(String name, int size, int price, int condition) {
        super.name = name;
        this.size = size;
        super.price = price;
        super.condition = condition;
        super.id = nextId.getAndIncrement();
    }
}
