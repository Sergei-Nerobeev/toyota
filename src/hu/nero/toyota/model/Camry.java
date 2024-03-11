package hu.nero.toyota.model;

import hu.nero.toyota.detail.*;
import hu.nero.toyota.detail.Country;
import hu.nero.toyota.type.AbstractCar;

import java.util.Arrays;
import java.util.Objects;

import static hu.nero.toyota.detail.Transmission.AUTOMATE;
import static hu.nero.toyota.detail.WheelRadius.SEVENTEEN;

public class Camry extends AbstractCar {
    public static final WheelRadius CAMRY_RADIUS = SEVENTEEN;
    public static final int MAX_SPEED = 225;
    private Usb usb;

    public Camry(Color color,
                 Transmission transmission,
                 FuelTank fuelTank,
                 Engine engine,
                 Wheel[] wheels,
                 ElectricalSystem electricalSystem,
                 HeadLights headLights,
                 Country countryAssembly,
                 CarModel carModel,
                 double price) {
        super(color,
                MAX_SPEED,
                transmission,
                fuelTank,
                engine,
                wheels,
                electricalSystem,
                headLights,
                CAMRY_RADIUS,
                countryAssembly,
                carModel,
                price);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false; // написать правильное сравнение
        Camry camry = (Camry) o;
        return Objects.equals(usb, camry.usb);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), usb);
    }
}
