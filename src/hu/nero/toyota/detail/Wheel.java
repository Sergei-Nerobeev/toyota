package hu.nero.toyota.detail;

import java.util.Objects;

public class Wheel extends AbsCrushDetail {
    private CountryOfProduction countryOfProduction;
    private int wheelRadius;

    public Wheel(CountryOfProduction countryOfProduction, int wheelRadius) {
        this.countryOfProduction = countryOfProduction;
        this.wheelRadius = wheelRadius;
    }

    public void setCountryOfProduction(CountryOfProduction countryOfProduction) {
        this.countryOfProduction = countryOfProduction;
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
        return Objects.hash(countryOfProduction);
    }
}
