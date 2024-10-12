package controller;

import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {
        System.out.println("Kies een nummer tussen 1 en 10");
        Scanner scanner = new Scanner(System.in);

        int gekozenNummer = scanner.nextInt();
        if (gekozenNummer < 5) {
            System.out.println("Geniet van het geluk dat een vriend je brengt");
        }
        else {
            System.out.println("Sorry, maar het leven lacht je niet toe...");
        }
    }

}
