package lambda.generic;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Exercise {

    public static void main(String[] args) {
        String s = "Imię";
        Integer i = 1;
        System.out.println(s);

        process(s, s1 -> System.out.println(s1));
        process(i, s1 -> System.out.println(s1));
        process(new ArrayList<>(), System.out::println); // method reference (krótszy zapis)

    }
    // ĆWICZENIE #1

    // Rozwiązanie z zajęć #1
    // Literkę E po static dodajemy, aby zrobić tę metodę generyczną
    private static <E> void process(E s, Consumer<E> consumer) {
        consumer.accept(s);
    }


    // Moje rozwiązanie #1

//    private void process(Consumer<E> consumer){
//        var result = new ArrayList<E>();
//        for(Consumer<E> element : consumer){
//            result.add(consumer.toString());
//                    }
//                }
//
//
//    @Override
//    public void accept(E e) {
//
//    }



}
