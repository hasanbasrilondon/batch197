package day13arraylist_method_creation;

public class C03MethodCreation {
    public static void main(String[] args) {

       // Method Call:
      int r1 = add(3,7);

      double r2 = multiplyThreeNumbers(2.1, 3.5, 4.5);


    }

    public static double multiplyThreeNumbers(double a, double b, double c) {
        return a;
    }

    // Type a method to add integers no usages

    public static int add(int a, int b){
        int sum =a + b;
        return sum;
    }

    // Type a method to multiply three numbers:
    public double mulyiplyThreeNumbers(double a, double b, double c){
        return a*b*c;
    }
    // Type a method that joins two strings
    public String joinTwoString(String a,String b){
        return a.concat(b);
    }
}
