package hu.nero.toyota.model;

import hu.nero.toyota.detail.*;
import hu.nero.toyota.detail.Country;
import hu.nero.toyota.type.AbstractCar;

public class Solara extends AbstractCar {
    public static final WheelRadius SOLARA_RADIUS = WheelRadius.SIXTEEN;
    public static final Transmission TRANSMISSION = Transmission.ROBOT;
    public static final int MAX_SPEED = 300;
    private Fridge fridge;

    public Solara(Color color, int maxSpeed, Transmission transmission, FuelTank fuelTank,
                  Engine engine, Wheel[] wheels, ElectricalSystem electricalSystem, HeadLights headLights,
                  WheelRadius wheelRadius, Country countryAssembly, CarModel carModel, double price,
                  Roof roof, Fridge fridge) {
        super(color, MAX_SPEED, Transmission.ROBOT, fuelTank, engine, wheels, electricalSystem, headLights,
                wheelRadius, countryAssembly, carModel, price);
        this.fridge = fridge;
    }

    public void setFridge(Fridge fridge) {
        this.fridge = fridge;
    }
    public void freezeBeverage() {
        fridge.freeze();
    }
}
