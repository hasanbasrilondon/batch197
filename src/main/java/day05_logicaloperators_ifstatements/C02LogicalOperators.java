package day05_logicaloperators_ifstatements;

public class C02LogicalOperators {

    public static void main(String[] args) {

         /*
        -------------------- And Operator----------------

                Tea     and      Cake          Order
                 T       &&        F             F
                 F       &&        T             F
                 F       &&        F             F
                 T       &&        T             T

     */

        int a =12;
        int b = 4;
        System.out.println((a > b) && (a == b * 3) && (a / b == 3) && (a % b == 3));
        // And operator ==> single false makes result false

        System.out.println((a < b) && (a == b * 3) && (a / b == 3) && (a % b == 3));
        // in above code after getting false java will not execute the codes
        // if you use single & sign java will check all operations

           /*
        ------------------------Or Operator----------------------
                Cafe    or     Tea     Order
                F       ||      T       T
                T       ||      F       T
                T       ||      T       T
                F       ||      F       F
         */
        System.out.println((a > b) || (a == b * 3) || (a % b == 3));
        // Or operator is like Pollyanna (optimist) single true is enough to make result true.

        // If we need to use "And" operator together with "or" operator try to use "()"

        System.out.println(((a > b) && (a == b * 3)) || (a % b == 3));

        System.out.println((a > b) && ((a == b * 3) || (a % b == 3)));










    }

}
