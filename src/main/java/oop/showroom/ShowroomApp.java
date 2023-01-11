package oop.showroom;

import oop.showroom.model.Car;
import oop.showroom.model.Motorbike;
import oop.showroom.model.Vehicle;
import oop.showroom.model.enums.*;
import oop.showroom.repository.VehicleRepository;
import oop.showroom.service.VehicleServiceImpl;

import java.util.Arrays;

public class ShowroomApp {

    public static void main(String[] args) {
        Vehicle audi = new Car(BrandType.AUDI, ModelType.A4, ColourType.RED, EngineType.V8, 10_000,
                GearboxType.AUTOMATIC, false, FuelType.PB95, "car-drive", 5,
                200, 5);

        Motorbike bmwMotorbike = new Motorbike(BrandType.BMW, ModelType.X6, ColourType.GREEN, EngineType.V8, 50_000,
                GearboxType.AUTOMATIC, true, MotorbikeType.CHOPPER, "łańcuch");

        VehicleServiceImpl vehicleService = new VehicleServiceImpl();
        vehicleService.addVehicle(audi);
        vehicleService.addVehicle(bmwMotorbike);

        System.out.println(Arrays.toString(VehicleRepository.vehicles));

    }
}
