package hu.nero.toyota.detail;

public class FuelTank {
    private double fuelLevel = 0;

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        if (fuelLevel < 0) {
            throw new RuntimeException("FueLevel is empty!");
        }
        this.fuelLevel = fuelLevel;
    }
}
