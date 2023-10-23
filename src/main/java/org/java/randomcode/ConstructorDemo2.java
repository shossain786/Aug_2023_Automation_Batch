package org.java.randomcode;

public class ConstructorDemo2 {
    public static void main(String[] args) {
        CalculatorA obj = new CalculatorA(18, 5);
        CalculatorA obj1 = new CalculatorA("Java", 5);
        System.out.println(obj.sumOfNumbers());
        System.out.println(obj.subtractionOfNumbers());
    }
}

class CalculatorA {
    int num1;
    int num2;
    // parameterized constructor
    // this keyword: refer to the current class object
    public CalculatorA() {
        num1 = 0;
        num2 = 0;
    }

    public CalculatorA(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public CalculatorA(String str, int num2) {
//        this.num1 = num1;
        this.num2 = num2;
    }
    public CalculatorA(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int sumOfNumbers() {
        return num1 + num2;
    }
    public int subtractionOfNumbers() {
        return num1 - num2;
    }
}