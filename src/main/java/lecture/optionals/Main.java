package lecture.optionals;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        //    Optional.empty(); // metoda .empty() wtedy dostajemy pustego Optional'a

        String empty = null;
        // .ofNullable() używamy gdy w Optionalu może być null
        Optional<String> stringOptional = Optional.ofNullable(empty);

        // jak wyciągnąć z optionala jakieś wartości ?
        // stringOptional.get(); // nope, tak nie możemy zrobić

        // isPresent zwraca true albo false
        if(stringOptional.isPresent()) {
            System.out.println(stringOptional.get());
        }

        String name = "Tomek";
        // .of() używamy gdy w Optionalu nie ma nulla
        Optional<String> nameOptional = Optional.of(name);
        // .orElse() jeśli Optional przechowuje null wtedy da nam obiekt z tej metody
        // obiekt w .orElse zawsze zostanie stworzony
        var name1 = nameOptional.orElse("Kamil");
        System.out.println(".orElse(): " + name1);

        // .orElseGet()
        // jeśli obiekt w optional nie jest null to .orElseGet() nie stworzy obiektu "Kamil"
        var name3 = nameOptional.orElseGet(() -> "Kamil");
        System.out.println(".orElseGet(): " + name3);

        // .orElseThrow()
        nameOptional.orElseThrow(() -> new RuntimeException("W name optionalu nic nie było"));
        stringOptional.orElseThrow(() -> new RuntimeException("W string optionalu nic nie było"));
        // stringOptional wyrzuca nam wyjątek, bo nic w nim nie ma


    }
}
