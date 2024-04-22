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
        testTakenCamry();
    }

    static void testStorageCreation() throws CountryFactoryNotEqualException {
        DetailFactory detailFactory = new DetailFactory(CountryOfProduction.CHINA);
        CarFactory carFactory = new CarFactory(detailFactory, CountryOfProduction.CHINA);
        Storage storage = new Storage();

        storage.addCamry(carFactory.createCamry(Color.ORANGE, 20000));


        int actualCounterTotalCarsInMainStorage = 0;
        int expectedCounterTotalCarsInMainStorage = storage.getTotalCarsInMainStorage();
        if (expectedCounterTotalCarsInMainStorage == actualCounterTotalCarsInMainStorage) {
            System.out.println("Actual equals expected! Expected == " + expectedCounterTotalCarsInMainStorage);
            System.out.println("_____________________________");
        }
        System.out.println("Actual not equals expected! Expected == " + expectedCounterTotalCarsInMainStorage);
        System.out.println("_____________________________");
    }

    static void testAddCamry() throws CountryFactoryNotEqualException {
        DetailFactory detailFactory = new DetailFactory(CountryOfProduction.CHINA);
        CarFactory carFactory = new CarFactory(detailFactory, CountryOfProduction.CHINA);
        Storage storage = new Storage();

        storage.addCamry(carFactory.createCamry(Color.ORANGE, 20000));
        int actualCounterCamryInCamryStorage = 0;
        int expectedCounterCamryInCamryStorage = storage.getTotalCamryStorage();
        if (expectedCounterCamryInCamryStorage == actualCounterCamryInCamryStorage) {
            System.out.println("Actual equals expected! Expected == " + expectedCounterCamryInCamryStorage);
            System.out.println("_____________________________");
        }
        System.out.println("Actual not equals expected! Expected == " + expectedCounterCamryInCamryStorage);
        System.out.println("_____________________________");
    }

    static void testTakenCamry() throws CountryFactoryNotEqualException {
        DetailFactory detailFactory = new DetailFactory(CountryOfProduction.CHINA);
        CarFactory carFactory = new CarFactory(detailFactory, CountryOfProduction.CHINA);
        Storage storage = new Storage();

        storage.addCamry(carFactory.createCamry(Color.ORANGE, 20000));
        storage.takeCamry(carFactory.createCamry(Color.ORANGE, 20000));
        int actualCounterCamry = 1;

    }

}
