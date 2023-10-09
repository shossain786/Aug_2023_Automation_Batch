package org.java.interfaces;

interface Phone {
    void call();
    default void message() {
        System.out.println("Message sent Successfully!!");
    }
}

class Android implements Phone {
    @Override
    public void call() {
        System.out.println("Calling from Android!!!!");
    }
}

class Iphone implements Phone {
    @Override
    public void call() {
        System.out.println("Calling from Iphone!!!!");
    }
}

public class InterfacePractice1 {
    public static void main(String[] args) {
        Android android = new Android();
        android.call();
        android.message();

        Iphone iphone = new Iphone();
        iphone.call();
        iphone.message();
    }
}
