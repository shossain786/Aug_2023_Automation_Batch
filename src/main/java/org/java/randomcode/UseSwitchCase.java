package org.java.randomcode;

public class UseSwitchCase {
    public static void main(String[] args) {
        printSubject("CSE 2Year");
    }

    static void printSubject(String className) {
        //java 1.1
        if (className.equals("CSE 1Year"))
            System.out.println("C, Math, Phy...");
        else if (className.equals("CSE 2Year"))
            System.out.println("C++, Math, Phy...");
        else if (className.equals("CSE Year")) {
            System.out.println("Java, Math, Phy...");
        } else
            System.out.println("Please provide a correct className");

// Java 1.5
        switch (className){
            case "CSE 1Year":
                System.out.println("C, Math, Phy...");
                break;
            case "CSE 2Year":
                System.out.println("C++, Math, Phy...");
                break;
            case "CSE 3Year":
                System.out.println("Java, Math, Phy...");
                break;
            default:
                System.out.println("Please provide a correct className");
        }
    }
}
/*
Write a Java program to print subject of a class.
Java 8 --> Based on(most reliable version)
Java 11 (another most stable/reliable version)
Latest Java -> 21
*/
//HP AML/HP QTC(UFT) --> Test Management tool
// Jira (Project Management Tool)
/*
Developing test: (For Automation)IntelliJ/Eclipse (for Manual: Excel sheet)
Storing test cases: GitHub
Managing the tests: Jira/TestRail
*/