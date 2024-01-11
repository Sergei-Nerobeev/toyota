package hu.nero;

import hu.nero.car.*;
import hu.nero.car.models.Camry;

public class Runner {
  public static void main(String[] args) throws StartCarException {

    Camry camry = new Camry(
        "Red",
        220,
        "Automate",
        20000.00,
        new Wheel[4],
        new FuelTank(0.0),
        new Engine(),
        new ElectricalSystem(),
        new Light(),
        true
    );
    camry.startMovement();

  }
}
