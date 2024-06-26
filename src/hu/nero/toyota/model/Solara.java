package hu.nero.toyota.model;

import hu.nero.toyota.detail.*;
import hu.nero.toyota.detail.CountryOfProduction;
import hu.nero.toyota.type.AbstractCar;

import java.util.Arrays;

public class Solara extends AbstractCar {
    public static final int SOLARA_RADIUS = 16;
    public static final Transmission TRANSMISSION = Transmission.ROBOT;
    public static final int MAX_SPEED = 300;
    private Fridge fridge;
    private Roof roof;

    public Solara(CountryOfProduction countryOfProduction,
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
                  Roof roof,
                  Fridge fridge) {
        super(countryOfProduction,
                color,
                MAX_SPEED,
                Transmission.ROBOT,
                fuelTank,
                engine,
                wheels,
                electricalSystem,
                headLights,
                SOLARA_RADIUS,
                carModel,
                price
        );
        this.fridge = fridge;
        this.roof = roof;
    }

    public Fridge getFridge() {
        return fridge;
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
                ", carModel=" + carModel +
                ", price=" + price +
                '}';
    }
}
