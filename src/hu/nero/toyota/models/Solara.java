package hu.nero.toyota.models;

import hu.nero.toyota.abstractcar.*;
import hu.nero.toyota.type.Cabriolet;

public class Solara extends Cabriolet implements Optionable {

  public Solara(
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
