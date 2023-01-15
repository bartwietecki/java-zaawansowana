package homework.fourth;

import java.util.Arrays;

public enum Continent {

    AFRYKA(30_400_000),
    AMERYKA_POLUDNIOWA(17_800_000),
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

        Continent allContinents[] = Continent.values();
        System.out.println(Arrays.toString(allContinents));

        for (Continent c : allContinents) {
            System.out.println(c);
        }

        biggestSurface();
        smallestSurface();

    }

        public static void biggestSurface() {

            System.out.println("Największą powierzchnię ma: ");
        }


        public static void smallestSurface() {

            System.out.println("Najmniejszą powierzchnię ma: ");
        }

}

//        System.out.println("NAJMNIEJSZA I NAJWIĘKSZA CYFRA *");
//        Continent allContinents[] = new Continent[]{};
//        Continent smallest = allContinents[0];
//        Continent biggest = allContinents[0];
//
//        for (int i = 0; i < allContinents.length; i++){
//            if(smallest > allContinents[i]) {
//                smallest = allContinents[i];
//            }
//            System.out.println("TUTAJ: " + allContinents[i]);
//
//            if (biggest < allContinents[i]) {
//                biggest = allContinents[i];
//            }
//        }
//        System.out.println(smallest);
//        System.out.println(biggest);
//
//    }




