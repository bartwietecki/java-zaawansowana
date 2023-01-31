package showroom.repository;

import showroom.model.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class VehicleRepository {

    private static long id = 0L;

    // final - nie możemy przypisać innego obiektu, ale możemy tę listę cały czas modyfikować ofc
    private static final List<Vehicle> vehicles = new ArrayList<>();

    public static List<Vehicle> getVehicles() {
        return vehicles;
    }

    public static void add(Vehicle vehicle) {
        vehicle.setId(id); // po kazdym dodaniu obiektu
        id++;              // id nam się zwiększy o 1

    }

    public static Optional<Vehicle> findById(Long id) {
        var result = vehicles.stream().filter(vehicle -> id.equals(vehicle.getId())).toList();
        return Optional.ofNullable(result.get(0));
    }

    public static void remove(Long id) {
        vehicles.removeIf(vehicle -> id.equals(vehicle.getId())); // usuwamy jeśli id podane tutaj jest równe
        // id któregoś z vehicles

    }

    public static void remove(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }
}
