package oop.showroom;

import oop.showroom.model.Car;
import oop.showroom.model.Motorbike;
import oop.showroom.model.Vehicle;
import oop.showroom.model.enums.*;
import oop.showroom.service.VehicleServiceImpl;

import java.util.Scanner;

public class ShowroomApp {

    // ten Main to jest start naszej aplikacji
    public static void main(String[] args) throws InterruptedException {
        Vehicle audi = new Car(BrandType.AUDI, ModelType.A4, ColourType.RED, EngineType.V8, 10_000,
                GearboxType.AUTOMATIC, false, FuelType.PB95, "car-drive", 5,
                200, 5);

        Motorbike bmwMotorbike = new Motorbike(BrandType.BMW, ModelType.X6, ColourType.GREEN, EngineType.V8, 50_000,
                GearboxType.AUTOMATIC, true, MotorbikeType.CHOPPER, "łańcuch");

        VehicleServiceImpl vehicleService = new VehicleServiceImpl();
        vehicleService.addVehicle(audi);
        vehicleService.addVehicle(bmwMotorbike);

//        System.out.println(Arrays.toString(VehicleRepository.vehicles));

        Scanner scanner = new Scanner(System.in); // wejście systemu
        boolean on = true;

        System.out.println("Witaj w aplikacji salonu pojazdów!");
        Thread.sleep(1000);
        while (on) {
            System.out.println("Jaką operację chcesz wykonać?");
            System.out.println("1 - dodaj nowy samochód");
            System.out.println("2 - dodaj nowy motocykl");
            System.out.println("3 - wyświetl wszystkie pojazdy");
            System.out.println("0 - zakończ program");
            System.out.println("Wpisz odpowiednią liczbę:");
            int decision = scanner.nextInt();
            // switcha używamy wtedy kiedy wiemy jakie są możliwe wartości
            switch (decision) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Lista wszystkich pojazdów:");
                    for (Vehicle vehicle : vehicleService.getAllVehicles()) {
                        System.out.println(vehicle);
                    }
                    System.out.println();
                    break;
                case 0:
                    on = false; // jeśli ktoś wybierze zero to program się kończy -> on = false;
                    System.out.println("Do widzenia!");
                    break;
                default:
                    System.out.println("Wprowadzono błędne dane. Nie ma operacji o takim numerze.");
                    System.out.println();
            }


        }


    }
}
