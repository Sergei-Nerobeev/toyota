package hu.nero.toyota.test;

import hu.nero.toyota.detail.CarModel;
import hu.nero.toyota.detail.Color;
import hu.nero.toyota.detail.Country;
import hu.nero.toyota.detail.Transmission;
import hu.nero.toyota.exceptoin.CountryFactoryNotEqualException;
import hu.nero.toyota.factory.CarFactory;
import hu.nero.toyota.factory.DetailFactory;
import hu.nero.toyota.model.Camry;

public class CreateCamryTest {
    public static void main(String[] args) throws CountryFactoryNotEqualException {
        createCamryTest();

    }

    public static void createCamryTest() throws CountryFactoryNotEqualException {
        Color color = Color.BLACK;
        double price = 20000;
        Country china = Country.CHINA;

        DetailFactory detailFactory = new DetailFactory(china);
        CarFactory carFactory = new CarFactory(detailFactory, china);

        Camry testCamry = new Camry(
                color,
                Transmission.AUTOMATE,
                detailFactory.createFuelTank(50),
                detailFactory.createEngine(),
                detailFactory.createFourWheels(Camry.CAMRY_RADIUS),
                detailFactory.createElectricalSystem(),
                detailFactory.createHeadLights(),
                china,
                CarModel.CAMRY,
                price
        );
        Camry camry = carFactory.createCamry(color, price);

        boolean resultTest = camry.equals(testCamry); // equals?
        boolean resultTest2 = camry.equals(camry); // equals?
        System.out.println(resultTest);
        System.out.println(resultTest2);
        System.out.println(camry);
        System.out.println(testCamry);


    }
}
