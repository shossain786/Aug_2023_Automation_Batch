package collectionframework.arraylist;

import java.util.*;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<>();
        countries.add("India");
        countries.add("Nepal");
        countries.add("US");
        countries.add("Canada");

        System.out.println(countries);

//        countries.clear();
//        System.out.println(countries);
//      isEmpty() method is used to check whether an arrayList contains any data or not
//        it returns true/false. If arraylist is empty then it return true.
        System.out.println(countries.isEmpty());
        System.out.println("------------------------");

//        Traversing through an arraylist using iterator
        Iterator<String> iterator = countries.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

//      Using spliterator
        System.out.println("Spliterator using");
        Spliterator<String> spliterator = countries.spliterator();
        spliterator.forEachRemaining(System.out::println);

        List<String> newCountries = countries.subList(1, 3);
        System.out.println(newCountries);

        System.out.println(countries.indexOf("Canada"));

//      Convert an arraylist to an Array
        Object[] countryArray = countries.toArray();
        System.out.println(Arrays.toString(countryArray));

        countries.remove("US");

        System.out.println(countries);

        System.out.println(countries.contains("Russia"));
//        Sorting an arraylist
        Collections.sort(countries);
        System.out.println(countries);
    }
}
// ArrayList maintain the insertion order
//