package org.java.inheritance;

public class GrandChild1 extends ChildClass {
    public static void main(String[] args) {
        displaySub();  //member of ChildClass
        greeting();     //member of a grandparent being treated as direct member of direct parent class
    }
}
