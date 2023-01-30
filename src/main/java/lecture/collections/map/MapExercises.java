package lecture.collections.map;

import java.util.*;

public class MapExercises {

    public static void main(String[] args) {

        // Chcemy przechowywać wszystkie oceny danego ucznia
        // Jan
        String jan = "Jan";
        Integer matematykaOcena1 = 1;
        Integer biologiaOcena1 = 5;
        List<Integer> ocenyJan = List.of(matematykaOcena1, biologiaOcena1);
        // Basia
        String basia = "Basia";
        Integer matematykaOcena2 = 4;
        Integer biologiaOcena2 = 4;

        // Klasa
        List<Integer> ocenyBasia = List.of(matematykaOcena2, biologiaOcena2);

        Map<String, List<Integer>> classroom = new HashMap<>();
        classroom.put(jan, ocenyJan); // ustalamy ucznia i oceny
        classroom.put(basia, ocenyBasia); // ustalamy ucznia i oceny

        // Wyświetlamy uczniów wraz z ich ocenami
        var entrySet = classroom.entrySet();
        for (Map.Entry<String, List<Integer>> record : entrySet) {
            System.out.println("Uczeń: " + record.getKey() + " oceny: " + record.getValue());
        }

        // Dodawanie oceny uczniowi Janowi
//        classroom.get("Jan").add(1);

        // Liczenie średniej z ocen
        System.out.println("To ma równać się 4.0: " + countAvgForStudents(classroom).get("Basia"));

    }

    //TODO obsłużyć wyjątek dzielenia przez 0
    // Przejrzeć jeszcze raz metodę z liczeniem średniej, skumać ją !!!
    private static Map<String, Double> countAvgForStudents(Map<String, List<Integer>> students){
        Map<String, Double> result = new HashMap<>(); // tworzymy nową mapę do której zapisane zostaną wartości
        for(Map.Entry<String, List<Integer>> record : students.entrySet()){
            Integer sum = 0;
            for(Integer grade : record.getValue())
                sum += grade; // sum = sum + grade;

            Double avg = sum.doubleValue() / record.getValue().size(); // na sumie wyciągamy z Integera -> Double'a

            result.put(record.getKey(), avg);
        }
        return result;
    }


}

