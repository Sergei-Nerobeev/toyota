package hu.nero.toyota.abscar;

import java.util.concurrent.ThreadLocalRandom;

public abstract class AbstractCar {
  protected Wheel[] wheels;
  protected Color color;
  protected double price;
  protected Type type;
  protected MaxSpeed maxSpeed;
  protected Transmission transmission;
  protected boolean isMoving;
  protected FuelTank fuelTank;
  protected Engine engine;
  protected ElectricalSystem electricalSystem;
  protected Light light;
  public AbstractCar(){}

  public AbstractCar(
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
    this.wheels = wheels;
    this.color = color;
    this.price = price;
    this.type = type;
    this.maxSpeed = maxSpeed;
    this.transmission = transmission;
    this.isMoving = isMoving;
    this.fuelTank = fuelTank;
    this.engine = engine;
    this.electricalSystem = electricalSystem;
    this.light = light;
  }

  public void startMovement() throws StartCarException { // спросить у Дани
    if (wheels.length != 4) {
      throw new StartCarException("Check count of wheels: " + wheels.length);
    }
    if (wheels[0].isFlat()) {
      throw new StartCarException("Check wheel condition: " + wheels[0].isFlat());
    }
    if (fuelTank.getFuelLevel() < 0) {
      throw new StartCarException("Check fuelTank level: " + (fuelTank.getFuelLevel() > 0));
    }
    if (engine.isEngineOn()) {
      throw new StartCarException("Check engine: " + engine.isEngineOn());
    } else {
      System.out.println("Car starts moving");
    }
  }

  public void stopMoving() {
    isMoving = false;
    System.out.println("Car is not moving");
  }

  public void tornOnLight() {
    light.tornOn();
  }

  public boolean changeWheel(Wheel wheelForReplacement) {
    for (int i = 0; i < wheels.length; i++)
        if (!wheels[i].isFlat() && wheels[i].getRadius() == wheelForReplacement.getRadius()) {
        wheels[i] = wheelForReplacement;
        System.out.println("Wheel changed");
        return true;
      }

    System.out.println("Radius is not correct");
    return false;
  }
  public void getFlatTire() {
    getRandomWheel().setFlat(true);
  }

  private Wheel getRandomWheel() {
    final var randomIndex = ThreadLocalRandom.current().nextInt(0, wheels.length);
    return wheels[randomIndex];
  }

}

