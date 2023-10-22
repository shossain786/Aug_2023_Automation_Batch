package org.java.randomcode;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        String str = new String("");
//        declaration
        String[] sub;
        String subs[];
        String []subs1 = {"C", "C++", "C#"};
        int[] rollnumber = new int[3];
//        initialization:
        sub = new String[3];
        subs = new String[]{"Python", "Java", "Perl"};

        sub[2] = "Selenium"; //storing data in 3rd position
        sub[0] = "TestNG";
        sub[1] = "RestAssured";
// printing the content of the arrays
        System.out.println(Arrays.toString(sub));
        System.out.println(Arrays.toString(subs));
        System.out.println(Arrays.toString(subs1));
        System.out.println(Arrays.toString(rollnumber));

//
    }
}

//by default:
// for int: 0, String: null, bollean: false