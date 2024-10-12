// BodyMassIndex.java
// Dit programma berekent de BMI van een gebruiker op basis van het gewicht in kilogrammen en legnte in centimeters

package controller;

import java.util.Scanner;

public class BodyMassIndex {
    public static <Int> void main(String[] args) {
        // Scanner aanmaken voor gebruikersinvoer
        Scanner scanner = new Scanner(System.in);

        // Gebruiker vragen om hun naam
        System.out.print("Voer je naam in: ");
        String voorNaam = scanner.nextLine(); // Invoer van de naam, kan meerdere woorden bevatten

        int gewichtInKilogram; //initialiseert de variabele VRAAG DOCENT, Ik heb hem omgezet naar een int, maar hoe krijg ik het werkend met een double?
        int lengteInCentimeters; //definieert de variabele

        Scanner input;
        input = new Scanner(System.in);

        // Vraag om invoer totdat een geldig geboortejaar is ingevoerd
        while (true) {
            System.out.print("Geef je lengte in centimeters in (3 cijfers): ");
            String lengteInCentimetersInput = scanner.nextLine(); // Invoer van het aantal centimeters als String
            {
                System.out.print("Geef je gewicht in kilogram met maximaal 1 cijfer achter de komma (3 cijfers): ");
                gewichtInKilogram = (int) input.nextDouble(); // Invoer van het gewicht in kilogram als Double
            }
            // Controleer de input
            if (lengteInCentimetersInput.length() == 3 && lengteInCentimetersInput.matches("\\d{3}")) {
                lengteInCentimeters = Integer.parseInt(lengteInCentimetersInput); // Converteer naar int
                break; // Geldige invoer, breek de lus
            } else {
                System.out.println("Fout: Voer je lengte in centimeters in (exact 3 cijfers).");
            }
        }

        // Constante voor een gezond BMI
        final int BMI_GEWENST = 25; // Het gewenste BMI is vastgesteld

        double lengteInMeters = lengteInCentimeters / 100.0;

        // Berekening van het BMI
        double bmiGebruiker = gewichtInKilogram / (lengteInMeters * lengteInMeters); // BMI berekenen


        // Output van het BMI
        System.out.println(voorNaam + ", je BMI is: " + bmiGebruiker);

        if (bmiGebruiker < 25) {
            System.out.println("Je bent op gezond gewicht!");
        } else {
            System.out.println("Je moet naar een dietist en minder Baskin-Robbins ijs eten!");

        }
    }
}
