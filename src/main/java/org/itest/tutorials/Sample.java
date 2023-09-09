package org.itest.tutorials;

public class Sample {

    static String subject = "Java";

    int size = 100; //global/class/instance variable

    int age = 20;

    int addition(int num1, int num2){
        int result = num1 + num2;
        return result;
    }

    void display(){
        String name = "Selenium"; //local variable
        System.out.println(name);
        System.out.println(size);
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Sample object = new Sample();
        object.printAddress();
//        System.out.println(age);
    }

    void printAddress() {
        System.out.println("Address---");
        printName();
        printSubject();
    }

    static void printSubject(){
        System.out.println(subject);
        Sample object = new Sample();
        object.printAddress();
    }

    void printName() {
     //   System.out.println(name);
        System.out.println(size);
    }
}
