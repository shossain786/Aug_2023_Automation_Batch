package org.java.randomcode;

public class ConditionalStatement1 {

    static void printName(String name) {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        printAge(20);
        printCountry("India");
        printName("Saddam");
    }
    static void printCountry(String country) {
        System.out.println("Country: " + country);
    }
    static void printAge(int age) {
        if (age < 0) {
            System.out.println("Please enter valid age. It can not be negative");
            return;
        }
        System.out.println("Age: " + age);
    }
}