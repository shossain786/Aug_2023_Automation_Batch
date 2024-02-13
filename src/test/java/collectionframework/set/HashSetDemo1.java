package collectionframework.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {
    public static void main(String[] args) {
        HashSet<String> companies = new HashSet<>();
//        printing default data from a hashSet
        System.out.println(companies);

        companies.add("IBM");
        companies.add("TCS");
        companies.add("IBM");
        companies.add("CTS");
        companies.add("Oracle");

        System.out.println(companies);
        System.out.println(companies.size());

//        traversing through a HashSet
        System.out.println("Using for enhanced for loop");
        for (String company : companies)
            System.out.println(company);

//        using for each loop
        System.out.println("Using for each loop");
        companies.forEach((n) -> System.out.println(n));

//        by using iterator
        System.out.println("Using for iterator!");

        Iterator iterator = companies.iterator();

        while (iterator.hasNext())
            System.out.println(iterator.next());

        companies.add(null);
        System.out.println(companies);

        companies.add("");
        System.out.println(companies);

    }
}
// duplicate entry not allowed
// insertion order not maintained
// What/how to store data in a container so that duplicate entry can be avoided?
// How to fetch data from a HashSet?
// How to traverse through a HashSet?
// How to add/delete/remove data in/from a HashSet?
// Can we store null value in a HashSet? -[Yes, we can store null value in HashSet]
// Does HashSet allow to store empty String? - [Yes, we can store empty String in HashSet]
// What is the default data/value in HashSet/ArrayList? - it store emptyList
// When should we/you go with the HashSet? [When the requirement is to ignore the duplicate entry]
// When we/you should not go with the HashSet? [When the requirement is to allow the duplicate entry]