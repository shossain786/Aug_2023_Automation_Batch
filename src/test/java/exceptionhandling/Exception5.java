package exceptionhandling;

import org.openqa.selenium.InvalidArgumentException;

public class Exception5 {
    public static void main(String[] args) {
        int result = 0;
        try {
            result = calculateDiv1(34, -3);
        } catch (ArithmeticException e ) {
            System.out.println(e.getMessage());
        } catch (InvalidArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println("Inside InvalidArgumentException");
        }
//        result = calculateDiv1(35, 0);
        System.out.println("Result: " + result);
    }

    public static int calculateDiv(int num1, int num2){
        int result = 0;
        try {
            result = num1/num2;
        }catch (ArithmeticException e){
//            System.out.println("Inside catch block");
        }
        return result;
    }

    public static int calculateDiv1(int num1, int num2) throws ArithmeticException, InvalidArgumentException {
        if (num2 == 0)
            throw new ArithmeticException("You can not divide any number with zero.");

        if (num2 < 0)
            throw new InvalidArgumentException("Please enter a positive number");

        System.out.println("Performing division operation");
        int result = 0;
        result = num1/num2;

        return result;
    }
}