package hu.nero.toyota.model;

import hu.nero.toyota.detail.*;
import hu.nero.toyota.detail.CountryOfProduction;
import hu.nero.toyota.type.AbstractCar;

import java.util.Arrays;

import static hu.nero.toyota.detail.Transmission.MECHANICAL;

public class Dyna extends AbstractCar {
    public static final int DYNA_RADIUS = 20;
    public static final Transmission DYNA_TRANSMISSION = MECHANICAL;
    public static final int MAX_SPEED = 150;
    public static final int MAX_CAPACITY = 3_000;
    private Socket socket;
    private Usb usb;

    public Dyna(CountryOfProduction countryOfProduction,
                Color color,
                Transmission transmission,
                FuelTank fuelTank,
                Engine engine,
                Wheel[] wheels,
                ElectricalSystem electricalSystem,
                HeadLights headLights,
                int wheelRadius,
                CountryOfProduction countryOfProductionAssembly,
                CarModel carModel,
                double price,
                Socket socket,
                Usb usb
    ) {
        super(countryOfProduction,
                color,
                MAX_SPEED,
                DYNA_TRANSMISSION,
                fuelTank,
                engine,
                wheels,
                electricalSystem,
                headLights,
                DYNA_RADIUS,
                carModel,
                price);
        this.socket = socket;

    }

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    @Override
    public String toString() {
        return "Dyna{" +
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
}
