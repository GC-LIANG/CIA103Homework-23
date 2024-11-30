package HW7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Q1 {
    public static void main(String[] args) {
        String filePath = "src/HW7/Sample.txt";

        try {
            byte[] fileBytes = Files.readAllBytes(Paths.get(filePath));
            String content = new String(fileBytes);
            long byteCount = fileBytes.length;
            long charCount = content.length();
            long lineCount = Files.lines(Paths.get(filePath)).count();

            System.out.println("Sample.txt檔案共有" + byteCount + "個位元組," + charCount + "個字元," + lineCount + "列資料");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}