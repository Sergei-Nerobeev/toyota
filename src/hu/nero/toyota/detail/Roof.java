package hu.nero.toyota.detail;

import java.util.Objects;

public class Roof extends AbsTurnDetail {
    private CountryOfProduction countryOfProduction;


    public Roof(CountryOfProduction countryOfProduction) {
        this.countryOfProduction = countryOfProduction;
    }

    public void roofUp() {
        setOn(true);
    }

    public void roofDown() {
        setOn(false);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Roof roof1 = (Roof) o;
        return countryOfProduction == roof1.countryOfProduction;
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryOfProduction);
    }
}
