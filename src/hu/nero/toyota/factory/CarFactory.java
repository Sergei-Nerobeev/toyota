package hu.nero.toyota.factory;

import hu.nero.toyota.detail.*;
import hu.nero.toyota.model.Camry;

public class CarFactory {

    private DetailFactory detailFactory;
    private Wheel wheel = new Wheel(WheelRadius.SEVENTEEN);
    private Transmission transmission;
    private Engine engine;
    private FuelTank fuelTank;
    private HeadLights headLights;
    private ElectricalSystem electricalSystem;
    public CarFactory(DetailFactory detailFactory) {
        this.detailFactory = detailFactory;
    }
    public CarFactory(){}

    public Camry createCamry() {
        DetailFactory detailFactory = new DetailFactory(Country.CHINE);
        detailFactory.createFuelTank();
        detailFactory.createEngine();
        detailFactory.createWheel(WheelRadius.SEVENTEEN);
        detailFactory.createTransmission();
        detailFactory.createElectricalSystem();
        detailFactory.createHeadLights();
        detailFactory.getCountryAssembly();
        return new Camry(Color.ORANGE,Country.CHINE);
    }

}
