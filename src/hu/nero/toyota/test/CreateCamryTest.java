package hu.nero.toyota.test;


import hu.nero.toyota.detail.*;
import hu.nero.toyota.exceptoin.CountryFactoryNotEqualException;
import hu.nero.toyota.factory.CarFactory;
import hu.nero.toyota.factory.DetailFactory;
import hu.nero.toyota.model.Camry;

import java.util.Arrays;

public class CreateCamryTest {

    public static void main(String[] args) throws CountryFactoryNotEqualException {
        createCamryTest();
        checkArrayOfWheels();
        checkFieldsOfHeadlights();
    }

    public static void createCamryTest() throws CountryFactoryNotEqualException {
        //Arrange
        Color color = Color.BLACK;
        double price = 20000;
        FuelTank fuelTank = new FuelTank(0D);
        fuelTank.setLevel(20D);
        CountryOfProduction china = CountryOfProduction.CHINA;
        Wheel wheel = new Wheel(WheelRadius.SEVENTEEN);
        Wheel[] wheels = {wheel, wheel, wheel, wheel};

        Camry expectedCamry = new Camry(
                CountryOfProduction.CHINA,
                Color.BLACK,
                Transmission.AUTOMATE,
                fuelTank,
                new Engine(CountryOfProduction.CHINA),
                wheels,
                new ElectricalSystem(CountryOfProduction.CHINA),
                new HeadLights(CountryOfProduction.CHINA),
                CarModel.CAMRY,
                20000,
                new Usb());

        DetailFactory detailFactory = new DetailFactory(china);
        CarFactory carFactory = new CarFactory(detailFactory, china);

        //Act
        Camry actualCamry = carFactory.createCamry(color, price);

        //Assert
        boolean resultTest = actualCamry.equals(expectedCamry);

        System.out.println(resultTest);
        System.out.println("Actual: " + actualCamry);
        System.out.println("Expect: " + expectedCamry);
    }

    public static void checkArrayOfWheels() {

        Wheel wheel = new Wheel(WheelRadius.SEVENTEEN);
        Wheel[] expWheels = {wheel, wheel, wheel, wheel};
        CountryOfProduction china = CountryOfProduction.CHINA;
        DetailFactory detailFactory = new DetailFactory(china);

        Wheel[] actWheels = detailFactory.createFourWheels(Camry.CAMRY_RADIUS);

        boolean resultTest = Arrays.equals(expWheels, actWheels);
        System.out.println(resultTest);
    }

    public static void checkFieldsOfHeadlights() {

        CountryOfProduction china = CountryOfProduction.CHINA;
        DetailFactory detailFactory = new DetailFactory(china);
        HeadLights expHeadlights = new HeadLights(china);

        HeadLights actHeadLights = detailFactory.createHeadLights(CountryOfProduction.CHINA);

        boolean resultTest = expHeadlights.equals(actHeadLights);
        System.out.println(resultTest);
    }


}
