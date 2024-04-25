package hu.nero.toyota.storage;

import hu.nero.toyota.exceptoin.StorageIsEmptyException;
import hu.nero.toyota.model.Camry;
import hu.nero.toyota.model.Dyna;
import hu.nero.toyota.model.Hiance;
import hu.nero.toyota.model.Solara;

public class Storage {
    private static final int MAX_NUMBER_OF_CARS = 1_000; // размер массива
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
        this.totalCamryStorage = 0;
        this.totalSolaraStorage = 0;
        this.totalDynaStorage = 0;
        this.totalHianceStorage = 0;
        this.camryArray = new Camry[MAX_NUMBER_OF_CARS];
        this.solaraArray = new Solara[MAX_NUMBER_OF_CARS];
        this.dynaArray = new Dyna[MAX_NUMBER_OF_CARS];
        this.hianceArray = new Hiance[MAX_NUMBER_OF_CARS];
    }

    public int countCamryStorage() {
        if (getTotalCamryStorage() == 0) {
            throw new RuntimeException("Camry Storage is empty");
        }
        System.out.print("In Camry Storage: ");
        return getTotalCamryStorage();

    }

    public int countSolaraStroge() {
        if (getTotalSolaraStorage() == 0) {
            throw new RuntimeException("Solara Storage is empty");
        }
        System.out.print("In Solara Storage: ");
        return getTotalSolaraStorage();
    }

    public int countDynaStorage() {
        if (getTotalDynaStorage() == 0) {
            throw new RuntimeException("Dyna Storage is empty");
        }
        System.out.print("In Dyna Storage: ");
        return getTotalDynaStorage();
    }

    public int countHianceStorage() {
        if (getTotalHianceStorage() == 0) {
            throw new RuntimeException("Hiance Storage is empty");
        }
        System.out.println("In Hiance Storage: " + getTotalHianceStorage());
        return getTotalHianceStorage();
    }

    public Camry addCamry(Camry camry) {
        if (totalCamryStorage >= MAX_NUMBER_OF_CARS || totalCarsInMainStorage >= MAX_NUMBER_OF_CARS) {
            throw new RuntimeException("");
        }
        totalCarsInMainStorage++;
        totalCamryStorage++;
        for (int index = 0; index < solaraArray.length; index++) {
            if (camryArray[index] == null) {
                camryArray[index] = camry;
                break;
            }
        }
        System.out.println("Added: " + camry + "\nTotal cars in Main Storage: " + totalCarsInMainStorage
                + "\nTotal in Camry Storage: " + totalCamryStorage +
                "\n------------------------------------");

        return camry;
    }

    public Camry takeCamry(Camry camry) throws StorageIsEmptyException {

        if (totalCamryStorage == 0) {
            throw new StorageIsEmptyException();
        }

        totalCarsInMainStorage--;
        totalCamryStorage--;
        for (int index = 0; index < camryArray.length; index++) {
            if (camryArray[index] != null && camryArray[index].equals(camry)) {
                camryArray[index] = null;
                break;
            }
        }
        System.out.println(
                "Taken one Camry.\nTotal cars on the Main Storage: " +
                        totalCarsInMainStorage + "\nTotal in Camry Storage: " + totalCamryStorage +
                        "\n------------------------------------");
        return camry;
    }

    public Solara takeSolara(Solara solara) {
        if (totalCarsInMainStorage <= 0 || totalSolaraStorage <= 0) {
            throw new RuntimeException("Solara Storage is empty.");
        }
        totalCarsInMainStorage--;
        totalSolaraStorage--;
        for (int index = 0; index < solaraArray.length; index++) {
            if (solaraArray[index] != null && solaraArray[index].equals(solara)) {
                solaraArray[index] = null;
            }
        }
        System.out.println(
                "Taken one Solara.\nTotal cars on the Main Storage: " +
                        totalCarsInMainStorage + "\nTotal in Solara Storage: " + totalSolaraStorage +
                        "\n------------------------------------");
        return solara;
    }

    public Solara addSolara(Solara solara) {
        if (totalSolaraStorage >= MAX_NUMBER_OF_CARS || totalCarsInMainStorage >= MAX_NUMBER_OF_CARS) {
            throw new RuntimeException("");
        }
        totalCarsInMainStorage++;
        totalSolaraStorage++;
        for (int index = 0; index < solaraArray.length; index++) {
            if (solaraArray[index] == null) {
                solaraArray[index] = solara;
                break;
            }
        }
        System.out.println("Added to Solara Storage: " + solara + "\nTotal cars in Main Storage: " + totalCarsInMainStorage
                + "\nTotal in Solara Storage: " + totalSolaraStorage +
                "\n------------------------------------");

        return solara;
    }

    public int getMaxNumberOfCars() {
        return MAX_NUMBER_OF_CARS;
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
