package hu.nero.toyota.models;

import hu.nero.toyota.abscar.*;
import hu.nero.toyota.type.Van;

public class Hiance extends Van {

  public Hiance(
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
      int cargoCapacity,
      Wheel spareWheel) {
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
        light,
        cargoCapacity
    );

  }

}
