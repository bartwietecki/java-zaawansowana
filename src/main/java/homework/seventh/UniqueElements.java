package homework.seventh;

import java.util.ArrayList;
import java.util.List;

public class UniqueElements {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();

        values.add(10);
        values.add(11);
        values.add(10);
        values.add(11);
        values.add(12);
        values.add(11);

        // wszystkie elementy listy
        for(Integer i : values){
            System.out.println(i);
        }

        System.out.println();

        // tylko unikalne elementy listy
        values.stream().distinct().forEach(System.out::println);

    }

}
