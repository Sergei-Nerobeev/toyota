package hu.nero.car.models;

import hu.nero.car.*;
import hu.nero.car.type.Van;

public class Dyna extends Van implements OptionWritable {
  public Dyna(
      String color,
      int maxSpeed,
      String transmissionType,
      double price,
      Wheel[] wheels,
      FuelTank fuelTank,
      Engine engine,
      ElectricalSystem electricalSystem,
      Light light,
      int cargoCapacity) {
    super(color, maxSpeed, transmissionType, price, wheels, fuelTank, engine, electricalSystem, light, cargoCapacity);
  }

  @Override
  public void addOptional() {
    System.out.println("Charge phone option connected");
  }

}
