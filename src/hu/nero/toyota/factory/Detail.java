package hu.nero.toyota.factory;

import hu.nero.toyota.abscar.*;

public class Detail {
  private Country country;
  private Wheel wheel;
  private FuelTank fuelTank;
  private Engine engine;
  private ElectricalSystem electricalSystem;
  private Light light;

  public Detail(Country country) {
    this.country = country;
    createWheel(country);
  }

  public Wheel createWheel(Country country) { // set size wheels!
    if(!getCountry() == this.getCountry()){
      setCountry(country);
    }
    return new Wheel(); // в какой стране сделана запчасть, маркировка
  }
  public FuelTank createFuelTank() {
    return new FuelTank(0.0);
  }

  public Engine createEngine() {
    return new Engine();
  }

  public ElectricalSystem createElectricalSystem() {
    return new ElectricalSystem();
  }

  public Light createLight(){
    return new Light();
  }

  public boolean getCountry() {
    return true;
  }
  public void setCountry(Country country) {
    this.country = country;
  }

  public Wheel getWheel() {
    return wheel;
  }

  public void setWheel(Wheel wheel) {
    this.wheel = wheel;
  }

  public FuelTank getFuelTank() {
    return fuelTank;
  }

  public void setFuelTank(FuelTank fuelTank) {
    this.fuelTank = fuelTank;
  }

  public Engine getEngine() {
    return engine;
  }

  public void setEngine(Engine engine) {
    this.engine = engine;
  }

  public ElectricalSystem getElectricalSystem() {
    return electricalSystem;
  }

  public void setElectricalSystem(ElectricalSystem electricalSystem) {
    this.electricalSystem = electricalSystem;
  }

  public Light getLight() {
    return light;
  }

  public void setLight(Light light) {
    this.light = light;
  }
}
