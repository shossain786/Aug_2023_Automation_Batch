package org.java.randomcode;

public class ConstructorDemo {

    public ConstructorDemo() {
        System.out.println("Inside Constructor");
    }
    int a = 10;
    public static void main(String[] args) {
        ConstructorDemo obj = new ConstructorDemo();
        System.out.println(obj.a);
    }
}