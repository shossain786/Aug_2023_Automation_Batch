package org.java.interface2;

public class ClassB implements InterfaceC{
    @Override
    public void methodB() {
        System.out.println("Inside methodB from classB");
    }

    @Override
    public void methodB1() {
        System.out.println("Inside methodB1 from classB");
    }

    @Override
    public void methodC1() {
        System.out.println("Inside methodC1 from classB");
    }

    @Override
    public void methodC2() {
        System.out.println("Inside methodC2 from classB");
    }

    @Override
    public void methodC3() {
        System.out.println("Inside methodC3 from classB");
    }
}
