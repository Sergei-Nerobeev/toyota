package hu.nero.toyota.detail;

public class FuelTank {
    private double level = 0;

    public double getLevel() {
        return level;
    }

    public void setLevel(double level) {
        if (level < 0) {
            throw new RuntimeException("FueLevel is empty!");
        }
        this.level = level;
    }
}
