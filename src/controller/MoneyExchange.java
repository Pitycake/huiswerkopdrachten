package controller;

import java.util.Scanner;

public class MoneyExchange {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Vraag de gebruiker om het aantal euro's in te voeren
        System.out.print("In te wisselen bedrag (alleen gehele getallen): ");
        int euro = input.nextInt(); // Sla de invoer op in de variabele 'euro'

        // Bereken de wisselkoersen op basis van het ingevoerde aantal euro's en maak ze definitief ('final')
        final double DOLLAR = euro * 1.23843;
        final double POND = euro * 0.88459;
        final double YEN = euro * 134.67411;

        // Bereken de transactiekosten (1,5% van het bedrag, minimaal 2 en maximaal 15 euro)
        double transactieKostenDouble = Math.max(2, Math.min(15, euro * 0.015));

        // Rond de transactiekosten naar boven af naar het dichtstbijzijnde gehele getal
        final int transactieKosten = (int) Math.ceil(transactieKostenDouble);

        // Trek de transactiekosten af van het in te wisselen bedrag
        final int wisselBedrag = euro - transactieKosten;

        // Toon de resultaten
        System.out.println("De transactiekosten bedragen " + transactieKosten + " Euro");
        System.out.println("We rekenen daarom " + wisselBedrag + " Euro voor u om.");
        System.out.println("U krijgt hiervoor " + (wisselBedrag * 1.23843) + " Dollar.");
        System.out.println("U krijgt hiervoor " + (wisselBedrag * 0.88459) + " Pond.");
        System.out.println("U krijgt hiervoor " + (wisselBedrag * 134.67411) + " Yen.");

        // Sluit de scanner om resourcelekken te voorkomen
        input.close();
    }
}
