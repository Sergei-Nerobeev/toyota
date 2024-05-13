package hu.nero.toyota.storage;

import hu.nero.toyota.exceptoin.StorageIsEmptyException;
import hu.nero.toyota.model.Camry;
import hu.nero.toyota.model.Dyna;
import hu.nero.toyota.model.Hiance;
import hu.nero.toyota.model.Solara;

import java.util.Arrays;

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
    final String BORDER_LINE = "\n------------------------------------";

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

    public Camry add(Camry camry) {
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
                BORDER_LINE);

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
                        BORDER_LINE);
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
                        BORDER_LINE);
        return solara;
    }

    public Solara add(Solara solara) {
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
                + "\nTotal in Solara Storage: " + totalSolaraStorage + "\n" + BORDER_LINE);

        return solara;
    }

    public Hiance takeHiance(Hiance hiance) {
        if (totalCarsInMainStorage <= 0 || totalHianceStorage <= 0) {
            throw new RuntimeException("Hiance Storage is empty.");
        }
        totalCarsInMainStorage--;
        totalHianceStorage--;
        for (int index = 0; index < hianceArray.length; index++) {
            if (hianceArray[index] != null && hianceArray[index].equals(hiance)) {
                hianceArray[index] = null;
            }
        }
        System.out.println(
                "Taken one Hiance.\nTotal cars on the Main Storage: " +
                        totalCarsInMainStorage + "\nTotal in Hiance Storage: " + totalHianceStorage +
                        BORDER_LINE);
        return hiance;
    }

    public Hiance add(Hiance hiance) {
        if (totalHianceStorage >= MAX_NUMBER_OF_CARS || totalCarsInMainStorage >= MAX_NUMBER_OF_CARS) {
            throw new RuntimeException("");
        }
        totalCarsInMainStorage++;
        totalHianceStorage++;
        for (int index = 0; index < hianceArray.length; index++) {
            if (hianceArray[index] == null) {
                hianceArray[index] = hiance;
                break;
            }
        }
        System.out.println("Added to Hiance Storage: " + hiance + "\nTotal cars in Main Storage: " + totalCarsInMainStorage
                + "\nTotal in Hiance Storage: " + totalHianceStorage + "\n" + BORDER_LINE);

        return hiance;
    }

    public Dyna takeDyna(Dyna dyna) {
        if (totalCarsInMainStorage <= 0 || totalDynaStorage <= 0) {
            throw new RuntimeException("Dyna Storage is empty.");
        }
        totalCarsInMainStorage--;
        totalDynaStorage--;
        for (int index = 0; index < dynaArray.length; index++) {
            if (dynaArray[index] != null && dynaArray[index].equals(dyna)) {
                dynaArray[index] = null;
            }
        }
        System.out.println(
                "Taken one Dyna.\nTotal cars on the Main Storage: " +
                        totalCarsInMainStorage + "\nTotal in Hiance Storage: " + totalDynaStorage +
                        BORDER_LINE);
        return dyna;
    }

    public Dyna add(Dyna dyna) {
        if (totalDynaStorage >= MAX_NUMBER_OF_CARS || totalCarsInMainStorage >= MAX_NUMBER_OF_CARS) {
            throw new RuntimeException("");
        }
        totalCarsInMainStorage++;
        totalDynaStorage++;
        for (int index = 0; index < dynaArray.length; index++) {
            if (dynaArray[index] == null) {
                dynaArray[index] = dyna;
                break;
            }
        }
        System.out.println("Added to Dyna Storage: " + dyna + "\nTotal cars in Main Storage: " + totalCarsInMainStorage
                + "\nTotal in Dyna Storage: " + totalDynaStorage + "\n" + BORDER_LINE);

        return dyna;
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
