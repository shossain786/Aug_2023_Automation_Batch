package org.java.inheritance;

public class PolymorphismClass {
    public static void main(String[] args) {
        Polymorphisom1 obj = new Polymorphisom1();
        obj.method1();
        obj.method1("Java");
        obj.method1(20, "Selenium");
    }
}
class Polymorphisom1{
    void method1() {
        System.out.println("Inside method1");
    }
    void method1(String str) {
        System.out.println("Inside another method1");
    }
    void method1(int num) {
        int num1;
        System.out.println("Inside method1");
    }
    void method1(int num, String str) {
        System.out.println("Inside method1");
    }
}

// Polymorphism:
//    Compile-time polymorphism(also known as static polymorphism, method overloading, static binding, early binding) -->
//method are in same class, methods signature are different
//    Run-time polymorphism(also known as dynamic polymorphism, method overriding, dynamic binding, late binding)
