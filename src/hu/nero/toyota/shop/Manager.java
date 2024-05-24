package hu.nero.toyota.shop;

import hu.nero.toyota.detail.Color;
import hu.nero.toyota.exceptoin.StorageIsEmptyException;
import hu.nero.toyota.factory.CarFactory;
import hu.nero.toyota.model.Camry;
import hu.nero.toyota.storage.Storage;

public class Manager {

    private final String name;
    private final Storage storage;
    private final Camry camry;
    private CarFactory carFactory;
    private final double MAX_PRICE = 100_000;


    public Manager(String name, Storage storage, Camry camry, CarFactory carFactory) {
        this.name = name;
        this.storage = storage;
        this.camry = camry;
        this.carFactory = carFactory;
    }

    // У менеджера есть метод - продать машину клиенту: возвращается самая дорогая машина,
    // которую может купить покупатель со своей суммой денег из имеющихся
    // Если машин на складе нет, то идет запрос на сборку и производство по ценам выше,
    // и машина заносится на склад. Если клиенту не хватает денег, то никакую машину он не получает.
    public Camry saleCar(Customer customer) throws StorageIsEmptyException {
        // Получаем самую дорогую машину, которую может купить покупатель
        Camry camry = storage.getMaxPriceCamry(customer.getMoneyAmount());
        if (camry != null && customer.getMoneyAmount() >= camry.getPrice()) {
            // Если такая машина есть на складе, то мы её продаём
            storage.takeCamry(camry);
            System.out.println("It is your car: ");
            return camry;

        }
        if (camry == null) {
            // Если машин на складе нет, то создаём новую по более высокой цене
            Camry newCamry = carFactory.createCamry(Color.WHITE, MAX_PRICE);
            storage.add(newCamry);
            System.out.println("New car created and added to storage: ");
            return newCamry;

        } // денег нет, но вы держитесь :)
        if (customer.getMoneyAmount() == 0 || customer.getMoneyAmount() < camry.getPrice()) {
            throw new RuntimeException("You don't have enough money");
        }

        throw new StorageIsEmptyException();
    }
}
