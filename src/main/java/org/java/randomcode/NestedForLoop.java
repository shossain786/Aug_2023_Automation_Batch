package org.java.randomcode;

public class NestedForLoop {
    public static void main(String[] args) {
//        for (int i = 0; i<5; i++) { // 1st iteration i = 0
            /*for (int j = 0; j < 5; j++) {
                System.out.println(i + "," + j);
            }*/
//
            int i, j;
            for(i=0; i<10; i++) {
                for(j=i; j<10; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
//    }
}
