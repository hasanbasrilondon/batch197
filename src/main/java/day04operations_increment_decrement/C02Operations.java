package day04operations_increment_decrement;

public class C02Operations {
    public static void main(String[] args) {
        // '=' Assignment Operator: Assign value on the right to the value on the left
        // '==' Equality Operator: It compares value on the right to the left
        //                         It returns boolean
        // 2+4==6  ==> true   3+7 == 5 ==> false
        System.out.println(2+4 == 6);
        System.out.println(3 + 7 == 5);
        // If I use char with mathematical operator Java will use its ASCII value
        System.out.println('A'==65);
        // Example: Find ASCII value of '!' by typing codes
        System.out.println('!'*1);
        System.out.println('!'+0);

        // '!' Not Operator: !true = false  !false = true !!true = true
        // '!=' Not Equal Operator: 3+2 != 10 ==> true  3+2 != 5 ==> false
        // '>' , '<' , '<=' , return boolean 5<7 ==> true

        // '==' for String
        // For String values there are two important part : 1) value 2) Address

        String s1 = "Hasan";
        String s2 = "Basri";
        String s3 = "Hasan";
        String s4 = new String("HaSan");

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1==s4);
        System.out.println(s1.equals(s4));
        System.out.println(s1.equalsIgnoreCase(s4));
    }
}
