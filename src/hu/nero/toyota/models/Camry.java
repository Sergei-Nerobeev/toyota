package hu.nero.toyota.models;

import hu.nero.toyota.abstractcar.*;
import hu.nero.toyota.type.Passengers;

public class Camry extends Passengers implements Optionable {

  public Camry(
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
      boolean cruiseControl) {
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
        cruiseControl
    );
  }

  @Override
  public void addOptional() {
    System.out.println("Usb connected");
  }




}




