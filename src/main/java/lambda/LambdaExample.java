package lambda;

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

        var editedList = editedDoctors(doctors, (s) -> "Hello " + s.toUpperCase());    // WYRAŻENIE LAMBDA

        System.out.println(editedList);
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
