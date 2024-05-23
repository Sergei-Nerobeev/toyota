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
    // У менеджера есть метод - продать машину клиенту: возвращается самая дорогая машина,
    // которую может купить покупатель со своей суммой денег из имеющихся
    // Если машин на складе нет, то идет запрос на сборку и производство по ценам выше,
    // и машина заносится на склад. Если клиенту не хватает денег, то никакую машину он не получает.
    public Camry saleCar2(Customer customer) throws StorageIsEmptyException {
        // Получаем самую дорогую машину, которую может купить покупатель
        Camry camry = storage.getMaxPriceCamry(customer.getMoneyAmount());
        if (camry != null && customer.getMoneyAmount() >= camry.getPrice()) {
            // Если такая машина есть на складе, то мы её продаём
            storage.takeCamry(camry);
            System.out.println("It is your car: ");
            return camry;

        }
        if (camry == null && customer.getMoneyAmount() >= camry.getPrice()) {
            // Если машин на складе нет, то создаём новую по более высокой цене
            Camry newCamry = carFactory.createCamry(camry.getColor(), camry.getPrice() * 2);
            storage.add(camry);
            System.out.println("New car created and added to storage: " + newCamry);
            return newCamry;

        } // денег нет, но вы держитесь :)
        if (customer.getMoneyAmount() < camry.getPrice()) {
            System.out.println("You don't have enough money");
            return null;
        }

        return camry;
    }
}
