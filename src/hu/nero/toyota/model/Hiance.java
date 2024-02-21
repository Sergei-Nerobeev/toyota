package hu.nero.toyota.model;

import hu.nero.toyota.detail.*;
import hu.nero.toyota.detail.Country;
import hu.nero.toyota.type.Truck;

public class Hiance extends Truck {
    public static final WheelRadius HIANCE_RADIUS = WheelRadius.TWENTY;
    public static final Transmission TRANSMISSION = Transmission.MECHANICAL;
    public static final int MAX_SPEED = 170;
    public static final int MAX_CAPACITY = 2_000;
    private Wheel safeWheel;

    public Hiance(Color color, Country countryAssembly) {
        super(color, MAX_SPEED, Transmission.MECHANICAL, WheelRadius.TWENTY, MAX_CAPACITY, countryAssembly, CarModel.HIANCE);
    }

    public Wheel getSafeWheel() {
        return safeWheel;
    }

    public void setSafeWheel(Wheel safeWheel) {
        this.safeWheel = safeWheel;
    }
}
