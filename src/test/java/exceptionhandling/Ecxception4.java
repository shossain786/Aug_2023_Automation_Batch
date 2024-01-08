package exceptionhandling;

public class Ecxception4 {
    public static void main(String[] args) {
        final int num = 16;
        int num2 = 0;
        int result = 0;

        try {
            System.out.println("Inside try block");
            result = num/num2;
        } catch (ArithmeticException e){
            System.out.println("Inside catch block");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Inside finally block");
        }
// final, finally, finalize(it is being used with garbage collection)
        System.out.println("Result: " + result);

        try {
        } finally {
        }
    }
    final void printName(){
        System.out.println("Hello");
    }
}

final class ClassA{
    // methods...
}
//throws, thrown