public class StringBuilderDemo {
    public static void main(String[] args) {
        String str = new String("Java Selenium");
        StringBuilder stringBuilder = new StringBuilder("Java Selenium");

        str = str.concat(" Tutorial Class");

        stringBuilder.append(" Tutorial Class");

        System.out.println(str);
        System.out.println(stringBuilder);

        System.out.println(stringBuilder.substring(2, 10));
        System.out.println(stringBuilder.substring(10));

        System.out.println(stringBuilder.indexOf("a"));
        System.out.println(stringBuilder.indexOf("a", stringBuilder.indexOf("Selenium") + 8));

        System.out.println(stringBuilder.lastIndexOf("a"));


        System.out.println(str.replace("Java", "Python"));

        System.out.println(stringBuilder.replace(0, 4, "Python"));
        System.out.println(stringBuilder.charAt(16));
    }
}

// I have a text "Java Selenium Tutorial Class".
// 1. Write a program to print the unique characters in the text.
// 2. Also find out the number of occurrence of all the characters and store them in a map with key as
//  character name and value as number of occurrence. [output: a = 4]
// ignore the case sensitiveness