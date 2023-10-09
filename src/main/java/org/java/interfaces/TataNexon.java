package org.java.interfaces;

public class TataNexon extends Vehicles implements Car{
    @Override
    public void start() {
        System.out.println("Tata Nexon Started Successfully!");
    }

    @Override
    public void run() {
        System.out.println("Tata Nexon running!");
    }

    @Override
    public void stop() {
        System.out.println("Tata Nexon Stoped Successfully!");
    }

    public void hornModel() {
        System.out.println("Horn Model: Autologius wintone!");
    }
}
