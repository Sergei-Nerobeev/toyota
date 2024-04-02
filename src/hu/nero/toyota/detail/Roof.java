package hu.nero.toyota.detail;

import java.util.Objects;

public class Roof extends AbsTurnDetail {
    private CountryOfProduction countryOfProduction;
    private Roof roof;

    public Roof(CountryOfProduction countryOfProduction) {
        this.countryOfProduction = countryOfProduction;
    }

    public Roof getRoof() {
        return roof;
    }

    public void roofUp() {
        System.out.println("Roof up");

    }

    public void roofDown() {
        System.out.println("Roof down");
        roof.setOn(false);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Roof roof1 = (Roof) o;
        return countryOfProduction == roof1.countryOfProduction && Objects.equals(roof, roof1.roof);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryOfProduction, roof);
    }
}
