package controller;

public class ComputeArea {
    public static void main(String[] args) {
        final double PI = 3.14159;
    double radius;
    double area;

    radius = 20;
    area = radius * radius * PI;

    System.out.println("The area for the circle of radius " +
            radius + " is " + area);
    //Step 1 read in radius
    //Step 2 Compute area
    //Step 3 Display the area
}
}
