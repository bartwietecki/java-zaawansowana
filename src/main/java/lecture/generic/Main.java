package lecture.generic;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SDAList<String> list = new SDAList<>();
        List<String> listFromElements = new SDAList<>("Tomek", "Magda", "Kasia");
        List<String> listOf = SDAList.of("Tomek", "Magda", "Kasia");

        /*

        List.of(1,2,3,4,5); // Lista pozwala nam zainicjować obiekt w ten sposób

         */


        System.out.println(listOf.size());

        list.add("Józef");

        List<String> arrayList = new ArrayList<>();
        arrayList.add("Damian");
        arrayList.add("Karolina");

        System.out.println(list.union(arrayList));
    }
}


