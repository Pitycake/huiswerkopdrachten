package controller;

import java.util.Scanner;

public class MoneyExchangeAdvanced {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Vraag de gebruiker om de gewenste valuta te kiezen
        System.out.println("Kies een valuta:");
        System.out.println("1. Dollar");
        System.out.println("2. Pond");
        System.out.println("3. Yen");
        int keuze = input.nextInt();  // Hier sla je de keuze op

        // Vraag de gebruiker om het aantal euro's in te wisselen
        System.out.print("In te wisselen bedrag (alleen gehele getallen): ");
        int euro = input.nextInt(); // Sla de invoer op in de variabele 'euro'

        // Bereken de transactiekosten (1,5% van het bedrag, minimaal 2 en maximaal 15 euro)
        double transactieKostenDouble = Math.max(2, Math.min(15, euro * 0.015));
        int transactieKosten = (int) Math.ceil(transactieKostenDouble);

        // Trek de transactiekosten af van het in te wisselen bedrag
        int wisselBedrag = euro - transactieKosten;

        // Bereken de wisselkoersen op basis van het ingevoerde aantal euro's
        double resultaat = 0;
        String valutaNaam = ""; // Variabele om de naam van de valuta op te slaan

        // Gebruik een if-else statement om de juiste valuta te tonen
        if (keuze == 1) {
            resultaat = wisselBedrag * 1.23843;  // Dollar
            valutaNaam = "Dollar";
        } else if (keuze == 2) {
            resultaat = wisselBedrag * 0.88459;  // Pond
            valutaNaam = "Pond";
        } else if (keuze == 3) {
            resultaat = wisselBedrag * 134.67411;  // Yen
            valutaNaam = "Yen";
        } else {
            System.out.println("Ongeldige keuze. Kies een nummer tussen 1 en 3.");
        }

        // Als de gebruiker een geldige keuze heeft gemaakt, toon dan het resultaat
        if (keuze >= 1 && keuze <= 3) {
            System.out.println("De transactiekosten bedragen " + transactieKosten + " Euro.");
            System.out.println("We rekenen " + wisselBedrag + " Euro voor u om.");
            System.out.println("Je krijgt " + String.format("%.2f", resultaat) + " " + valutaNaam + " voor " + euro + " Euro.");  // Afgerond naar 2 decimalen en de naam van de valuta toegevoegd
        }

        // Sluit de scanner om resourcelekken te voorkomen
        input.close();
    }
}
