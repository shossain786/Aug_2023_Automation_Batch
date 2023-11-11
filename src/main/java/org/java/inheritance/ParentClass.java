package org.java.inheritance;

public class ParentClass{
    static void greeting(){    //static method
        System.out.println("Hello from Parent class.");
    }

    void printName() {  // non-static method
        System.out.println("Peter");
    }

    static void printMessage() {
        System.out.println("Inside Parent 1");
    }
}

// 100 tc : open browser, navigate, close