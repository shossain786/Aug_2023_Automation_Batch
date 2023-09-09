package org.itest.tutorials;

public class Sample2 {

    String date = "30-Aug"; //non static memeber

    public static void main(String[] args) {  // static member
        Sample2 sample2 = new Sample2();
        Sample1 sample1 = new Sample1();


        System.out.println(sample2.date);
        sample1.displayClassName();

        sample1.printSubject();

        System.out.println("Subject is: " + sample1.subject);
        System.out.println(Sample1.subject);
    }


    public void printDate() {  //non-static memeber
        System.out.println(date);
    }
}
//object(non-static), ClassName(static)
//what are the ways to call a static member?
//two: within same class(both with/without ClassName), from different class(call with Class name)
///github
