package day13arraylist_method_creation;

public class C04MethodOverLoading {
    public static void main(String[] args) {

        add(3,8);


    }

    // Create a method to add two integers
    public static int add(int a , int b){
        return a + b;
    }
    // Create a method to add three integers
    public static int add(int a,int b , int c){
        return a+b+c;
    }
    // Create a method to add one integer and one double
    public static double add(int a, double b){
        return a+b;
    }
    // Create a method to add one double and one integer
    public static double add(double a , int b){
        return a+b;
    }
}
