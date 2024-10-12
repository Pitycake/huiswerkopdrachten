package controller;

import java.util.Scanner;

public class MoneyExchange {

    public static void main (String [] args) {
        int euro;
        final double DOLLAR = euro * 1.23843;
        final double POND = euro * 0.88459;
        final double YEN = euro * 134.67411;
        double transactieKosten = 1.0;

        int wisselBedrag = (int) (euro - transactieKosten);



        Scanner input;
        input = new Scanner(System.in);
        System.out.print("In te wisselen bedrag (alleen gehele getallen): ");
        input.nextInt();
        System.out.println("De transactiekosten bedragen " + transactieKosten + " Euro");
        System.out.println("We rekenen daarom " + wisselBedrag + " voor u om.");


        System.out.println(" U krijgt hiervoor " + DOLLAR + " Dollar.");
        System.out.println(" U krijgt hiervoor " + POND + " Pond.");
        System.out.println(" U krijgt hiervoor " + YEN + " Yen.");



    }
}





//Schrijf een programma dat uitrekent hoeveel buitenlandse valuta een klant krijgt voor zijn
//euro’s. In het programma wordt voor de volgende valuta het bedrag uitgerekend:
//• US dollar
//• GB pound
//• Yen
//Alleen een geheel aantal euro’s kan worden omgewisseld.
//Zorg dat de invoer en uitvoer van het programma er als vol

//Voor het wisselen moet de klant transactiekosten betalen. Deze bedragen 1,5%, met een
//minimum van 2 euro per transactie en een maximum van 15 euro per transactie. Schrijf voor het
//berekenen van de transactiekosten een methode die op basis van het in te wisselen bedrag in
//euro’s de kosten berekent en teruggeeft (returned).
//Zorg dat de invoer en uitvoer van het programma er als volgt uitziet:
