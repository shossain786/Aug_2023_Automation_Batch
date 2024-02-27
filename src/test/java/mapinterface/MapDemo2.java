package mapinterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(10, "Java");
        hashMap.put(20, "Python");
        hashMap.put(15, "C Sharp");
        hashMap.put(9, "Perl");
        hashMap.put(20, "Selenium"); //key is duplicate
        hashMap.put(5, "Perl"); //data is duplicate with different key
        hashMap.put(1, null);

        Set<Integer> keys = hashMap.keySet(); //returns list of keys from the HashMap in Set format
//        Set values  = (Set) hashMap.values(); //returns list of Values from the HashMap in Set format
        System.out.println(keys);
//        for -> by suing indexing(we can not use it for iterating over a map directly)
//        for -> advance/enhanced for loop
//        forEach loop
//        iterator

        for (int key : keys){
            System.out.println("Key:" + key + " and value: " + hashMap.get(key));
        }

        System.out.println("--------------------------------");

        Iterator<Integer> iterator = hashMap.keySet().iterator();
        while (iterator.hasNext()) {
            int key = iterator.next();
            System.out.println(key + ": " + hashMap.get(key));
        }
        System.out.println("--------------------------------");
        hashMap.forEach((key, value) -> System.out.println(key + ": " + value)); //single line approach

        System.out.println("------------------------------->>");
        hashMap.forEach((key, value) -> {    //multiple line approach
            System.out.println(key + ": " + value);
        });

        System.out.println("------------------------------->>");
       for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
           System.out.println(entry.getKey() + ": " + entry.getValue());
       }

        System.out.println("------------------------------->>");

       Iterator itr = hashMap.entrySet().iterator();
       while (itr.hasNext()) {
          Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>) itr.next();
           System.out.println(entry.getKey() + ":" + entry.getValue());
       }

    }
}
//we can not directly use for loop/iterator over the Map classes for traversing, instead we need to convert
//map classes to Set classes.
