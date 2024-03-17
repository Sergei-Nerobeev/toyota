package hu.nero.toyota.factory;

import hu.nero.toyota.detail.*;
import hu.nero.toyota.exceptoin.CountryFactoryNotEqualException;
import hu.nero.toyota.model.Camry;
import hu.nero.toyota.model.Dyna;
import hu.nero.toyota.model.Hiance;
import hu.nero.toyota.model.Solara;

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
                detailFactory.createFuelTank(),
                detailFactory.createEngine(),
                detailFactory.createFourWheels(Camry.CAMRY_RADIUS),
                detailFactory.createElectricalSystem(),
                detailFactory.createHeadLights(),
                countryAssembly,
                CarModel.CAMRY,
                price
        );
    }

    public Solara createSolara(Color color, double price) {
        return new Solara(
                color,
                Transmission.ROBOT,
                detailFactory.createFuelTank(),
                detailFactory.createEngine(),
                detailFactory.createFourWheels(Solara.SOLARA_RADIUS),
                detailFactory.createElectricalSystem(),
                detailFactory.createHeadLights(),
                Solara.SOLARA_RADIUS,
                countryAssembly,
                CarModel.SOLARA,
                price,
                detailFactory.createRoof().getRoof(),
                detailFactory.createFridge()
        );
    }
    public Dyna createDyna(Color color, double price) {
        return new Dyna(
                color,
                Transmission.AUTOMATE,
                detailFactory.createFuelTank(),
                detailFactory.createEngine(),
                detailFactory.createFourWheels(Dyna.DYNA_RADIUS),
                detailFactory.createElectricalSystem(),
                detailFactory.createHeadLights(),
                Dyna.DYNA_RADIUS,
                countryAssembly,
                CarModel.DYNA,
                price,
                detailFactory.createSocket(),
                detailFactory.createUsb()
        );
    }
    public Hiance createHiance(Color color, double price) {
        return new Hiance(
                color,
                Transmission.MECHANICAL,
                detailFactory.createFuelTank(),
                detailFactory.createEngine(),
                detailFactory.createFourWheels(Hiance.HIANCE_RADIUS),
                detailFactory.createElectricalSystem(),
                detailFactory.createHeadLights(),
                Hiance.HIANCE_RADIUS,
                countryAssembly,
                CarModel.HIANCE,
                price,
                new Wheel(WheelRadius.TWENTY),
                Hiance.MAX_CAPACITY
        );
    }

    @Override
    public String toString() {
        return "CarFactory{" +
                countryAssembly +
                detailFactory +
                '}';
    }

}
