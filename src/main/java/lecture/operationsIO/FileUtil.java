package lecture.operationsIO;

import java.io.*;

public class FileUtil {

    public String readFile(String path) {
        //        var fileReader = new FileReader("src/main/resources/input");
//        var bufferedReader = new BufferedReader(fileReader);
//        var stringBuilder = new StringBuilder();
//        String line;
//        while ((line = bufferedReader.readLine()) != null) {
//            stringBuilder.append(line);
//        }
//        return stringBuilder.toString();
//    }

        var stringBuilder = new StringBuilder();
        try (BufferedReader bf = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = bf.readLine()) != null) {
                stringBuilder.append(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return stringBuilder.toString();
    }


    // ta metoda poniżej ma zapisać dane do outputu - ZADANIE
//    public void writeFile(String path, String content) throws IOException {
//        var fileWriter = new FileWriter(path);
//        var bufferedWriter = new BufferedWriter(fileWriter);
//        bufferedWriter.write(content);
//        bufferedWriter.flush();

    public void writeFile(String path, String content) {
        BufferedWriter bufferedWriter;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(path));
            bufferedWriter.write(content);
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
