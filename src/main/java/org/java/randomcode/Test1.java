package org.java.randomcode;

public class Test1 {
    public static void main(String[] args) {
        Test2 obj = new Test2();


        String str = obj.getSub();
//
        System.out.println(str);
    }
}


class Test2{
    public String getSub() {
        return "Java";
    }
}
