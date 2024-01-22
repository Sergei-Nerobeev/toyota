package hu.nero.toyota.abscar;

public enum MaxSpeed {
  CAMRY(280), SOLARA(260), DYNA(220), HIANCE(200);
  private int maxSpeed;

  MaxSpeed(int maxSpeed) {
    this.maxSpeed = maxSpeed;
  }

  public int getMaxSpeed() {
    return maxSpeed;
  }

  public void setMaxSpeed(int maxSpeed) {
    this.maxSpeed = maxSpeed;
  }
}
