package controller;

import java.util.Scanner;

public class DisplayTime {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        //verkrijg input van gebruiker
        System.out.print("Enter an integer for seconds: ");
        int seconds = input.nextInt();

        int minutes = seconds / 60; // Aantal minuten afgeleid van seconden
        int remainingSeconds = seconds % 60; // Overgebleven seconden
        System.out.println(seconds + " seconds is " + minutes +
                " minutes and " + remainingSeconds + " seconds.");
    }
}
