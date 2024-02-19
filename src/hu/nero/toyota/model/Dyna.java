package hu.nero.toyota.model;

import hu.nero.toyota.detail.*;
import hu.nero.toyota.factory.Country;
import hu.nero.toyota.type.Truck;

public class Dyna extends Truck {
    public static final WheelRadius DYNA_RADIUS = WheelRadius.TWENTY;
    public static final Transmission TRANSMISSION= Transmission.MECHANICAL;
    public static final int MAX_SPEED = 150;
    public static final int MAX_CAPACITY = 3_000;
    private Socket socket;

    protected Dyna(Color color, int maxSpeed, Transmission transmission, WheelRadius wheelRadius,
                   Country countryAssembly, CarModel carModel, int maxCapacity) {
        super(color, maxSpeed, transmission, wheelRadius, countryAssembly, carModel, maxCapacity);
    }

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }
}
