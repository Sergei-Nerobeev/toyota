package hu.nero.toyota.test;

import hu.nero.toyota.detail.CountryOfProduction;
import hu.nero.toyota.detail.Wheel;
import hu.nero.toyota.factory.DetailFactory;

import java.util.Arrays;

public class CreateFourWheelsTest {
    public static void main(String[] args) {
    createFourWheelsTest();

    }
    public static void createFourWheelsTest() {
        //Arrange
        CountryOfProduction countryOfProduction = CountryOfProduction.USA;
        DetailFactory detailFactory = new DetailFactory(countryOfProduction);
        //Act
        Wheel[] wheels = detailFactory.createFourWheels(countryOfProduction,17);
        Wheel[] testWheels = detailFactory.createFourWheels(countryOfProduction, 17);
        System.out.println(Arrays.toString(wheels));
        int wheelCount = wheels.length;
        int testWheelCount = 3;
        //Assert
        boolean resultTest = Arrays.equals(wheels, testWheels);
        boolean resultTestWheelsCount = wheelCount == testWheelCount;
        System.out.println(wheelCount);
        System.out.println(resultTest);
        System.out.println(resultTestWheelsCount);
    }
}
