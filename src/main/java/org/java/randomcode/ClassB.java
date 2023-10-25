package org.java.randomcode;

public class ClassB {
    public static void main(String[] args) {
        ClassA objA = new ClassA();
        objA.method1();
        objA.method3();
        objA.method4();

        objA.num2 = 10;
//        objA.sceretKey = "rwerwer";
        System.out.println(objA.num2);
    }
}
