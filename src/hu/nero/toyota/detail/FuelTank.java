package hu.nero.toyota.detail;

import java.util.Objects;

public class FuelTank {
    private CountryOfProduction countryOfProduction;
    private double level = 0;
    private final double volume;

    public FuelTank(CountryOfProduction countryOfProduction, double volume) {
        this.countryOfProduction = countryOfProduction;
        this.volume = volume;
    }

    public FuelTank(double volume) {
        this.volume = volume;
    }

    public double getLevel() {
        return level;
    }

    public void setLevel(double level) {
        if (level < 0) {
            throw new RuntimeException("FueLevel is empty!");
        }
        this.level = level;
    }

    @Override
    public String toString() {
        return "FuelTank{" +
                level +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FuelTank fuelTank = (FuelTank) o;
        return Double.compare(level, fuelTank.level) == 0
                && Double.compare(volume, fuelTank.volume) == 0
                && countryOfProduction == fuelTank.countryOfProduction;
    }

    @Override
    public int hashCode() {
        return Objects.hash(level, volume);
    }
}
