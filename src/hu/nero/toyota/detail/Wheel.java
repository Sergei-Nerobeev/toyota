package hu.nero.toyota.detail;

import java.util.Objects;

public class Wheel extends AbsCrushDetail {
  private final WheelRadius wheelRadius;

  public Wheel(WheelRadius wheelRadius) {
        this.wheelRadius = wheelRadius;
    }

  public WheelRadius getWheelRadius() {
    return wheelRadius;
  }

  @Override
  public String toString() {
    return "Wheel{" +
            "wheelRadius=" + wheelRadius +
            '}';
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) return true;
    if (object == null || getClass() != object.getClass()) return false;
    Wheel wheel = (Wheel) object;
    return wheelRadius == wheel.wheelRadius;
  }

  @Override
  public int hashCode() {
    return Objects.hash(wheelRadius);
  }
}
