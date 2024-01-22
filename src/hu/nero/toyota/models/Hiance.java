package hu.nero.toyota.models;

import hu.nero.toyota.abscar.*;

public class Hiance extends AbstractCar implements Optionable {

  public Hiance(
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

}



