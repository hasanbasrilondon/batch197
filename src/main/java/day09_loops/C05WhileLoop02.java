package day09_loops;

public class C05WhileLoop02 {
    public static void main(String[] args) {

        //Tyoe a code print even numbers from 15 to 5

        int i = 15;
        while (i>4){
            if (i%2==0){
                System.out.print(i + " ");

            }
            i--;

        }
        // Example : Type a code to check if a given number is Palindrome or not
        // 12321    -----> polindrome 12312 ------> not polindrome

        int num = 12321;
        String numStr = String.valueOf(num);
        String reversed = "";

        int k = numStr.length()-1;
        while (k>=0){
            reversed = reversed + numStr.charAt(k);
            k--;
        }
        if (numStr.equals(reversed)){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }















    }
}
