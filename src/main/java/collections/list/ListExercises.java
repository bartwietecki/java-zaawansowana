package collections.list;

import java.util.ArrayList;
import java.util.List;

public class ListExercises {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(9);
        numbers.add(6);
        numbers.add(3);
        numbers.add(12);

        System.out.println(findEvenNumber(numbers));

    }

    /**
     * ZADANIE: Napisz ciało metody zwracającej nową listę zawierającą jedynie liczby parzyste
     */

    public static List<Integer> findEvenNumber(List<Integer> numbers) {
        List<Integer> listOut = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                listOut.add(number);
            }
        }
        return listOut;
    }
}


//        // Poprawne rozwiązanie -> od Arka
//        public static List<Integer> findEvenNumber (List < Integer > numbers) {
//            List<Integer> listOut = new ArrayList<>();
//            for (int i = 0; i < numbers.size(); i++) {
//                if ((numbers.get(i) % 2) == 0) {
//                    listOut.add(numbers.get(i));
//                }
//            }
//            return listOut;
//        }

// Moje rozwiązanie
//    public static List<Integer> findEvenNumber(List<Integer> numbers){
//        int i;
//        for(i = 0; i < numbers.size(); i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }
//        return numbers;
//    }

