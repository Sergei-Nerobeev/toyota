package hu.nero.toyota.type;

import hu.nero.toyota.detail.*;

public class LightCar extends AbstractCar {
    private CruiseControl cruiseControl;

    protected LightCar(Color color, int maxSpeed, Transmission transmission, WheelRadius wheelRadius,
                       CarModel carModel, FuelTank fuelTank, Engine engine, HeadLights headLights, ElectricalSystem electricalSystem) {
        super(color, maxSpeed, transmission, wheelRadius, carModel, fuelTank, engine, headLights, electricalSystem);
    }


    public CruiseControl getCruiseControl() {
        return cruiseControl;
    }

    public void setCruiseControl(CruiseControl cruiseControl) {
        this.cruiseControl = cruiseControl;
    }

    public void cruiseControlOn() {
        System.out.println("Cruise control is on");
        cruiseControl.setOn(true);
    }

    public void cruiseControlOff() {
        System.out.println("Cruise control is on");
        cruiseControl.setOn(false);
    }

}
