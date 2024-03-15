public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Java Selenium");
        System.out.println(stringBuffer);

        System.out.println(stringBuffer.substring(10));

        System.out.println(stringBuffer.insert(4, "-"));
    }

    public synchronized void display(){
        System.out.println("hello");
    }
}

//Difference between String, StringBuilder and StringBuffer
//1. Mutability
//2. Way of Modification the object (String +, in SB we do cannot use +)
//3. (String: caoncate, SB-> appned())
//4. Synchronization: String and StringBuilder is not ThreadSafe. StringBuffer is ThreadSafe
//5. Data modification : String -> waste more memory, SB: optimised use of memory
//6. toUpperCase/toLowerCase()
//7. inset/delete

// I have a text "Java Selenium". Write a program and store the text in a String type variable
// and modify the text to "Java - Selenium".