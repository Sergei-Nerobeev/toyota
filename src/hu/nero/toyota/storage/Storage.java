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

  public void addCar(Object car) {
    for (int i = 0; i < cars.length; i++) {
      for (int j = 0; j < cars.length; ) {
        cars[i][j] = car;
        totalCars++;
        maxCars--;
        System.out.println("Added to Storage: " + car + ". Total cars: " + totalCars + ". Free place: " + maxCars);
        break;
      }
    }
  }

  public Object takenCar() {
    Object takenCar = null;
    for (int i = 0; i < cars.length; i++) {
      for (int j = 0; j < cars.length; j++ ) {
        takenCar = cars[i][j];
        totalCars -= 1;
        maxCars += 1;
        System.out.println(
            "Taken from Storage: " + takenCar + ". Total cars: " + totalCars + "." + " Free place: " + maxCars);

      }
    }
    return takenCar;
  }
}



