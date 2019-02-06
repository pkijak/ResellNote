package com.resellnote;

public class Accessories extends Item {

    public Accessories(String name, int price, int condition) {
        this.name = name;
        this.price = price;
        this.condition = condition;
//        this.id = nextId.getAndIncrement();
    }
}
