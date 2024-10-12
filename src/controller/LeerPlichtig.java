package controller;

import java.util.Scanner;
public class LeerPlichtig {
    public static void main(String[] args) {
        Scanner invoer = new Scanner(System.in);
        System.out.println("Geef je leeftijd:");
        int leeftijd = invoer.nextInt();
        if (leeftijd < 4 || leeftijd > 16) {
            System.out.println("Je hoeft niet naar school!");
        } else {
            System.out.println("Je moet naar school gaan!");
        }
    }
}
