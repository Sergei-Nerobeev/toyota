package hu.nero.toyota.models;

import hu.nero.toyota.abstractcar.*;
import hu.nero.toyota.type.Cabriolet;

public class Solara extends Cabriolet implements Optionable {

  public Solara(
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
        isMoving,
        price,
        wheels,
        fuelTank,
        engine,
        electricalSystem,
        light,
        roofState
    );
  }

  @Override
  public void addOptional() {
    System.out.println("Mini-fridge connected");
  }

}
