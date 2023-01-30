package lecture.lambda.generic;

@FunctionalInterface
public interface Process <T> {

    T apply (String s);
        // tworzymy nowy parametr
    // jestem teraz w stanie zwrócić obiekt o różnym typie
}
