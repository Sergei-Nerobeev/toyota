package hu.nero.toyota.type;

import hu.nero.toyota.abstractcar.*;

public class Cabriolet extends Car {
  private boolean roofState;

  public Cabriolet(
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
      boolean roofState) {
    super(
        isFlatWheel,
        spareWheelRadius,
        color,
        maxSpeed,
        transmissionType,
        isMoving, price,
        wheels,
        fuelTank,
        engine,
        electricalSystem,
        light
    );
    this.roofState = roofState;
  }
}
