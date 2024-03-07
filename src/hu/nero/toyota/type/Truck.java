package hu.nero.toyota.type;

import hu.nero.toyota.detail.*;

public class Truck extends AbstractCar{
    private final int maxCapacity;

    public Truck(Color color, int maxSpeed, Transmission transmission, boolean isMove, FuelTank fuelTank, Engine engine,
                 Wheel[] wheels, ElectricalSystem electricalSystem, HeadLights headLights, WheelRadius wheelRadius,
                 Country countryAssembly, CarModel carModel) {
        super(color, maxSpeed, transmission, isMove, fuelTank, engine, wheels, electricalSystem, headLights,
                wheelRadius, countryAssembly, carModel);
        this.maxCapacity = getMaxCapacity();
    }


    public int getMaxCapacity() {
        return maxCapacity;
    }
}
