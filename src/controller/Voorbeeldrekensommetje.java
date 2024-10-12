package controller;

import java.util.Scanner;

public class Voorbeeldrekensommetje {

    public static void main(String[] args) {
        // Genereer twee willekeurigegetallen van 2 tot 10 en bereken antwoord
        int getal1 = genereerGetal();
        int getal2 = genereerGetal();
        int antwoordSom = getal1 * getal2;
        // Geef gebruiker de som en vraag om antwoord
        Scanner input = new Scanner(System.in);
        System.out.print("Hoeveel is " + getal1 + " * " + getal2 + "? ");
        int antwoordGebruiker = input.nextInt();
        // controleer antwoord en geef feedback
        if (antwoordGebruiker == antwoordSom) {
            System.out.println("Goed gedaan!");
        } else {
            System.out.println("Helaas niet goed, het antwoord is " + antwoordSom);
        }
    }

    public static int genereerGetal() {
        int getal = 2 + (int) (9 * Math.random());
        return getal;
    }
}
