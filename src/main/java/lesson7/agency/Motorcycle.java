package lesson7.agency;

import java.util.Objects;

public class Motorcycle extends Vehicle {
    private String brand;

    public Motorcycle(String brand, String licencePlate, double pricePerDay) {
        super(pricePerDay, licencePlate);
        this.brand = brand;
    }

    @Override
    public String getVehicleInfo() {
        return getLicencePlate() + ": " + getPricePerDay() + " " + " available: " + isAvailable();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Motorcycle that)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(brand, that.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), brand);
    }
}
