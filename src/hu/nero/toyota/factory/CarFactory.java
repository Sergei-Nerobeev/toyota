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
                countryOfProduction,
                color,
                Transmission.AUTOMATE,
                detailFactory.createFuelTank(CountryOfProduction.CHINA),
                detailFactory.createEngine(CountryOfProduction.CHINA),
                detailFactory.createFourWheels(Camry.CAMRY_RADIUS),
                detailFactory.createElectricalSystem(CountryOfProduction.CHINA),
                detailFactory.createHeadLights(CountryOfProduction.CHINA),
                CarModel.CAMRY,
                price,
                detailFactory.createUsb(CountryOfProduction.CHINA)
        );
    }

    public Solara createSolara(Color color, double price) {
        return new Solara(
                CountryOfProduction.CHINA,
                color,
                Transmission.ROBOT,
                detailFactory.createFuelTank(CountryOfProduction.CHINA),
                detailFactory.createEngine(CountryOfProduction.CHINA),
                detailFactory.createFourWheels(Solara.SOLARA_RADIUS),
                detailFactory.createElectricalSystem(CountryOfProduction.CHINA),
                detailFactory.createHeadLights(CountryOfProduction.CHINA),
                Solara.SOLARA_RADIUS,
                countryOfProduction,
                CarModel.SOLARA,
                price,
                detailFactory.createRoof(CountryOfProduction.CHINA),
                detailFactory.createFridge(CountryOfProduction.CHINA)
        );
    }
    public Dyna createDyna(Color color, double price) {
        return new Dyna(
                CountryOfProduction.CHINA,
                color,
                Transmission.AUTOMATE,
                detailFactory.createFuelTank(CountryOfProduction.CHINA),
                detailFactory.createEngine(CountryOfProduction.CHINA),
                detailFactory.createFourWheels(Dyna.DYNA_RADIUS),
                detailFactory.createElectricalSystem(CountryOfProduction.CHINA),
                detailFactory.createHeadLights(CountryOfProduction.CHINA),
                Dyna.DYNA_RADIUS,
                countryOfProduction,
                CarModel.DYNA,
                price,
                detailFactory.createSocket(CountryOfProduction.CHINA),
                detailFactory.createUsb(CountryOfProduction.CHINA)
        );
    }
    public Hiance createHiance(Color color, double price) {
        return new Hiance(
                CountryOfProduction.CHINA,
                color,
                Transmission.MECHANICAL,
                detailFactory.createFuelTank(CountryOfProduction.CHINA),
                detailFactory.createEngine(CountryOfProduction.CHINA),
                detailFactory.createFourWheels(Hiance.HIANCE_RADIUS),
                detailFactory.createElectricalSystem(CountryOfProduction.CHINA),
                detailFactory.createHeadLights(CountryOfProduction.CHINA),
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
