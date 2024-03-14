package hu.nero.toyota.model;

import hu.nero.toyota.detail.*;
import hu.nero.toyota.detail.Country;
import hu.nero.toyota.type.AbstractCar;

import java.util.Arrays;

public class Hiance extends AbstractCar {
    public static final WheelRadius HIANCE_RADIUS = WheelRadius.TWENTY;
    public static final Transmission TRANSMISSION = Transmission.MECHANICAL;
    public static final int MAX_SPEED = 170;
    public static final int MAX_CAPACITY = 2_000;
    private Wheel safeWheel;

    public Hiance(Color color,
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
                  Wheel safeWheel,
                  int max_Capacity
   ) {
        super(color,
                MAX_SPEED,
                Transmission.MECHANICAL,
                fuelTank,
                engine,
                wheels,
                electricalSystem,
                headLights,
                HIANCE_RADIUS,
                countryAssembly,
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

    public Wheel getSafeWheel() {
        return safeWheel;
    }
}
