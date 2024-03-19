public class JavaDemo1 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 15;

        int temp = num1; // temp is holding 10
//
//        num1 = num2; //--> now Num1 is holding 15
//        num2 = temp; //--> now Num2 is holding 10

//        System.out.println("Num1 = " + num1 + " and Num2 = " + num2);

        num1 = num1 + num2; //--> num1 = 25
        num2 = num1 - num2; // num2 = 10
        num1 = num1 - num2;

        System.out.println("Num1 = " + num1 + " and Num2 = " + num2);

    }
}


/*

Write a program to swap two numbers.
input: int num1 = 10;
        int num2 = 15;
Output: int num2 = 10;
        int num1 = 15;

        Write a program to swap below strings with third variable and without using third variable
        String str1 = "Java"
        String str2 = "Python"
*/
