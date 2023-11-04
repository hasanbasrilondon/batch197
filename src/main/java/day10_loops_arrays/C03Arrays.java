package day10_loops_arrays;

import java.util.Arrays;

public class C03Arrays {

    public static void main(String[] args) {

        // When we learn smt new follow these step: 1) What   2) Why
        //                       3)Low-level implementations 4) mid-level implement.
        //                      5) Advanced-Level imp.  6) projects

        // Array are used to store multiple data
        // Data type of each element must be the same

        // How to create an Array:
        String [] stdNames = new String[5]; // [null,null,null,null,null]

        // How to print Array on the console
        System.out.println(stdNames); // prints references
        System.out.println(Arrays.toString(stdNames)); // [Mary, Tom, Murat, John, Julie]
        // How to add elements to the Array:
        stdNames[0] = "Mary";
        stdNames[3] = "John";
        stdNames[1] = "Tom";
        stdNames[4] = "Julie";
        stdNames[2] = "Murat";
        System.out.println(Arrays.toString(stdNames));
        // How to get specific element from an Array
        String third = stdNames[2];
        System.out.println(third);

        // Example: Create an int Array then find the multiplication of them.

        int [] numbers = new int [4];
        numbers[0] = 12;
        numbers [1]= 5;
        numbers[2] = 4;
        numbers[3]= 2;
        System.out.println(Arrays.toString(numbers));

        // First Way:
        int product = 1;

        for (int i =0; i<numbers.length; i++){
            product = product*numbers[i];

        }
        System.out.println(product);

        // Second Way: For Each Loop (Enhanced Loop) ---> works with Arrays and Collections
                                                // If you need to use indexes you cannot use For Each
        int n = 1;
        for (int w:numbers){ // [12,5,4,2]
            n = n*w;

        }
        System.out.println(n);

        // Example : Find the difference between maximum and minimum value of array elements
        // [8,12,34,10,78,19]

        int [] numsArr = {8,12,34,10,78,19};
        System.out.println(Arrays.toString(numsArr));

        Arrays.sort(numsArr);
        System.out.println(Arrays.toString(numsArr));

        int difference = numsArr [numsArr.length-1] - numsArr[0];
        System.out.println("difference = " + difference);


    }

}
