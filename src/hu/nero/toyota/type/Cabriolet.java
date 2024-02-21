package hu.nero.toyota.type;

import hu.nero.toyota.detail.CarModel;
import hu.nero.toyota.detail.Color;
import hu.nero.toyota.detail.Roof;
import hu.nero.toyota.detail.Transmission;
import hu.nero.toyota.detail.WheelRadius;
import hu.nero.toyota.detail.Country;

public class Cabriolet extends LightCar {
    private Roof roof;

    protected Cabriolet(Color color, int maxSpeed, Transmission transmission, WheelRadius wheelRadius, Country countryAssembly, CarModel carModel) {
        super(color, maxSpeed, transmission, wheelRadius, countryAssembly, carModel);
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
