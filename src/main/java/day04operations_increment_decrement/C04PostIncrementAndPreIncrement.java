package day04operations_increment_decrement;

public class C04PostIncrementAndPreIncrement {

    public static void main(String[] args) {

        //When you ask Java to do two operation at a time java would like to know which one is the first.

        int age = 20;
        int age2 = 20;

        System.out.println(age++);

        System.out.println(age);
        age++;
        System.out.println(age);
        age++;

    }

}
