package com.resellnote;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class Item {

    protected boolean sold = false;
    protected String name;
    protected int price;
    protected int soldPrice;
    protected int condition;
    public int id;

    static AtomicInteger nextId = new AtomicInteger();

    public boolean isSold() {
        return sold;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getSoldPrice() {
        return soldPrice;
    }

    public int getCondition() {
        return condition;
    }

    public int getId() {
        return id;
    }

    public void setSold(boolean sold) {
        this.sold = sold;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setSoldPrice(int soldPrice) {
        this.soldPrice = soldPrice;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public void setId(int id) {
        this.id = id;
    }
}
