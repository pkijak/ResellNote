package com.resellnote;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner in = new Scanner(System.in);
    private static String commands = "[-1]QUIT, [0]Polecenia, [1]Dostepne przedmioty, [2]Sprzedane przedmioty, [3]Dodaj przedmiot, [4]Usun przedmiot,"
            + " [5]Edytuj przedmiot, [6]Sprzedaj. [7] Bilans";

    public static void main(String[] args) {

        Storage storage = new Storage(5);

        storage.addItem();


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
                    storage.availableItems();
                    break;
                case 2:
                    storage.soldItems();
                    break;
                case 3:
                    // add item
                    break;
                case 4:
                    //  remove item
                    break;
                case 5:
                   //modify item
                    break;
                case 6:
                storage.soldItems();
                    break;
                case 7:
                    // bilans

            }
        }
    }
}