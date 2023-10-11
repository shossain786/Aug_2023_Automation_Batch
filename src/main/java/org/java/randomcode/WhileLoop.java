package org.java.randomcode;

public class WhileLoop {
    public static void main(String[] args) {
        //Print number from 0 to 10;

        int num = 0;

        while (num <=10) {
            System.out.println(num);
            num++;
        }
        String[] subjects = {"Java", "Python", "C", "C++", "R", "Ruby"};
        boolean flag = true;

        int i =0;

        while (flag){
            if (subjects[i].equals("C")) {
                System.out.println(subjects[i]);
                flag = false;
            } else
                System.out.println(subjects[i]);
            i++;
        }
        for (String sub : subjects) {
            if (sub.equals("C++"))
                break;
            System.out.println(sub);
        }

        for (String sub : subjects){
            if (sub.equals("C++"))
                continue;

            System.out.println(sub);
        }

        System.out.println("Completed the execution!");
    }
}
