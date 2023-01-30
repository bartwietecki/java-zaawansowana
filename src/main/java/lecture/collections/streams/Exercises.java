package lecture.collections.streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Exercises {

    public static void main(String[] args) {
        Person jan = new Person("Jan", "Kowalski");
        Person karolina = new Person("Karolina", "Szwata");
        Person rozalia = new Person("Rozalia", "Kobylska");
        Person maciej = new Person("Maciej", "Puszkowski");
        Person tomasz = new Person("Tomasz", "Wojtyra");

        List<Person> people = new ArrayList<>(List.of(jan, karolina, rozalia, maciej, tomasz));

        // ZADANIA:

        // Stwórz nową listę imion, w której nie będzie osobów z nazwiskiem na literę 'K' oraz zwrócone zostanie tylko imię


        // Moje rozwiązanie:
        /*
        List<Person> namesList = new ArrayList<>(List.of(jan, karolina, rozalia, maciej, tomasz));

        namesList.sort((o1, o2) -> o1.getName().charAt(0));
        System.out.println("Posortowana lista po imionach: " + namesList);
         */


        // Poprawne rozwiązanie:
        var filteredNames = people.stream().filter(person -> !person.getSurname().startsWith("K"))
                .map(person -> person.getName()).toList();
        System.out.println(filteredNames);

//----------------------------------------------------------------------------------------------------------------------

        //Jan
        String jan1 = "Jan";
        Integer matemematyka1 = 1;
        Integer biologia1 = 5;
        List<Integer> ocenyJan = List.of(matemematyka1, biologia1);
        //Basia
        String basia = "Basia";
        Integer matemematyka2 = 4;
        Integer biologia2 = 4;

        //klasa
        List<Integer> ocenyBasia = List.of(matemematyka2, biologia2);
        Map<String, List<Integer>> classroom = new HashMap<>();
        classroom.put(jan1, ocenyJan);
        classroom.put(basia, ocenyBasia);

        // metodą forEach, jestem w stanie poiterować po mapce i z każdym elementem coś zrobić
        // wyświetlanie za pomocą lambdy klucza i wartości
        classroom.forEach((k, v) -> System.out.println(k + v));

        // mapa to jest entrySet (możemy go zrobić)
        var result = classroom.entrySet().stream().filter(stringListEntry ->
                stringListEntry.getKey().equals("Basia")).toList();
        // mamy tutaj takiego resulta, czyli listę entrySetów

        // zasadniczo moglibyśmy to wpisać do nowej mapy, coś z tym jeszcze zrobić .result


    }
}
