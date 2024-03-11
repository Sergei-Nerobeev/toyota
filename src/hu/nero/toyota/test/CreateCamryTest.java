package hu.nero.toyota.test;


import hu.nero.toyota.detail.Color;
import hu.nero.toyota.detail.Country;
import hu.nero.toyota.exceptoin.CountryFactoryNotEqualException;
import hu.nero.toyota.factory.CarFactory;
import hu.nero.toyota.factory.DetailFactory;
import hu.nero.toyota.model.Camry;

public class CreateCamryTest {
    public static void main(String[] args) throws CountryFactoryNotEqualException {
        createCamryTest();

    }

    public static void createCamryTest() throws CountryFactoryNotEqualException {
        //Arrange
        Color color = Color.BLACK;
        double price = 20000;
        Country china = Country.CHINA;

        DetailFactory detailFactory = new DetailFactory(china);
        CarFactory carFactory = new CarFactory(detailFactory, china);

        //Act
        Camry camry = carFactory.createCamry(color, price);
        Camry camry2 = carFactory.createCamry(color, price);

        //Assert
        boolean resultTest = camry.equals(camry2); // equals?

        System.out.println(resultTest);
        System.out.println(camry);
        System.out.println(camry2);


    }
}
