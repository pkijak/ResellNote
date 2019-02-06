package com.resellnote;

import java.util.ArrayList;

public class Storage {

    private int maxCapacity;

    public Storage(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }


    ArrayList<Item> items = new ArrayList<>();


    public void availableItems() {

        System.out.println("Available items: " );
        for (Item i : items) {
            if (!i.sold) {
                System.out.println("[" + i.getId() + "], " + i.getName());
            }
        }
    }

    public void soldItems() {
        System.out.println("Sold items: ");
        for (Item i : items) {
            if (i.sold) {
                System.out.println("[" + i.getId() + "], " + i.getName());
            }
        }
    }


    public void addItem(int type) {
        switch (type) {
            case 0:
                items.add(new Shoes("Piraty", 1500, 7, "red", 11));
                System.out.println("Item added");
                break;
            case 1:
                items.add(new Clothes("Bogo", 1200, 7, "black", "L"));
                System.out.println("Item added");
                break;
            case 2:
                items.add(new Accessories("gucci", 1400, 7));
                System.out.println("Item added");
                break;

        }
    }

    public void makeAsSold(int id) {
        //items.get(id).setSold(true);
        System.out.println(items.get(id).getName() + " sold");
    }

    public void removeItem(int id) {
        System.out.println("you want to remove " + items.get(id).getName());
        items.remove(id);
    }
}
