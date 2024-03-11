package hu.nero.toyota.factory;

import hu.nero.toyota.detail.*;
import hu.nero.toyota.exceptoin.CountryFactoryNotEqualException;
import hu.nero.toyota.model.Camry;

public class CarFactory {
    private final Country countryAssembly;
    private final DetailFactory detailFactory;

    public CarFactory(DetailFactory detailFactory, Country countryAssembly) throws CountryFactoryNotEqualException {
        if (detailFactory.getCountryAssembly() != countryAssembly) {
            throw new CountryFactoryNotEqualException("Country of detail factory: " + detailFactory.getCountryAssembly() +
                    "It is not country of car factory. Car factory is: " + countryAssembly);
        }
        this.countryAssembly = countryAssembly;
        this.detailFactory = detailFactory;
    }

    public Camry createCamry(Color color, double price) {
        return new Camry(
                color,
                Transmission.AUTOMATE,
                detailFactory.createFuelTank(50),
                detailFactory.createEngine(),
                detailFactory.createFourWheels(Camry.CAMRY_RADIUS),
                detailFactory.createElectricalSystem(),
                detailFactory.createHeadLights(),
                countryAssembly,
                CarModel.CAMRY,
                price
        );

    }


}
