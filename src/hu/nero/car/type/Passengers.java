package hu.nero.car.type;

import hu.nero.car.*;

public class Passengers extends Car{
  private boolean cruiseControl = false;

  public Passengers(
      String color, int maxSpeed, String transmissionType, double price, Wheel[] wheels, FuelTank fuelTank,
      Engine engine,
      ElectricalSystem electricalSystem, Light light, boolean cruiseControl) {
    super(color, maxSpeed, transmissionType, price, wheels, fuelTank, engine, electricalSystem, light);
    this.cruiseControl = cruiseControl;
  }


}
