package lesson7.agency;

import java.util.ArrayList;
import java.util.List;

public class Agency implements AgencyActions {
    private List<Customer> customers;
    private List<Vehicle> vehicles;

    public Agency() {
        customers = new ArrayList<>();
        vehicles = new ArrayList<>();
    }

    @Override
    public String addCustomer(Customer customer) {
        if (!customers.contains(customer)) {
            customers.add(customer);
            return customer.getId() + " " + customer.getName() + " added.";
        }
        return "Customer already exists.";
    }

    @Override
    public String displayAvailableVehicles() {
        if (vehicles.isEmpty()) {
            return "No vehicles available for rent.";
        }

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Available cars:");
        for (Vehicle vehicle : vehicles) {
            if (vehicle.isAvailable()) {
                stringBuilder.append(vehicle.getVehicleInfo());
            }
        }

        return stringBuilder.toString();
    }

    @Override
    public String rentVehicle(int customerId, String licencePlate) {

        Customer customer = getCustomerById(customerId);

        if (customer == null) {
            return "Customer with id " + customerId + " not found";
        }

        Vehicle vehicle = getVehicleByLicence(licencePlate);

        if (vehicle == null) {
            return "Vehicle with licence plate " + licencePlate + " not found";
        }

        return customer.rentVehicle(vehicle);
    }

    @Override
    public String returnVehicle(int customerId, String licencePlate) {
        Customer customer = getCustomerById(customerId);

        if (customer == null) {
            return "Customer with id " + customerId + " not found";
        }

        Vehicle vehicle = getVehicleByLicence(licencePlate);

        if (vehicle == null) {
            return "Vehicle with licence plate " + licencePlate + " not found";
        }

        return customer.returnVehicle(vehicle);
    }

    private Vehicle getVehicleByLicence(String licencePlate) {
        Vehicle selectedVehicle = null;
        for (Vehicle vehicle : vehicles) {
            if (vehicle != null && vehicle.getLicencePlate().equals(licencePlate)) {
                selectedVehicle = vehicle;
            }
        }
        return selectedVehicle;
    }

    private Customer getCustomerById(int customerId) {
        Customer selectedCustomer = null;
        for (Customer customer : customers) {
            if (customer != null && customer.getId() == customerId) {
                selectedCustomer = customer;
            }
        }
        return selectedCustomer;
    }

    @Override
    public String addVehicle(Vehicle vehicle) {
        if (!vehicles.contains(vehicle)) {
            vehicles.add(vehicle);
            return vehicle.getVehicleInfo() + ": added.";
        }
        return "Vehicle already exists.";
    }
}
