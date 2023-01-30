package lecture.collections.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Main {
    public static void main(String[] args) {

        // ------------------------- SORTOWANIE - COLLECTIONS -----------------------------
        List<Integer> integers = new ArrayList<>(List.of(1, 4, 5, 7, 8, 4356, 8, 9, 87));

        System.out.println("Lista bez sortu: " + integers);
        Collections.sort(integers);
        System.out.println("Lista posortowana: " + integers);
        Collections.reverse(integers);
        System.out.println("Lista posortowana odwrtonie: " + integers);


        // ------------------------- SORTOWANIE - COMPARATOR ------------------------------
        Integer num = 5;
        Integer num2 = 5;
        Integer bigger = 10;

        System.out.println("Mniejsza porównana do większej: " + num.compareTo(bigger));
        ; // wynik: -1
        System.out.println("Większa porównana do mniejszej: " + bigger.compareTo(num));
        ; // wynik: 1
        System.out.println("Liczby są równe: " + num2.compareTo(num));
        ; // wynik: 0

        List<Integer> listForComparing = new ArrayList<>(List.of(1, 4, 5, 7, 8, 4356, 8, 9, 87));
        System.out.println("Lista bez sortu: " + listForComparing);


        listForComparing.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println("Lista posortowana rosnąco" + listForComparing);

        // WYRAŻENIE LAMBDA

        //        listForComparing.sort((o1, o2) -> o1.compareTo(o2));
        listForComparing.sort(Integer::compareTo); // replace with method reference
        System.out.println("Lista posortowana rosnąco (zapis lecture.lambda)" + listForComparing);

//        listForComparing.sort(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2.compareTo(o1);
//            }
//        });
//        System.out.println("Lista posortowana malejąco" + listForComparing);

        // WYRAŻENIE LAMBDA
        listForComparing.sort((o1, o2) -> o2.compareTo(o1));
        System.out.println("Lista posortowana malejąco" + listForComparing);

        // Comparator
        listForComparing.sort(Comparator.reverseOrder()); // reverse order
        System.out.println("Lista posortowana malejąco" + listForComparing);


        // ------------------------- SORTOWANIE - COMPARATOR (Porównytwanie Stringów) ------------------------------
        List<String> stringList = new ArrayList<>(List.of("Karol", "Adam", "Zygmunt", "Celina"));

        System.out.println("Nieposortowana lista: " + stringList);
        stringList.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2); // String też jest comparable, dlatego jesteśmy w stanie zaimplementować w nim taką wartość
            }
        });

        // Lista -> Lambda -> Method Reference
        stringList.sort(String::compareTo);
        System.out.println("Posortowana lista: " + stringList);


        // ---------------------------------------------------------------------------------------------------------


        // Porównywanie po polach w klasach
        Person jan = new Person("Jan", "Kowalski");
        Person karolina = new Person("Karolina", "Kaczmarek");
        Person jadwiga = new Person("Jadwiga", "Skudro");

        List<Person> people = new ArrayList<>(List.of(jan, karolina, jadwiga));
        System.out.println("Nieposortowana liczba osób: " + people);

//        people.sort(new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getName().compareTo(o2.getName()); // z pierwszego o1, wyciągamy imię (String) i porównujemy
//            }
//        });
//        System.out.println("Posortowana lista po imionach: " + people);

        // Zapis lecture.lambda powyższej metody
        people.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        System.out.println("Posortowana lista po imionach: " + people);

//        people.sort(new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return (o1.getName() + o1.getSurname()).compareTo((o2.getName() + o2.getSurname()));
//            }
//        });
//        System.out.println("Posortowana lista po imieniu z nazwiskiem: " + people);

        // Zapis lecture.lambda powyższej metody
        people.sort((o1, o2) -> (o1.getName() + o1.getSurname()).compareTo((o2.getName() + o2.getSurname())));
        System.out.println("Posortowana lista po imieniu z nazwiskiem: " + people);
    }
}
