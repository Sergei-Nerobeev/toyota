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
    }

    public static void createCamryTest() throws CountryFactoryNotEqualException {
        //Arrange
        Color color = Color.BLACK;
        double price = 20000;
        CountryOfProduction china = CountryOfProduction.CHINA;
        Wheel wheel = new Wheel(WheelRadius.SEVENTEEN);
        Wheel [] wheels = {wheel,wheel,wheel,wheel};

        Camry expectedCamry = new Camry(
                Color.BLACK,
                Transmission.AUTOMATE,
                new FuelTank(20),
                new Engine(),
                wheels,
                new ElectricalSystem(CountryOfProduction.CHINA),
                new HeadLights(),
                CountryOfProduction.CHINA,
                CarModel.CAMRY,
                20000);

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
        Wheel [] expWheels = {wheel,wheel,wheel,wheel};
        CountryOfProduction china = CountryOfProduction.CHINA;
        DetailFactory detailFactory = new DetailFactory(china);

        Wheel [] actWheels = detailFactory.createFourWheels(Camry.CAMRY_RADIUS);

        boolean resultTest = Arrays.equals(expWheels,actWheels);
        System.out.println(resultTest);
    }


}
