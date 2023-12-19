package exceptionhandling;

import java.util.Arrays;

public class Exception2 {
    public static void main(String[] args) {
        String[] employees = {"Sandy", "Mandeep", "Saddam"};
        int[] nums = {12, 10, 30, 35};
        int[] dividers = {2, 0, 10, 5};

        printMessage("Java");

        printDivOfNumbers(nums, dividers);

        printMessage1(employees);
    }

    static void printDivOfNumbers(int[] nums, int[] divs) {
        int length = nums.length;
        for (int i = 0; i < length; i++){
            try {
                System.out.println(nums[i]/divs[i]);
            }catch (ArithmeticException exception){
                System.out.println(exception.getMessage());
                exception.printStackTrace();
                System.out.println("You can not divide any number with zero!");
            }
        }
    }
    static void printMessage(String... nameArray){
        System.out.println(Arrays.toString(nameArray));
    }

    static void printMessage1(String[] nameArray){
        for (String name : nameArray)
            System.out.println(name);
    }
}
