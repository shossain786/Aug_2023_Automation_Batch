package org.java.randomcode;

public class ConditionalStatement2 {
    public static void main(String[] args) {
        printGrade(-10);
    }

    static void printGrade(int number) {
        if (number < 30 && number >= 0){
            System.out.println("Failed! Your number is: " + number);
        } else if (number >=30 && number < 60) {
            System.out.println("Grade is C! Your number is: " + number);
        } else if (number >=60 && number < 69) {
            System.out.println("Grade is B! Your number is: " + number);
        } else if (number >=70 && number < 79) {
            System.out.println("Grade is B+! Your number is: " + number);
        } else if (number >=80 && number < 89) {
            System.out.println("Grade is A! Your number is: " + number);
        } else if (number >=90 && number <= 100) {
            System.out.println("Grade is A+! Your number is: " + number);
        } else {
            System.out.println("You have entered a invalid number! Please recheck.");
        }

        System.out.println("Grade find successfully!");
    }
}
