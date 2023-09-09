package org.itest.tutorials;

public class Sample1 {

    static String subject  = "Java"; // call them with Class name
    String className = "Selenium";  // non static should be called with object reference


    public static void printSubject() {  // call them with Class name
        System.out.println(subject); // without class
        System.out.println(Sample1.subject); // with class name
    }

    public void displayClassName() {   // non static should be called with object reference
        System.out.println(className);
    }
}

//Osama bin Laden
//non static member within same class:
//two situations: static(need object reference), non-static: no need of object reference