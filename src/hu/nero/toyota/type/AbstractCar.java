package hu.nero.toyota.type;

import hu.nero.toyota.detail.CarModel;
import hu.nero.toyota.detail.Color;
import hu.nero.toyota.exceptoin.StartCarFailedException;
import hu.nero.toyota.detail.*;
import hu.nero.toyota.detail.Country;

public abstract class AbstractCar {
    public static final int COUNT_WHEELS = 4;
    protected Color color;
    protected int maxSpeed;
    protected Transmission transmission;
    protected boolean isMove = false;
    protected FuelTank fuelTank;
    protected Engine engine;
    protected Wheel[] wheels = new Wheel[COUNT_WHEELS];
    protected ElectricalSystem electricalSystem;
    protected HeadLights headLights;
    protected WheelRadius wheelRadius;
    protected Country countryAssembly;
    protected CarModel carModel;

    protected AbstractCar(Color color, int maxSpeed, Transmission transmission, WheelRadius wheelRadius,
                          Country countryAssembly, CarModel carModel) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.transmission = transmission;
        this.wheelRadius = wheelRadius;
        this.countryAssembly = countryAssembly;
        this.carModel = carModel;
    }

    public void start() throws StartCarFailedException {
        if (isMove) {
            throw new StartCarFailedException("Car is already start");
        }
        checkDetailsBeforeStart();
        isMove = true;

    }

    public void stop() {
        isMove = false;
    }

    private void checkDetailsBeforeStart() throws StartCarFailedException {
        StringBuilder failures = new StringBuilder();
        if (fuelTank.getLevel() <= 0) {
            failures.append("FuelTank is empty");
        }
        if (!engine.isWork()) {
            failures.append("Engine doesn't work");
        }
        if (!headLights.isWork()) {
            failures.append("HeadLights doesn't work");
        }
        if (!electricalSystem.isWork()) {
            failures.append("Electrical system doesn't work");
        }
        if (!failures.isEmpty()) {
            throw new StartCarFailedException(failures.toString());
        }
    }

    private boolean checkWheelsWork() {
        for (Wheel wheel : wheels) {
            if (!wheel.isWork()) {
                return false;
            }
        }
        return true;
    }

    public CarModel getModel() {
        return carModel;
    }

    public WheelRadius getWheelRadius() {
        return wheelRadius;
    }

    public Country getCountryAssembly() {
        return countryAssembly;
    }

    public void setFuelTank(FuelTank fuelTank) {
        this.fuelTank = fuelTank;
    }

    public FuelTank getFuelTank() {
        return fuelTank;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        checkWheels(wheels);
        this.wheels = wheels;
    }

    public ElectricalSystem getElectricalSystem() {
        return electricalSystem;
    }

    public HeadLights getHeadLights() {
        return headLights;
    }

    public void setHeadLights(HeadLights headLights) {
        this.headLights = headLights;
    }

    public void setElectricalSystem(ElectricalSystem electricalSystem) {
        this.electricalSystem = electricalSystem;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public boolean isMove() {
        return isMove;
    }

    private void checkWheels(Wheel[] wheels) {
        if (wheels == null || wheels.length != 4) {
            throw new RuntimeException("Wheels array null or not size " + COUNT_WHEELS);
        }
        for (Wheel wheel : wheels) {
            checkWheel(wheel);
        }
    }

    private void checkWheel(Wheel wheel) {
        if (wheel == null || wheel.getWheelRadius() != wheelRadius) {
            throw new RuntimeException("Wheel is null or not same radius");
        }
    }
}

