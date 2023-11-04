public class C05StringManipulations {

    public static void main(String[] args) {

        // Example 1 : Count the alphabetical chars in given string
        // "Tom12 Hanks!..." ------> 8

        /*
        ---------------Regular Expressions---------------
        i) If we handle group of data we use regex
        - All Uppercase letters [A-Z]
        - All lowercase letters [a-z]
        - All letters           [A-Za-z]
        - All digits            [0-9]
        - letters from b to me  [b-m]
        - group of letters akmre [akmer]

        -All chars different from Uppercase letters [^A-Z]
        -All chars different from Lowercase letters [^a-z]
        -All chars different from letters           [^A-Za-z]
        -All chars different from digits            [^0-9]
        -All chars different from letters and digits [^A-Za-z0-9]

        -All punctuation marks : \\p {Punct}

         */
         String name = "Hasan12 Basri!...";
        System.out.println(name.replaceAll("[^A-Za-z ]", "").length());
        //replaceAll() ---> is used to group of data from string with something else
        //length()  -----> counts the number of character in a String

        // Example 2 : Write a code change all numbers by * in a given password
        String password = "a126Rd?q5";
        String hiddenPass = password.replaceAll("[0-9]", "*");
        System.out.println(hiddenPass);

        // Example 3 : Get initials from full name: (Middle names are exculeded)
        // "Tom Hanks" ------> TH    "  toM Hanks   " ------> TH  "tOm hAnKs  " -----> TH

        String name2 = "tAOm hAnKs";
        // How to get first initial
        String firstInitial = name2.substring(0,1).toUpperCase();

        // How to get second initial
        String secondInitial =(name2.split("A")[1].
                substring(0,1).
                toUpperCase());

        System.out.println(firstInitial+secondInitial);


    }

}
