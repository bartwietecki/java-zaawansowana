package showroom.service;

import showroom.model.Vehicle;
import showroom.model.enums.BrandType;

import java.util.List;

public interface VehicleService {

    void addVehicle(Vehicle vehicle);

//    Vehicle[] getAllVehicles();

    List<Vehicle> getAllVehicles();

    List<Vehicle> getVehiclesByBrand(BrandType brandType);

    void removeVehicle(Long id);

}

