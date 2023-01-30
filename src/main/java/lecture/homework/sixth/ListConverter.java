package lecture.homework.sixth;

import java.util.ArrayList;
import java.util.List;

public class ListConverter {
    public static void main(String[] args) {

        // ZADANIE WYKONANE ALGORYTMICZNIE

        List<String> stringList = new ArrayList<>();
        stringList.add("1");
        stringList.add("2");
        stringList.add("3");

        // ...




        // ZADANIE WYKONANE NA STREAMACH

        /*
        List<String> stringList1 = new ArrayList<>();
        stringList1.add("1");
        stringList1.add("2");
        stringList1.add("3");
        stringList1.add("4");
        stringList1.add("5");

        System.out.println(stringList1);

        List<Integer> integersList = stringList1.stream().map(Integer::parseInt).collect(Collectors.toList());

        for (Integer integerNumber : integersList) {
            System.out.println(integerNumber);
        }

         */
    }
}
