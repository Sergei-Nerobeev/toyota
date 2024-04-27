package hu.nero.toyota.test;

import hu.nero.toyota.detail.Color;
import hu.nero.toyota.detail.CountryOfProduction;
import hu.nero.toyota.exceptoin.CountryFactoryNotEqualException;
import hu.nero.toyota.exceptoin.StorageIsEmptyException;
import hu.nero.toyota.factory.CarFactory;
import hu.nero.toyota.factory.DetailFactory;
import hu.nero.toyota.model.Camry;
import hu.nero.toyota.model.Solara;
import hu.nero.toyota.storage.Storage;

public class StorageNewTest {
    public static void main(String[] args) throws CountryFactoryNotEqualException, StorageIsEmptyException {
        createStorageTest();
    }

    public static void createStorageTest() throws CountryFactoryNotEqualException, StorageIsEmptyException {
        Storage storage = new Storage();
        DetailFactory detailFactory = new DetailFactory(CountryOfProduction.USA);
        CarFactory carFactory = new CarFactory(detailFactory, CountryOfProduction.USA);
        var actualCamry = carFactory.createCamry(Color.BLUE, 150000);
        var actualCamry2 = carFactory.createCamry(Color.BLACK, 33000);
        var actualCamry3 = carFactory.createCamry(Color.ORANGE, 890000);
        var actualCamry4 = carFactory.createCamry(Color.GREEEN, 150000);
        var actualCamry5 = carFactory.createCamry(Color.BLUE, 15000000);
        var actualSolara = carFactory.createSolara(Color.WHITE, 35000);
        var actualSolara2 = carFactory.createSolara(Color.GREEEN, 35000);
        var actualSolara3 = carFactory.createSolara(Color.ORANGE, 46000);
        var actualSolara4 = carFactory.createSolara(Color.BLUE, 67000);
        var actualSolara5 = carFactory.createSolara(Color.BLACK, 350);

        storage.addCamry(actualCamry);
        storage.addCamry(actualCamry2);
        storage.addCamry(actualCamry3);
        storage.addCamry(actualCamry4);
        storage.addCamry(actualCamry5);

        storage.addSolara(actualSolara);
        storage.addSolara(actualSolara2);
        storage.addSolara(actualSolara3);
        storage.addSolara(actualSolara4);
        storage.addSolara(actualSolara5);


        storage.takeSolara(actualSolara);
        storage.takeSolara(actualSolara2);
        storage.takeSolara(actualSolara3);
        storage.takeSolara(actualSolara4);
        storage.takeSolara(actualSolara5);
        storage.takeCamry(actualCamry);
        storage.takeCamry(actualCamry2);
        storage.takeCamry(actualCamry3);
        storage.takeCamry(actualCamry4);
        storage.takeCamry(actualCamry5);

        System.out.println(storage.countSolaraStroge());
        System.out.println(storage.countCamryStorage());

        try{
            Camry takenCamry = storage.takeCamry(actualCamry2);
            Solara takenSolara = storage.takeSolara(actualSolara3);
            System.out.println(takenCamry);
            System.out.println(takenSolara);
        } catch (StorageIsEmptyException exception) {
            System.out.println("Exception!This storages are empty!\n");
        }


    }
}
