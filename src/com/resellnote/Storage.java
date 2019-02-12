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
        /*
        if (items.size() >= maxCapacity) {
            System.out.println("You cant add more items, storage full! (" + items.size() + "/" + maxCapacity + ")");
        } else {
            items.put(Item.assignId(), new Shoes("Piraty", 1500, 7, "red", 11));
            items.put(Item.assignId(), new Shoes("Belugi", 1500, 7, "red", 11));
            items.put(Item.assignId(), new Shoes("Zebry", 1500, 7, "red", 11));
            items.put(Item.assignId(), new Shoes("Creamy", 1500, 7, "red", 11));
            items.put(Item.assignId(), new Shoes("Sezame", 1500, 7, "red", 11));
            System.out.println("Item added");
        } */
        System.out.println("What do you want to add? [Shoes] | [Clothes] | [Accessories] ");
        String option = in.nextLine();

        switch (option.toLowerCase()) {
            case "clothes":
                System.out.println("adding clothes");
                break;
            case "shoes":
                System.out.println("Addin shoes");
                break;
            case "accessories":
                System.out.println("adding accessories");
                break;
        }
    }


    public void modifyItem() { // work in progress
        printInLine();
        System.out.println("\nPick item to modify: ");
        int id = in.nextInt();

        if (items.containsKey(id)) {
            System.out.println("Enter new name for " + items.get(id).getName());
            in.nextLine();
            String newName = in.nextLine();
            items.get(id).setName(newName);
        } else {
            System.out.println("Item not found");
        }
    }

    public void sellItem() {
        printInLine();
        System.out.println("\nChoose item to mark as sold: ");
        int id = in.nextInt();

        if (items.containsKey(id)) {
            items.get(id).setSold(true);
            System.out.println("How much did you get for " + items.get(id).getName() + "?: ");
            items.get(id).setSoldPrice(in.nextInt());
            System.out.println("You marked " + items.get(id).getName() + " as sold");
            System.out.println("Your profit is " + (items.get(id).soldPrice - items.get(id).price) + " PLN");
        } else {
            System.out.println("Item not found");
        }
    }

    public void removeItem() {
        printInLine();
        System.out.println("\nChoose item to remove: ");
        int id = in.nextInt();

        if (items.containsKey(id)) {
            System.out.println(items.get(id).getName() + " removed");
            items.remove(id);
        } else {
            System.out.println("Item not found");
        }
    }


    public void bilans() {

        int spendMoney = 0;
        int earnedMoney = 0;
        int profit = 0;

        for (Map.Entry<Integer, Item> entry : items.entrySet()) {
            if (!entry.getValue().sold) {
                spendMoney += entry.getValue().getPrice();
            } else {
                earnedMoney += entry.getValue().getSoldPrice();
                profit += (entry.getValue().getSoldPrice() - entry.getValue().getPrice());
            }
        }
        System.out.println("You have already spended: " + spendMoney + " PLN");
        System.out.println("You sold items for: " + earnedMoney + " PLN");
        System.out.println("Current profit:  " + profit + " PLN");

        if (earnedMoney > spendMoney) {
            System.out.println("Wow, you are on +");
        } else {
            System.out.println("Keep trying");
        }
    }

    public void details() {

        printInLine();
        System.out.print("\nPick item: ");
        int pickItem = in.nextInt();

        if (items.containsKey(pickItem)) {
            System.out.println("\n|  Details |");
            System.out.println("Name: " + items.get(pickItem).getName() +
                    "\nPrice: " + items.get(pickItem).getPrice() +
                    "\nCondition: " + items.get(pickItem).getCondition() + "/10" +
                    "\nColor: ");
        } else {
            System.out.println("Item not found");
        }
    }

    private void printInLine() {
        for (Map.Entry<Integer, Item> entry : items.entrySet()) {
            if (!entry.getValue().isSold()) {
                System.out.print(" - " + entry.getKey() + "." + entry.getValue().getName());
            }
        }
    }
}
