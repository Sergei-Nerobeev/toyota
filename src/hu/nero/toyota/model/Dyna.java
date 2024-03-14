package hu.nero.toyota.model;

import hu.nero.toyota.detail.*;
import hu.nero.toyota.detail.Country;
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

    public Dyna(Color color,
                Transmission transmission,
                FuelTank fuelTank,
                Engine engine,
                Wheel[] wheels,
                ElectricalSystem electricalSystem,
                HeadLights headLights,
                WheelRadius wheelRadius,
                Country countryAssembly,
                CarModel carModel,
                double price,
                Socket socket
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
                countryAssembly,
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
                ", fuelTank=" + fuelTank +
                ", engine=" + engine +
                ", wheels=" + Arrays.toString(wheels) +
                ", electricalSystem=" + electricalSystem +
                ", headLights=" + headLights +
                ", wheelRadius=" + wheelRadius +
                ", countryAssembly=" + countryAssembly +
                ", carModel=" + carModel +
                ", price=" + price +
                '}';
    }
}
