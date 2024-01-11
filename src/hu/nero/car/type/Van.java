package hu.nero.car.type;

import hu.nero.car.*;

public class Van extends Car {
  private int cargoCapacity;

  public Van(
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
