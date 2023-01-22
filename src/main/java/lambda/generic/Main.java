package lambda.generic;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        List<String> names = List.of("Jarek", "Krzysztof", "Kamila");
        List<Integer> numbers = List.of(1, 6, 4, 7, 6, 4, 756, 9);


        // Chcę zrobić nową listę tylko i wyłącznie z tymi imionami, których liczba liter jest > 5
        System.out.println(process(names, s -> s.length() > 7)); // Wyrażenie lambda

        // Predicate
        // BiConsumer
        // Consumer
        // Comparator
        // metoda accept od Consumera, przyjmuje T, ja mam numerki, dlatego num ->
        print(numbers, num -> System.out.println("To jest liczba: " + num));
        print(names, imię -> System.out.println("To jest imię: " + imię));
    }

    // robimy poniżej metodę która przyjmie konsumera i wyświetli nową listę w konsoli
    private static <E>void print(List<E> numbers, Consumer<E> consumer) {
        for(E num : numbers){
            consumer.accept(num);
        }
    }

    // Do każdego Stringa metoda doda sobie Hello i wrzuci do nowej listy
    private static List<String> add(List<String> list, Process<String> process) {
        var result = new ArrayList<String>();
        for (String element : list) {
            result.add(process.apply(element));
        }
        return result;
    }


    private static List<String> process(List<String> list, Process<Boolean> process) {
        var result = new ArrayList<String>();
        for (String element : list) {
            if (process.apply(element)) {
                result.add(element);
            }
        }
        return result;
    }
}
