package hu.nero.toyota.model;

import hu.nero.toyota.detail.*;
import hu.nero.toyota.type.AbstractCar;

import java.util.Arrays;
import java.util.Objects;

import static hu.nero.toyota.detail.WheelRadius.SEVENTEEN;

public class Camry extends AbstractCar {
    public static final WheelRadius CAMRY_RADIUS = SEVENTEEN;
    public static final int MAX_SPEED = 225;
    private Usb usb;

    public Camry(CountryOfProduction countryOfProduction,
                 Color color,
                 Transmission transmission,
                 FuelTank fuelTank,
                 Engine engine,
                 Wheel[] wheels,
                 ElectricalSystem electricalSystem,
                 HeadLights headLights,
                 CarModel carModel,
                 double price,
                 Usb usb) {
        super(countryOfProduction,
                color,
                MAX_SPEED,
                transmission,
                fuelTank,
                engine,
                wheels,
                electricalSystem,
                headLights,
                CAMRY_RADIUS,
                carModel,
                price) ;
                this.usb = usb;
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
                ", fuelTank=" + fuelTank.getLevel() +
                ", engine=" + engine +
                ", wheels=" + Arrays.toString(wheels) +
                ", electricalSystem=" + electricalSystem +
                ", headLights=" + headLights +
                ", wheelRadius=" + wheelRadius +
                ", carModel=" + carModel +
                ", price=" + price +
                '}';
    }
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Camry car = (Camry) object;
        return Double.compare(car.price, price) == 0 &&
                color == car.color &&
                transmission == car.transmission &&
                Objects.equals(fuelTank, car.fuelTank) &&
                Objects.equals(engine, car.engine) &&
                Arrays.equals(wheels, car.wheels) &&
                Objects.equals(electricalSystem, car.electricalSystem) &&
                Objects.equals(headLights, car.headLights) &&
                carModel == car.carModel;
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), usb);
    }
}
