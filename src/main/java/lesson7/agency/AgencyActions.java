package lesson7.agency;

public interface AgencyActions {
    String addCustomer(Customer customer);

    String displayAvailableVehicles();

    String rentVehicle(int customerId, String licencePlate);

    String returnVehicle(int customerId, String licencePlate);

    String addVehicle(Vehicle vehicle);
}
