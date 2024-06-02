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

        return managerName + "I sold " + getCountSoldCamry() + " Camry";
    }

    public int getCountSoldCamry() {
        return countSoldCamry;
    }
}
