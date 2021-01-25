package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius:");
        double radius = input.nextDouble();
        input.close();

        double area = Circle.getArea(radius);

//      if (radius != Double.parseDouble(radius)) {
        if (Double.isNaN(radius)) {
            System.out.println("Radius must be a number.");
            if (radius < 0) {
                System.out.println("Radius must be entered.");
            } else {
                System.out.println("The area of a circle of radius " + radius + " is: " + area);
            }
        }
    }
}
