package hu.nero.toyota.model;

import hu.nero.toyota.detail.*;
import hu.nero.toyota.detail.Country;
import hu.nero.toyota.type.AbstractCar;

import static hu.nero.toyota.detail.Transmission.MECHANICAL;
import static hu.nero.toyota.detail.WheelRadius.TWENTY;

public class Dyna extends AbstractCar {
    public static final WheelRadius DYNA_RADIUS = TWENTY;
    public static final Transmission TRANSMISSION = MECHANICAL;
    public static final int MAX_SPEED = 150;
    public static final int MAX_CAPACITY = 3_000;
    private Socket socket;

    public Dyna(Color color, int maxSpeed, Transmission transmission, FuelTank fuelTank, Engine engine,
                Wheel[] wheels, ElectricalSystem electricalSystem, HeadLights headLights, WheelRadius wheelRadius,
                Country countryAssembly, CarModel carModel, double price,Socket socket) {
        super(color, MAX_SPEED, TRANSMISSION, fuelTank, engine, wheels, electricalSystem, headLights,
                wheelRadius, countryAssembly, carModel,price);
        this.socket = socket;
    }

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }
}
