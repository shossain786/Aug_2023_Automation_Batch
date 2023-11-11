package org.java.inheritance;

public class InterfaceClass4 extends Parent6{
    int num1;
    public static void main(String[] args) {
        InterfaceClass4 obj = new InterfaceClass4();

    }

    void printValue() {
        this.num1 = 15;
        super.num1 = 10;
    }

}

class Parent6{
    int num1;
}


class Parent5{
    int num1;
    public Parent5(int num1) {
        this.num1 = num1;
    }
}