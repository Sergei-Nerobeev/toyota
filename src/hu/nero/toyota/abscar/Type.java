package hu.nero.toyota.abscar;

public enum Type {
  PASSENGERS(), CABRIOLET(false), VAN(0);
  private boolean roofState;
  private int maxWeight;
  Type(){}

  Type(boolean state) {
    this.roofState = roofState;
  }

  Type(int maxWeight) {
    this.maxWeight = maxWeight;
  }

  public boolean isRoofStateOn() {
    return roofState;
  }

  public void setRoofState(boolean state) {
    this.roofState = roofState;
  }

  public int getMaxWeight() {
    return maxWeight;
  }

  public void setMaxWeight(int maxWeight) {
    this.maxWeight = maxWeight;
  }
}
