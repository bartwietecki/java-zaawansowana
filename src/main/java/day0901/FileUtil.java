package day0901;

import java.io.*;

public class FileUtil {

    public String readFile(String path) throws IOException {
        var fileReader = new FileReader("src/main/resources/input");
        var bufferedReader = new BufferedReader(fileReader);
        var stringBuilder = new StringBuilder();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            stringBuilder.append(line);
        }
        return stringBuilder.toString();
    }

    public void writeFile(String path, String content){
// ta metoda ma zapisać dane do outputu
    }

}
