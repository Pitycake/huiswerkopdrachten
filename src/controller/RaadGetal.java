package controller;

import java.util.Scanner;

public class RaadGetal {
    public static void main(String[] args) {
        final int TE_RADEN_GETAL = (int) (Math.random() * 100) + 1;
        Scanner invoer = new Scanner(System.in);
        int geraden = 0;

        System.out.println("Raad een getal tussen de 1 en de 100");

        while (geraden != TE_RADEN_GETAL) {
            geraden = invoer.nextInt();

            if (geraden == TE_RADEN_GETAL) {
                System.out.println("Goed geraden!!");
            } else if (geraden > TE_RADEN_GETAL) {
                System.out.println("Te hoog!");
            } else {
                System.out.println("Te laag!");
            }
        }

        System.out.println("Het getal was " + TE_RADEN_GETAL);
    }
}
