package hu.nero.toyota.storage;

import hu.nero.toyota.model.Camry;
import hu.nero.toyota.model.Dyna;
import hu.nero.toyota.model.Hiance;
import hu.nero.toyota.model.Solara;

public class Storage {
    private int maxNumberOfCars = 1000; // макс количество машин на складе
    private int totalCarsOnStorage; // общее количество машин на складе
    private final Object[][] carStorage;
    private final Camry[] camry;
    private final Solara[] solara;
    private final Dyna[] dyna;
    private final Hiance[] hiance;

    public Storage() {
        this.totalCarsOnStorage = 0;
        this.carStorage = new Object[1][maxNumberOfCars];
        this.camry = new Camry[maxNumberOfCars];
        this.solara = new Solara[maxNumberOfCars];
        this.dyna = new Dyna[maxNumberOfCars];
        this.hiance = new Hiance[maxNumberOfCars];
    }

    public void addCamry(Camry camry) {
        this.carStorage[0][0] = camry;
        totalCarsOnStorage += 1;
        maxNumberOfCars -= 1;
        System.out.println("Added to to storage: " + camry + ". Total cars on the storage: " + totalCarsOnStorage +
                ". Free place for: " + maxNumberOfCars + " cars.");
    }

    public Camry takenCamry() {
        Camry takenCamry = (Camry) this.carStorage[0][0];
        totalCarsOnStorage -= 1;
        maxNumberOfCars += 1;
        System.out.println(
                "Taken from Storage: " + takenCamry + ". Total cars on the storage: " + totalCarsOnStorage +
                        "." + " Free place: " + maxNumberOfCars);
        return takenCamry;

    }

    public void addSolara(Solara solara) {
        this.carStorage[0][1] = solara;
        totalCarsOnStorage += 1;
        maxNumberOfCars -= 1;
        System.out.println("Added to to storage: " + solara + ". Total cars on the storage: " + totalCarsOnStorage +
                ". Free place for: " + maxNumberOfCars + " cars.");
    }

    public Solara takenSolara() {
        Solara takenSolara = (Solara) this.carStorage[0][1];
        totalCarsOnStorage -= 1;
        maxNumberOfCars += 1;
        System.out.println(
                "Taken from Storage: " + takenSolara + ". Total cars on the storage: " + totalCarsOnStorage +
                        "." + " Free place: " + maxNumberOfCars);
        return takenSolara;

    }
    public void addDyna(Dyna dyna) {
        this.carStorage[0][2] = dyna;
        totalCarsOnStorage += 1;
        maxNumberOfCars -= 1;
        System.out.println("Added to to storage: " + dyna + ". Total cars on the storage: " + totalCarsOnStorage +
                ". Free place for: " + maxNumberOfCars + " cars.");
    }

    public Dyna takenDyna() {
        Dyna takenDyna = (Dyna) this.carStorage[0][2];
        totalCarsOnStorage -= 1;
        maxNumberOfCars += 1;
        System.out.println(
                "Taken from Storage: " + takenDyna + ". Total cars on the storage: " + totalCarsOnStorage +
                        "." + " Free place: " + maxNumberOfCars);
        return takenDyna;

    }
}
