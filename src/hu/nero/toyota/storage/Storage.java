package hu.nero.toyota.storage;

import hu.nero.toyota.model.Camry;
import hu.nero.toyota.model.Dyna;
import hu.nero.toyota.model.Hiance;
import hu.nero.toyota.model.Solara;

import java.util.Arrays;

public class Storage {
    private static int maxNumberOfCars = 1000; // макс количество машин на складе
    private int totalCarsInMainStorage; // общее количество машин на складе
    private int totalCamryStorage;
    private int totalSolaraStorage;
    private int totalDynaStorage;
    private int totalHianceStorage;
    private Camry[] camryArray;
    private Solara[] solaraArray;
    private Dyna[] dynaArray;
    private Hiance[] hianceArray;

    public Storage() {
        this.totalCarsInMainStorage = 0;
        this.camryArray = new Camry[totalCamryStorage];
        this.solaraArray = new Solara[totalSolaraStorage];
        this.dynaArray = new Dyna[totalDynaStorage];
        this.hianceArray = new Hiance[totalHianceStorage];
    }

    public int countCamryStorage() { //todo
        return getTotalCamryStorage();
    }

    public int countSolaraStroge() {
        return getTotalSolaraStorage();

    }

    public int countDynaStorage() {
        return getTotalDynaStorage();
    }

    public int countHianceStorage() {
        return getTotalHianceStorage();
    }

    public Camry addCamry(Camry camry) {
        totalCarsInMainStorage++;
        totalCamryStorage++;
        maxNumberOfCars--;
        Arrays.fill(camryArray, camry);

        System.out.println("Added to Camry Storage: " + camry + "\nTotal cars in Storage: " + totalCarsInMainStorage
                + "\nFree place: " + maxNumberOfCars + "\nTotal in Camry Storage: " + totalCamryStorage);

        return camry;
    }

    public Camry takenCamry() {
        totalCarsInMainStorage--;
        totalCamryStorage--;
        maxNumberOfCars++;
        System.out.println(
                "Taken from Camry Storage:  Total cars on the Storage: " + totalCarsInMainStorage +
                        "." + " Free place for: " + maxNumberOfCars);
        return null;
    }


    public int getTotalCamryStorage() {
        return totalCamryStorage;
    }

    public int getTotalSolaraStorage() {
        return totalSolaraStorage;
    }

    public int getTotalDynaStorage() {
        return totalDynaStorage;
    }

    public int getTotalHianceStorage() {
        return totalHianceStorage;
    }

    public int getMaxNumberOfCars() {
        return maxNumberOfCars;
    }

    public int getTotalCarsInMainStorage() {
        return totalCarsInMainStorage;
    }

}
