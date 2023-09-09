package org.itest.tutorials;

public class StringHandling {
    public static void main(String[] args) {
//        String subject = "Java";
//        System.out.println(subject);
//
//        subject = subject.concat(" Program");
//        System.out.println(subject);
//
        String str1 = "Java";
        String str2 = "Java";

        System.out.println(str1.equals(str2));

        String str3 = new String("Java");
        String str4 = new String("Java");

//        System.out.println(str3.equals(str4));
//        System.out.println(str1.equals(str4));

        System.out.println(str1 == str2);
        System.out.println(str3 == str4);

        System.out.println(str1 == str3);

    }
}
//StringBuffer, StringBuilder
// equals() --> it checks the content of the objects
// '=='(comparator operator) --> it verify if the objects are same
// '==='