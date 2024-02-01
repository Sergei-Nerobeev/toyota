package hu.nero.toyota.factory;

import hu.nero.toyota.abscar.*;

public class DetailFactory {
  private Country country;

  public DetailFactory(Country country) {
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


}
