package hu.nero.toyota.shop;

import hu.nero.toyota.exceptoin.StorageIsEmptyException;
import hu.nero.toyota.factory.CarFactory;
import hu.nero.toyota.model.Camry;
import hu.nero.toyota.storage.Storage;

public class Manager {

    private final String name;
    private final Storage storage;
    private final Camry camry;
    private CarFactory carFactory;


    public Manager(String name, Storage storage, Camry camry, CarFactory carFactory) {
        this.name = name;
        this.storage = storage;
        this.camry = camry;
        this.carFactory = carFactory;
    }

//    public Camry saleCar(Customer customer) throws StorageIsEmptyException {
//        if (storage.getMaxPriceCamry(customer.getMoneyAmount()) != null){
//            return camry;
//        }
//        if ((storage.getTotalCamryStorage() != 0 && customer.getMoneyAmount() >= camry.getPrice())) {
//            System.out.println(customer.getName() + " bought the Camry for " + camry.getPrice());
//        }
//
//        if (storage.getTotalCamryStorage() == 0 && customer.getMoneyAmount() >= camry.getPrice()) {
//            System.out.println(customer.getName() + " your order for Camry has been accepted: ");
//            return carFactory.createCamry(camry.getColor(), camry.getPrice() * 2);
//        }
//        if (customer.getMoneyAmount() < camry.getPrice()) {
//            throw new RuntimeException(customer.getName() + " you don't have enough money");
//        }
//        return camry;
//    }

    public Camry saleCar2(Customer customer) throws StorageIsEmptyException {
        // todo
        if (storage.getMaxPriceCamry(customer.getMoneyAmount()) != null &&
        customer.getMoneyAmount() != 0){
            System.out.println("It s your Camry: ");
        } else {
            carFactory.createCamry(camry.getColor(),camry.getPrice() * 2);
        }
        return camry;
    }
}
