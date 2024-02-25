package hu.nero.toyota.type;

import hu.nero.toyota.detail.*;

public class Cabriolet extends LightCar {
    private Roof roof;

    protected Cabriolet(Color color, int maxSpeed, Transmission transmission, WheelRadius wheelRadius, CarModel carModel,
                        FuelTank fuelTank) {
        super(color, maxSpeed, transmission, wheelRadius, carModel, new FuelTank(10D), new Engine(), new HeadLights(),
                new ElectricalSystem());
    }

    public Roof getRoof() {
        return roof;
    }

    public void setRoof(Roof roof) {
        this.roof = roof;
    }

    public void roofUp() {
        System.out.println("Roof up");
        roof.setOn(true);
    }

    public void roofDown() {
        System.out.println("Roof down");
        roof.setOn(false);
    }
}
