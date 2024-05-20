package hu.nero.toyota;

import hu.nero.toyota.detail.Color;
import hu.nero.toyota.detail.CountryOfProduction;
import hu.nero.toyota.exceptoin.CountryFactoryNotEqualException;
import hu.nero.toyota.exceptoin.StorageIsEmptyException;
import hu.nero.toyota.factory.CarFactory;
import hu.nero.toyota.factory.DetailFactory;
import hu.nero.toyota.model.Camry;
import hu.nero.toyota.model.Dyna;
import hu.nero.toyota.model.Hiance;
import hu.nero.toyota.model.Solara;
import hu.nero.toyota.shop.Customer;
import hu.nero.toyota.shop.Manager;
import hu.nero.toyota.storage.Storage;

public class Runner {
    public static void main(String[] args) throws CountryFactoryNotEqualException, StorageIsEmptyException {

        CarFactory carFactory = new CarFactory(new DetailFactory(CountryOfProduction.JAPAN), CountryOfProduction.JAPAN);
        Camry camry = carFactory.createCamry(Color.BLACK, 10_000);
        Camry camry2 = carFactory.createCamry(Color.BLACK, 12_000);
//        System.out.println(camry);
//        Solara solara = carFactory.createSolara(Color.WHITE, 12_000);
//        System.out.println(solara);
//        Hiance hiance = carFactory.createHiance(Color.ORANGE, 15_000);
//        System.out.println(hiance);
//        Dyna dyna = carFactory.createDyna(Color.GREEEN, 22_000);
//        System.out.println(dyna);

        Storage storage = new Storage();
        storage.add(camry);
        storage.add(camry2);
        storage.takeCamry(camry);
        Camry expensiveCamry = storage.getMaxPriceCamry();
        System.out.println("Here is: " + expensiveCamry);


//        storage.add(solara);
//        storage.add(hiance);
//        storage.add(dyna);

        Customer customer = new Customer("John Smith", 10_000);
        Customer customer2 = new Customer("Sara Conor", 15_000);
        Customer customer3 = new Customer("Tom Yang", 12_000);

        Manager manager = new Manager("Manager #1", storage, camry);
        try {
            System.out.println(manager.saleCar(customer));
            System.out.println(manager.saleCar(customer2));
            System.out.println(manager.saleCar(customer3));
        } catch (StorageIsEmptyException exception) {
            System.out.println("Camry Storage is empty!");
        }


    }
}
