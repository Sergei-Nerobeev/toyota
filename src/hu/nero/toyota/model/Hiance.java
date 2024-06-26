package hu.nero.toyota.model;

import hu.nero.toyota.detail.*;
import hu.nero.toyota.detail.CountryOfProduction;
import hu.nero.toyota.type.AbstractCar;

import java.util.Arrays;

public class Hiance extends AbstractCar {
    public static final int HIANCE_RADIUS = 20;
    public static final Transmission TRANSMISSION = Transmission.MECHANICAL;
    public static final int MAX_SPEED = 170;
    public static final int MAX_CAPACITY = 2_000;
    private Wheel safeWheel;

    public Hiance(CountryOfProduction countryOfProduction,
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
                  Wheel safeWheel,
                  int max_Capacity
   ) {
        super(countryOfProduction,
                color,
                MAX_SPEED,
                Transmission.MECHANICAL,
                fuelTank,
                engine,
                wheels,
                electricalSystem,
                headLights,
                HIANCE_RADIUS,
                carModel,
                price
        );
    }

    @Override
    public String toString() {
        return "Hiance{" +
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

    public Wheel getSafeWheel() {
        return safeWheel;
    }
}
