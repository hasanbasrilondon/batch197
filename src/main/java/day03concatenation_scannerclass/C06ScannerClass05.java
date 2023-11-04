package day03concatenation_scannerclass;

import java.util.Scanner;

public class C06ScannerClass05 {
    public static void main(String[] args) {


        //Example 3: Ask user to enter i)Full name ii)Age iii)Height iv)Marital status
        //           Then print them on the console in different lines with a label

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Your Full Name:...");
        String fullName = input.nextLine();
        System.out.println("Please Enter Your Age:...");
        byte age =input.nextByte();
        System.out.println("Please Enter Your Height:...");
        double height = input.nextDouble();
        System.out.println("Please Enter Your Marital Status:...");
        String maritalStatus = input.next();

        System.out.println("Full Name = " + fullName);
        System.out.println("Age = " +age );
        System.out.println("Height = " + height);
        System.out.println("Marital Status = " + maritalStatus);





    }
}
