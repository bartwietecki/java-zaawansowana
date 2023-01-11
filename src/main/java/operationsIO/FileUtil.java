package operationsIO;

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

// ta metoda poniżej ma zapisać dane do outputu - ZADANIE
    public void writeFile(String path, String content) throws IOException {
        var fileWriter = new FileWriter(path);
        var bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(content);
        bufferedWriter.flush();
    }

}
