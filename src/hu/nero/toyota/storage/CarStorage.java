package hu.nero.toyota.storage;

import hu.nero.toyota.models.Camry;
import hu.nero.toyota.models.Dyna;
import hu.nero.toyota.models.Hiance;
import hu.nero.toyota.models.Solara;

public class CarStorage {
  private static int maxCars = 1000; // макс количество машин на складе
  private int totalCars; // общее количество машин на складе
  private int[] carQuantites; // массив для хранения количества каждого типа машин
  private Camry[] camry;
  private Solara[] solara;
  private Dyna[] dyna;
  private Hiance[] hiance;

  public CarStorage() {
    this.totalCars = 0;
    this.camry = new Camry[maxCars];
    this.solara = new Solara[maxCars];
    this.dyna = new Dyna[maxCars];
    this.hiance = new Hiance[maxCars];
  }

  public void addCamry(Camry camry, int quantity) {
    for (int i = 0; i < quantity; i++) {
      this.camry[totalCars + i] = camry;
    }
    totalCars += quantity;
    maxCars -= totalCars;
    System.out.println(quantity + " cars type of " + camry + " added in CarStorage. Total cars: "
                           + totalCars + " Free storage place: " + maxCars);
  }

  public Camry takenCamry() {
    Camry takenCamry = new Camry();// TODO!
    takenCamry = this.camry[totalCars - 1];
    totalCars -= 1;
    System.out.println("Total cars: " + totalCars + "." + " Taken one of " + takenCamry.toString());
    return takenCamry;
  }
  public void addSolara(Solara solara, int quantity) {
    for (int i = 0; i < quantity; i++) {
      this.solara[totalCars + i] = solara;
    }
    totalCars += quantity;
    maxCars -= totalCars;
    System.out.println(quantity + " cars type of " + solara + " added in CarStorage. Total cars: "
                           + totalCars + " Free storage place: " + maxCars);
  }

  public Solara takenSolara() {
    Solara takenSolara = this.solara[totalCars - 1];
    totalCars -= 1;
    System.out.println("Total cars: " + totalCars + "." + " Taken one of " + takenSolara.toString());
    return takenSolara;
  }

}
