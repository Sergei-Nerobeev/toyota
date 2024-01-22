package hu.nero.toyota.models;

import hu.nero.toyota.abscar.*;
import hu.nero.toyota.factory.Country;

public class Camry extends AbstractCar implements Optionable {
  private Wheel spareWheel;

  public Camry() {
  }
  
  public Camry(
      Country country,
      Wheel spareWheel,
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
    this.spareWheel = spareWheel;
  }

  @Override
  public void addOptional() {
    System.out.println("USB connected");
  }

  @Override
  public String toString() {
    return "Camry: " + color + "/" + price;
  }
}



