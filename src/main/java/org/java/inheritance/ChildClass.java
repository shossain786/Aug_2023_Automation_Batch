package org.java.inheritance;

public class ChildClass extends ParentClass {
    public static void main(String[] args) {
        greeting();
        displaySub();

        ChildClass obj = new ChildClass();
        obj.displayCity();

        obj.printName();
    }

    void displayCity() {        // non-static member
        System.out.println("Pune");
    }

    static void displaySub() {  //static member
        System.out.println("Java");
    }
}
