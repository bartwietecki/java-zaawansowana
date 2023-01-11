package oop.showroom;

public class Main {
    public static void main(String[] args) {
        Car audi = new Car(BrandType.AUDI, ModelType.A4, ColourType.RED, EngineType.V8, 10_000,
                GearboxType.AUTOMATIC, false, FuelType.PB95, "car-drive", 5,
                200, 5);

        Motorbike bmwMotorbike = new Motorbike(BrandType.BMW, ModelType.X6, ColourType.GREEN, EngineType.V8, 50_000,
                GearboxType.AUTOMATIC, true, MotorbikeType.CHOPPER, "łańcuch");

        System.out.println(audi.getSimpleVehicle());


    }
}
