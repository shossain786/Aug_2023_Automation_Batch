package org.java.randomcode;

public class Operators {
    public static void main(String[] args) {
        int num = 10;

        if (num > 0 && num < 100)
            System.out.println("inside if");

        if (num > 20 || num > 100)
            System.out.println("Inside 2nd if");

        if (!(num < 0)){
            System.out.println("inside not");
        }

        if (!(num < 0) && num>100){
            System.out.println("inside not");
        }
    }
}

// And --> &&  A*B
// OR --> ||   A+B
// NOT --> ! (always used on true/false)
/// not true --> false
/// not false --> true