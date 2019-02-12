package com.resellnote;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Storage {

    public Storage() {
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

        System.out.println("What do you want to add? [Shoes] | [Clothes] | [Accessories] ");
        String option = in.nextLine();

        switch (option.toLowerCase()) {
            case "clothes":
                System.out.println("Enter Name / Color / Size, split by ' - ' ");
                String clothesString = in.nextLine();
                String[] clothesArray = clothesString.split("-");

                if (clothesArray.length == 3) {
                    System.out.println("Name: " + clothesArray[0]);
                    System.out.println("Color: " + clothesArray[1]);
                    System.out.println("Size: " + clothesArray[2]);

                    System.out.println("\n Enter price: ");
                    int price = in.nextInt();

                    System.out.println("Enter condition: ");
                    int condition = in.nextInt();

                    items.put(Item.assignId(), new Clothes(clothesArray[0], price, condition, clothesArray[2], clothesArray[2]));

                    System.out.println(clothesArray[0] + " added to list");
                    in.nextLine();
                    break;
                } else {
                    System.out.println("Wrong number of parameters");
                    break;
                }
            case "shoes":
                System.out.println("Enter Name / Color, split by ' - ' ");
                String shoesString = in.nextLine();
                String[] shoesArray = shoesString.split("-");

                if (shoesArray.length == 2) {
                    System.out.println("Name: " + shoesArray[0]);
                    System.out.println("Color: " + shoesArray[1]);

                    System.out.println("\n Enter price: ");
                    int price = in.nextInt();

                    System.out.println("Enter condition: ");
                    int condition = in.nextInt();

                    System.out.println("Enter size: ");
                    int size = in.nextInt();

                    items.put(Item.assignId(), new Shoes(shoesArray[0], price, condition, shoesArray[1], size));
                    System.out.println(shoesArray[0] + " added to list");
                    in.nextLine();
                    break;
                } else {
                    System.out.println("Wrong number of parameters");
                }
            case "accessories":
                System.out.println("Enter name: ");
                String name = in.nextLine();

                System.out.println("Enter price: ");
                int price = in.nextInt();

                System.out.println("Enter condition: ");
                int condition = in.nextInt();

                System.out.println("Enter size: ");
                int size = in.nextInt();

                items.put(Item.assignId(), new Accessories(name, price, condition, size));
                System.out.println(name + " added to list");

                in.nextLine();
                break;
        }
    }

    public void modifyItem() { // work in progress

        if (items.isEmpty()) {
            System.out.println("Items not found");
        } else {
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
    }

    public void sellItem() {

        if (items.isEmpty()) {
            System.out.println("Items not found");
        } else {
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
    }

    public void removeItem() {

        if (items.isEmpty()) {
            System.out.println("Items not found");
        } else {
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
