package hu.nero.toyota;

import hu.nero.toyota.detail.Color;
import hu.nero.toyota.detail.CountryOfProduction;
import hu.nero.toyota.exceptoin.CountryFactoryNotEqualException;
import hu.nero.toyota.exceptoin.StartCarFailedException;
import hu.nero.toyota.factory.CarFactory;
import hu.nero.toyota.factory.DetailFactory;
import hu.nero.toyota.model.Camry;
import hu.nero.toyota.model.Dyna;
import hu.nero.toyota.model.Hiance;
import hu.nero.toyota.model.Solara;
import hu.nero.toyota.storage.Customer;
import hu.nero.toyota.storage.Storage;

public class Runner {
    public static void main(String[] args) throws CountryFactoryNotEqualException {

        CarFactory carFactory = new CarFactory(new DetailFactory(CountryOfProduction.JAPAN), CountryOfProduction.JAPAN);
        Camry camry = carFactory.createCamry(Color.BLACK, 10_000);
        System.out.println(camry);
        Solara solara = carFactory.createSolara(Color.WHITE, 12_000);
        System.out.println(solara);
        Hiance hiance = carFactory.createHiance(Color.ORANGE, 15_000);
        System.out.println(hiance);
        Dyna dyna = carFactory.createDyna(Color.GREEEN, 22_000);
        System.out.println(dyna);

        Storage storage = new Storage();
        storage.add(camry);
        storage.add(solara);
        storage.add(hiance);
        storage.add(dyna);

        Customer customer = new Customer("John Smith.", 20_000);
        System.out.println(customer.getMoneyAmount());
        System.out.println(customer.getName());

    }
}
