package hu.nero.toyota.factory;

import hu.nero.toyota.abscar.*;
import hu.nero.toyota.models.Camry;
import hu.nero.toyota.models.Dyna;
import hu.nero.toyota.models.Hiance;
import hu.nero.toyota.models.Solara;

public class FactoryLine {
  private DetailFactory detailFactory;
  private final String exceptionMassage = "The factories are located in different countries: ";
  private final String and = " and ";

  public FactoryLine(DetailFactory detailFactory) {
    this.detailFactory = detailFactory;
  }

  public Camry createCamry(Color color, double price) throws CountryFactoryNotEqualException {
    if (!detailFactory.getCountry() == this.detailFactory.getCountry()) {
      throw new CountryFactoryNotEqualException(
          exceptionMassage + detailFactory.getCountry() + and + this.detailFactory.getCountry());
    }
    Wheel[] wheels = new Wheel[4]; // Сделать через фабричные методы
    for (int i = 0; i < wheels.length; i++) {
      wheels[i] = new Wheel(17);
    }
    return new Camry(
        Title.CAMRY,
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

  public Solara createSolara(Color color, double price) throws CountryFactoryNotEqualException {
    if (!detailFactory.getCountry() == (this.detailFactory.getCountry())) {
      throw new CountryFactoryNotEqualException(
          exceptionMassage + detailFactory.getCountry() + and + this.detailFactory.getCountry());
    }
    Wheel[] wheels = new Wheel[4]; // Спросить у Дани как лучше
    for (int i = 0; i < wheels.length; i++) {
      wheels[i] = new Wheel(16);
    }
    return new Solara(
        Title.SOLARA,
        Country.JAPAN,
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

  public Dyna createDyna(Color color, double price) throws CountryFactoryNotEqualException {

    if (!detailFactory.getCountry() == (this.detailFactory.getCountry())) {
      throw new CountryFactoryNotEqualException(
          exceptionMassage + detailFactory.getCountry() + and + this.detailFactory.getCountry());
    }
    Wheel[] wheels = new Wheel[4]; // Спросить у Дани как лучше
    for (int i = 0; i < wheels.length; i++) {
      wheels[i] = new Wheel(20);
    }
    return new Dyna(
        Title.DYNA,
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

  public Hiance createHiance(Color color, double price) throws CountryFactoryNotEqualException {

    if (!detailFactory.getCountry() == (this.detailFactory.getCountry())) {
      throw new CountryFactoryNotEqualException(
         exceptionMassage +  detailFactory.getCountry() + and + this.detailFactory.getCountry());
    }
    Wheel[] wheels = new Wheel[4]; // Спросить у Дани как лучше
    for (int i = 0; i < wheels.length; i++) {
      wheels[i] = new Wheel(20);
    }
    return new Hiance(
        Title.HIANCE,
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

