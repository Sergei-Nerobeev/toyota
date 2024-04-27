package hu.nero.toyota.shop;

import hu.nero.toyota.factory.CarFactory;
import hu.nero.toyota.storage.Storage;
import hu.nero.toyota.type.AbstractCar;

public class Manager {
    private String name;
    private Storage storage;
    private CarFactory carFactory;

    public Manager(String name, Storage storage, CarFactory carFactory) {
        this.name = name;
        this.storage = storage;
        this.carFactory = carFactory;
    }

    public AbstractCar sellCar(Customer customer) {
        return sellCarHelper(customer);
    }

    private AbstractCar sellCarHelper(Customer customer) {
        return null;
    }
}
