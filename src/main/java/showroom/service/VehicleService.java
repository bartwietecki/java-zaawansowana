package showroom.service;

import showroom.model.Vehicle;

import java.util.List;

public interface VehicleService {

    void addVehicle(Vehicle vehicle);

//    Vehicle[] getAllVehicles();

    List<Vehicle> getAllVehicles();

}
