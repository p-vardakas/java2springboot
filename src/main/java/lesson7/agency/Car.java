package lesson7.agency;

import java.util.Objects;

public class Car extends Vehicle{
    private String type;

    public Car(double pricePerDay, String licencePlate, String type) {
        super(pricePerDay, licencePlate);
        this.type = type;
    }

    @Override
    public String getVehicleInfo() {
        return getLicencePlate() + ": " + type + " " + getPricePerDay() + " " + " available: " + isAvailable();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(type, car.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type);
    }
}
