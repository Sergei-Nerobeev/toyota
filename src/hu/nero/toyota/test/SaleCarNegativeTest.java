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

public class SaleCarNegativeTest {
    public static void main(String[] args) throws CountryFactoryNotEqualException, StorageIsEmptyException {
        saleCarNegativeTest();
    }

    public static void saleCarNegativeTest() throws CountryFactoryNotEqualException, StorageIsEmptyException {
        //Arrange
        CarFactory carFactory = new CarFactory(new DetailFactory(CountryOfProduction.JAPAN), CountryOfProduction.JAPAN);
        Storage storage = new Storage();
        Camry camry10 = carFactory.createCamry(Color.WHITE, 10_000);
        Camry camry20 = carFactory.createCamry(Color.WHITE, 20_000);
        Camry camry30 = carFactory.createCamry(Color.WHITE, 30_000);
        Customer customer = new Customer("John Smith", 0); // денег нет
        Customer customer2 = new Customer("John Smith", 9_000); // не достаточно средств
        Manager manager = new Manager("Manager #1", storage, carFactory);
        //Act
        storage.add(camry10);
        storage.add(camry20);
        storage.add(camry30);
        storage.takeCamry(camry10);
        storage.takeCamry(camry20);
        storage.takeCamry(camry30);

        Camry actualCamry = null;
        try {
//            actualCamry = manager.saleCar(customer);
            actualCamry = manager.saleCar(customer2);
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
