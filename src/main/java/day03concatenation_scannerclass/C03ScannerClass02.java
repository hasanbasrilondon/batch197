package day03concatenation_scannerclass;

import java.util.Scanner;

public class C03ScannerClass02 {
    public static void main(String[] args) {
        // Get user's full name
        // Scanner Class object
        Scanner input = new Scanner(System.in);

        // Write message to user
        System.out.println("Please enter your full name :......");

        // Get data from user
        String fullName = input.nextLine();
        System.out.println("Your full name is :" + fullName);

        // Ask only name of user's parent.
        System.out.println("Please enter only first name your parent");
        String firtsNameOfParent = input.next();
        System.out.println("Your parent's first name is: " + firtsNameOfParent);
    }
}
