package org.java.abstractdemo;

public abstract class Animal {  // using abstract keyword in Class declaration
//    in this clas we can have implemented and un-implemented both type of methods

//    implemented method: it must has body with curly braces
    public void breathing() {
        System.out.println("I take O2 and release CO2");
    }

// abstract method: it has abstract keyword in method declaration and ending with semi-colon(;). It should not
//    have any-body
    public abstract void sound();

//    another implemented method
    public void move(){
        System.out.println("I can move!");
    }
}
// note: abstract class can have any number of implemented(concrete)/un-implemented methods
// abstract class can have all methods un-implemented or all methods implemented(but this is not recommended)
// once we define any class as abstract we can not create an object of the class.
// we can not use 'final' keyword in abstract class declaration
