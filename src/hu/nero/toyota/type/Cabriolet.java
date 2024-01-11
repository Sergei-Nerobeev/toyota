package hu.nero.toyota.type;

import hu.nero.toyota.abscar.*;

public class Cabriolet extends Car {
  private boolean roofState;

  public Cabriolet(
      Wheel spareWheel,
      boolean isFlatWheel,
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
        spareWheel,
        isFlatWheel,
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
