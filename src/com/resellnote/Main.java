package com.resellnote;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner in = new Scanner(System.in);
    private static String commands = "[-1]QUIT, [0]Polecenia, [1]Dostepne przedmioty, [2]Sprzedane przedmioty, [3]Dodaj przedmiot, [4]Usun przedmiot,"
            + " [5]Edytuj przedmiot, [6]Sprzedaj. [7] Bilans";

    public static void main(String[] args) {


        ArrayList<Item> items = new ArrayList<>();

        items.add(new Shoes("Piraty", 1500, 6, "red", 11));
        items.add(new Clothes("Bogo", 1500, 7, "black", "L"));
        items.add(new Accessories("Gucci belt", 600, 4));

        for (Item i : items) {
            System.out.println(i.getName());
        }


 /*
        System.out.println("|   RESELL NOTE    |");
        System.out.println(commands);

        boolean flag = true;
        while (flag) {
            System.out.println("Wprowadz polecenie: ");


            int answer = in.nextInt();
            switch (answer) {

                default:
                    System.out.println("Polecenie nieprawidlowe");
                    break;

                case -1:
                    System.out.println("QUIT");
                    flag = false;
                    break;

                case 0:
                    System.out.println(commands);
                    break;
                case 1:
                    // dostepne itemy
                case 2:
                    // sprzedane itemy
                case 3:
                    // dodaj item
                case 4:
                    // usun item
                case 5:
                    // edytuj item
                case 6:
                    // sprzedaj item
                case 7:
                    // bilans

            }
        }
    } */
    }
}
