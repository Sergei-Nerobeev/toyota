package hu.nero.toyota.abscar;

public class Wheel {
  private boolean isFlat;
  private int radius;

  public Wheel(int radius) {

    this.radius = radius;
  }
  public Wheel(){}

  public boolean isFlat() {
    return isFlat;
  }

  public int getRadius() {
    return radius;
  }

  public void setRadius(int radius) {
    this.radius = radius;
  }

  public void setFlat(boolean flat) {
    isFlat = flat;
  }
}
