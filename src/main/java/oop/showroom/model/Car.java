package oop.showroom.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import oop.showroom.model.enums.*;


@Getter
@Setter
@NoArgsConstructor
public class Car extends Vehicle {
    private FuelType fuel;
    private String carDrive;
    private int doorsNumber;
    private Integer capacity;
    private int passengersNumber;

    public Car(FuelType fuel, String carDrive, int doorsNumber, int capacity, int passengersNumber) {
        this.fuel = fuel;
        this.carDrive = carDrive;
        this.doorsNumber = doorsNumber;
        this.capacity = capacity;
        this.passengersNumber = passengersNumber;
    }

    public Car(BrandType brand, ModelType model, ColourType colour, EngineType engine, double mileage,
               GearboxType gearboxType, boolean isUsed, FuelType fuel, String carDrive, int doorsNumber,
               Integer capacity, int passengersNumber) {
        super(brand, model, colour, engine, mileage, gearboxType, isUsed);
        this.fuel = fuel;
        this.carDrive = carDrive;
        this.doorsNumber = doorsNumber;
        this.capacity = capacity;
        this.passengersNumber = passengersNumber;
    }

    public Object createSimpleCar() {
        return new simpleCar(this);
    }

    public Object getSimpleVehicle(){
        return new simpleCar(this);
    }

//    public simpleCar createSimpleCar(Car car) {
//        return new simpleCar(car);
//    }


    @Override
    public String toString() {
        return "Car {" +
                "Brand: " + super.getBrand() +
                ", Model: " + super.getModel() +
                ", Colour: " + super.getColour() +
                ", Enginge Type: " + super.getEngine() +
                ", Mileage: " + super.getMileage() +
                ", Gearbox Type: " + super.getGearboxType() +
                ", Used: " + super.isUsed() +
                ", Fuel: " + fuel +
                ", Car Drive: " + carDrive +
                ", Doors Number: " + doorsNumber +
                ", Capacity: " + capacity +
                ", Passengers Number: " + passengersNumber +
                "}";
    }

    static class simpleCar {
        private BrandType brandType;
        private ModelType modelType;
        private boolean isUsed;

        public simpleCar(Car car) {
            this.brandType = car.getBrand();
            this.modelType = car.getModel();
            this.isUsed = car.isUsed();
        }

        @Override
        public String toString() {
            return "simpleCar{" +
                    "brandType=" + brandType +
                    ", modelType=" + modelType +
                    ", isUsed=" + isUsed +
                    '}';
        }
    }
}
