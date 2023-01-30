package lecture.homework.seventh;

import java.util.ArrayList;
import java.util.List;

public class UniqueElements {
    public static void main(String[] args) {

        // ZADANIE WYKONANE ALGORYTMICZNIE

        List<Integer> values1 = new ArrayList<>();

        values1.add(10);
        values1.add(11);
        values1.add(10);
        values1.add(11);
        values1.add(12);
        values1.add(11);

        // ...


        // ZADANIE WYKONANE NA STREAMACH

        List<Integer> values = new ArrayList<>();

        values.add(10);
        values.add(11);
        values.add(10);
        values.add(11);
        values.add(12);
        values.add(11);

        // wszystkie elementy listy
        for (Integer i : values) {
            System.out.println(i);
        }

        System.out.println();

        // tylko unikalne elementy listy
        values.stream().distinct().forEach(System.out::println);

    }

}
