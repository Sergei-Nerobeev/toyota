package hu.nero.toyota.factory;

import hu.nero.toyota.abscar.*;
import hu.nero.toyota.models.Camry;
import hu.nero.toyota.models.Dyna;
import hu.nero.toyota.models.Hiance;
import hu.nero.toyota.models.Solara;

public class FactoryLine {
  private DetailFactory detailFactory;

  public FactoryLine(DetailFactory detailFactory) {
    this.detailFactory = detailFactory;
  }

  public Camry createCamry(Color color, double price) throws CountyFactoryNotEqualException {

    if (!detailFactory.getCountry().equals(this.detailFactory.getCountry())) {
      throw new CountyFactoryNotEqualException(
          "The factories are located in different countries: " +
              detailFactory.getCountry() + " and " + this.detailFactory.getCountry());
    }
    Wheel[] wheels = new Wheel[4]; // Спросить у Дани как лучше
    for (int i = 0; i < wheels.length; i++) {
        wheels[i] = new Wheel(17);
    }
    return new Camry(
        Country.CHINE,
        new Wheel(17),
        wheels,
        color,
        price,
        Type.PASSENGERS,
        MaxSpeed.CAMRY,
        Transmission.AUTOMATE,
        true,
        new FuelTank(20.00),
        new Engine(),
        new ElectricalSystem(),
        new Light()
    );
  }
  public Solara createSolara(Color color, double price) throws CountyFactoryNotEqualException {

    if (!detailFactory.getCountry().equals(this.detailFactory.getCountry())) {
      throw new CountyFactoryNotEqualException(
          "The factories are located in different countries: " +
              detailFactory.getCountry() + " and " + this.detailFactory.getCountry());
    }
    Wheel[] wheels = new Wheel[4]; // Спросить у Дани как лучше
    for (int i = 0; i < wheels.length; i++) {
        wheels[i] = new Wheel(16);
    }
    return new Solara(
        Country.USA,
        new Wheel(16),
        wheels,
        color,
        price,
        Type.PASSENGERS,
        MaxSpeed.CAMRY,
        Transmission.AUTOMATE,
        true,
        new FuelTank(20.00),
        new Engine(),
        new ElectricalSystem(),
        new Light()
    );
  }
  public Dyna createDyna(Color color, double price) throws CountyFactoryNotEqualException {

    if (!detailFactory.getCountry().equals(this.detailFactory.getCountry())) {
      throw new CountyFactoryNotEqualException(
          "The factories are located in different countries: " +
              detailFactory.getCountry() + " and " + this.detailFactory.getCountry());
    }
    Wheel[] wheels = new Wheel[4]; // Спросить у Дани как лучше
    for (int i = 0; i < wheels.length; i++) {
        wheels[i] = new Wheel(20);
    }
    return new Dyna(
        Country.CHINE,
        new Wheel(20),
        wheels,
        color,
        price,
        Type.PASSENGERS,
        MaxSpeed.CAMRY,
        Transmission.AUTOMATE,
        true,
        new FuelTank(20.00),
        new Engine(),
        new ElectricalSystem(),
        new Light(),
        1000
    );
  }
  public Hiance createHiance(Color color, double price) throws CountyFactoryNotEqualException {

    if (!detailFactory.getCountry().equals(this.detailFactory.getCountry())) {
      throw new CountyFactoryNotEqualException(
          "The factories are located in different countries: " +
              detailFactory.getCountry() + " and " + this.detailFactory.getCountry());
    }
    Wheel[] wheels = new Wheel[4]; // Спросить у Дани как лучше
    for (int i = 0; i < wheels.length; i++) {
        wheels[i] = new Wheel(20);
    }
    return new Hiance(
        Country.JAPAN,
        new Wheel(20),
        wheels,
        color,
        price,
        Type.PASSENGERS,
        MaxSpeed.CAMRY,
        Transmission.AUTOMATE,
        true,
        new FuelTank(20.00),
        new Engine(),
        new ElectricalSystem(),
        new Light()
    );
  }
}

