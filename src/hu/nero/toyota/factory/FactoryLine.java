package hu.nero.toyota.factory;

import hu.nero.toyota.abscar.*;
import hu.nero.toyota.models.Camry;

public class FactoryLine {
  private DetailFactory detailFactory;

  public FactoryLine(DetailFactory detailFactory) {
    this.detailFactory = detailFactory;
  }

  public Camry createCamry(String color, double price) throws CountyFactoryNotEqualException {
    if (!detailFactory.getCountry().equals(this.detailFactory.getCountry())) {
      throw new CountyFactoryNotEqualException(
          "The factories are located in different countries: " +
          detailFactory.getCountry() + " and " + this.detailFactory.getCountry());
    }
    return new Camry(
        new Wheel(),
        false,
        "Red",
        260,
        "Automate",
        true,
        20000.00,
        new Wheel[4],
        new FuelTank(10),
        new Engine(),
        new ElectricalSystem(),
        new Light(),
        true
        );
  }
}

