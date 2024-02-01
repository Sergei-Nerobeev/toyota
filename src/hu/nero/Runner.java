package hu.nero;

import hu.nero.toyota.dealer.DealerCenter;
import hu.nero.toyota.factory.Country;
import hu.nero.toyota.factory.CountryFactoryNotEqualException;
import hu.nero.toyota.factory.DetailFactory;
import hu.nero.toyota.factory.FactoryLine;
import hu.nero.toyota.storage.Storage;

public class Runner {
  public static void main(String[] args) throws CountryFactoryNotEqualException {

    DealerCenter dealerCenter = new DealerCenter(Country.JAPAN,new Storage(),new FactoryLine(new DetailFactory(Country.JAPAN)));
    dealerCenter.createCars();

  }
}
