package org.java.randomcode;

import org.testng.annotations.Test;

public class NumberOperations {
    @Test
    public void checkPrime() {
        int number = 47;
        if (number < 3)
            System.out.println( number + " is a prime number!");
        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0)
                System.out.println(number + " is a prime number!");
        }
        System.out.println(number + " is not a prime number!");
    }

    @Test
    public void reverseANumber() {
        int number = 2430461;
        int reversed = 0;
        while (number != 0) {
            reversed = reversed * 10 + number % 10;
            number = number / 10;
        }
        System.out.println(reversed);
    }
}
