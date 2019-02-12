package com.resellnote;

import java.util.Scanner;

public class Main {

    private static Scanner in = new Scanner(System.in);
    private static String commands = "[-1]Quit, [0]Polecenia, [1]Dostepne przedmioty, [2]Sprzedane przedmioty, [3]Dodaj, [4]Usun,"
            + " [5]Edytuj, [6]Sprzedaj. [7]Bilans [8]Szczegoly";

    public static void main(String[] args) {

        Storage storage = new Storage(5);

        storage.addItem();


        System.out.println("|   RESELL NOTE    |");
        System.out.println(commands);

        boolean flag = true;
        while (flag) {
            System.out.println("Choose option: (0 - print list)");


            int answer = in.nextInt();
            switch (answer) {

                default:
                    System.out.println("Wrong command");
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
                    storage.addItem();
                    break;
                case 4:
                    storage.removeItem();
                    break;
                case 5:
                    System.out.println("modify item");
                    break;
                case 6:
                    storage.sellItem();
                    break;
                case 7:
                    storage.bilans();
                    break;
                case 8:
                    storage.details();
            }
        }
    }
}