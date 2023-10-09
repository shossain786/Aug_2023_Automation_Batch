package org.java.interfaces;

public class SuzukiVitara implements  Car{
    @Override
    public void start() {
        System.out.println("Suzuki Vitara Started Successfully!");
    }

    @Override
    public void run() {
        System.out.println("Suzuki Vitara running!");
    }

    @Override
    public void stop() {
        System.out.println("Suzuki Vitara Stopped Successfully!");
    }

    public void hornModel() {
        System.out.println("Horn Model: EXOME!");
    }
}
