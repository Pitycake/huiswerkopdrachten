package controller;

import java.util.Scanner;

public class Stemmen {
    public static void main(String [] args){
        Scanner invoer = new Scanner(System.in);
        System.out.println("Geef je leeftijd op:");
        int leeftijd = invoer.nextInt();
        if (leeftijd < 18) {
            System.out.println("Je mag geen sigaretten kopen");
        } else {
            System.out.println("Je mag een kankerverwekkend(sigaret) staafje kopen");

        }
    }
}
