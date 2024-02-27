package mapinterface;

import java.util.HashMap;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
//        HashMap<ArrayList, WebDriver> hashMap1 = new HashMap<>();

        hashMap.put(10, "Java");
        hashMap.put(20, "Python");
        hashMap.put(15, "C Sharp");
        hashMap.put(9, "Perl");
        hashMap.put(20, "Selenium"); //key is duplicate
        hashMap.put(5, "Perl"); //data is duplicate with different key
        hashMap.put(null, "R");
        hashMap.put(null, null);
        hashMap.put(1, null);

        System.out.println(hashMap);

        System.out.println(hashMap.get(15));

        treeMapDemo();
    }

    public static void treeMapDemo() {
        TreeMap<String, String> treeMap = new TreeMap<>();


        treeMap.put("key3", "UK");
        treeMap.put("key4", "USA");
        treeMap.put("key5", "Srilanka");
        treeMap.put("key1", "India");
        treeMap.put("key2", "US");

        System.out.println(treeMap);
        System.out.println(treeMap.get("0"));
    }
}
