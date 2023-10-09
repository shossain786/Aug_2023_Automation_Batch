package org.java.interfaces;

@FunctionalInterface
interface A1 {
    void display(String name);
}

public class FuncInterfaceDemo2 {
/*    public static void main(String[] args) {
        A obj = (String name) -> System.out.println("Hello from Demo2 " + name);
        obj.display("Java");
    }*/
//    Again for the above implementation (String name) is something java can do for us.
//    So we can simple fied it like below
/*    public static void main(String[] args) {
        A obj = (name) -> System.out.println("Hello from Demo2 " + name);
        obj.display("Java2");
    }*/
//    This can be simplified to below structure if we have only one parameter in signature
//    we can avoid using the parenthesis
    public static void main(String[] args) {
        A obj = name -> System.out.println("Hello from Demo2 " + name);
        obj.display("Java3");
    }
}
