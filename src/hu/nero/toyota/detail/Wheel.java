package hu.nero.toyota.detail;

import java.util.Objects;

public class Wheel extends AbsCrushDetail {
    private CountryOfProduction countryOfProduction;

    public Wheel(CountryOfProduction countryOfProduction) {
        this.countryOfProduction = countryOfProduction;
    }

    public void setCountryOfProduction(CountryOfProduction countryOfProduction) {
        this.countryOfProduction = countryOfProduction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wheel wheel = (Wheel) o;
        return countryOfProduction == wheel.countryOfProduction;
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryOfProduction);
    }
}
