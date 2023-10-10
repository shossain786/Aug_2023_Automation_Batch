package org.java.randomcode;

import java.util.ArrayList;

public class AdvancedForLoop {

    static int[] enmployeeNo = {101,102,193,104,105};
    static String[] names = {"Rahul", "Mandeep", "Sandy", "Saddam", "Sajra"};
    public static void main(String[] args) {        //normal for loop
        System.out.println(names.length);

        //By using normal for loop
        for(int i = 0; i<names.length ; i++){
            System.out.println(names[i]);
        }

        System.out.println("------------------------------------");

        // Enhanced for loop
        for (String a : names){
            System.out.println(a);
        }

        System.out.println("------------------------------------");
        for (int b : enmployeeNo) {
            System.out.println(b);
        }

        System.out.println("------------------------------------");
        ArrayList<String> subs = new ArrayList<String>();
        subs.add("Java");
        subs.add("Selenium");
        subs.add("Python");
        subs.add("TestNG");


        subs.forEach(sub -> System.out.println(sub));
        System.out.println("------------------------------------");
        subs.forEach(System.out::println);

    }
}