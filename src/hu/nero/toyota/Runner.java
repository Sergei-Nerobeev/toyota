package hu.nero.toyota;

import hu.nero.toyota.detail.Color;
import hu.nero.toyota.detail.Country;
import hu.nero.toyota.exceptoin.CountryFactoryNotEqualException;
import hu.nero.toyota.exceptoin.StartCarFailedException;
import hu.nero.toyota.factory.CarFactory;
import hu.nero.toyota.factory.DetailFactory;
import hu.nero.toyota.model.Camry;


public class Runner {
    public static void main(String[] args) throws StartCarFailedException, CountryFactoryNotEqualException {
        CarFactory carFactory = new CarFactory(new DetailFactory(Country.CHINE),Country.CHINE);
        Camry camry = carFactory.createCamry(Color.GREEEN, 20000D);
        System.out.println(camry);

    }
}
