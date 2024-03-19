import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo {
    public static void main(String[] args) throws IOException {
        String filePath = System.getProperty("user.dir")+ "/downloads/new_text.txt";
        FileWriter fileWriter = new FileWriter(filePath);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("Mandeep is like an angry bird today!");
//
        bufferedWriter.flush(); //java
//        bufferedWriter.close();
    }
}
