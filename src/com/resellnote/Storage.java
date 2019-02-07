package com.resellnote;

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

    public void sellItem() {
        System.out.println("Choose item to mark as sold: ");
        int id = in.nextInt();
        items.get(id).setSold(true);
        System.out.println("How much did you get for " + items.get(id).getName() + "?: ");
        items.get(id).setSoldPrice(in.nextInt());
        System.out.println("You marked " + items.get(id).getName() + " as sold");
        System.out.println("Your profit is " + (items.get(id).soldPrice - items.get(id).price) + " PLN");

    }

    public void removeItem() {
        System.out.println("Choose item to remove: ");
        int id = in.nextInt();
        System.out.println(items.get(id).getName() + " removed");
        items.remove(id);
    }

    public void bilans() {

        int spendMoney = 0;
        int earnedMoney = 0;
        for (Map.Entry<Integer, Item> entry : items.entrySet()) {
            if (!entry.getValue().sold) {
                spendMoney += entry.getValue().getPrice();
                System.out.println("Price for " + entry.getValue().getName() + " added");
            } else {
                earnedMoney += entry.getValue().getSoldPrice();
                System.out.println("Sold price for " + entry.getValue().getName() + " addded");
            }
        }
        System.out.println("You have already spended: " + spendMoney + " PLN");
        System.out.println("You have already earned: " + earnedMoney + " PLN");
        if (earnedMoney > spendMoney) {
            System.out.println("Wow, you are on +");
        } else {
            System.out.println("Keep trying");
        }
    }
        public void details () {

        }
    }
