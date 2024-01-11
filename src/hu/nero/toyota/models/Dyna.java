package hu.nero.toyota.models;

import hu.nero.toyota.abstractcar.*;
import hu.nero.toyota.type.Van;

public class Dyna extends Van implements Optionable {

  public Dyna(
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
        light,
        cargoCapacity
    );
  }

  @Override
  public void addOptional() {
    System.out.println("Charge phone option connected");
  }

}
