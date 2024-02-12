package hu.nero.toyota.dealer;

import hu.nero.toyota.abscar.Color;
import hu.nero.toyota.factory.Country;
import hu.nero.toyota.factory.CountryFactoryNotEqualException;
import hu.nero.toyota.factory.Detail;
import hu.nero.toyota.factory.FactoryLine;
import hu.nero.toyota.models.Camry;
import hu.nero.toyota.models.Dyna;
import hu.nero.toyota.models.Hiance;
import hu.nero.toyota.models.Solara;
import hu.nero.toyota.storage.Storage;

public class DealerCenter {
  private Country country;
  private Storage storage;
  private Detail detail;
  private FactoryLine factoryLine;

  public DealerCenter(Storage storage, FactoryLine factoryLine) {
    this.storage = new Storage();

  }

  public void createCars() throws CountryFactoryNotEqualException {
    Camry camry = factoryLine.createCamry(Color.BLACK, 10000.00);
    Solara solara = factoryLine.createSolara(Color.WHITE, 12000.00);
    Hiance hiance = factoryLine.createHiance(Color.BLACK, 15000.00);
    Dyna dyna = factoryLine.createDyna(Color.BLACK, 22000.00);
    storage.addCar(camry);
    storage.addCar(solara);
    storage.addCar(hiance);
    storage.addCar(dyna);
  }
  public Storage getStorage() {
    return storage;
  }

  public void setStorage(Storage storage) {
    this.storage = storage;
  }

  public Detail getDetailFactory() {
    return detail;
  }

  public void setDetailFactory(Detail detail) {
    this.detail = detail;
  }

  public FactoryLine getFactoryLine() {
    return factoryLine;
  }

  public void setFactoryLine(FactoryLine factoryLine) {
    this.factoryLine = factoryLine;
  }
}
