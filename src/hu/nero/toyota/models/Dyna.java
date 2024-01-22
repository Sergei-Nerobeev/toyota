package hu.nero.toyota.models;

import hu.nero.toyota.abscar.*;

public class Dyna extends AbstractCar implements Optionable {
  private int maxCapacity;

  public Dyna(
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
      Light light,
      int maxCapacity) {
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
    this.maxCapacity = maxCapacity;
  }

  @Override
  public void addOptional() {
    System.out.println("Charge phone option connected");
  }


}
