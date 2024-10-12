package controller;

import java.util.Scanner;


public class BMIBerekening {

    public static void main(String[] args) {
        // Declareer de variabelen input (Scanner), lengte, gewicht en bmi
        int lengte;
        double gewicht;
        Scanner input;
        double bmi;
        final int OVERGEWICHT_GRENS = 25;
        // Gebruiker om input vragen mbv scanner
        input = new Scanner(System.in);
        System.out.print("Geef je lengte in centimeters: ");
        lengte = input.nextInt();
        System.out.print("Geef je gewicht in kilogram: ");
        gewicht = input.nextDouble();
        // bmi uitrekenen
        double lengteInMeters = lengte / 100.0;
        bmi = gewicht / (lengteInMeters * lengteInMeters);
        // Toon het resultaat
        System.out.println("Jouw BMI is: " + bmi);
        if (bmi > OVERGEWICHT_GRENS) {
            System.out.println("Je hebt overgewicht.");
        }  else {
            System.out.println("Je bent goed op gewicht.");
        }
    }
}
