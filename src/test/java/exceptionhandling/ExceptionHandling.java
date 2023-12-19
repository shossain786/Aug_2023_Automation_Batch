package exceptionhandling;

public class ExceptionHandling {
    public static void main(String[] args) {
        int a =105;
        int b = 0;
        printDiv(a, b);
    }

    static void printDiv(int num1, int num2){
        int result = 0;
        int sum = num1 + num2;
        try {
            result = num1/num2;
        } catch (ArithmeticException e){
            System.out.println("Exception occurred");
        }

        System.out.println(result);
        System.out.println("Sum of the number: " + sum);
    }
}
//hierarchy of exception