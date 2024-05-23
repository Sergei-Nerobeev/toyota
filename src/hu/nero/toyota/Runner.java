package hu.nero.toyota;

import hu.nero.toyota.detail.Color;
import hu.nero.toyota.detail.CountryOfProduction;
import hu.nero.toyota.exceptoin.CountryFactoryNotEqualException;
import hu.nero.toyota.exceptoin.StorageIsEmptyException;
import hu.nero.toyota.factory.CarFactory;
import hu.nero.toyota.factory.DetailFactory;
import hu.nero.toyota.model.Camry;
import hu.nero.toyota.shop.Customer;
import hu.nero.toyota.shop.Manager;
import hu.nero.toyota.storage.Storage;

public class Runner {
    public static void main(String[] args) throws CountryFactoryNotEqualException, StorageIsEmptyException {

        CarFactory carFactory = new CarFactory(new DetailFactory(CountryOfProduction.JAPAN), CountryOfProduction.JAPAN);
        Camry camry = carFactory.createCamry(Color.BLACK, 16_000);
        Camry camry2 = carFactory.createCamry(Color.BLACK, 18_000);
        Camry camry3 = carFactory.createCamry(Color.BLACK, 24_000);

        Storage storage = new Storage();
        storage.add(camry);
        storage.add(camry2);
        storage.add(camry3);
        storage.takeCamry(camry);


        Customer customer = new Customer("John Smith", 23_000);
        Camry expensiveCamry = storage.getMaxPriceCamry(customer.getMoneyAmount());
        System.out.println("Expensive Camry is: " + expensiveCamry);
//        Customer customer2 = new Customer("Sara Conor", 15_000);
//        Customer customer3 = new Customer("Tom Yang", 12_000);

        Manager manager = new Manager("Manager #1", storage, camry, carFactory);
        try {
            System.out.println(manager.saleCar2(customer));

        } catch (StorageIsEmptyException exception) {
            System.out.println("Camry Storage is empty!");
        }


    }
}
