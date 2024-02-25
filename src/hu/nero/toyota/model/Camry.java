package hu.nero.toyota.model;

import hu.nero.toyota.detail.*;
import hu.nero.toyota.detail.Country;
import hu.nero.toyota.type.LightCar;

public class Camry extends LightCar {
    public static final WheelRadius CAMRY_RADIUS = WheelRadius.SEVENTEEN;
    public static final int MAX_SPEED = 225;
    public static final Transmission TRANSMISSION = Transmission.AUTOMATE;
    private Usb usb;

    public Camry(Color color) {

        super(color, MAX_SPEED, Transmission.AUTOMATE, WheelRadius.SEVENTEEN, CarModel.CAMRY, new FuelTank(20D),
                new Engine(), new HeadLights(), new ElectricalSystem());
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
