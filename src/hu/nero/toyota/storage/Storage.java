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
    this.cars[0][0] = camry;
    totalCars += 1;
    maxCars -= 1;
    System.out.println("Added to Storage: " + camry + ". Total cars: " + totalCars + ". Free place: " + maxCars);
  }
  public void addCar(Object car){
  if(car.equals(this.camry)) {
    this.cars[0][0] = car;
    totalCars++;
    maxCars--;
    System.out.println("Added to Storage: " + camry + ". Total cars: " + totalCars + ". Free place: " + maxCars);
  }
  else if (car.equals(solara)) {
    this.cars[0][1] = car;
    totalCars += 1;
    maxCars -= 1;
    System.out.println("Added to Storage: " + solara + ". Total cars: " + totalCars + ". Free place: " + maxCars);
  }
  else if(car.equals(dyna)) {
    this.cars[0][2] = dyna;
    totalCars += 1;
    maxCars -= 1;
    System.out.println("Added to Storage: " + dyna + ". Total cars: " + totalCars + ". Free place: " + maxCars);
  }
  else if(car.equals(hiance)) {
    this.cars[0][3] = hiance;
    totalCars += 1;
    maxCars -= 1;
    System.out.println("Added to Storage: " + hiance + ". Total cars: " + totalCars + ". Free place: " + maxCars);
  }
  }

  public Camry takenCamry() {
    Camry takenCamry = (Camry) this.cars[0][0];
    totalCars -= 1;
    maxCars += 1;
    System.out.println(
        "Taken from Storage: " + takenCamry + ". Total cars: " + totalCars + "." + " Free place: " + maxCars);
    return takenCamry;

  }

  public void addSolar(Solara solara) {
    this.cars[0][1] = solara;
    totalCars += 1;
    maxCars -= 1;
    System.out.println("Added to Storage: " + solara + ". Total cars: " + totalCars + ". Free place: " + maxCars);
  }

  public Solara takenSolar() {
    Solara takenSolar = (Solara) this.cars[0][1];
    totalCars -= 1;
    maxCars += 1;
    System.out.println(
        "Taken from Storage: " + takenSolar + ". Total cars: " + totalCars + "." + " Free place: " + maxCars);
    return takenSolar;

  }

  public void addDyna(Dyna dyna) {
    this.cars[0][2] = dyna;
    totalCars += 1;
    maxCars -= 1;
    System.out.println("Added to Storage: " + dyna + ". Total cars: " + totalCars + ". Free place: " + maxCars);
  }

  public Dyna takenDyna() {
    Dyna takenDyna = (Dyna) this.cars[0][2];
    totalCars -= 1;
    maxCars += 1;
    System.out.println(
        "Taken from Storage: " + takenDyna + ". Total cars: " + totalCars + "." + " Free place: " + maxCars);
    return takenDyna;

  }

  public void addHiance(Hiance hiance) {
    this.cars[0][3] = hiance;
    totalCars += 1;
    maxCars -= 1;
    System.out.println("Added to Storage: " + hiance + ". Total cars: " + totalCars + ". Free place: " + maxCars);
  }

  public Hiance takenHiance() {
    Hiance takenHiance = (Hiance) this.cars[0][3];
    totalCars -= 1;
    maxCars += 1;
    System.out.println(
        "Taken from Storage: " + takenHiance + ". Total cars: " + totalCars + "." + " Free place: " + maxCars);
    return takenHiance;
  }
}
