package hu.nero.toyota.type;

import hu.nero.toyota.detail.CarModel;
import hu.nero.toyota.detail.Color;
import hu.nero.toyota.detail.Transmission;
import hu.nero.toyota.detail.WheelRadius;
import hu.nero.toyota.factory.Country;

public class Truck extends AbstractCar{
    private final int maxCapacity;
    protected Truck(Color color, int maxSpeed, Transmission transmission,
                    WheelRadius wheelRadius, int maxCapacity,Country countryAssembly, CarModel carModel) {
        super(color, maxSpeed, transmission, wheelRadius, countryAssembly, carModel);
        this.maxCapacity = maxCapacity;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }
}
