package org.java.interfacedemo;

public class TataSumo implements Vehicle{
    @Override
    public void move() {
        System.out.println("Moving by TataSumo");
        System.out.println("My max speed: " + MAXSPEED);
//        Vehicle.MAXSPEED = 300; //not allowed as its by default final
    }

    @Override
    public void makeSound() {
        System.out.println("I am using TataSumo horn");
    }
}
