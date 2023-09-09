package org.itest.tutorials;

import java.util.Arrays;

public class StringHandling1 {
    public static void main(String[] args) {
        String str1 = "--Mandeep-Sandy-Priya-Mandeep-Sandy-Priya-Mandeep-Sandy-Priya";

        System.out.println(str1.trim());
        String[] names = str1.split("-");
        System.out.println(Arrays.toString(names));
        for (String name : names)
            System.out.println(name);
        System.out.println(str1.contains("Sandy"));
        //to re-trieve a sub part of a String/text
        System.out.println(str1.substring(0));
        System.out.println(str1.substring(8,13));
    }
}
