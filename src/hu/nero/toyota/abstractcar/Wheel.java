package hu.nero.toyota.abstractcar;

public class Wheel {
  private boolean isFlat;
  private int radius;

  public Wheel() {
    this.isFlat = false;
    this.radius = 0;
  }

  public boolean getIsFlat() {
    return isFlat;
  }

  public int getRadius() {
    return radius;
  }

  public void replaceWheel(Wheel wheel) {
    if (this.radius == wheel.getRadius()) {
      this.radius = wheel.getRadius();
    }
  }
}
