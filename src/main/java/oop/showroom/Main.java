package oop.showroom;

import oop.showroom.model.Car;
import oop.showroom.model.Motorbike;
import oop.showroom.model.Vehicle;
import oop.showroom.model.enums.*;

public class Main {
    public static void main(String[] args) {
        Car audi = new Car(BrandType.AUDI, ModelType.A4, ColourType.RED, EngineType.V8, 10_000,
                GearboxType.AUTOMATIC, false, FuelType.PB95, "car-drive", 5,
                200, 5);

        Motorbike bmwMotorbike = new Motorbike(BrandType.BMW, ModelType.X6, ColourType.GREEN, EngineType.V8, 50_000,
                GearboxType.AUTOMATIC, true, MotorbikeType.CHOPPER, "łańcuch");

        // Polimorfizm
        Vehicle vehicle = null; // inicjacja obiektu, nawet nie musi być null'a
        vehicle = audi;
        System.out.println(vehicle.getSimpleVehicle());
        vehicle = bmwMotorbike;
        System.out.println(vehicle.getSimpleVehicle());

        // nasz Vehicle pozwala nam nadpisać swoją metodę abstrakcyjną
        Vehicle aeroplane = new Vehicle() { // towrzymy zupełnie nową klase
            @Override
            public Object getSimpleVehicle() {
                return new SimpleAeroplane(this);
            }

             static class SimpleAeroplane{
                private final BrandType brandType;

                public SimpleAeroplane(Vehicle vehicle1) {
                    this.brandType = vehicle1.getBrand();
                }

                @Override
                public String toString() {
                    return "SimpleAeroplane{" +
                            "brandType=" + brandType +
                            '}';
                }
            }
        };
        aeroplane.setBrand(BrandType.CITROEN);
        System.out.println(aeroplane.getSimpleVehicle());


    }
}
