package hu.nero.toyota.factory;

import hu.nero.toyota.detail.*;
import hu.nero.toyota.exceptoin.CountryFactoryNotEqualException;
import hu.nero.toyota.model.Camry;
import hu.nero.toyota.model.Dyna;
import hu.nero.toyota.model.Hiance;
import hu.nero.toyota.model.Solara;

public class CarFactory {
    private final CountryOfProduction countryOfProduction;
    private final DetailFactory detailFactory;

    public CarFactory(DetailFactory detailFactory, CountryOfProduction countryOfProduction) throws CountryFactoryNotEqualException {
        if (detailFactory.getCountryOfProduction() != countryOfProduction) {
            throw new CountryFactoryNotEqualException("Country of detail factory: " + detailFactory.getCountryOfProduction() +
                    "It is not country of car factory. Car factory is: " + countryOfProduction);
        }
        this.countryOfProduction = countryOfProduction;
        this.detailFactory = detailFactory;
    }

    public Camry createCamry(Color color, double price) {
        return new Camry(
                color,
                Transmission.AUTOMATE,
                detailFactory.createFuelTank(20D),
                detailFactory.createEngine(),
                detailFactory.createFourWheels(Camry.CAMRY_RADIUS),
                detailFactory.createElectricalSystem(),
                detailFactory.createHeadLights(),
                CarModel.CAMRY,
                price,
                new Usb()
        );
    }

    public Solara createSolara(Color color, double price) {
        return new Solara(
                color,
                Transmission.ROBOT,
                detailFactory.createFuelTank(20D),
                detailFactory.createEngine(),
                detailFactory.createFourWheels(Solara.SOLARA_RADIUS),
                detailFactory.createElectricalSystem(),
                detailFactory.createHeadLights(),
                Solara.SOLARA_RADIUS,
                countryOfProduction,
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
                detailFactory.createFuelTank(20.0),
                detailFactory.createEngine(),
                detailFactory.createFourWheels(Dyna.DYNA_RADIUS),
                detailFactory.createElectricalSystem(),
                detailFactory.createHeadLights(),
                Dyna.DYNA_RADIUS,
                countryOfProduction,
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
                detailFactory.createFuelTank(20.0),
                detailFactory.createEngine(),
                detailFactory.createFourWheels(Hiance.HIANCE_RADIUS),
                detailFactory.createElectricalSystem(),
                detailFactory.createHeadLights(),
                Hiance.HIANCE_RADIUS,
                countryOfProduction,
                CarModel.HIANCE,
                price,
                new Wheel(WheelRadius.TWENTY),
                Hiance.MAX_CAPACITY
        );
    }

    @Override
    public String toString() {
        return "CarFactory{" +
                countryOfProduction +
                detailFactory +
                '}';
    }

}
