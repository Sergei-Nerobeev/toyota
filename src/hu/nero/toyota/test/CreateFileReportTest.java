package hu.nero.toyota.test;

import hu.nero.toyota.shop.Report;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CreateFileReportTest {
    public static void main(String[] args) throws IOException {
        createFileReportTest();
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
}