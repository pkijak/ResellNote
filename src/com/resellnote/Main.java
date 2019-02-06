package com.resellnote;

import java.util.Scanner;

public class Main {

    private static Scanner in = new Scanner(System.in);
    private static String commands = "[-1]QUIT, [0]Polecenia, [1]Dostepne przedmioty, [2]Sprzedane przedmioty, [3]Dodaj przedmiot, [4]Usun przedmiot,"
            + " [5]Edytuj przedmiot, [6]Sprzedaj. [7] Bilans";

    public static void main(String [] args) {

        System.out.println(commands);
    }
}
