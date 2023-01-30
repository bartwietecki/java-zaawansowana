package lecture.lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaExample {

    public static void main(String[] args){
        Hospital internist = new Internist();
        internist.treat();



        // Zmiana poniższej metody na wyrażenie LAMBDA
/*

        Hospital ophthalmologist = new Hospital() {                               // Po lewej: klasa anonimowa
            @Override
            public void treat() {
                System.out.println("Okulista zaczyna leczyć");
            }
        };

 */

        //        ophthalmologist.getDoctorName();

        Hospital ophthalmologist = () -> System.out.println("Okulista zaczyna leczyć"); // Wyrażenie LAMBDA
        ophthalmologist.treat();


/*
        Doctor doctor = new Doctor() {
            @Override
            public String process(String s) {
                return "Hello Doctor " + s + "!";
            }
        };

 */

        Doctor doctor = (s) -> "Hello Doctor " + s + "!";

        var greetings = doctor.process("Damian");
        System.out.println(greetings);

        List<String> doctors = List.of("Damian", "Karol", "Matylda", "Tamara");

 /*
        var editedList = editedDoctors(doctors, new Doctor() {
                    @Override                                                       // PRZED LAMBDA
                    public String process(String s) {
                        return s.toUpperCase();
                    }
                });

  */

        // Wyrażenie lecture.lambda pozwala na dodanie do każdego lakarza Hello przed imieniem
        var editedList = editedDoctors(doctors, (s) -> "Hello " + s.toUpperCase());    // WYRAŻENIE LAMBDA

        System.out.println(editedList);

        // Poniżej: WYRAŻENIE LAMBDA POZWALA NA ZLICZENIE LICZBY ZNAKÓW W IMIENIU KAŻDEGO LEKARZA/DOCTOR

        // var countedDoctorsList = countedDoctors(doctors, String::length); <- poniższy inny zapis, referencja do metody

        //                                             ustawiamy nawę d, bo doctor już wcześniej był używany
        var countedDoctorsList = countedDoctors(doctors, d -> d.length()); // na 2gim miejscu musze wstrzyknac implementacje,
                                                                     // która policzy ilość znaków z imienia każdego doktora
        System.out.println(countedDoctorsList);
    }

    private static List<Integer> countedDoctors(List<String> doctors,
                                               IntegerFunctionalInterface functionalInterface){
        var result = new ArrayList<Integer>();
        // dla każdego elementu z tej listy doctors, ja musze coś zrobić
        for(String d : doctors){
            // do tego chce dodać doktorów z listy doctors
            result.add(functionalInterface.process(d));
        }
        return result;
    }


    // robię metodę aby otrzymać nową listę ze starej listy lekarze
    private static List<String> editedDoctors(List<String> doctors, Doctor doctor){
        var result = new ArrayList<String>();
        for(String name : doctors){
            result.add(doctor.process(name));
        }
        return result;
    }


}
