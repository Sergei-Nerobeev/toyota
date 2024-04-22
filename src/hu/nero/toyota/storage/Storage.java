package hu.nero.toyota.storage;

import hu.nero.toyota.model.Camry;
import hu.nero.toyota.model.Dyna;
import hu.nero.toyota.model.Hiance;
import hu.nero.toyota.model.Solara;

import java.util.Arrays;

public class Storage {
    private static int maxNumberOfCars = 4_000; // макс количество машин на складе
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

    public int countCamryStorage() {
        if (getTotalCamryStorage() == 0) {
            throw new RuntimeException("Camry Storage is empty");
        }
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

        System.out.println("Added to Camry Storage: " + camry + "\nTotal cars in Main Storage: " + totalCarsInMainStorage
                + "\nFree place: " + maxNumberOfCars + "\nTotal in Camry Storage: " + totalCamryStorage +
                "\n------------------------------------");

        return camry;
    }

    public Solara addSolara(Solara solara) {
        totalCarsInMainStorage++;
        totalSolaraStorage++;
        maxNumberOfCars--;
        Arrays.fill(solaraArray, solara);

        System.out.println("Added to Solara Storage: " + solara + "\nTotal cars in Main Storage: " + totalCarsInMainStorage
                + "\nFree place: " + maxNumberOfCars + "\nTotal in Solara Storage: " + totalSolaraStorage);

        return solara;
    }

    public void takeCamry(Camry camry) {
        totalCarsInMainStorage--;
        totalCamryStorage--;
        maxNumberOfCars++;
        for (int i = 0; i < camryArray.length; i++) {
            if (camryArray[i].equals(camry)) {
                camryArray[i] = null;
                break;
            }

            throw new RuntimeException("Camry Storage is empty");

        }
        System.out.println(
                "Take from Camry Storage: " + getTotalCamryStorage() +  "\nTotal cars on the Main Storage: " + totalCarsInMainStorage +
                        "\nFree place for: " + maxNumberOfCars + "\n------------------------------------");

    }

    public void takeSolara() {
        totalCarsInMainStorage--;
        totalSolaraStorage--;
        maxNumberOfCars++;
        System.out.println(
                "Take from Solara Storage:  Total cars on the Main Storage: " + totalCarsInMainStorage +
                        "\nFree place for: " + maxNumberOfCars);
    }


public static int getMaxNumberOfCars() {
    return maxNumberOfCars;
}

public int getTotalCarsInMainStorage() {
    return totalCarsInMainStorage;
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

}
