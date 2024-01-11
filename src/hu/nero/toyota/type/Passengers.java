package hu.nero.toyota.type;

import hu.nero.toyota.abstractcar.*;

public class Passengers extends Car {
  private boolean cruiseControl = false;

  public Passengers(
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
      boolean cruiseControl) {
    super(
        isFlatWheel,
        spareWheelRadius,
        color, maxSpeed,
        transmissionType,
        isMoving,
        price,
        wheels,
        fuelTank,
        engine,
        electricalSystem,
        light
    );
    this.cruiseControl = cruiseControl;
  }
}
