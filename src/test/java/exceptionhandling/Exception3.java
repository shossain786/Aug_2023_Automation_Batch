package exceptionhandling;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Exception3 {
    public static void main(String[] args) {
        String[] employees = {"Sandy", "Mandeep", "Saddam"};
        int[] nums = {12, 10, 30, 35};
        int[] dividers = {2, 4, 0, 5};

        printMessage("Java");

        printDivOfNumbers(nums, dividers);

        printMessage1(employees);
    }

    static void printDivOfNumbers(int[] nums, int[] divs) {
        int length = nums.length;
        for (int i = 0; i < length; i++){
            try {
                System.out.println(nums[i]/divs[i]);
            } catch (ArithmeticException e){}catch (Exception e) {
                System.out.println("Inside main exception");
            }
        }
    }
    static void printMessage(String... nameArray){
        System.out.println(Arrays.toString(nameArray));
    }

    static void printMessage1(String[] nameArray){
        try {
            for (String name : nameArray)
                System.out.println(name);
        } catch (NoSuchFieldError e){} catch (ArithmeticException e){

        }
    }
}
