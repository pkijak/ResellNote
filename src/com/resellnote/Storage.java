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
            System.out.println(entry.getKey() + ". " + entry.getValue().getName());
        }

    }

    public void addItem() {
        items.put(Item.assignId(), new Shoes("Piraty", 1500, 7, "red", 11));
        items.put(Item.assignId(), new Shoes("Pirat2y", 1500, 7, "red", 11));
        items.put(Item.assignId(), new Shoes("Pirsdasdat2y", 1500, 7, "red", 11));
        items.put(Item.assignId(), new Shoes("Pir123123at2y", 1500, 7, "red", 11));
        items.put(Item.assignId(), new Shoes("Pir213123at2y", 1500, 7, "red", 11));
        System.out.println("item dodany");
    }

    public void modifyItem() {
        System.out.println("Wybierz przedmiot do edytowania: ");
        int id = in.nextInt();
        System.out.println("Enter new name for " + items.get(id).getName());
        in.nextLine();
        String newName = in.nextLine();
        items.get(id).setName(newName);
    }

}
