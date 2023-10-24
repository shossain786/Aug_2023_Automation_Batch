package org.java.randomcode;

public class NestedClass {
    static String sub = "JAVA";

    public static void main(String[] args) {
        Display obj = new Display();
        obj.displayName();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        NestedClass.Display obj1 = new NestedClass.Display();
        obj1.displayName();

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        NestedClass obj2 = new NestedClass();
        obj2.printSubject();
    }

    static class Display{
        void displayName() {
            System.out.println("inside display method");
            System.out.println("Welcome to " + sub + " programming.");
        }
    }

    public void printSubject() {
        System.out.println("Subject : " + sub);
    }
}
