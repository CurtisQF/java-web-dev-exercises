package exercises.Chap2;

import java.util.Scanner;

public class MPG {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles did you drive?");
        float miles = input.nextInt();
        System.out.println("How many gallons of gas were consumed?");
        float gallons = input.nextInt();
        float mpg = miles / gallons;
        System.out.println("The miles-per-gallon is " + mpg);
    }
}
