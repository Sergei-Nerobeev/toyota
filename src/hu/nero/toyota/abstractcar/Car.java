package hu.nero.toyota.abstractcar;

public abstract class Car implements SpareWheelChangeable {
  private int spareWheelRadius;
  private boolean isFlatWheel;
  private String color;
  private int maxSpeed;
  private String transmissionType;
  private boolean isMoving;
  private double price;
  private Wheel[] wheels;
  protected FuelTank fuelTank;
  protected Engine engine;
  protected ElectricalSystem electricalSystem;
  private Light light;

  public Car(
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
      Light light) {
    this.isFlatWheel = isFlatWheel;
    this.spareWheelRadius = spareWheelRadius;
    this.color = color;
    this.maxSpeed = maxSpeed;
    this.transmissionType = transmissionType;
    this.price = price;
    this.wheels = wheels;
    this.fuelTank = fuelTank;
    this.engine = engine;
    this.electricalSystem = electricalSystem;
    this.light = light;
    this.isMoving = isMoving;

  }

  public void startMovement() throws StartCarException {
    if (wheels.length == 4 &&
        isFlatWheel == false &&
        fuelTank.getFuelLevel() > 0 &&
        engine.getEngineOn() &&
        electricalSystem.getElectricalSystem()) {
      isMoving = true;
      System.out.println("Car starts moving");
    }
    else {
      throw new StartCarException("Unable to start the car.Check conditions.");
    }
  }

  @Override
  public void spareWheelChange(int radius) {
    if (radius == getSpareWheelRadius()) {
      System.out.println("Successful wheel changed!");
    }
    else {
      stopMoving();
      System.out.println("Wheel diameter is not the same");
    }
  }

  public void stopMoving() {
    isMoving = false;
    System.out.println("Car is not moving");
  }

  public void tornOnLight() {
    light.tornOn();
  }

  public int getSpareWheelRadius() {
    return spareWheelRadius;
  }
}




