package hu.nero.toyota.factory;

import hu.nero.toyota.detail.*;

public class DetailFactory {
    private CountryOfProduction countryOfProduction;
    private int wheelRadius;

    public DetailFactory(CountryOfProduction countryOfProduction) {
        this.countryOfProduction = countryOfProduction;
    }

    public Wheel createWheel(int wheelRadius) {
        return new Wheel(countryOfProduction,wheelRadius);
    }

    public Wheel[] createFourWheels(CountryOfProduction countryOfProduction) {
        Wheel[] wheels = new Wheel[4];
        for (int i = 0; i < 4; i++) {
            wheels[i] = new Wheel(countryOfProduction,wheelRadius);
        }
        return wheels;
    }

    public Engine createEngine(CountryOfProduction countryOfProduction) {
        return new Engine(countryOfProduction);
    }

    public FuelTank createFuelTank(CountryOfProduction countryOfProduction) {
        FuelTank fuelTank = new FuelTank(0);
        fuelTank.setLevel(20D);
        setCountryOfProduction(countryOfProduction);
        return fuelTank;
    }

    public HeadLights createHeadLights(CountryOfProduction countryOfProduction) {
        return new HeadLights(countryOfProduction);
    }

    public ElectricalSystem createElectricalSystem(CountryOfProduction countryOfProduction) {
        return new ElectricalSystem(countryOfProduction);
    }

    public CountryOfProduction getCountryOfProduction() {
        return countryOfProduction;
    }

    public void setCountryOfProduction(CountryOfProduction countryOfProduction) {
        this.countryOfProduction = countryOfProduction;
    }

    public Fridge createFridge(CountryOfProduction countryOfProduction) {
        Fridge fridge = new Fridge();
        fridge.setTitle("ХОЛОДИЛЬНИК");
        setCountryOfProduction(countryOfProduction);
        return fridge;
    }

    public Roof createRoof(CountryOfProduction countryOfProduction) {
        Roof roof = new Roof(countryOfProduction);
        roof.setOn(true);
        roof.roofUp();
        setCountryOfProduction(countryOfProduction);
        return roof;
    }

    public Socket createSocket(CountryOfProduction countryOfProduction) {
        Socket socket = new Socket(countryOfProduction);
        socket.chargePhone();
        setCountryOfProduction(countryOfProduction);
        return socket;
    }

    public Usb createUsb(CountryOfProduction countryOfProduction) {
        Usb usb = new Usb();
        usb.connectMusic();
        setCountryOfProduction(countryOfProduction);
        return usb;
    }

    @Override
    public String toString() {
        return "DetailFactory{" +
                countryOfProduction +
                '}';
    }
}
