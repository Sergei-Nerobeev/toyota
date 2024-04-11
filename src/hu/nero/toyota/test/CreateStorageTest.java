package hu.nero.toyota.test;

import hu.nero.toyota.detail.*;
import hu.nero.toyota.exceptoin.CountryFactoryNotEqualException;
import hu.nero.toyota.factory.CarFactory;
import hu.nero.toyota.factory.DetailFactory;
import hu.nero.toyota.storage.Storage;

public class CreateStorageTest {
    public static void main(String[] args) throws CountryFactoryNotEqualException {
        createStorageTest();
    }

    static void createStorageTest() throws CountryFactoryNotEqualException {
        //Arrange
        Storage storage = new Storage();
        int wheelRadius = 17;
        FuelTank fuelTank = new FuelTank(0D);
        fuelTank.setLevel(20D);
        CountryOfProduction china = CountryOfProduction.CHINA;
        DetailFactory detailFactory = new DetailFactory(china);
        CarFactory carFactory = new CarFactory(detailFactory, china);
        Wheel wheel = new Wheel(china, wheelRadius);
        Wheel[] wheels = {wheel, wheel, wheel, wheel};

        //Act
        storage.addCamry(carFactory.createCamry(Color.BLACK, 20000));
        storage.addSolara(carFactory.createSolara(Color.BLUE, 30000));
        storage.addDyna(carFactory.createDyna(Color.ORANGE, 40000));

        storage.takenCamry();
        storage.takenSolara();
        storage.takenDyna();

        //Assert

    }
}
