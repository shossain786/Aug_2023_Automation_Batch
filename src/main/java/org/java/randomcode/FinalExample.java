package org.java.randomcode;

public class FinalExample {
    protected int num1  = 20;
    final protected int num2 = 30;
    public static void main(String[] args) {
        FinalExample obj = new FinalExample();
        obj.num1 = 25;

        System.out.println(obj.num1);
        System.out.println(obj.num2);
    }

//    once a method is declared as final it can not be overridden
    final void displayName() {
        System.out.println("Inside display method!");
    }
}

class FinalEx2 {
    public void greetings(){
        System.out.println("Hello World!");
    }
}