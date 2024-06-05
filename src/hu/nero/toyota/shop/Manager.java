package hu.nero.toyota.shop;

import hu.nero.toyota.detail.Color;
import hu.nero.toyota.exceptoin.StorageIsEmptyException;
import hu.nero.toyota.factory.CarFactory;
import hu.nero.toyota.model.Camry;
import hu.nero.toyota.storage.Storage;

import java.io.File;
import java.io.IOException;

public class Manager {

    private final String name;
    private final Storage storage;
    private CarFactory carFactory;
    private final double MAX_PRICE = 100_00;
    private Report report;


    public Manager(String name, Storage storage, CarFactory carFactory) {
        this.name = name;
        this.storage = storage;
        this.carFactory = carFactory;
        this.report = new Report(name);
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
        }
        if (camry == null) {
            // Если машин на складе нет, то создаём новую по более высокой цене
            camry = carFactory.createCamry(Color.WHITE, MAX_PRICE);
            System.out.println("New car created and added to storage: ");
        }

        return camry;
    }
    // создание отчета
    public void generateFileReport() {
        File tempFile = null;
        try {
            tempFile = File.createTempFile("m_report", ".txt");
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
        report.createFileReport(tempFile.getAbsolutePath());
        report.createTextReport();
    }
}
