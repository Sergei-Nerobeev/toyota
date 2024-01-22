package hu.nero.toyota.abscar;

public enum Transmission {
  AUTOMATE("AUTOMATE"),ROBOT("ROBOT"), MECHANICAL("MECHANICAL");
  private String type;

  Transmission(String type) {
    this.type = type;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }
}
