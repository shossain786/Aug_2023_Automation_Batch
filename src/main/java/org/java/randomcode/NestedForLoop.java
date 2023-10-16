package org.java.randomcode;

public class NestedForLoop {
    public static void main(String[] args) {
        boolean flag = false;
        for (int i = 0; i<5; i++) { // 1st iteration i = 0 // outer for loop
            for (int j = 0; j < 5; j++) {                   // inner for loop
                if (j == 1)
                    break;

                if(i == 3 && j == 3){
                    flag = true;
                    break;
                }

                if(i != j)
                    System.out.println(i + "," + j);

               /* if (i == j)
                    continue;
                else
                    System.out.println(i + "," + j);*/
            }
            if (flag)
                break;

           /* int i, j;
            for(i=0; i<10; i++) {
                for(j=i; j<10; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }*/
        }
    }
}

//continue, break
//continue: by-pass/skip
//break: related to loops
// if i == j then skip
// if i != j then print
