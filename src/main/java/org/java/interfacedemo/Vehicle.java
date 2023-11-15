package org.java.interfacedemo;

public interface Vehicle {
    int MAXSPEED = 250;

//    public static final int maxspeed = 200;
    void move();

    void makeSound();
}
//inside interface, we can have variables and methods
// by default all variable in interface are 'public static final'
// by default all methods in an interface are public
// all final variable are recommend to write as all in caps char
