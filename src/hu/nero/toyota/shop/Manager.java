package hu.nero.toyota.shop;

import hu.nero.toyota.exceptoin.StorageIsEmptyException;
import hu.nero.toyota.model.Camry;
import hu.nero.toyota.storage.Storage;


public class Manager {

    private final String name;
    private final Storage storage;
    private final Camry camry;

    public Manager(String name, Storage storage, Camry camry) {
        this.name = name;
        this.storage = storage;
        this.camry = camry;

    }

    public Camry saleCar(Customer customer) throws StorageIsEmptyException {

        if ((storage.getTotalCamryStorage() != 0 && customer.getMoneyAmount() >= camry.getPrice())) {

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

}
