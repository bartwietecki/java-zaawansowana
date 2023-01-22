package exceptions;

public class Main {

    public static void main(String[] args) {
//        throwException();

        try {
            throwException();
        } catch (RuntimeException ex) {
//            System.out.println(ex.getCause());
            ex.printStackTrace();
        }

    }

    private static void throwException() {
        throw new RuntimeException("Błąd");
    }

}
