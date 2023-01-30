package showroom.service;

import showroom.model.Vehicle;
import showroom.repository.VehicleRepository;

import java.util.List;

public class VehicleServiceImpl implements VehicleService { // implementacja interfejsów, robi się to po to aby
    // zaimplementować jakiś "service"

/*
    // tutaj było zadanie z licznikiem, aby wypisywać po kolei każdy pojazd. Przenalizuję jeszcze raz to zadanie (nie zrobiłem)
    static int id = 0;

    // jeszcze zanim zamieniliśmy tablicę na listę ...

    @Override
    public void addVehicle(Vehicle vehicle) {
        VehicleRepository.vehicles[id] = vehicle;
        id++;
    }
 */

    @Override
    public void addVehicle(Vehicle vehicle) {
        VehicleRepository.vehicles.add(vehicle);
    }


    /*
    // Ogarnąć sobie jeszcze raz, 2 tablice, działanie
    @Override
    public Vehicle[] getAllVehicles() {

        Vehicle[] tab = VehicleRepository.vehicles;
        int counter = 0;
        for (Vehicle v : tab) {
            if (v != null)
                counter++;
        }

        Vehicle[] result = new Vehicle[counter]; // nowa tablica, która jest tak długa ile jest elementów NIEnullowych !
        int index = 0;
        for (Vehicle v : tab) {
            if (v != null) {
                result[index] = v;
                index++;
            }
        }
        return result;
    }
     */

    @Override
    public List<Vehicle> getAllVehicles() {
        return VehicleRepository.vehicles;
    }

}