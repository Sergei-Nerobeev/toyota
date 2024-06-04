package hu.nero.toyota.test;

import hu.nero.toyota.shop.Report;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CreateFileReportTest {
    public static void main(String[] args) throws IOException {
        createFileReportTest();
//        getUnitsTest();
    }

    public static void createFileReportTest() throws IOException {
        Report report = new Report("Joe: ");
        File temp = null;
        try {
            temp = File.createTempFile("report", ".txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        report.createFileReport(temp.getAbsolutePath());
        FileReader fileReader = new FileReader(temp);
        try {
            int wr = fileReader.read();
            System.out.println(wr);
        } catch (FileNotFoundException exception) {
            System.out.println("File not found!");
        }
    }

    public static void getUnitsTest() {
        Report report = new Report("Joe: ");

        String result = report.getUnits(2);
        String result2 = report.getUnits(5);
        String result3 = report.getUnits(1);
        String result4 = report.getUnits(1001);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

    }
}