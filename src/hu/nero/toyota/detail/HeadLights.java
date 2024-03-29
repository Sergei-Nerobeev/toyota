package hu.nero.toyota.detail;

import java.util.Objects;

/*
* Фары
* */
public class HeadLights extends AbsCrushDetail {
    private final CountryOfProduction countryOfProduction;

    public HeadLights(CountryOfProduction countryOfProduction) {
        this.countryOfProduction = countryOfProduction;
    }

    @Override
    public String toString() {
        return "HeadLights made in: " + countryOfProduction;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        HeadLights headLights = (HeadLights) object;
        return Objects.equals(countryOfProduction, headLights.countryOfProduction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryOfProduction);
    }
}
