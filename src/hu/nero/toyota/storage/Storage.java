package hu.nero.toyota.storage;

import hu.nero.toyota.models.Camry;
import hu.nero.toyota.models.Dyna;
import hu.nero.toyota.models.Hiance;
import hu.nero.toyota.models.Solara;

public class Storage {
  private static int maxCars = 1000; // макс количество машин на складе
  private int totalCars; // общее количество машин на складе
  private Object[][] cars;
  private Camry[] camry;
  private Solara[] solara;
  private Dyna[] dyna;
  private Hiance[] hiance;

  public Storage() {
    this.totalCars = 0;
    this.cars = new Object[1][maxCars];
    this.camry = new Camry[maxCars];
    this.solara = new Solara[maxCars];
    this.dyna = new Dyna[maxCars];
    this.hiance = new Hiance[maxCars];
    this.cars[0][0] = camry;
    this.cars[0][1] = solara;
    this.cars[0][2] = dyna;
    this.cars[0][3] = hiance;
  }

  public void addCamry(Camry camry) {
    for (int i = 0; i < cars.length; i++)
      for (int j = 0; j < cars.length; j++) {
        this.cars[0][0] = camry;
        totalCars += 1;
        maxCars -= 1;
        System.out.println("Added to Storage: " + camry + ". Total cars: " + totalCars + ". Free place: " + maxCars);
      }
  }

  public Camry takenCamry() {
    Camry takenCamry = this.camry[totalCars - 1];
    totalCars -= 1;
    System.out.println("Total cars: " + totalCars + "." + " Taken: " + takenCamry);
    return takenCamry;

  }

  public void addSolara(Solara solara, int quantity) {
    for (int i = 0; i < quantity; i++) {
      this.solara[totalCars + i] = solara;
    }
    totalCars += quantity;
    maxCars -= totalCars;
    System.out.println(quantity + " cars type of " + solara + " added in Storage. Total cars: "
                           + totalCars + " Free storage place: " + maxCars);
  }

  public Solara takenSolara() {
    Solara takenSolara = this.solara[totalCars - 1];
    totalCars -= 1;
    System.out.println("Total cars: " + totalCars + "." + " Taken: " + takenSolara);
    return takenSolara;
  }

}
