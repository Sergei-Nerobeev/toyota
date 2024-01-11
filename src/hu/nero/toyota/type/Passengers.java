package hu.nero.toyota.type;

import hu.nero.toyota.abscar.*;

public class Passengers extends Car {
  private boolean cruiseControl = false;

  public Passengers(
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
      boolean cruiseControl) {
    super(
        spareWheel,
        isFlatWheel,
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
