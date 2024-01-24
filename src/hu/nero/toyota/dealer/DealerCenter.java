package hu.nero.toyota.dealer;

import hu.nero.toyota.abscar.Color;
import hu.nero.toyota.factory.Country;
import hu.nero.toyota.factory.CountyFactoryNotEqualException;
import hu.nero.toyota.factory.DetailFactory;
import hu.nero.toyota.factory.FactoryLine;
import hu.nero.toyota.models.Camry;
import hu.nero.toyota.models.Dyna;
import hu.nero.toyota.models.Hiance;
import hu.nero.toyota.models.Solara;
import hu.nero.toyota.storage.Storage;

public class DealerCenter {
  private Country country;
  private Storage storage;
  private DetailFactory detailFactory;
  private FactoryLine factoryLine;

  public DealerCenter(Country country) {
    this.country = country;
    this.storage = new Storage();
    this.detailFactory = new DetailFactory(Country.JAPAN);
    this.factoryLine = new FactoryLine(detailFactory);
  }

//  public void createCars() throws CountyFactoryNotEqualException {
//    Camry camry = factoryLine.createCamry(Color.BLACK, 10000.00);
//    Solara solara = factoryLine.createSolara(Color.WHITE, 12000.00);
//    Hiance hiance = factoryLine.createHiance(Color.BLACK, 15000.00);
//    Dyna dyna = factoryLine.createDyna(Color.BLACK, 22000.00);
//    storage.addCamry(camry);
//    storage.addSolar(solara);
//    storage.addHiance(hiance);
//    storage.addDyna(dyna);
//  }
  public Storage getStorage() {
    return storage;
  }

  public void setStorage(Storage storage) {
    this.storage = storage;
  }

  public DetailFactory getDetailFactory() {
    return detailFactory;
  }

  public void setDetailFactory(DetailFactory detailFactory) {
    this.detailFactory = detailFactory;
  }

  public FactoryLine getFactoryLine() {
    return factoryLine;
  }

  public void setFactoryLine(FactoryLine factoryLine) {
    this.factoryLine = factoryLine;
  }
}
