package demo;

import org.java.randomcode.ClassA;
import org.java.randomcode.FinalExample;

public class ClassG extends FinalExample {
    public static void main(String[] args) {
        ClassG obj = new ClassG();
        obj.num1 = 45;
//        obj.num2 = 50; not allowed
        System.out.println(obj.num1);
        System.out.println(obj.num2);
    }
}
