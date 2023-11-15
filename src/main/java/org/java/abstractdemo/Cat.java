package org.java.abstractdemo;

public class Cat extends Animal{

    public static final String color = "Red";
    @Override
    public void sound() {
        System.out.println("I sound like: Meow");
    }
}
