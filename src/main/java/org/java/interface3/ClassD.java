package org.java.interface3;

public class ClassD implements InterfaceD, InterfaceE{
    @Override
    public void methodD() {
        System.out.println("Inside methodD from classD");
    }

    @Override
    public void methodE() {
        System.out.println("Inside methodE from classD");
    }
}

//Java new features of Java8
// usage of extends and implements keywords
// default, static method
// Upcasting class object ref