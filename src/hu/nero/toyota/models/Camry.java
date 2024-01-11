package hu.nero.toyota.models;

import hu.nero.toyota.abstractcar.*;
import hu.nero.toyota.type.Passengers;

public class Camry extends Passengers implements Optionable {

  public Camry(
      boolean isFlatWheel,
      int spareWheelRadius,
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
        isFlatWheel,
        spareWheelRadius,
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




