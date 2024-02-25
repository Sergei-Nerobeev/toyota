package hu.nero.toyota.detail;

public class FuelTank {
    private double level = 0;

    public FuelTank(double level) {
        this.level = level;
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
    public void addFuel(double level) {
        this.level = level;
    }
}
