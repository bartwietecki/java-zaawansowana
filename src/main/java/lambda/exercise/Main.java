package lambda.exercise;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(4, 5, 7, 2, 3, 78, 43, 1, 6);
        System.out.println("Pierwotna lista liczb: " + numbers);

     //   var isEven = process(numbers, (i) -> (i % 2 == 0));              M O J E

        Process isEven = new Process() {
            @Override
            public boolean apply(Integer num) {
                return num % 2 == 0;
            }
        };

        System.out.println("Tylko liczby parzyste: " + process(numbers, isEven));
        System.out.println("Tylko liczby większe od 10: " + process(numbers, number -> number > 10));
        System.out.println("Tylko liczby nieparzyste TERAZ: " + process(numbers, number -> number % 2 != 0)); // zapis lambda
        System.out.println("Tylko liczby nieparzyste: " + process(numbers, new Process() {
            @Override
            public boolean apply(Integer num) {
                return num % 2 != 0;
            }
        }));


    }

    private static List<Integer> process(List<Integer> numbers, Process process) {
        List<Integer> list = new ArrayList<>();
        for (Integer number : numbers) {
            if (process.apply(number)) {
                list.add(number);
            }
        }
        return list;
    }

    // TODO popróbować sobie jeszcze z tą metodą powyżej, przenazalizować, skumać

//    private static List<Integer> process(List<Integer> numbers, ProcessInterface processInterface) {
//        List<Integer> isEven = new ArrayList<>();
//        for (Integer number : numbers) {
//            if (number % 2 == 0) {                                   M O J E
//                isEven.add(number);
//            }
//        }
//        return isEven;
//    }


}
