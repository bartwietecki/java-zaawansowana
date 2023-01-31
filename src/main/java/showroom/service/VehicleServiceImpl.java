package showroom.service;

import showroom.exceptions.BadObjectException;
import showroom.exceptions.NotFoundException;
import showroom.model.Vehicle;
import showroom.model.enums.BrandType;
import showroom.repository.VehicleRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static showroom.exceptions.ExceptionMessages.OBJECT_CANNOT_BE_NULL;
import static showroom.exceptions.ExceptionMessages.OBJECT_NOT_FOUND_BY_PROVIDED_ID;

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
        VehicleRepository.add(vehicle);
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
        return VehicleRepository.getVehicles();
    }

    /**
     * Metoda pozwalająca na pobranie z repozytorium pojazdów danej marki
     * @param brandType marka pojazdu
     * @return zwracamy listę pojazdów
     */
    @Override
    public List<Vehicle> getVehiclesByBrand(BrandType brandType) {
        Optional.ofNullable(brandType).orElseThrow(() -> new BadObjectException(OBJECT_CANNOT_BE_NULL));
                                                  // jeśli to będzie nullem to po prostu dostaniemy BadObjectException
        return VehicleRepository.getVehicles().stream().filter(v -> brandType.equals(v.getBrand()))
                .collect(Collectors.toList());
    }

    /**
     * Metoda pozwalająca na usunięcie pojazdu o danym id
     * @param id identyfikator pojazdu
     */
    @Override
    public void removeVehicle(Long id) {
        Optional.ofNullable(id).orElseThrow(() -> new BadObjectException(OBJECT_CANNOT_BE_NULL));
        var vehicle = VehicleRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(OBJECT_NOT_FOUND_BY_PROVIDED_ID)); // .orElseThrow() bo to optional
        VehicleRepository.remove(id);
    }
}