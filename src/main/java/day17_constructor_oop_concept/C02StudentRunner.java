package day17_constructor_oop_concept;

import day17_constructor_oop_concept.C01Students;

public class C02StudentRunner{
    public static void main(String[] args) {

        C01Students std1 = new C01Students();
        System.out.println(std1.name);

        C01Students std2 = new C01Students("Hasan",22);

        std1.name = "Basri";
        std1.age = 41;
        System.out.println(std1.name);
        System.out.println(std2.age);

        System.out.println(std2.name);
        System.out.println(std1.age);

        std1.doSport();
        std1.study();
        std2.study();


    }


    }

