package hu.nero;

import hu.nero.car.*;
import hu.nero.car.models.Camry;
import hu.nero.car.models.Dyna;
import hu.nero.car.models.Hiance;
import hu.nero.car.models.Solara;

public class Runner {
  public static void main(String[] args) throws StartCarException {

    Camry camry = new Camry(
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
    camry.startMovement();
    camry.addOptional();
    camry.tornOnLight();
    camry.stopMoving();

    System.out.println("--------------------------------");

    Solara solara = new Solara(
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
    solara.startMovement();
    solara.addOptional();
    solara.tornOnLight();
    solara.stopMoving();

    System.out.println("--------------------------------");

    Dyna dyna = new Dyna(
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
    dyna.startMovement();
    dyna.addOptional();
    dyna.tornOnLight();
    dyna.stopMoving();

    System.out.println("--------------------------------");

    Hiance hiance = new Hiance(
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
        1

    );
    hiance.startMovement();
    hiance.getSpareWheel();
    hiance.tornOnLight();
    hiance.stopMoving();
  }

}
