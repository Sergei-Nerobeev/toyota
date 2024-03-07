package hu.nero.toyota.model;

import hu.nero.toyota.detail.*;
import hu.nero.toyota.detail.Country;
import hu.nero.toyota.type.AbstractCar;

import java.util.Arrays;

import static hu.nero.toyota.detail.Transmission.AUTOMATE;
import static hu.nero.toyota.detail.WheelRadius.SEVENTEEN;

public class Camry extends AbstractCar {
    public static final WheelRadius CAMRY_RADIUS = SEVENTEEN;
    public static final int MAX_SPEED = 225;
    public static final Transmission TRANSMISSION = AUTOMATE;
    private Usb usb;

    public Camry(Color color, int maxSpeed, Transmission transmission, boolean isMove, FuelTank fuelTank, Engine engine,
                 Wheel[] wheels, ElectricalSystem electricalSystem, HeadLights headLights, WheelRadius wheelRadius,
                 Country countryAssembly, CarModel carModel) {
        super(color, maxSpeed, transmission, isMove, fuelTank, engine, wheels, electricalSystem, headLights,
                wheelRadius, countryAssembly, carModel);
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

    @Override
    public String toString() {
        return "Camry{" +
                "color=" + color +
                ", maxSpeed=" + maxSpeed +
                ", transmission=" + transmission +
                ", isMove=" + isMove +
                ", fuelTank=" + fuelTank +
                ", engine=" + engine +
                ", wheels=" + Arrays.toString(wheels) +
                ", electricalSystem=" + electricalSystem +
                ", headLights=" + headLights +
                ", wheelRadius=" + wheelRadius +
                ", countryAssembly=" + countryAssembly +
                ", carModel=" + carModel +
                '}';
    }
}
