package hu.nero.toyota.factory;

import hu.nero.toyota.detail.*;

public class DetailFactory {
    private CountryOfProduction countryOfProduction;

    public DetailFactory(CountryOfProduction countryOfProduction) {
        this.countryOfProduction = countryOfProduction;
    }

    public Wheel createWheel(WheelRadius wheelRadius) {
        return new Wheel(wheelRadius);
    }

    public Wheel[] createFourWheels(WheelRadius wheelRadius) {
        Wheel[] wheels = new Wheel[4];
        for (int i = 0; i < 4; i++) {
            wheels[i] = new Wheel(wheelRadius);
        }
        return wheels;
    }

    public Engine createEngine() {
        return new Engine(CountryOfProduction.CHINA);
    }

    public FuelTank createFuelTank(Double levelFuel) {
        FuelTank fuelTank = new FuelTank(0);
        fuelTank.setLevel(20);
        return fuelTank;
    }

    public HeadLights createHeadLights() {
        return new HeadLights(CountryOfProduction.CHINA);
    }

    public ElectricalSystem createElectricalSystem() {
        return new ElectricalSystem(CountryOfProduction.CHINA);
    }

    public CountryOfProduction getCountryOfProduction() {
        return countryOfProduction;
    }

    public void setCountryOfProduction(CountryOfProduction countryOfProduction) {
        this.countryOfProduction = countryOfProduction;
    }

    public Fridge createFridge() {
        Fridge fridge = new Fridge();
        fridge.setTitle("ХОЛОДИЛЬНИК");
        return fridge;
    }

    public Roof createRoof() {
        Roof roof = new Roof();
        roof.setOn(true);
        roof.roofUp();
        return roof;
    }

    public Socket createSocket() {
        Socket socket = new Socket();
        socket.chargePhone();
        return socket;
    }

    public Usb createUsb() {
        Usb usb = new Usb();
        System.out.println("Usb mounted");
        usb.connectMusic();
        return usb;
    }

    @Override
    public String toString() {
        return "DetailFactory{" +
                countryOfProduction +
                '}';
    }
}
