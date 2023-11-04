package day03concatenation_scannerclass;

import java.util.Scanner;

public class C02ScannerClass01 {
    public static void main(String[] args) {
        // Scanner Class : When we need to get data from user we use Scanner Class
        // There are 3 steps to get input from user
        // First step: create Scanner Class object
        Scanner input = new Scanner(System.in);

        // Second Step: Write message to user
        System.out.println("Please enter your age:....");

        // Third Step Get data from the user
        byte age = input.nextByte();

        System.out.println("Your age is = " + age);
    }
}
