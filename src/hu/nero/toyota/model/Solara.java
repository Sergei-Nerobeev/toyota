package hu.nero.toyota.model;

import hu.nero.toyota.detail.*;
import hu.nero.toyota.detail.Country;
import hu.nero.toyota.type.Cabriolet;

public class Solara extends Cabriolet {
    public static final WheelRadius SOLARA_RADIUS = WheelRadius.SIXTEEN;
    public static final Transmission TRANSMISSION = Transmission.ROBOT;
    public static final int MAX_SPEED = 300;
    private Fridge fridge;
    public Solara(Color color) {
        super(color, MAX_SPEED, Transmission.ROBOT, WheelRadius.SIXTEEN, CarModel.SOLARA, new FuelTank(50D));
    }

    public void setFridge(Fridge fridge) {
        this.fridge = fridge;
    }
    public void freezeBeverage() {
        fridge.freeze();
    }
}
