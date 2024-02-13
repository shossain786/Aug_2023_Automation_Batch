package collectionframework.arraylist;

import java.util.ArrayList;
public class ArrayListDemo {
   static String[] students = new String[4];
   static int[] nums = new int[4];
    public static void main(String[] args) {
//        ArrayList employees;

        ArrayList<String> companies = new ArrayList<String>();

//        to get the size of the arraylist we have to use size()
        System.out.println(companies.size());

        int count = 0;
        while (count < 10) {
            companies.add("Company" + count);
            count++;
        }
        System.out.println(companies);
        System.out.println(companies.size());
        companies.add(3, "TCS");
        System.out.println(companies);
    }
}
