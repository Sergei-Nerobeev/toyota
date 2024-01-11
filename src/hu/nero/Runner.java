package hu.nero;

import hu.nero.toyota.abstractcar.*;
import hu.nero.toyota.models.Camry;
import hu.nero.toyota.models.Dyna;
import hu.nero.toyota.models.Hiance;
import hu.nero.toyota.models.Solara;

public class Runner {
  public static void main(String[] args) {

    Camry camry = new Camry(
        new Wheel(),
        false,
        "Red",
        220,
        "Automate",
        true,
        20000.00,
        new Wheel[4],
        new FuelTank(50.0),
        new Engine(),
        new ElectricalSystem(),
        new Light(),
        true
    );
    try {
      camry.startMovement();
      camry.addOptional();
      camry.tornOnLight();
      camry.stopMoving();
      camry.spareWheelChange(new Wheel());

    }
    catch (StartCarException exception) {
      System.out.println("Error: " + exception.getMessage());
    }

    System.out.println("--------------------------------");

    Solara solara = new Solara(
        new Wheel(),
        false,
        "Black",
        280,
        "Robot",
        true,
        30000.00,
        new Wheel[4],
        new FuelTank(20.00),
        new Engine(),
        new ElectricalSystem(),
        new Light(),
        true
    );
    try {
      solara.startMovement();
      solara.addOptional();
      solara.tornOnLight();
      solara.spareWheelChange(new Wheel());

    }
    catch (StartCarException exception) {
      System.out.println("Error: " + exception.getMessage());
    }

    System.out.println("--------------------------------");

    Dyna dyna = new Dyna(
        new Wheel(),
        false,
        "Green",
        180,
        "Mechanical",
        true,
        15000.00,
        new Wheel[4],
        new FuelTank(40.00),
        new Engine(),
        new ElectricalSystem(),
        new Light(),
        6

    );
    try {
      dyna.startMovement();
      dyna.addOptional();
      dyna.tornOnLight();
      dyna.spareWheelChange(new Wheel());
      dyna.stopMoving();
    }
    catch (StartCarException exception) {
      System.out.println("Error: " + exception.getMessage());
    }

    System.out.println("--------------------------------");

    Hiance hiance = new Hiance(

        false,
        "White",
        160,
        "Automate",
        true,
        40000.00,
        new Wheel[4],
        new FuelTank(60.00),
        new Engine(),
        new ElectricalSystem(),
        new Light(),
        8,
        new Wheel()

    );
    try {
      hiance.startMovement();
      hiance.getSpareWheel();
      hiance.tornOnLight();
      hiance.spareWheelChange(new Wheel());
      hiance.stopMoving();
    }
    catch (StartCarException exception) {
      System.out.println("Error: " + exception.getMessage());
    }

  }

}
