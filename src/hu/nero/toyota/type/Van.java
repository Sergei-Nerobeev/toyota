package hu.nero.toyota.type;

import hu.nero.toyota.abstractcar.*;

public class Van extends Car {
  private int cargoCapacity;

  public Van(
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
      int cargoCapacity) {
    super(
        spareWheel,
        isFlatWheel,
        color,
        maxSpeed,
        transmissionType,
        isMoving,
        price,
        wheels,
        fuelTank,
        engine,
        electricalSystem,
        light
    );
    this.cargoCapacity = cargoCapacity;
  }
}
