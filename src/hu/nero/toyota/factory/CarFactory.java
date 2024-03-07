package hu.nero.toyota.factory;

import hu.nero.toyota.detail.*;
import hu.nero.toyota.exceptoin.CountryFactoryNotEqualException;
import hu.nero.toyota.model.Camry;

public class CarFactory {
    private Country countryAssembly;
    private DetailFactory detailFactory = new DetailFactory(Country.CHINE);

    public CarFactory(DetailFactory detailFactory, Country countryAssembly) throws CountryFactoryNotEqualException {
        if (detailFactory.getCountryAssembly() != countryAssembly) {
            throw new CountryFactoryNotEqualException("Country of detail factory: " + detailFactory.getCountryAssembly() +
                    "It is not country of car factory. Car factory is: " + countryAssembly);
        }
    }
    public Camry createCamry(Color color, double price){
       return new Camry(color,Camry.MAX_SPEED,Transmission.AUTOMATE,true,new FuelTank(),new Engine(),
       new Wheel[4],new ElectricalSystem(),new HeadLights(),WheelRadius.SEVENTEEN,countryAssembly,CarModel.CAMRY);

    }



}
