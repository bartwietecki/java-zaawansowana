package lecture.homework.fourth;

import java.util.*;

public enum Continent {

    AMERYKA_POLUDNIOWA(17_800_000),
    AFRYKA(30_400_000),
    AMERYKA_POLNOCNA(24_200_000),
    ANTARKTYDA(13_200_000),
    AUSTRALIA(7_700_000),
    EURAZJA(54_800_000);

    private final long surface;

    Continent(long surface) {
        this.surface = surface;
    }

    public long getSurface() {
        return surface;
    }

    public static void main(String[] args) {
        Continent[] allContinents = Continent.values();
        System.out.println("Wszystkie kontynenty: ");
        System.out.println(Arrays.toString(allContinents));

        System.out.println("Wszystkie kontynenty po kolei: ");
        for (Continent c : allContinents) {
            System.out.println(c);
        }

        System.out.println("Każda powierzchnia kontynentu po kolei: ");
        for (Continent surfaceNumber : allContinents) {
            System.out.println(surfaceNumber.getSurface());
        }

        System.out.println("Wywołanie metody, która zwróci największą powierzchnię kontynentu: ");
        System.out.println(biggestSurface(allContinents));
        System.out.println("Wywołanie metody, która zwróci najmniejszą powierzchnię kontynentu: ");
        System.out.println(smallestSurface(allContinents));

        // ########################################################################################################

        List<Continent> allContinents1 = List.of(Continent.values());

        System.out.println("Tutaj największa powierzchnia z Listy: ");
        allContinents1.stream().max(Comparator.comparing(Continent::getSurface)).ifPresent(System.out::println);
        System.out.println("Tutaj najmniejsza powierzchnia z Listy: ");
        allContinents1.stream().min(Comparator.comparing(Continent::getSurface)).ifPresent(System.out::println);

        // ########################################################################################################


        // Poprawne metody dla Kontynent MAX and MIN surface
        System.out.println("Poprawne metody MAX and MIN:");
        System.out.println(maxSurface());
        System.out.println(minSurface());
    }

    // Porawne metody MAX and MIN surface

    public static Continent maxSurface() {
        Continent max = null;
        for (Continent continent : Continent.values()) {
            if (max == null || continent.surface > max.surface) {
                max = continent;
            }
        }
        return max;
    }

    public static Continent minSurface() {
        Continent min = null;
        for (Continent continent : Continent.values()) {
            if (min == null || continent.surface < min.surface) {
                min = continent;
            }
        }
        return min;
    }


    // ŹLE - te metody nie działają, tzn. działają ale wskazują na indeksy...

    public static Continent biggestSurface(Continent[] continents) {
        double maxValue = 0;
        int indexOfMaxValue = 0;
        for (int i = 0; i < continents.length; i++) {
            if (continents[i].getSurface() > maxValue) {
                indexOfMaxValue = i;
            }
        }
        return continents[indexOfMaxValue];
    }

    public static Continent smallestSurface(Continent[] continents) {
        double minValue = 0;
        int indexOfMinValue = 0;
        for (int i = 0; i < continents.length; i++) {
            if (continents[i].getSurface() < minValue) {
                indexOfMinValue = i;
            }
        }
        return continents[indexOfMinValue];
    }

}



