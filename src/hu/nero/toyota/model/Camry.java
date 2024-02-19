package hu.nero.toyota.model;

import hu.nero.toyota.detail.*;
import hu.nero.toyota.factory.Country;
import hu.nero.toyota.type.LightCar;

public class Camry extends LightCar {
    public static final WheelRadius CAMRY_RADIUS = WheelRadius.SEVENTEEN;
    public static final int MAX_SPEED = 225;
    public static final Transmission TRANSMISSION = Transmission.AUTOMATE;
    private Usb usb;
    protected Camry(Color color, int maxSpeed, Transmission transmission,
                    WheelRadius wheelRadius, Country countryAssembly, CarModel carModel) {
        super(color, maxSpeed, transmission, wheelRadius, countryAssembly, carModel);
    }
    public void connectedMusic() {
        usb.connectMusic();
    }

    public Usb getUsb() {
        return usb;
    }

    public void setUsb(Usb usb) {
        this.usb = usb;
    }
}
