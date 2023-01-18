package collections.streams;

import java.util.ArrayList;
import java.util.List;

public class Main {

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

        var integerStream = integers.stream(); // jak napiszę var to dostaję :Stream <Integer> , czyli Interface, która zawiera określone metody
        // na tym integerStreamie jestem w stanie wywołać te metody (z Interface'u)

//        integerStream.filter(new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return integer % 2 == 0;
//            }
//        });

        // zapis lambda powyższej funkcji
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
    }

    private static List<String> converter(List<Integer> integers){
        var result = new ArrayList<String>();
        for(Integer i : integers){
            result.add(i.toString());
        }
        return result;
    }
}
