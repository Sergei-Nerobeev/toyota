package hu.nero.toyota.model;

import hu.nero.toyota.detail.*;
import hu.nero.toyota.detail.CountryOfProduction;
import hu.nero.toyota.type.AbstractCar;

import java.util.Arrays;

import static hu.nero.toyota.detail.Transmission.MECHANICAL;
import static hu.nero.toyota.detail.WheelRadius.TWENTY;

public class Dyna extends AbstractCar {
    public static final WheelRadius DYNA_RADIUS = TWENTY;
    public static final Transmission DYNA_TRANSMISSION = MECHANICAL;
    public static final int MAX_SPEED = 150;
    public static final int MAX_CAPACITY = 3_000;
    private Socket socket;
    private Usb usb; // todo

    public Dyna(Color color,
                Transmission transmission,
                FuelTank fuelTank,
                Engine engine,
                Wheel[] wheels,
                ElectricalSystem electricalSystem,
                HeadLights headLights,
                WheelRadius wheelRadius,
                CountryOfProduction countryOfProductionAssembly,
                CarModel carModel,
                double price,
                Socket socket,
                Usb usb
    ) {
        super(color,
                MAX_SPEED,
                DYNA_TRANSMISSION,
                fuelTank,
                engine,
                wheels,
                electricalSystem,
                headLights,
                DYNA_RADIUS,
                countryOfProductionAssembly,
                carModel,price);
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
                ", countryAssembly=" + countryOfProduction +
                ", carModel=" + carModel +
                ", price=" + price +
                '}';
    }
}
