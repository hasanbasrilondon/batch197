package day05_logicaloperators_ifstatements;

import java.util.Scanner;

public class C04IfStatement02 {
    public static void main(String[] args) {

        // Example : Ask user to enter initial letter of a day, then print
        //           all possible days starting with that initial
        // 'M' -----> Monday  'T' ------> Tuesday and Thursday

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Initial Letter of a Day...");
        char initial = input.next().charAt(0);// To get char from String we use input.next().charAt()

        if (initial=='M'){
            System.out.println("Monday");

        } else if (initial=='T') {
            System.out.println("Tuesday and Thursday");

        } else if (initial=='W') {
            System.out.println("Wednesday");

        } else if (initial=='F') {
            System.out.println("Friday");

        } else if (initial=='S') {
            System.out.println("Saturday and Sunday");

        }else {
            System.out.println("Please enter a valid initial");

        }

    }
}
