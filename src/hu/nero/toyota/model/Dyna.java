package hu.nero.toyota.model;

import hu.nero.toyota.detail.*;
import hu.nero.toyota.type.Truck;

public class Dyna extends Truck {
    public static final WheelRadius DYNA_RADIUS = WheelRadius.TWENTY;
    public static final Transmission TRANSMISSION = Transmission.MECHANICAL;
    public static final int MAX_SPEED = 150;
    public static final int MAX_CAPACITY = 3_000;
    private Socket socket;

    public Dyna(Color color) {

        super(color, MAX_SPEED, Transmission.MECHANICAL, WheelRadius.TWENTY, MAX_CAPACITY, CarModel.DYNA, new FuelTank(40),
                new Engine(), new HeadLights(), new ElectricalSystem(), MAX_CAPACITY);
    }

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }
}
