package hu.nero.toyota.storage;

import hu.nero.toyota.model.Camry;
import hu.nero.toyota.model.Dyna;
import hu.nero.toyota.model.Hiance;
import hu.nero.toyota.model.Solara;

public class Storage {
    private int maxNumberOfCars = 1000; // макс количество машин на складе
    private int totalCarsInMainStorage; // общее количество машин на складе
    private int totalCamryStorage;
    private int totalSolaraStorage;
    private int totalDynaStorage;
    private int totalHianceStorage;
    private final Object[][] mainStorage;

    public Storage() {
        this.totalCarsInMainStorage = 0;
        this.mainStorage = new Object[1][maxNumberOfCars];
        Camry[] camry = new Camry[totalCamryStorage];
        Solara[] solara = new Solara[totalSolaraStorage];
        Dyna[] dyna = new Dyna[totalDynaStorage];
        Hiance[] hiance = new Hiance[totalHianceStorage];
    }

    public void counterOfCamry() {
        int result = getTotalCamryStorage();
        System.out.println("Count of Camry in Camry Storage now are: " + result);
    }

    public void counterOfSolara() {
        int result = getTotalSolaraStorage();
        System.out.println("Count of Solara in Solara Storage now are: " + result);
    }
    public void counterOfDyna() {
        int result = getTotalDynaStorage();
        System.out.println("Count of Dyna in Dyna Storage now are: " + result);
    }

    public void counterOfHiance() {
        int result = getTotalHianceStorage();
        System.out.println("Count of Hiance in Hiance Storage now are: " + result);
    }

    public void addCamry(Camry camry) {
        this.mainStorage[0][0] = camry;
        totalCarsInMainStorage++;
        totalCamryStorage++;
        maxNumberOfCars--;
        System.out.println("Added to to Camry Storage: " + camry + ". Total cars on the Storage: " + totalCarsInMainStorage
                + ". Free place for: " + maxNumberOfCars + " cars.");

    }

    public Camry takenCamry() {
        Camry takenCamry = (Camry) this.mainStorage[0][0];
        totalCarsInMainStorage--;
        totalCamryStorage--;
        maxNumberOfCars++;
        System.out.println(
                "Taken from Camry Storage: " + takenCamry + ". Total cars on the Storage: " + totalCarsInMainStorage +
                        "." + " Free place for: " + maxNumberOfCars);
        return takenCamry;
    }

    public void addSolara(Solara solara) {
        this.mainStorage[0][1] = solara;
        totalCarsInMainStorage++;
        totalSolaraStorage++;
        maxNumberOfCars--;
        System.out.println("Added to to Solar Storage: " + solara + ". Total cars on the Storage: " + totalCarsInMainStorage +
                ". Free place for: " + maxNumberOfCars);
    }

    public Solara takenSolara() {
        Solara takenSolara = (Solara) this.mainStorage[0][1];
        totalCarsInMainStorage--;
        totalSolaraStorage--;
        maxNumberOfCars++;
        System.out.println(
                "Taken from Solara Storage: " + takenSolara + ". Total cars on the Storage: " + totalCarsInMainStorage +
                        "." + " Free place for: " + maxNumberOfCars);
        return takenSolara;

    }

    public void addDyna(Dyna dyna) {
        this.mainStorage[0][2] = dyna;
        totalCarsInMainStorage++;
        totalDynaStorage++;
        maxNumberOfCars--;
        System.out.println("Added to to Dyna Storage: " + dyna + ". Total cars on the Storage: " + totalCarsInMainStorage +
                ". Free place for: " + maxNumberOfCars);
    }

    public Dyna takenDyna() {
        Dyna takenDyna = (Dyna) this.mainStorage[0][2];
        totalCarsInMainStorage--;
        totalDynaStorage--;
        maxNumberOfCars += 1;
        System.out.println(
                "Taken from Dyna Storage: " + takenDyna + ". Total cars on the Storage: " + totalCarsInMainStorage +
                        "." + " Free place: " + maxNumberOfCars);
        return takenDyna;
    }

    public void addHiance(Hiance hiance) {
        this.mainStorage[0][3] = hiance;
        totalCarsInMainStorage++;
        totalHianceStorage++;
        maxNumberOfCars--;
        System.out.println("Added to to Hiance Storage: " + hiance + ". Total cars on the Storage: " + totalCarsInMainStorage +
                ". Free place for: " + maxNumberOfCars);
    }

    public Hiance takenHiance() {
        Hiance takenHiance = (Hiance) this.mainStorage[0][3];
        totalCarsInMainStorage--;
        totalHianceStorage--;
        maxNumberOfCars++;
        System.out.println(
                "Taken from Hiance Storage: " + takenHiance + ". Total cars on the Storage: " + totalCarsInMainStorage +
                        "." + " Free place for: " + maxNumberOfCars);
        return takenHiance;
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

    public Object[][] getMainStorage() {
        return mainStorage;
    }
}
