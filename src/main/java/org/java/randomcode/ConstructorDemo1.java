package org.java.randomcode;

public class ConstructorDemo1 {
    public static void main(String[] args) {
        Calculator obj = new Calculator(13, 8);
        System.out.println(obj.sumOfNumbers());
        System.out.println(obj.subtractionOfNumbers());
    }
}

class Calculator {
    int num1;
    int num2;
//parameterized constructor
    public Calculator(int _num1, int _num2) {
        num1 = _num1;
        num2 = _num2;
    }
    public int sumOfNumbers() {
        return num1 + num2;
    }
    public int subtractionOfNumbers() {
        return num1 - num2;
    }
}
