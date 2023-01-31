package lecture;

import lecture.reflection.Person;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

public class ReflectionTest {

    Person person = new Person("Bartek");

    @Test
    public void test() throws NoSuchFieldException, IllegalAccessException {
        System.out.println(person);

        // korzystamy z refleksji i weźmy sobie to pole; pole age
        Field age = person.getClass().getField("age");
        age.setAccessible(true); // możemy się teraz do tego pola dostać

        age.setInt(person, 25);

        System.out.println(person);
    }
}
