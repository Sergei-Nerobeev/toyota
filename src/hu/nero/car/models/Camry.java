package hu.nero.car.models;

import hu.nero.car.*;
import hu.nero.car.type.Passengers;

public class Camry extends Passengers implements OptionWritable {

  public Camry(
      String color,
      int maxSpeed,
      String transmissionType,
      double price,
      Wheel[] wheels,
      FuelTank fuelTank,
      Engine engine,
      ElectricalSystem electricalSystem,
      Light light,
      boolean cruiseControl) {
    super(color, maxSpeed, transmissionType, price, wheels, fuelTank, engine, electricalSystem, light, cruiseControl);
  }

  @Override
  public void addOptional() {
    System.out.println("Usb connected");
  }
}
