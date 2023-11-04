package day09_loops;

import java.util.Scanner;

public class C08DoWhileLoop02 {

    public static void main(String[] args) {

     // Type a code to find sum of the integers from 7 to 10
     int sum = 0;
     int i = 7;

     do {
         sum =sum + i;
         i++;
     }while (i<11);
        System.out.println(sum);

        /*
              Ask user to enter an integer
              If the integer is less than 100, tell user "Won!"
              Otherwise, tell user "Lost!"
         */



    }

}
