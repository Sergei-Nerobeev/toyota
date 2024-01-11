package hu.nero.car.type;

import hu.nero.car.*;

public class Cabriolet extends Car {
  private boolean roofState;
  public Cabriolet(
      String color, int maxSpeed, String transmissionType, double price, Wheel[] wheels, FuelTank fuelTank,
      Engine engine,
      ElectricalSystem electricalSystem, Light light, boolean roofState) {
    super(color, maxSpeed, transmissionType, price, wheels, fuelTank, engine, electricalSystem, light);
    this.roofState = roofState;
  }

}
