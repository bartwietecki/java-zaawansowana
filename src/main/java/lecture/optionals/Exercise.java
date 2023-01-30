package lecture.optionals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Exercise {

    public static void main(String[] args) {
        String[] tab = new String[]{"Tomek", null, "Jan", null, "Maria", "Julia", "Robert"};
        List<String> stringList = new ArrayList<>(Arrays.asList(tab));

        Integer[] integers = new Integer[]{234,null,676,86,978,96};
        List<Integer> integersList = new ArrayList<>(Arrays.asList(integers));

        // dla każdego naszego Stringa chcemy wywołać metodę check
        // forEach, dla każdego obiektu w środku; no i z tym obiektem chce coś zrobić; chcę zrobić metodę check; no i dorzucam s
        stringList.forEach(s -> findNull(s));
        System.out.println();
        stringList.forEach(s -> check(s));
        System.out.println();

        stringList.forEach(i -> findNull(i));
        System.out.println();
        integersList.forEach(integer -> check(integer));

    }

    private static <T> void findNull(T s) {
        // za każdym razem będzie wpadał element z tablicy, czasami null czasami nie, dlatego używam .ofNullable()
        var optional = Optional.ofNullable(s);
        // jeśli ten optional jest empty
        if(optional.isEmpty()) {
            System.out.println("Znalazłem null");
        }
    }

    private static <T> void check(T s) {
        var optional = Optional.ofNullable(s);
        if (optional.isPresent()){
            System.out.println(optional.get());
        } else {
            System.out.println("Znalazłem null");
        }
    }
}
