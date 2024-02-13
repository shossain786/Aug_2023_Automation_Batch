package collectionframework.arraylist;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> books = new ArrayList<>();

        books.add("Java");
        books.add("Python");
        books.add("Perl");
        books.add("Groovy");
        books.add("PHP");

        ArrayList<String> books1 = new ArrayList<>();

        books1.add("Java");
        books1.add("Python");
        books1.add("Groovy");
        books1.add("Perl");
        books1.add("PHP");

        System.out.println(books);
        System.out.println(books.equals(books1));
//      traversing through an arraylist
//        Normal for loop
        System.out.println("Normal for loop: ");
        for (int i = 0; i < books.size(); i++)
            System.out.println(books.get(i));

//        Advanced/enhanced for loop
        System.out.println("Enhanced for loop: ");
        for (String book : books)
            System.out.println(book);

//        for Each loop
        System.out.println("For Each loop");

        books.forEach((n) -> System.out.println(n));
// advance use of foreach loop
        System.out.println("Advanced foreach loop");
        books.forEach(System.out::println);

        books.forEach((n) -> {
            System.out.println(n);
        });
    }
}
