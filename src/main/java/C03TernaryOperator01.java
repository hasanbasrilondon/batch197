public class C03TernaryOperator01 {
    // Example 1: Type code to check if a given number is even or odd

    public static void main(String[] args) {

        int num1 = 12;
        String result1 = (num1%2==0) ? "Even" : "Odd";
        System.out.println(result1);

        // Example 2: Write a code to check if given number has three digits or not

        int num2 = -321;
        String result2 = (num2>99 && num2<1000) || (num2>-1000 && num2<-99) ? num2 + " is three digits" : num2 + " is not three digits";
        System.out.println(result2);

        // Example 3: Write a code to calculate absolute value of a number
        int num3 = 3;
        int result3 = (num3<0) ? -1*num3 : num3;
        System.out.println(result3);

        //Example 4: Type code to find the multiplication of two integers if the signs are same.
        //           Give a message like "I do not know how to multiply" if the signs are different.
        //           5 and 4 ==> 5*4    -3 and -2 ==> -3*-2    -4 and 3 ==> "I do not know how to multiply"

         int a = 9;
         int b = -6;
         Object result4 = (a<0 && b<0) || (a>0 && b>0) ? a*b : "I do not know how to multiply";
        System.out.println(result4);









    }
}
