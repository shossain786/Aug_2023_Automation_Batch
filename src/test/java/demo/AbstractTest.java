package demo;

import org.java.abstractdemo.Cat;
import org.java.abstractdemo.Dog;

public class AbstractTest {
    public static void main(String[] args) {
        Cat obj = new Cat();
        obj.breathing();
        obj.sound();
        obj.move();

        System.out.println(">>>>>>>>>>>>>>>>>>>");

        Dog dog = new Dog();
        dog.sound();
        dog.move();
    }
}
