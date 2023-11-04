package day02_datatypes;

public class C03WrapperClass {
    public static void main(String[] args) {
        // Wrapper Class: Java created a new data structure by adding some usefull method
        //                This new structure  is called as "Wrapper Class"

        // Java created wrapper class for every primitive data

        /* Primitive         Wrapper Class
        byte ---------->     Byte
        short --------->     Short
        int ----------->     Integer
        long ---------->     Long
        float --------->     Float
        double -------->     Double
        boolean -------->    Boolean
        char ---------->     Character

         */
        // primitive data does not have methods
        int weight = 25;

        // Wrapper Class has many methods
        Integer height = 120;


        // I can find max and min value of int by Wrapper Classes
        System.out.println(Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);

        System.out.println("Short.MAX_VALUE = " + Short.MAX_VALUE);
        System.out.println("Short.MIN_VALUE = " + Short.MIN_VALUE);

        // Auto Boxing: Converting primitive data to Wrapper Class(Java does automatically)
        char chr = '?';
        Character chr2 = chr;
        //System.out.println("chr2.equals('?') = " + chr2.equals('?'));

        // Unboxing : Converting Wrapper Class to primitive data (Java does automatically)
        Boolean b1 = true;
        boolean b2 = b1;

        //-----------------Examples---------------------
        Double num1 = 43.5; // Change double to int by using Wrapper Class methods
        int fromDouble = num1.intValue();
        System.out.println(fromDouble);

        String sfromDouble = num1.toString(); // "43.5"
        System.out.println(num1/3);

        String str = "123";// Changed into int
        int fromString = Integer.valueOf(str);

        String bol1 = "true";
        boolean bol2 = Boolean.valueOf(bol1);


    }
}
