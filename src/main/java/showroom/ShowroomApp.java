package showroom;

import showroom.model.Car;
import showroom.model.Motorbike;
import showroom.model.Vehicle;
import showroom.model.enums.*;
import showroom.service.VehicleService;
import showroom.service.VehicleServiceImpl;

import java.util.Arrays;
import java.util.Scanner;

public class ShowroomApp {

    private static final Scanner SCANNER = new Scanner(System.in); // (System.in) oznacza wejście systemu

    // ten Main to jest start naszej aplikacji
    public static void main(String[] args) throws InterruptedException {
        ShowroomApp showroomApp = new ShowroomApp();
        showroomApp.run();

    }

    private void run() throws InterruptedException {
        VehicleServiceImpl vehicleService = new VehicleServiceImpl();

        initialMethod(vehicleService);

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
                case 4 -> showVehiclesByBrand(vehicleService);
                case 5 -> removeVehicleById(vehicleService);
                case 0 -> {
                    on = false; // jeśli ktoś wybierze zero to program się kończy -> on = false;
                    System.out.println("Do widzenia!");
                }
                default -> {
                    System.out.println("Wprowadzono błędne dane. Nie ma operacji o takim numerze.");
                }
            }
        }
    }

    private void showMenu() {
        System.out.println("Jaką operację chcesz wykonać?");
        System.out.println("1 - dodaj nowy samochód");
        System.out.println("2 - dodaj nowy motocykl");
        System.out.println("3 - wyświetl wszystkie pojazdy");
        System.out.println("4 - wyświetl wszystkie pojazdy dla danej marki");
        System.out.println("5 - usuń pojazd o danym identyfikatorze");
        System.out.println("0 - zakończ program");
    }

    private void addCar(VehicleService vehicleService) {
        Car car = new Car();
        System.out.println("Podaj markę: BMW, AUDI, CITROEN");
        String brand = SCANNER.next();
        car.setBrand(BrandType.valueOf(brand)); // Brand jest ENUMem, a nie Stringiem

        System.out.println("Podaj model: X6, A4, C4");
        String model = SCANNER.next();
        car.setModel(ModelType.valueOf(model));

        System.out.println("Podaj kolor: RED, GREEN, WHITE");
        String colour = SCANNER.next();
        car.setColour(ColourType.valueOf(colour));

        System.out.println("Podaj typ silnika: V8, V12");
        String engineType = SCANNER.next();
        car.setEngine(EngineType.valueOf(engineType));

        System.out.println("Podaj przebieg");
        double mileage = SCANNER.nextDouble();
        car.setMileage(mileage);

        System.out.println("Podaj rodzaj skrzyni biegów: MANUAL, AUTOMATIC");
        String gearboxType = SCANNER.next();
        car.setGearboxType(GearboxType.valueOf(gearboxType));

        // jak dodać boolean'a isUsed (?)

        System.out.println("Podaj rodzaj paliwa: PB95, PB98, DIESEL");
        String fuel = SCANNER.next();
        car.setFuel(FuelType.valueOf(fuel));

        System.out.println("Podaj napęd");
        String carDrive = SCANNER.next();
        car.setCarDrive(carDrive);

        System.out.println("Podaj liczbę drzwi");
        int doorsNumber = SCANNER.nextInt();
        car.setDoorsNumber(doorsNumber);

        System.out.println("Podaj pojemność bagażnika");
        int capacity = SCANNER.nextInt();
        car.setCapacity(capacity);

        System.out.println("Podaj liczbę pasażerów");
        int passengersNumber = SCANNER.nextInt();
        car.setPassengersNumber(passengersNumber);

        vehicleService.addVehicle(car); // car dziedziczy po vehicle
        // samochód dodaje się do naszej bazy pojazdów
        System.out.println("Dodano samochód");
    }

    private void addMotorbike(VehicleService vehicleService) {
        Motorbike motorbike = new Motorbike();
        System.out.println("Podaj markę: BMW, AUDI, CITROEN");
        String motorbikeBrand = SCANNER.next();
        motorbike.setBrand(BrandType.valueOf(motorbikeBrand));

        System.out.println("Podaj model: X6, A4, C4");
        String motorbikeModel = SCANNER.next();
        motorbike.setModel(ModelType.valueOf(motorbikeModel));

        System.out.println("Podaj kolor: RED, GREEN, WHITE");
        String motorbikeColour = SCANNER.next();
        motorbike.setColour(ColourType.valueOf(motorbikeColour));;

        System.out.println("Podaj typ silnika: V8, V12");
        String motorbikeEngineType = SCANNER.next();
        motorbike.setEngine(EngineType.valueOf(motorbikeEngineType));

        System.out.println("Podaj przebieg");
        double motorbikeMileage = SCANNER.nextDouble();
        motorbike.setMileage(motorbikeMileage);

        System.out.println("Podaj rodzaj skrzyni biegów: MANUAL, AUTOMATIC");
        String motorbikeGearboxType = SCANNER.next();
        motorbike.setGearboxType(GearboxType.valueOf(motorbikeGearboxType));

        // How to make isUsed ? boolean

        System.out.println("Podaj typ motoru: CHOPPER, ENDURO");
        String motorbikeType = SCANNER.next();
        motorbike.setMotorbikeType(MotorbikeType.valueOf(motorbikeType));

        System.out.println("Podaj napęd");
        String motorbikeDrive = SCANNER.next();
        motorbike.setMotorbikeDrive(motorbikeDrive);

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

    private void showVehiclesByBrand(VehicleService vehicleService) {
        System.out.println("Marki w systemie: ");
        System.out.println(Arrays.toString(BrandType.values()));
        System.out.println("Podaj markę: ");
        String brand = SCANNER.next();
        System.out.println("Lista wszystkich pojazdów marki: " + brand + ":");
        for (Vehicle vehicle : vehicleService.getVehiclesByBrand(BrandType.valueOf(brand))) {
            System.out.println(vehicle);
        }
        System.out.println();
    }

    private void removeVehicleById(VehicleService vehicleService) {
        System.out.println("Podaj id pojazdu");
        Long id = SCANNER.nextLong();
        vehicleService.removeVehicle(id);
        System.out.println("Usunięto pojazd o id: " + id);
    }

    private void initialMethod(VehicleService vehicleService) {
        Vehicle audi = new Car(BrandType.AUDI, ModelType.A4, ColourType.RED, EngineType.V8, 10_000,
                GearboxType.AUTOMATIC, false, FuelType.PB95, "4X4", 5,
                200, 5);

        Motorbike bmwMotorbike = new Motorbike(BrandType.BMW, ModelType.X6, ColourType.GREEN, EngineType.V8, 50_000,
                GearboxType.AUTOMATIC, true, MotorbikeType.CHOPPER, "łańcuch");


        vehicleService.addVehicle(audi);
        vehicleService.addVehicle(bmwMotorbike);
    }
}
