package hu.nero.toyota.storage;

import hu.nero.toyota.models.Camry;
import hu.nero.toyota.models.Dyna;
import hu.nero.toyota.models.Hiance;
import hu.nero.toyota.models.Solara;

public class CarStorage {
  private static final int MAX_CARS = 1000; // макс количество машин на складе
  private int totalCars; // общее количество машин на складе
  private  int[] carQuantites; // массив для хранения количества каждого типа машин
  private Camry[] camry;
  private Solara[] solara;
  private Dyna[] dyna;
  private Hiance[] hiance;

  public CarStorage() {
    this.totalCars = 0;
    camry = new Camry[MAX_CARS];
    solara = new Solara[MAX_CARS];
    dyna = new Dyna[MAX_CARS];
    hiance = new Hiance[MAX_CARS];
  }
  public void addCamry(Camry camry, int quantity) {
    this.camry = new Camry[quantity];
    totalCars += quantity;
    System.out.println(quantity + " cars type of " + camry + " added in CarStorage. Total cars: " + totalCars);

  }

}
