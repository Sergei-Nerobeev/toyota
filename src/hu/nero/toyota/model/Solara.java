package hu.nero.toyota.model;

import hu.nero.toyota.detail.*;
import hu.nero.toyota.detail.CountryOfProduction;
import hu.nero.toyota.type.AbstractCar;

import java.util.Arrays;

public class Solara extends AbstractCar {
    public static final WheelRadius SOLARA_RADIUS = WheelRadius.SIXTEEN;
    public static final Transmission TRANSMISSION = Transmission.ROBOT;
    public static final int MAX_SPEED = 300;
    private Fridge fridge;
    private Roof roof;

    public Solara(Color color,
                  Transmission transmission,
                  FuelTank fuelTank,
                  Engine engine,
                  Wheel[] wheels,
                  ElectricalSystem electricalSystem,
                  HeadLights headLights,
                  WheelRadius wheelRadius,
                  CountryOfProduction countryOfProductionAssembly,
                  CarModel carModel,
                  double price,
                  Roof roof,
                  Fridge fridge) {
        super(color,
                MAX_SPEED,
                Transmission.ROBOT,
                fuelTank,
                engine,
                wheels,
                electricalSystem,
                headLights,
                SOLARA_RADIUS,
                countryOfProductionAssembly,
                carModel,
                price
        );
        this.fridge = fridge;
        this.roof = roof;
    }

    public Fridge getFridge() {
        return fridge;
    }

    public Roof getRoof() {
        return roof;
    }

    public void freezeBeverage() {
        fridge.freeze();
        System.out.println("Fridge is up!");
    }

    @Override
    public String toString() {
        return "Solara{" +
                "color=" + color +
                ", maxSpeed=" + maxSpeed +
                ", transmission=" + transmission +
                ", fuelTank=" + fuelTank.getLevel() +
                ", engine=" + engine +
                ", wheels=" + Arrays.toString(wheels) +
                ", electricalSystem=" + electricalSystem +
                ", headLights=" + headLights +
                ", wheelRadius=" + wheelRadius +
                ", countryAssembly=" + countryOfProductionAssembly +
                ", carModel=" + carModel +
                ", price=" + price +
                '}';
    }
}
