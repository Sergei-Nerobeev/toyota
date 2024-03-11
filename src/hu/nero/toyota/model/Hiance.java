package hu.nero.toyota.model;

import hu.nero.toyota.detail.*;
import hu.nero.toyota.detail.Country;
import hu.nero.toyota.type.AbstractCar;

public class Hiance extends AbstractCar {
    public static final WheelRadius HIANCE_RADIUS = WheelRadius.TWENTY;
    public static final Transmission TRANSMISSION = Transmission.MECHANICAL;
    public static final int MAX_SPEED = 170;
    public static final int MAX_CAPACITY = 2_000;
    private Wheel safeWheel;

    public Hiance(Color color, int maxSpeed, Transmission transmission, FuelTank fuelTank,
                  Engine engine, Wheel[] wheels, ElectricalSystem electricalSystem, HeadLights headLights,
                  WheelRadius wheelRadius, Country countryAssembly, CarModel carModel, double price,Wheel safeWheel) {
        super(color, MAX_SPEED, Transmission.MECHANICAL, fuelTank, engine, wheels, electricalSystem, headLights,
                wheelRadius, countryAssembly, carModel,price);
        this.safeWheel = safeWheel;
    }

    public Wheel getSafeWheel() {
        return safeWheel;
    }

    public void setSafeWheel(Wheel safeWheel) {
        this.safeWheel = safeWheel;
    }
}
