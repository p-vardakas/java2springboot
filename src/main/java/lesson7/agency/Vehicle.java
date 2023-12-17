package lesson7.agency;

import java.util.Objects;

public abstract class Vehicle implements Rentable {
    private boolean isAvailable;
    private double pricePerDay;
    private String licencePlate;

    public Vehicle(double pricePerDay, String licencePlate) {
        this.pricePerDay = pricePerDay;
        this.licencePlate = licencePlate;
        this.isAvailable = true;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public abstract String getVehicleInfo();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle vehicle)) return false;
        return isAvailable == vehicle.isAvailable && Double.compare(pricePerDay, vehicle.pricePerDay) == 0 && Objects.equals(licencePlate, vehicle.licencePlate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isAvailable, pricePerDay, licencePlate);
    }
}
