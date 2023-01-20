package collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExercises {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(9);
        numbers.add(6);
        numbers.add(3);
        numbers.add(12);
        System.out.println("Pierwotna lista: " + numbers);
        System.out.println("Tylko parzyste liczby: " + findEvenNumber(numbers));
        System.out.println("Napisałem jeszcze raz metodę samodzielnie. Tylko parzyste liczby: " + findEven(numbers));

        // Użycie Collections
        Collections.reverse(numbers); // używając tego odwracamy wszystkie elementy w liście numbers
        System.out.println("Lista odwrotnie: " + numbers);


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

    // Ta sama metoda, napisana przeze mnie
    public static List<Integer> findEven(List<Integer> numbers) {
        List<Integer> listOfIntegers = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                listOfIntegers.add(number);
            }
        }
        return listOfIntegers;
    }

}



    /*

    Poprawne rozwiązanie -> od Arka
        public static List<Integer> findEvenNumber (List < Integer > numbers) {
            List<Integer> listOut = new ArrayList<>();
            for (int i = 0; i < numbers.size(); i++) {
                if ((numbers.get(i) % 2) == 0) {
                    listOut.add(numbers.get(i));
                }
            }
            return listOut;
        }


Jeszcze raz ja !!! Skumaj to:

    public static List<Integer> findAllEvenNumbers(List<Integer> numbers) {
        List<Integer> newArray = new ArrayList<>();
        for (Integer n : numbers) {
            if (n % 2 == 0) {
                newArray.add(n);
            }
        }
        return newArray;
    }


 Moje rozwiązanie
    public static List<Integer> findEvenNumber(List<Integer> numbers){
        int i;
        for(i = 0; i < numbers.size(); i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        return numbers;
    }

     */
