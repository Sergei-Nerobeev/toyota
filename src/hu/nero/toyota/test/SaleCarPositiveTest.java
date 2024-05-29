package hu.nero.toyota.test;

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

public class SaleCarPositiveTest {

    public static void main(String[] args) throws CountryFactoryNotEqualException {
        saleCarPositiveTest();

    }

    public static void saleCarPositiveTest() throws CountryFactoryNotEqualException {
        //Arrange
        CarFactory carFactory = new CarFactory(new DetailFactory(CountryOfProduction.JAPAN), CountryOfProduction.JAPAN);
        Storage storage = new Storage();
        Camry camry0 = carFactory.createCamry(Color.WHITE, 0);
        Camry camry20 = carFactory.createCamry(Color.WHITE, 20_000);
        Camry camry30 = carFactory.createCamry(Color.WHITE, 30_000);
        Camry camry40 = carFactory.createCamry(Color.WHITE, 40_000);
        Customer customer = new Customer("John Smith", 23_000);
        Manager manager = new Manager("Manager #1", storage, carFactory);
        Camry expensiveCamry = storage.getMaxPriceCamry(customer.getMoneyAmount());
        //Act
        storage.add(camry0);
        storage.add(camry20);
        storage.add(camry30);
        storage.add(camry40);
        Camry actualCamry = null;
        try {
            actualCamry = manager.saleCar(customer);
            System.out.println(actualCamry);

        } catch (StorageIsEmptyException exception) {
            System.out.println("Camry Storage is empty!");
        }
        //Assert
        boolean resultTest;
        if (actualCamry.equals(camry20)) resultTest = true;
        else resultTest = false;
        System.out.println(resultTest);
    }


}
