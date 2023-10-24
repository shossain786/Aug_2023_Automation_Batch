package org.java.randomcode;

public class StaticClassDemo {

    static String str = "Hello";

    static {
        String sub = "Java";
        System.out.println(str + " Welcome to "+ sub + " Programming!");
    }

    {
        System.out.println(str + " Inside static block1");
    }
    public static void main(String[] args) {
        System.out.println("Inside main method!!");
        StaticClassDemo obj = new StaticClassDemo();
    }

    {
        System.out.println(str + " Inside static block2");
    }

    static {
        System.out.println("Inside another static block!!!!!!!!!!!!!!!");
    }
}
