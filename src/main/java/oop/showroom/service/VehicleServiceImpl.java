package oop.showroom.service;

import oop.showroom.model.Vehicle;
import oop.showroom.repository.VehicleRepository;

public class VehicleServiceImpl implements VehicleService { // implementacja interfejsów, robi się to po to aby
    // zaimplementować jakiś "service"


    // tutaj było zadanie z licznikiem, aby wypisywać po kolei każdy pojazd. Przenalizuję jeszcze raz to zadanie (nie zrobiłem)
    static int id = 0;

    @Override
    public void addVehicle(Vehicle vehicle) {
        VehicleRepository.vehicles[id] = vehicle;
        id++;
    }

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

}