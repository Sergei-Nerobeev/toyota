package hu.nero.toyota.detail;

public enum Transmission {
  AUTOMATE("AUTOMATE"), ROBOT("ROBOT"), MECHANICAL("MECHANICAL");
  private String name;
  Transmission(String name) {
    this.name = name;
  }

}