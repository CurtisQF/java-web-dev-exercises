package exercises.Chap2;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the rectangle's length?");
        int length = input.nextInt();
        System.out.println("What is the rectangle's width?");
        int width = input.nextInt();
        int area = width*length;
        System.out.println("The rectangle's area is " + area);
    }
}
