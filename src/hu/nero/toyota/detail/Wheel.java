package hu.nero.toyota.detail;

import java.util.Objects;

public class Wheel extends AbsCrushDetail {
  private CountryOfProduction countryOfProduction;
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
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Wheel wheel = (Wheel) o;
    return countryOfProduction == wheel.countryOfProduction && wheelRadius == wheel.wheelRadius;
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryOfProduction, wheelRadius);
  }
}
