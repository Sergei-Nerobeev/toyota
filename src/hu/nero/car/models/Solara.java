package hu.nero.car.models;

import hu.nero.car.*;
import hu.nero.car.type.Cabriolet;

public class Solara extends Cabriolet implements OptionWritable {

  public Solara(
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
