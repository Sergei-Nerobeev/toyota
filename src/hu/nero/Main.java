package hu.nero;

import hu.nero.toyota.abscar.*;
import hu.nero.toyota.factory.Country;
import hu.nero.toyota.factory.CountyFactoryNotEqualException;
import hu.nero.toyota.factory.DetailFactory;
import hu.nero.toyota.factory.FactoryLine;
import hu.nero.toyota.models.Camry;
import hu.nero.toyota.models.Dyna;
import hu.nero.toyota.models.Hiance;
import hu.nero.toyota.models.Solara;
import hu.nero.toyota.storage.CarStorage;

public class Main {
  public static void main(String[] args) {

    FactoryLine factoryLine = new FactoryLine(new DetailFactory(Country.USA));
    try{

      Camry camry = factoryLine.createCamry(Color.BLUE,29000.00);
      Solara solara = factoryLine.createSolara(Color.GREEEN, 34000.00);
      Dyna dyna = factoryLine.createDyna(Color.RED, 59000.00);
      Hiance hiance = factoryLine.createHiance(Color.ORANGE, 80000.00);

      camry.addOptional();
      camry.startMovement();
      camry.getFlatTire();
      camry.changeWheel(new Wheel(17));
      camry.tornOnLight();

      solara.addOptional();
      solara.startMovement();
      camry.getFlatTire();
      solara.changeWheel(new Wheel(16));
      solara.tornOnLight();

      dyna.addOptional();
      dyna.startMovement();
      camry.getFlatTire();
      dyna.changeWheel(new Wheel(20));
      dyna.tornOnLight();

      hiance.addOptional();
      hiance.startMovement();
      camry.getFlatTire();
      hiance.changeWheel(new Wheel(20));
      hiance.tornOnLight();

      CarStorage carStorage = new CarStorage();
      carStorage.addCamry(camry,10);
      carStorage.addCamry(camry,2);
      carStorage.addSolara(solara,5);

      carStorage.takenCamry();
      carStorage.takenSolara();
    }catch (CountyFactoryNotEqualException | StartCarException ex) {
      ex.printStackTrace();
    }



  }

}
