package hu.nero.car.models;

import hu.nero.car.*;
import hu.nero.car.type.Van;

public class Hiance extends Van {
  private int spareWheel = 1;

  public Hiance(
      String color,
      int maxSpeed,
      String transmissionType,
      double price,
      Wheel[] wheels,
      FuelTank fuelTank,
      Engine engine,
      ElectricalSystem electricalSystem,
      Light light,
      int cargoCapacity,
      int spareWheel) {
    super(color, maxSpeed, transmissionType, price, wheels, fuelTank, engine, electricalSystem, light, cargoCapacity);
    this.spareWheel = spareWheel;
  }

  public int getSpareWheel() {
    return spareWheel;
  }
}
