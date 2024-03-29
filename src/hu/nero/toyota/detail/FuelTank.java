package hu.nero.toyota.detail;

import java.util.Objects;

public class FuelTank {
    private double level = 0;
    private final double volume;

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
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        FuelTank fuelTank = (FuelTank) object;
        return Double.compare(level, fuelTank.level) == 0 &&
               Double.compare(volume, fuelTank.volume) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(level, volume);
    }
}
