package day25_collections;

import java.util.Collections;
import java.util.LinkedList;

public class C02Collections {
    public static void main(String[] args) {

        LinkedList<String> countries = new LinkedList<>();
        countries.add("France");
        countries.add("Italy");
        countries.add("Albania");
        countries.add("Belgium");
        countries.add("Germany");
        System.out.println(countries);

        LinkedList<String> names = new LinkedList<>();

        Collections.sort(countries);
        System.out.println(countries);
        System.out.println("names.peek =" + names.peek());

        String country = countries.peek();
        System.out.println(country);
        System.out.println(countries);










    }
}
