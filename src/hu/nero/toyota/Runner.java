package hu.nero.toyota;

import hu.nero.toyota.detail.Color;
import hu.nero.toyota.detail.Country;
import hu.nero.toyota.exceptoin.CountryFactoryNotEqualException;
import hu.nero.toyota.exceptoin.StartCarFailedException;
import hu.nero.toyota.factory.CarFactory;
import hu.nero.toyota.factory.DetailFactory;
import hu.nero.toyota.model.Camry;
import hu.nero.toyota.model.Dyna;
import hu.nero.toyota.model.Hiance;
import hu.nero.toyota.model.Solara;


public class Runner {
    public static void main(String[] args) throws StartCarFailedException, CountryFactoryNotEqualException {
        CarFactory carFactory = new CarFactory(new DetailFactory(Country.CHINA), Country.CHINA);
        Camry camry = carFactory.createCamry(Color.GREEEN, 20000D);
        System.out.println(camry);
        Solara solara = carFactory.createSolara(Color.ORANGE, 40000);
        System.out.println(solara);
        Dyna dyna = carFactory.createDyna(Color.BLUE, 50000);
        System.out.println(dyna);
        Hiance hiance = carFactory.createHiance(Color.BLACK, 60000);
        System.out.println(hiance);

    }
}
