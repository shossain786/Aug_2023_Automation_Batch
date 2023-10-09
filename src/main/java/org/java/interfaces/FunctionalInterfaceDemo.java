 package org.java.interfaces;

@FunctionalInterface
interface A {
    void display(String java);
}

/*class B implements 0000A {
    @Override
    public void display() {
        System.out.println("Hello World!");
    }
}*/

public class FunctionalInterfaceDemo {
//    normal use
/*    public static void main(String[] args) {
        A obj = new B();
        obj.display();
    }*/

//    with commenting out the Class B we created. And defining an Inner Class
/*    public static void main(String[] args) {
        A obj = new A() {
            public void display() {
                System.out.println("Hello World! From inner Class");
            }
        };
        obj.display();
    }*/
//    To simplify more of above implementation we can remove new A() --> as Java know it already
//    From above class the format of writing/completing a statement like new A() java already know.
//    So we do not need it to write. again writing method name also Java know how to complete the syntax
//    so once again we do not need to write the method signature. we need to focus only on method logic/body.
    public static void main(String[] args) {
        A obj = (String java) -> System.out.println("Hello World! From inner Class");
        obj.display("Java");
    }
}
