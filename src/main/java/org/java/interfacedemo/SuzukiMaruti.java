package org.java.interfacedemo;

public class SuzukiMaruti implements Vehicle{
    @Override
    public void move() {
        System.out.println("Moving from Suzuki Maruti");
        System.out.println("My max speed: " + MAXSPEED);
    }

    @Override
    public void makeSound() {
        System.out.println("Horn using suziki company");
    }
}
