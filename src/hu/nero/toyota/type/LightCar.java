package hu.nero.toyota.type;

import hu.nero.toyota.detail.CarModel;
import hu.nero.toyota.detail.Color;
import hu.nero.toyota.detail.CruiseControl;
import hu.nero.toyota.detail.Transmission;
import hu.nero.toyota.detail.WheelRadius;
import hu.nero.toyota.factory.Country;

public class LightCar extends AbstractCar {
    private CruiseControl cruiseControl;
    protected LightCar(Color color, int maxSpeed, Transmission transmission, WheelRadius wheelRadius,
                       Country countryAssembly, CarModel carModel) {
        super(color, maxSpeed, transmission, wheelRadius, countryAssembly, carModel);
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
