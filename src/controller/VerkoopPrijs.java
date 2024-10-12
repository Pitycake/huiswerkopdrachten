package controller;

import java.util.Scanner;

public class VerkoopPrijs {

    public static void main(String[] args) {
        // variabelen declaraties
        // constanten voor BTW hoog en laag.
        double inkoopprijs;
        int winstmarge;
        double verkoopprijsExclBTW;
        double verkoopprijsInclBTW;
        final int BTW_HOOG = 21;
        final int BTW_LAAG = 6;
        int tariefKeuze;

        // input opvragen
        Scanner inputVrager = new Scanner(System.in);
        System.out.print("Inkoopprijs: ");
        inkoopprijs = inputVrager.nextDouble();
        System.out.print("Winstmarge (in %): ");
        winstmarge = inputVrager.nextInt();

        // berekenen verkoopprijs op basis van winstmarge
        // printen van resultaat
        verkoopprijsExclBTW = inkoopprijs + inkoopprijs * (winstmarge / 100.0);
        System.out.println();
        System.out.println("Verkoopprijs exclusief BTW: " + verkoopprijsExclBTW);

        // vraag naar BTW_TARIEF
        System.out.println();
        System.out.print("Onder welk BTW-tarief valt het product?\n \t1 Hoog \n\t2 Laag\n");
        System.out.print("Geef je keuze: ");
        tariefKeuze = inputVrager.nextInt();
        System.out.println();

        // berekenen verkoopprijs inclusief BTW op basis van keuze tarief
        // printen van resultaat
        switch (tariefKeuze) {
            case 1:
                verkoopprijsInclBTW = verkoopprijsExclBTW + verkoopprijsExclBTW * (BTW_HOOG / 100.0);
                System.out.println("Verkoopprijs inclusief " + BTW_HOOG + "% BTW: " +
                        verkoopprijsInclBTW);
                break;
            case 2:
                verkoopprijsInclBTW = verkoopprijsExclBTW + verkoopprijsExclBTW * (BTW_LAAG / 100.0);
                System.out.println("Verkoopprijs inclusief " + BTW_LAAG + "% BTW: " +
                        verkoopprijsInclBTW);
                break;
            default:
                System.out.println("Je maakt een ongeldige keuze.");
        }
    }
}
