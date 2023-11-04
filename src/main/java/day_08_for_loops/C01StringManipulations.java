package day_08_for_loops;

public class C01StringManipulations {

    public static void main(String[] args) {

        String s = "Java is Java";
        char c = s.charAt(2);
        System.out.println(c);
        boolean b1= s.contains("is");
        System.out.println(b1);
        boolean b2= s.contains("Javax");
        System.out.println(b2);
        String s2 =s.repeat(3);
        System.out.println("s2 = " + s2);
        boolean b3= s.startsWith("j");
        System.out.println(b3);
        boolean b4= s.startsWith("J");
        System.out.println(b4);
        boolean b5 = s.endsWith("a");
        System.out.println(b5);

    }

}
