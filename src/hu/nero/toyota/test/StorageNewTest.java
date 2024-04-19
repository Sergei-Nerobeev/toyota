package hu.nero.toyota.test;

import hu.nero.toyota.detail.Color;
import hu.nero.toyota.detail.CountryOfProduction;
import hu.nero.toyota.exceptoin.CountryFactoryNotEqualException;
import hu.nero.toyota.factory.CarFactory;
import hu.nero.toyota.factory.DetailFactory;
import hu.nero.toyota.storage.Storage;

public class StorageNewTest {
    public static void main(String[] args) throws CountryFactoryNotEqualException {
        createStorageTest();
    }
    public static void createStorageTest() throws CountryFactoryNotEqualException {
        Storage storage = new Storage();
        DetailFactory detailFactory = new DetailFactory(CountryOfProduction.USA);
        CarFactory carFactory = new CarFactory(detailFactory,CountryOfProduction.USA);
        var actualCamry = carFactory.createCamry(Color.BLUE, 150000);

        storage.addCamry(actualCamry);

    }
}
