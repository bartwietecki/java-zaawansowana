package operationsIO.serialization;

import java.io.Serializable;

public class Person implements Serializable { // Serializable -> swojego rodzaju marker, klasa nic sama nie robi pozornie
                                                // ale mówi o tym, że dana klasa może być serializowana
    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override // to znaczy że coś jest nadpisywane, nie musi to występować
    public String toString(){
        return "";
    }
}
