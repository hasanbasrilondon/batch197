package day03concatenation_scannerclass;

import java.util.Scanner;

public class C04ScannerClass03 {
    public static void main(String[] args) {
        // Example 1: Ask user to enter 2 numbers, then print the sum and the multiplication of the numbers on the console.
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first number:....");
        double num1 = input.nextDouble();
        System.out.println("Please enter second number:....");
        double num2 = input.nextDouble();

        double sum = num1+num2;
        double product = num1*num2;
        System.out.println("Sum of "+num1+ " and "+ num2+ " is: "+ sum);
        System.out.println("Product of the number is: "+ product);


    }
}
