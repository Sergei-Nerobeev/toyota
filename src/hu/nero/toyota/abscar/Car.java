package hu.nero.toyota.abscar;

public abstract class Car implements SpareWheelChangeable {
  private Wheel spareWheel;
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
      Light light) {
    this.isFlatWheel = isFlatWheel;
    this.spareWheel = spareWheel;
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

  public Wheel getSpareWheel() {
    return spareWheel;
  }

  @Override
  public void spareWheelChange(Wheel wheel) {
    if (wheel.getRadius() == wheel.getRadius()) {
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

}




