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
        var actualSolara = carFactory.createSolara(Color.WHITE, 35000);

        storage.addCamry(actualCamry);
//        storage.addCamry(actualCamry);
        storage.addSolara(actualSolara);
        actualSolara = storage.takeSolara(actualSolara);
        actualCamry = storage.takeCamry(actualCamry);
        System.out.println(storage.getTotalCamryStorage());
        System.out.println(storage.getTotalCarsInMainStorage());
        System.out.println(storage.countCamryStorage());
        System.out.println(actualCamry);
        System.out.println(actualSolara);






    }
}
