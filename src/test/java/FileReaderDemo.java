import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReaderDemo{
    public static void main(String[] args) throws IOException {
//        String filePath = "C:\\Users\\Admin\\OneDrive\\Desktop\\hello.txt";
        String filePath = "C:/Users/Admin/OneDrive/Desktop/hello.txt";
//        readFileUsingBufferedReader(filePath);
//        readWithFileReader(filePath);
        readWithFileReader(filePath);
    }

    static void readCompleteFile(String filePath) throws IOException {
        System.out.println(Files.readString(Paths.get(filePath)));
    }

    static void readWithFileReader(String path) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
    }

    static void readFileUsingBufferedReader(String filePath) throws IOException {
//        File file = new File(filePath);
//        FileInputStream fileInputStream = new FileInputStream(new File(filePath));
//        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(new File(filePath)));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(new File(filePath))));
        String line;
//
        while ((line = bufferedReader.readLine()) != null) {
            if (line.contains("Sandy"))
                System.out.println(line);
        }
        System.out.println("------------------------------");

        while ((line = bufferedReader.readLine()) != null && line.contains("Sandy")) {
            System.out.println(line);
        }
    }
}
