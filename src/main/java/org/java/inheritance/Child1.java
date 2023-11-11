package org.java.inheritance;

public class Child1 extends Parent1{

    public Child1(){
        super(); // same as --> new Parent1();
        System.out.println("Hello from Child's Constructor");
    }

    public Child1(int num){
        System.out.println("Hello from Child's Constructor" + num);
    }

    public void hello() {
        System.out.println("Hello from Child1");
    }

    public void hello(String name) {
        System.out.println("Hello from Child1 " + name);
    }
}
// String str = "Java";
// String str = new String("Java");
//this--> current class
// super --> refes to parent