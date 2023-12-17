package lesson7.agency;

public class Rental {
    public static void main(String[] args) {
        Agency agency = new Agency();

        Customer customer1 = new Customer(1, "Jon Dee");
        Customer customer2 = new Customer(2, "Ann Lee");
        agency.addCustomer(customer1);
        agency.addCustomer(customer2);

        Car car = new Car(80.0, "ABC-1234", "Jeep");
        Motorcycle motorcycle = new Motorcycle("BMW", "DEF-4567", 60.0);
        System.out.println(agency.addVehicle(car));
        System.out.println(agency.addVehicle(motorcycle));

        System.out.println(agency.displayAvailableVehicles());

        System.out.println(agency.rentVehicle(3, "ABC-1234"));
        System.out.println(agency.rentVehicle(1, "ABC-1233"));
        System.out.println(agency.returnVehicle(1, "ABC-1234"));
    }
}
