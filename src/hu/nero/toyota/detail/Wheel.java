package hu.nero.toyota.detail;

public class Wheel extends AbsCrushDetail {
  private final WheelRadius wheelRadius;

    public Wheel(WheelRadius wheelRadius) {
        this.wheelRadius = wheelRadius;
    }

  public WheelRadius getWheelRadius() {
    return wheelRadius;
  }
}
