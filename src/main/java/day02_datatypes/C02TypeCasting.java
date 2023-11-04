package day02_datatypes;

public class C02TypeCasting {
    public static void main(String[] args) {
        // Type Casting is changing primitive data type of variable to another data type
        byte age = 35;
        byte myAge = age;

        // If we change data type of variable into a larger data type. This is "auto widening"
        // Java does this operation automatically --> auto widening
        
        short yourAge = age;
        System.out.println("yourAge = " + yourAge);

        // Explicit narrowing: Casting large data type to smaller data type
        //                     Java does not to automatically we need to do it explicitly
        //                     by adding name of smaller data type in front of the variable which has larger data
        short height = 12;
        byte heightOfBuilding = (byte) height;
        System.out.println("heightOfBuilding = " + heightOfBuilding);

        double height2 = height;
        System.out.println("height2 = " + height2);

        double weight = 79.95;
        short weight1 =(short) weight;
        System.out.println("weight1 = " + weight1);

         //NOTE: When doing mathematical operations in Java if data types same result must have same data type with the variables.
         //      The result may not fit to given data type, in this case java will remove decimal part
        int numOfStd = 20;
        int amountOfMoney = 398;
        System.out.println(amountOfMoney/numOfStd);

        int numOfStds = 20;
        float amountOfMoneys = 398.0F;
        System.out.println(amountOfMoneys/numOfStds);


    }
}
