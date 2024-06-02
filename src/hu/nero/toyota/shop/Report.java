package hu.nero.toyota.shop;

import hu.nero.toyota.model.Camry;
import hu.nero.toyota.model.Dyna;
import hu.nero.toyota.model.Hiance;
import hu.nero.toyota.model.Solara;

import java.io.FileWriter;
import java.io.IOException;

public class Report {
    private final String managerName;
    private final Camry[] soldCamrys = new Camry[1_000];
    private final Solara[] soldSolaras = new Solara[1_000];
    private final Hiance[] soldHiances = new Hiance[1_000];
    private final Dyna[] soldDynas = new Dyna[1_000];
    private int countSoldCamry = 0;
    private int countSoldSolara = 0;
    private int countSoldHiance = 0;
    private int countSoldDyna = 0;

    public Report(String managerName) {
        this.managerName = managerName;
    }

    public void addSoldCamry(Camry camry) {
        soldCamrys[countSoldCamry] = camry;
        countSoldCamry++;
    }

    // создание файла с отчетом
    public void createFileReport(String filename) {
        try (FileWriter fileWriter = new FileWriter(filename)) {
            fileWriter.append(createTextReport());
        } catch (IOException e) {
            System.out.println("Unable to write to report file");
        }
    }

    // создание текста файла
    public String createTextReport() {

        return managerName + "Продано: " + getCountSoldCamry() + " " + getUnits(getCountSoldCamry());
    }

    public int getCountSoldCamry() {
        return countSoldCamry;
    }

    public String getUnits(int carCount) {
        //1 штука, 2,3,4 штуки, 5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20 штук

        if (carCount % 10 == 1 && carCount % 100 != 11) {
            return "штука";
        } else if (carCount % 10 >= 2 && carCount % 10 <= 4 && (carCount % 100 < 10 || carCount % 100 >= 20)) {
            return "штуки";
        } else {
            return "штук";
        }
    }

}