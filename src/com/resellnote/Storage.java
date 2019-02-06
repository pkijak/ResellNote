package com.resellnote;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Storage {

    private int maxCapacity;

    public Storage(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    Scanner in = new Scanner(System.in);
    private Map<Integer, Item> items = new TreeMap<>();


    public void availableItems() {
        System.out.println("Available items:");
        for (Map.Entry<Integer, Item> entry : items.entrySet()) {
            if (!entry.getValue().sold) {
                System.out.println(entry.getKey() + ". " + entry.getValue().getName());
            }
        }
    }


    public void soldItems() {
        System.out.println("Sold items:");
        for (Map.Entry<Integer, Item> entry : items.entrySet()) {
            if (entry.getValue().sold) {
                System.out.println(entry.getKey() + "." + entry.getValue().getName()
                        + " - (" + (entry.getValue().soldPrice - entry.getValue().price + "PLN profit)"));
            }
        }
    }

    public void addItem() {
        if (items.size() >= maxCapacity) {
            System.out.println("You cant add more items, storage full! (" + items.size() + "/" + maxCapacity + ")");
        } else {
            items.put(Item.assignId(), new Shoes("Piraty", 1500, 7, "red", 11));
            items.put(Item.assignId(), new Shoes("Belugi", 1500, 7, "red", 11));
            items.put(Item.assignId(), new Shoes("Zebry", 1500, 7, "red", 11));
            items.put(Item.assignId(), new Shoes("Creamy", 1500, 7, "red", 11));
            items.put(Item.assignId(), new Shoes("Sezame", 1500, 7, "red", 11));
            System.out.println("Item added");
        }
    }


    public void modifyItem() { // tylko nazwe zmienia
        System.out.println("Wybierz przedmiot do edytowania: ");
        int id = in.nextInt();
        System.out.println("Enter new name for " + items.get(id).getName());
        in.nextLine();
        String newName = in.nextLine();
        items.get(id).setName(newName);
    }

    public void soldItem() {
        System.out.println("Choose item to mark as sold: ");
        int id = in.nextInt();
        items.get(id).setSold(true);
        System.out.println("How much did you get for " + items.get(id).getName() + "?: ");
        items.get(id).setSoldPrice(in.nextInt());
        System.out.println("You marked " + items.get(id).getName() + " as sold");
        System.out.println("Your profit is " + (items.get(id).soldPrice - items.get(id).price) + " PLN");

    }

}
