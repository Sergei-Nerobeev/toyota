package hu.nero.toyota.models;

import hu.nero.toyota.abstractcar.*;
import hu.nero.toyota.type.Van;

public class Hiance extends Van {
  private int spareWheel = 1;

  public Hiance(
      boolean isFlatWheel,
      int spareWheelRadius,
      String color,
      int maxSpeed,
      String transmissionType,
      boolean isMoving,
      double price,
      Wheel[] wheels,
      FuelTank fuelTank,
      Engine engine,
      ElectricalSystem electricalSystem,
      Light light,
      int cargoCapacity,
      int spareWheel) {
    super(
        isFlatWheel,
        spareWheelRadius,
        color,
        maxSpeed,
        transmissionType,
        isMoving,
        price,
        wheels,
        fuelTank,
        engine,
        electricalSystem,
        light,
        cargoCapacity
    );
    this.spareWheel = spareWheel;
  }

  public int getSpareWheel() {
    return spareWheel;
  }
}
