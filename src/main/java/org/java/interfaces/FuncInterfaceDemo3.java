package org.java.interfaces;

interface C {
    int add(int a, int b);
}

public class FuncInterfaceDemo3 {
    public static void main(String[] args) {
       /* C obj = new C(){
            public int add(int a, int b) {
                return a+b;
            }
        };*/
//  To simplify the above code we can write it like
       /* C obj = (int a, int b) -> {
            return a+b;
        };*/
//        the abode can be simplified to below code
        /*C obj = (a, b) -> a+b;*/
//        this code can be simplified again to below code
        C obj = Integer::sum;
        int result = obj.add(23, 5);
        System.out.println("Sum: " + result);
    }
}
