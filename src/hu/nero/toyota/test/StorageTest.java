package hu.nero.toyota.test;

import hu.nero.toyota.detail.Color;
import hu.nero.toyota.detail.CountryOfProduction;
import hu.nero.toyota.exceptoin.CountryFactoryNotEqualException;
import hu.nero.toyota.factory.CarFactory;
import hu.nero.toyota.factory.DetailFactory;
import hu.nero.toyota.model.Camry;
import hu.nero.toyota.storage.Storage;

public class StorageTest {
    public static void main(String[] args) throws CountryFactoryNotEqualException {
        testStorageCreation();
        testAddCamry();
    }

    static void testStorageCreation() throws CountryFactoryNotEqualException {
        DetailFactory detailFactory = new DetailFactory(CountryOfProduction.CHINA);
        CarFactory carFactory = new CarFactory(detailFactory, CountryOfProduction.CHINA);
        Storage storage = new Storage();

        storage.addCamry(carFactory.createCamry(Color.ORANGE, 20000));
        storage.addDyna(carFactory.createDyna(Color.ORANGE, 40000));

        int count = storage.getTotalCarsInMainStorage();
        if (count == 0) {
            System.out.println("Main Storage is empty - " + count);
        }
        System.out.println("Main Storage is not empty - " + count);
    }

    static void testAddCamry() throws CountryFactoryNotEqualException {
        DetailFactory detailFactory = new DetailFactory(CountryOfProduction.CHINA);
        CarFactory carFactory = new CarFactory(detailFactory, CountryOfProduction.CHINA);
        Storage storage = new Storage();

        Camry actualCamry = storage.addCamry(carFactory.createCamry(Color.ORANGE, 20000));

        int counterCamry = storage.getTotalCamryStorage();
        if (!(counterCamry == 0)) {
            System.out.println("Test added: " + counterCamry + " Camry:\n" + actualCamry);
        }


    }

}
