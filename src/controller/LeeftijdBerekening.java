// LeeftijdBerekening.java
// Dit programma berekent de leeftijd van een gebruiker op basis van het geboortejaar en het huidige jaar.

package controller;

import java.util.Scanner;

public class LeeftijdBerekening {
    public static void main(String[] args) {
        // Scanner aanmaken voor gebruikersinvoer
        Scanner scanner = new Scanner(System.in);

        // Gebruiker vragen om hun naam
        System.out.print("Voer je naam in: ");
        String voorNaam = scanner.nextLine(); // Invoer van de naam, kan meerdere woorden bevatten

        int geboorteJaar = 0; // Variabele voor het geboortejaar

        // Vraag om invoer totdat een geldig geboortejaar is ingevoerd
        while (true) {
            System.out.print("Voer je geboortejaar in (4 cijfers): ");
            String geboorteJaarInput = scanner.nextLine(); // Invoer van het geboortejaar als String

            // Controleer of het geboortejaar 4 cijfers bevat
            if (geboorteJaarInput.length() == 4 && geboorteJaarInput.matches("\\d{4}")) {
                geboorteJaar = Integer.parseInt(geboorteJaarInput); // Converteer naar int
                break; // Geldige invoer, breek de lus
            } else {
                System.out.println("Fout: Voer een geldig geboortejaar in (exact 4 cijfers).");
            }
        }

        // Constante voor het huidige jaar
        final int HUIDIG_JAAR = 2024; // Het huidige jaar is vastgesteld

        // Berekening van de leeftijd
        int leeftijd = HUIDIG_JAAR - geboorteJaar; // Leeftijd berekenen

            // Output van de leeftijd
            System.out.println(voorNaam + ", je leeftijd is: " + leeftijd + " jaar.");

        if (leeftijd < 18) {
            System.out.println("Je mag nog niet stemmen!");
        } else {
            System.out.println("Je mag stemmen!");

        }
    }
}
