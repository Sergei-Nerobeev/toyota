package hu.nero.toyota.abscar;

public class FuelTank {
  private double fuelLevel;

  public FuelTank(double fuelLevel) {
    this.fuelLevel = fuelLevel;
  }

  public boolean isNotEmpty() {
    return fuelLevel >= 0.0;
  }

  public double getFuelLevel() {
    return fuelLevel;
  }
}
