package collections.map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        String uczen1 = "Jan";
        String uczen2 = "Kasia";
        int ocena1 = 4;
        int ocena2 = 5;
        // kluczem mojej mapy jest String, np. Jan, a wartości daje Int

        // Tworzenie obiektu mapy
        Map<String, Integer> klasa = new HashMap<>();

        //dodawanie elementów do mapy
        klasa.put(uczen1, ocena1);

        //Mapa trzyma unikalne klucze, więc nie można dodać dwoch rekordow ponizej
        klasa.put(uczen1, ocena1);
        klasa.put(uczen2, ocena2);

        //Ten rekord już można dodać
        klasa.put(uczen2, ocena2);

        //Wyswietlanie elementow mapy
        System.out.println(klasa); // wyświetlamy mapę
        System.out.println("klucze: " + klasa.keySet());
        System.out.println("wartosci: " + klasa.values());


        System.out.println();


        //usuwanie element z mapy o danym kluczu
        klasa.remove(uczen1);

        //ponowne dodanie ucznia 1
        klasa.put(uczen1, ocena1);

        //pobieranie elementu z mapy o danym kluczu
        System.out.println(klasa.get(uczen2));

        //Wyswietlanie kluczy w inny sposob
        for (String key : klasa.keySet()) {
            System.out.println("Uczen: " + key);
        }

        //Wyswietlanie wartosci w mapie w inny sposob
        for (float value : klasa.values()) {
            System.out.println("Ocena: "+ value);
        }

        //Map.Entry pozwala dzialac na parach klucz-wartosc
        for (Map.Entry<String, Integer> pair : klasa.entrySet()) {
            System.out.println("Uczen - ocena " + pair);
        }




        // #1

//        klasa.forEach(new BiConsumer<String, Integer>() {
//            @Override
//            public void accept(String s, Integer integer) {
//                System.out.println("Klucz: " + s + " | Wartość: " + integer);
//            }
//        });

        // ZAPIS POWYŻSZY ZA POMOCĄ LAMBDY (patrz niżej) | Wyświetlanie wszystkich elementów mapy za pomocą lambdy

        // Strin Integer , wyrzucamy typy i nazwy zmiennych, Java sama się domyśli
        klasa.forEach((k, v) -> System.out.println("Klucz: " + k + " | Wartość: " + v));





        // #2

        // Wyświetlanie wszystkich elementów mapy za pomocą lambdy, które mają wartość większą niż 4
//        klasa.forEach(new BiConsumer<String, Integer>() {
//            @Override
//            public void accept(String s, Integer integer) {
//                if(integer > 4){  // Jeśli wartość większa niż 4, to wyświetlamy sobie osobę
//                    System.out.println("Klucz: " + s + " | Wartość: " + integer);
//                }
//            }
//        });


        klasa.forEach((s, integer) -> {
            if (integer > 4) System.out.println("Klucz: " + s + " | Wartość: " + integer);
        });






    }
}
