package hu.nero.toyota.type;

import hu.nero.toyota.detail.*;

public class Truck extends AbstractCar{
    private final int maxCapacity;

    protected Truck(Color color, int maxSpeed, Transmission transmission, WheelRadius wheelRadius, int capacity, CarModel carModel,
                    FuelTank fuelTank, Engine engine, HeadLights headLights, ElectricalSystem electricalSystem, int maxCapacity) {
        super(color, maxSpeed, transmission, wheelRadius, carModel, fuelTank, engine, headLights, electricalSystem);
        this.maxCapacity = maxCapacity;
    }


    public int getMaxCapacity() {
        return maxCapacity;
    }
}
