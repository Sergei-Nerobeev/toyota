package hu.nero.toyota.shop;

import hu.nero.toyota.factory.CarFactory;

public class Manager {
    private final String name;
    private CarFactory carFactory;

    public Manager(String name, CarFactory carFactory) {
        this.name = name;
        this.carFactory = carFactory;
    }
}
