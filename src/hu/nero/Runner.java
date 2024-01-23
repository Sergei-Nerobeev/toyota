package hu.nero;

import hu.nero.toyota.dealer.DealerCenter;
import hu.nero.toyota.factory.Country;
import hu.nero.toyota.factory.CountyFactoryNotEqualException;

public class Runner {
  public static void main(String[] args) throws CountyFactoryNotEqualException {

    DealerCenter dealerCenter = new DealerCenter(Country.JAPAN);
    dealerCenter.createCars();

  }
}
