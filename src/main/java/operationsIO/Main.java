package operationsIO;

import java.io.*;
import java.nio.CharBuffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        path();
//        buffer();
//       bufferedReader();
//       fileReader();
//       fileInputStream();
    }


    private static void path() throws IOException {
        Path path = Paths.get("src/main/resources/channelFile");
        if(!Files.exists(path))
            Files.createFile(path);
        Files.write(path, "Bartek".getBytes(), StandardOpenOption.WRITE);
    }


    // Buffer = Bufor
    private static void buffer() {
        CharBuffer charBuffer = CharBuffer.allocate(6);
        String name = "Bartek";

        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            charBuffer.put(c);
        }
        System.out.println(Arrays.toString(charBuffer.array()));
    }


    private static void bufferedReader() throws IOException {
        var fileReader = new FileReader("src/main/resources/input");
        var bufferedReader = new BufferedReader(fileReader);

        var fileWriter = new FileWriter("src/main/resources/output.txt");
        var bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write("Hello");

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            bufferedWriter.write(line);
            System.out.println(line);
        }
    }


    private static void fileReader() throws IOException {
        var fileReader = new FileReader("src/main/resources/input");
        var fileWriter = new FileWriter("src/main/resources/output");

        int i;
        while ((i = fileReader.read()) != -1) {
            fileWriter.write(i);
            System.out.println((char) i);
        }
        System.out.println((char) fileReader.read());
    }


    private static void fileInputStream() throws IOException {
        // musi zawierać ścieżkę do jakiegoś pliku
        FileInputStream fileInputStream = new FileInputStream("src/main/resources/input");
        FileOutputStream fileOutputStream = new FileOutputStream("src/main/resources/output");
//        System.out.println(fileInputStream.available());
//
//        int i = fileInputStream.read();
//        int i1 = fileInputStream.read();
//        char c = (char) i;
//        char c1 = (char) i1;
//
//        // poniżej:
//        // najpierw coś sobie czytam, zapisuje do zmiennej 'i', int'a zmieniam na char'a (rzutuje go), i chara printuje
//
//        System.out.println(c);
//        System.out.println(c1);
//        int i2 = fileInputStream.read();
//        System.out.println(i2);

//        int i = fileInputStream.read();
//        while (i != -1) {
//            System.out.println(i);
//            i = fileInputStream.read();
//    }


        int i;
        while ((i = fileInputStream.read()) != -1) {
            System.out.println(i);
            fileOutputStream.write(i);
        }


    }
}
