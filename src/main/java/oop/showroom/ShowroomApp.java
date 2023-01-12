package oop.showroom;

import oop.showroom.model.Car;
import oop.showroom.model.Motorbike;
import oop.showroom.model.Vehicle;
import oop.showroom.model.enums.*;
import oop.showroom.service.VehicleService;
import oop.showroom.service.VehicleServiceImpl;

import java.util.Scanner;

public class ShowroomApp {

    private static final Scanner SCANNER = new Scanner(System.in); // System.in oznacza wejście systemu

    // ten Main to jest start naszej aplikacji
    public static void main(String[] args) throws InterruptedException {
        ShowroomApp showroomApp = new ShowroomApp();
        showroomApp.run();

    }

    private void run() throws InterruptedException {
        VehicleServiceImpl vehicleService = new VehicleServiceImpl();

        initalMethod(vehicleService);

        boolean on = true;

        System.out.println("Witaj w aplikacji salonu pojazdów!");
        Thread.sleep(1000);
        while (on) {
            showMenu();
            System.out.println("Wpisz odpowiednią liczbę:");
            int decision = SCANNER.nextInt();
            // switcha używamy wtedy kiedy wiemy jakie są możliwe wartości
            switch (decision) {
                case 1 -> addCar(vehicleService);
                case 2 -> addMotorbike(vehicleService);
                case 3 -> showVehicles(vehicleService);
                case 0 -> {
                    on = false; // jeśli ktoś wybierze zero to program się kończy -> on = false;
                    System.out.println("Do widzenia!");
                }
                default -> {
                    System.out.println("Wprowadzono błędne dane. Nie ma operacji o takim numerze.");
                    System.out.println();
                }
            }
        }
    }

    private void showMenu() {
        System.out.println("Jaką operację chcesz wykonać?");
        System.out.println("1 - dodaj nowy samochód");
        System.out.println("2 - dodaj nowy motocykl");
        System.out.println("3 - wyświetl wszystkie pojazdy");
        System.out.println("0 - zakończ program");
    }

    private void addCar(VehicleService vehicleService) {
        Car car = new Car();
        System.out.println("Podaj markę: BMW, AUDI, CITROEN");
        String brand = SCANNER.next();
        car.setBrand(BrandType.valueOf(brand)); // Brand jest ENUMem, a nie Stringiem
        System.out.println("Podaj liczbę drzwi");
        int doorsNumber = SCANNER.nextInt();
        car.setDoorsNumber(doorsNumber);
        vehicleService.addVehicle(car); // car dziedziny po vehicle
        // samochód dodaje się do naszej bazy pojazdów
        System.out.println("Dodano samochód");
    }

    private void addMotorbike(VehicleService vehicleService) {
        Motorbike motorbike = new Motorbike();
        System.out.println("Podaj markę: BMW, AUDI, CITROEN");
        String motorbikeBrand = SCANNER.next();
        motorbike.setBrand(BrandType.valueOf(motorbikeBrand));
        System.out.println("Podaj typ motoru: CHOPPER, ENDURO");
        String motorbikeType = SCANNER.next();
        motorbike.setMotorbikeType(MotorbikeType.valueOf(motorbikeType));
        vehicleService.addVehicle(motorbike);
        System.out.println("Dodano motor");
    }

    private void showVehicles(VehicleService vehicleService) {
        System.out.println("Lista wszystkich pojazdów:");
        for (Vehicle vehicle : vehicleService.getAllVehicles()) {
            System.out.println(vehicle);
        }
        System.out.println();
    }

    private void initalMethod(VehicleService vehicleService) {
        Vehicle audi = new Car(BrandType.AUDI, ModelType.A4, ColourType.RED, EngineType.V8, 10_000,
                GearboxType.AUTOMATIC, false, FuelType.PB95, "car-drive", 5,
                200, 5);

        Motorbike bmwMotorbike = new Motorbike(BrandType.BMW, ModelType.X6, ColourType.GREEN, EngineType.V8, 50_000,
                GearboxType.AUTOMATIC, true, MotorbikeType.CHOPPER, "łańcuch");


        vehicleService.addVehicle(audi);
        vehicleService.addVehicle(bmwMotorbike);
    }
}
