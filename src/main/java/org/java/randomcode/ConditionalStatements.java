package org.java.randomcode;

public class ConditionalStatements {

    public static void main(String[] args) {
        int num = 107; //find if it is a positive or negative
        int num1 = 32;

        printEvenOrOdd(num);
        printEvenOrOdd(num1);

      /*  if (num >= 0) {
            System.out.println(num + " is a positive number.");
        } else {
            System.out.println(num + " is a negative number.");
        }

        System.out.println(14 / 2);
        System.out.println(15 % 2);*/

    }

    public static void printEvenOrOdd(int number) {
        if (number % 2 == 0)
            System.out.println(number + " is even");
        else
            System.out.println(number + " is odd");
    }
}
/*
if-else

if -standalone can be used
multilevel if-else

divider, dividend, quotient, reminder?0->even
divide--> /(quotient), % (reminder)
*/
