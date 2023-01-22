package collections.streams;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
class Person {
    // Klasa Person nie jest public, czyli obecnie mamy widok pakietowy

    private String name;
    private String surname;
}
