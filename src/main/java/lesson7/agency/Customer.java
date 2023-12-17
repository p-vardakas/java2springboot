package lesson7.agency;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Customer implements CustomerActions {
    private int id;
    private String name;
    private List<Vehicle> rentedVehicles;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
        this.rentedVehicles = new ArrayList<>();
    }

    @Override
    public String rentVehicle(Vehicle vehicle) {
        if (!rentedVehicles.contains(vehicle) && vehicle.isAvailable()) {
            rentedVehicles.add(vehicle);
            vehicle.setAvailable(false);
            return name + " rented " + vehicle.getVehicleInfo();
        }
        return "Vehicle already rented";
    }

    @Override
    public String returnVehicle(Vehicle vehicle) {
        if (rentedVehicles.contains(vehicle)) {
            vehicle.setAvailable(true);
            rentedVehicles.remove(vehicle);
            return name + " returned " + vehicle.getVehicleInfo();
        }
        return name + " has not rented " + vehicle.getVehicleInfo();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id && Objects.equals(name, customer.name) && Objects.equals(rentedVehicles, customer.rentedVehicles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, rentedVehicles);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
