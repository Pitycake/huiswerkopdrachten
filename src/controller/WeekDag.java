package controller;

import java.util.Scanner;

public class WeekDag {
    public static void main (String [] args) {
        Scanner invoer = new Scanner(System.in);
        System.out.println("Geef een dagnummer (1-7) ");
        int dagNummer = invoer.nextInt();

        System.out.print("Dat is een ");
        switch (dagNummer) {
            case 1:
                System.out.println("Maandag");
                break;
            case 2:
                System.out.println("Dinsdag");
                break;
            case 3:
                System.out.println("Woensdag");
                break;
            case 4:
                System.out.println("Donderdag");
                break;
            case 5:
                System.out.println("Vrijdag");
                break;
            case 6:
                System.out.println("Zaterdag");
                break;
            case 7:
                System.out.println("Zondag");
                break;
            default:
                System.out.println("Onbekende dag. Voer een getal tussen 1 en 7 in.");
                break;
        }
    }
}
