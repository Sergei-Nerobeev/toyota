package hu.nero.toyota.shop;

import hu.nero.toyota.model.Camry;
import hu.nero.toyota.model.Dyna;
import hu.nero.toyota.model.Hiance;
import hu.nero.toyota.model.Solara;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Report {
    private final String managerName;
    private final Camry[] soldCamrys = new Camry[1_000];
    private int countSoldCamry = 0;
    private final double camryCostPrice = 5000;
    private final Cashier cashier;

    public Report(String managerName) {
        this.managerName = managerName;
        this.cashier = new Cashier();

    }

    public int addSoldCamry(Camry camry) {
        soldCamrys[countSoldCamry] = camry;
        cashier.countIncome(camry);
        countSoldCamry++;
        return countSoldCamry;
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
        StringBuilder reportBuilder = new StringBuilder();
        reportBuilder.append(managerName + "\n" + "Report: sold " + countSoldCamry + " " +
                getUnits(getCountSoldCamry()) + "\n");

        joinCarsToReport(reportBuilder);
        return reportBuilder.toString();

    }

    private void joinCarsToReport(StringBuilder report) {
        double totalIncome = 0;
        for (Camry soldCamry : soldCamrys) {
            if (soldCamry == null) {
                break;
            }
            totalIncome = soldCamry.getPrice();

            report.append("CostPrice Camry: -- " + camryCostPrice + " ")
                    .append(" SoldPrice Camry: -- ")
                    .append(soldCamry.getPrice())
                    .append("\n");
        }
        double sum = totalIncome - camryCostPrice;
        report.append("Total:  income -- ")
                .append(totalIncome)
                .append(", outcome -- ")
                .append(camryCostPrice)
                .append(", Profit: ")
                .append(sum);

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