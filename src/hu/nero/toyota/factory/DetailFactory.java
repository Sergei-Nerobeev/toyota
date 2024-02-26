package hu.nero.toyota.factory;

import hu.nero.toyota.detail.*;

public class DetailFactory {
    private Country countryAssembly;

    public DetailFactory(Country countryAssembly) {
        this.countryAssembly = countryAssembly;
    }

    public Wheel createWheel(WheelRadius wheelRadius) {
        return new Wheel(wheelRadius);
    }

    public Transmission createTransmission() {
        return Transmission.SOME_VOLUME;
    }

    public Engine createEngine() {
        return new Engine();
    }

    public FuelTank createFuelTank() {
        return new FuelTank();
    }

    public HeadLights createHeadLights() {
        return new HeadLights();
    }

    public ElectricalSystem createElectricalSystem() {
        return new ElectricalSystem();
    }

    public Country getCountryAssembly() {
        return countryAssembly;
    }

    public void setCountryAssembly(Country countryAssembly) {
        this.countryAssembly = countryAssembly;
    }
}
