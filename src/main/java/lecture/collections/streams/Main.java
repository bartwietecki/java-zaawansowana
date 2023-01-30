package lecture.collections.streams;

import java.util.ArrayList;
import java.util.List;

class Main {

    public static void main(String[] args) {
//      -----------------------------DOTYCZY METODY STRUMIENIOWEJ, KTÓRA NAZYWA SIĘ FILTER -----------------------------

        List<Integer> integers = List.of(890, 345, 33, 5, 53, 6, 2, 1, 345); // obiekt może być na spokojnie immutable,
        System.out.println("Pierwotna lista: " + integers);             // bo będziemy go strumieniować (bez new Array)

        List<Integer> onlyEvenLoop = new ArrayList<>();
        for (Integer i : integers) {
            if (i % 2 == 0)
                onlyEvenLoop.add(i);
        }
        System.out.println("Tylko parzyste pętla " + onlyEvenLoop);

        var integerStream = integers.stream(); // jak napiszę var to dostaję :Stream <Integer> ,
        // czyli Interface, który zawiera określone metody
        // na tym integerStreamie jestem w stanie wywołać te metody (z Interface'u)

//        integerStream.filter(new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return integer % 2 == 0;
//            }
//        });

        // zapis lecture.lambda powyższej funkcji
        var onlyEvenStream = integerStream.filter(integer -> integer % 2 == 0).toList(); // Stream kończymy metodą .toList
        System.out.println("Tylko parzyste Stream: " + onlyEvenStream);


//      -----------------------------DOTYCZY METODY STRUMIENIOWEJ, KTÓRA NAZYWA SIĘ MAP --------------------------------

        // powiedzmy, że chciałbym zamienić tę listę Integerów na listę Stringów

        // Lista integer
        List<Integer> integersToMap = List.of(890, 345, 33, 5, 53, 6, 2, 1, 345);

        // Lista Stringów za pomocą metody "converter"
        var strings = converter(integers);

        // lista stringów za pomocą stream
        var stringFromStream = integersToMap.stream().map(integer -> integer.toString()).toList();

        // w Streamie mamy jakieś integery i chcemy je przekonwertować na Stringi
        // wyobraź sobie że każdy element po kolei chcesz przekonwerować, czyli:
        // integer -> toString().
        // i zakończ Streama metodą .toList (zapisz wszystko co przekonwertowałeś do Listy)


//      ------------------------DOTYCZY METODY STRUMIENIOWEJ, KTÓRA NAZYWA SIĘ FLAT MAP --------------------------------
        Person jan = new Person("Jan", "Kowalski");
        Person karolina = new Person("Karolina", "Szwata");
        Person rozalia = new Person("Rozalia", "Kobylska");
        Person maciej = new Person("Maciej", "Puszkowski");
        Person tomasz = new Person("Tomasz", "Wojtyra");

        // Zróbmy sobie jakieś 2 szkolenia
        var java = new Training("Java", List.of(jan, karolina));
        var python = new Training("Python", List.of(rozalia, maciej, tomasz));

        // zróbmy teraz listę treningów
        var trainings = List.of(java, python);

        // wyciągamy wszystkie imiona osób na szkolenie
        var names = trainings.stream().flatMap(training -> training.getStudents().stream()
                .map(person -> person.getName())).toList();

//        var names = trainings.stream().flatMap(training -> training.getStudents().stream()
//                .map(Person::getName)).toList();

        System.out.println("Imiona po flat mapie: " + names);
        // W A Ż N E
        // spłaszczam strukture do strumienia, ktory bedzie skladał się tylko i wyłącznie z listy studentow
        // w moim training mam liste, ale nie moge jej od razu przestreamowac bo mam ją w dwoch obiekatach
        // za pomoca flat mapy pozbywam sie dwoch obiektow i wchodze do streama
        // no i dalej w streamie za pomoca mapy sobie wszystko przerabiam
    }

    private static List<String> converter(List<Integer> integers) {
        var result = new ArrayList<String>();
        for (Integer i : integers) {
            result.add(i.toString());
        }
        return result;
    }
}
