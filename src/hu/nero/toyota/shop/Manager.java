package hu.nero.toyota.shop;

<<<<<<< HEAD
import hu.nero.toyota.factory.CarFactory;

public class Manager {
    private final String name;
    private CarFactory carFactory;

    public Manager(String name, CarFactory carFactory) {
        this.name = name;
        this.carFactory = carFactory;
    }
=======
import hu.nero.toyota.exceptoin.StorageIsEmptyException;
import hu.nero.toyota.factory.CarFactory;
import hu.nero.toyota.model.Camry;
import hu.nero.toyota.storage.Storage;


public class Manager {

    private final String name;
    private Storage storage;
    private CarFactory carFactory;

    public Manager(String name, Storage storage, CarFactory carFactory) {
        this.name = name;
        this.storage = storage;
        this.carFactory = carFactory;
    }

    public Camry saleCar(Customer customer, Camry camry) throws StorageIsEmptyException {
        if (storage.getTotalCamryStorage() != 0 && customer.getMoneyAmount() >= camry.getPrice()) {
            System.out.println(customer.getName() + " bought the Camry for " + camry.getPrice());
        }

        if (storage.getTotalCamryStorage() == 0 && customer.getMoneyAmount() >= camry.getPrice()) {
            System.out.println(customer.getName() + " your order for Camry has been accepted!");
            return storage.add(camry);
        }
        if (customer.getMoneyAmount() < camry.getPrice()) {
            throw new RuntimeException(customer.getName() + " you don't have enough money");
        }
        return storage.takeCamry(camry);
    }
>>>>>>> origin/Step-4-4
}
