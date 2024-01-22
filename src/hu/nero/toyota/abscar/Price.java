package hu.nero.toyota.abscar;

public enum Price {

  CAMRY(30000.00), SOLARA(28000.00), DYNA(22000.00), HIANCE(20000.00);
  private double cost;

  Price(double cost) {
    this.cost = cost;
  }

  public double getCost() {
    return cost;
  }

  public void setCost(int cost) {
    this.cost = cost;
  }
}
