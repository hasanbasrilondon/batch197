package day04operations_increment_decrement;

public class C03InrementAndDecrement {
    public static void main(String[] args) {

        // Increment: Used to increase value of a variable
        int age = 13;
        System.out.println(age + 2);
        System.out.println(age);

        // First way:
        age = age +2; //15
        System.out.println("First increment = " + age );

        // Increment can be done by multiplication as well
        // First way:
        age = age*2; //34
        System.out.println("Second increment = " + age );


        //Second way:
        age *= 2; // 68
        System.out.println("Third increment = " + age );

        // Decrement: It is used to decrease value of variable
        // First way:
        age = age - 2; // 66
        System.out.println("First decrement = " + age );

        // Second way:
        age -= 6; // 60
        System.out.println("Second decrement = " + age );













    }
}
