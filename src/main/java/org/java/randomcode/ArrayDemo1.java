package org.java.randomcode;

import java.util.Arrays;

public class ArrayDemo1 {
    public static void main(String[] args) {
        String[] subs = {"Java", "C", "Perl", "Python"};
        System.out.println("length of the array: " + subs.length);
        int length = subs.length;
        System.out.println("Last position data: " + subs[length-1]);

//        fetching data
        System.out.println(subs[1]);
        System.out.println(subs[3]);
//        Replacing data
        subs[2] = "C#";
        System.out.println(Arrays.toString(subs));
        System.out.println(subs[2]);
        System.out.println("====================================");
// traversing the array
        for (int i = 0; i < subs.length; i++) {
            System.out.println(subs[i]);
        }
//        trying to increase/modify the length of the array
//        subs[7] = "Physics";
        System.out.println(subs[5]);
    }
}
