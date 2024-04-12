package hu.nero.toyota.storage;

import hu.nero.toyota.model.Camry;
import hu.nero.toyota.model.Dyna;
import hu.nero.toyota.model.Hiance;
import hu.nero.toyota.model.Solara;

public class Storage {
    private int maxNumberOfCars = 1000; // макс количество машин на складе
    private int totalCarsOnStorage; // общее количество машин на складе
    private int totalCamry;
    private int totalSolara;
    private int totalDyna;
    private int totalHiance;
    private final Object[][] carStorage;
    private final Camry[] camry;
    private final Solara[] solara;
    private final Dyna[] dyna;
    private final Hiance[] hiance;

    public Storage() {
        this.totalCarsOnStorage = 0;
        this.carStorage = new Object[1][maxNumberOfCars];
        this.camry = new Camry[totalCamry];
        this.solara = new Solara[totalSolara];
        this.dyna = new Dyna[totalDyna];
        this.hiance = new Hiance[totalHiance];
    }

    public void counterOfCamry() {
        int result = getTotalCamry();
        System.out.println("Count of Camry in Camry Storage now are: " + result);
    }

    public void counterOfSolara() {
        int result = getTotalSolara();
        System.out.println("Count of Solara in Solara Storage now are: " + result);
    }
    public void counterOfDyna() {
        int result = getTotalDyna();
        System.out.println("Count of Dyna in Dyna Storage now are: " + result);
    }

    public void counterOfHiance() {
        int result = getTotalHiance();
        System.out.println("Count of Hiance in Hiance Storage now are: " + result);
    }

    public void addCamry(Camry camry) {
        this.carStorage[0][0] = camry;
        totalCarsOnStorage++;
        totalCamry++;
        maxNumberOfCars--;
        System.out.println("Added to to Camry Storage: " + camry + ". Total cars on the Storage: " + totalCarsOnStorage
                + ". Free place for: " + maxNumberOfCars + " cars.");

    }

    public Camry takenCamry() {
        Camry takenCamry = (Camry) this.carStorage[0][0];
        totalCarsOnStorage--;
        totalCamry--;
        maxNumberOfCars++;
        System.out.println(
                "Taken from Camry Storage: " + takenCamry + ". Total cars on the Storage: " + totalCarsOnStorage +
                        "." + " Free place for: " + maxNumberOfCars);
        return takenCamry;
    }

    public void addSolara(Solara solara) {
        this.carStorage[0][1] = solara;
        totalCarsOnStorage++;
        totalSolara++;
        maxNumberOfCars--;
        System.out.println("Added to to Solar Storage: " + solara + ". Total cars on the Storage: " + totalCarsOnStorage +
                ". Free place for: " + maxNumberOfCars);
    }

    public Solara takenSolara() {
        Solara takenSolara = (Solara) this.carStorage[0][1];
        totalCarsOnStorage--;
        totalSolara--;
        maxNumberOfCars++;
        System.out.println(
                "Taken from Solara Storage: " + takenSolara + ". Total cars on the Storage: " + totalCarsOnStorage +
                        "." + " Free place for: " + maxNumberOfCars);
        return takenSolara;

    }

    public void addDyna(Dyna dyna) {
        this.carStorage[0][2] = dyna;
        totalCarsOnStorage++;
        totalDyna++;
        maxNumberOfCars--;
        System.out.println("Added to to Dyna Storage: " + dyna + ". Total cars on the Storage: " + totalCarsOnStorage +
                ". Free place for: " + maxNumberOfCars);
    }

    public Dyna takenDyna() {
        Dyna takenDyna = (Dyna) this.carStorage[0][2];
        totalCarsOnStorage -= 1;
        totalDyna--;
        maxNumberOfCars += 1;
        System.out.println(
                "Taken from Dyna Storage: " + takenDyna + ". Total cars on the Storage: " + totalCarsOnStorage +
                        "." + " Free place: " + maxNumberOfCars);
        return takenDyna;
    }

    public void addHiance(Hiance hiance) {
        this.carStorage[0][3] = hiance;
        totalCarsOnStorage += 1;
        maxNumberOfCars -= 1;
        System.out.println("Added to to Hiance Storage: " + hiance + ". Total cars on the Storage: " + totalCarsOnStorage +
                ". Free place for: " + maxNumberOfCars);
    }

    public Hiance takenHiance() {
        Hiance takenHiance = (Hiance) this.carStorage[0][3];
        totalCarsOnStorage -= 1;
        maxNumberOfCars += 1;
        System.out.println(
                "Taken from Hiance Storage: " + takenHiance + ". Total cars on the Storage: " + totalCarsOnStorage +
                        "." + " Free place for: " + maxNumberOfCars);
        return takenHiance;
    }

    public int getTotalCamry() {
        return totalCamry;
    }

    public int getTotalSolara() {
        return totalSolara;
    }

    public int getTotalDyna() {
        return totalDyna;
    }

    public int getTotalHiance() {
        return totalHiance;
    }
}
