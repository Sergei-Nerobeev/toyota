package hu.nero.toyota.models;

import hu.nero.toyota.abscar.*;
import hu.nero.toyota.factory.Country;

public class Hiance extends AbstractCar implements Optionable {

  public Hiance(
      Title title,
      Country country,
      Wheel wheel,
      Wheel[] wheels,
      Color color,
      double price,
      Type type,
      MaxSpeed maxSpeed,
      Transmission transmission,
      boolean isMoving,
      FuelTank fuelTank,
      Engine engine,
      ElectricalSystem electricalSystem,
      Light light) {
    super(
        title,
        country,
        wheels,
        color,
        price,
        type,
        maxSpeed,
        transmission,
        isMoving,
        fuelTank,
        engine,
        electricalSystem,
        light
    );
  }

  @Override
  public void addOptional() {
    System.out.println("SpareWheel option connected");
  }
  @Override
  public String toString() {
    return "Hiance: " + color + "/" + price;
  }
}



