package com.resellnote;

import java.util.Scanner;

public class Main {

    private static Scanner in = new Scanner(System.in);
    private static String commands = "[-1]QUIT, [0]Polecenia, [1]Dostepne przedmioty, [2]Sprzedane przedmioty, [3]Dodaj przedmiot, [4]Usun przedmiot,"
            + " [5]Edytuj przedmiot, [6]Sprzedaj. [7] Bilans";

    public static void main(String[] args) {


        Item piraty = new Shoes("piraty",1500,9,"red",11);
        Item piraty2 = new Shoes("piraty",1500,9,"red",11);
        Item piraty3 = new Shoes("piraty",1500,9,"red",11);


        Item bogo1 = new Clothes("Bogo",2000,9,"black","L");
        Item bogo2 = new Clothes("Bogo",2000,9,"black","L");
        Item bogo3 = new Clothes("Bogo",2000,9,"black","L");

        Item necklace = new Accessories("Belt gucc",900,4);

        System.out.println(necklace.getId());

        System.out.println(piraty.getId());
        System.out.println(piraty2.getId());
        System.out.println(piraty3.getId());

        System.out.println(bogo1.getId());
        System.out.println(bogo2.getId());
        System.out.println(bogo3.getId());





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
    }
}
