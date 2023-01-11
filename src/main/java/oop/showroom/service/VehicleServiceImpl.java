package oop.showroom.service;

import oop.showroom.model.Vehicle;
import oop.showroom.repository.VehicleRepository;

public class VehicleServiceImpl implements VehicleService {


    // tutaj było zadanie z licznikiem, aby wypisywać po kolei każdy pojazd. Przenalizuję jeszcze raz to zadanie (nie zrobiłem)
    static int id = 0;
    @Override
    public void addVehicle(Vehicle vehicle) {
        VehicleRepository.vehicles[id] = vehicle;
        id++;
    }

    @Override
    public Vehicle[] getAllVehicles() {
        return VehicleRepository.vehicles;
    }
}