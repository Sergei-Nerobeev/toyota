package hu.nero.toyota.detail;

import java.util.Objects;

/*
 *  Круиз контроль
 * */
public class CruiseControl extends AbsTurnDetail {
    private CountryOfProduction countryOfProduction;

    public CruiseControl(CountryOfProduction countryOfProduction) {
        this.countryOfProduction = countryOfProduction;
    }

    public void cruiseControlOn() {
        System.out.println("Cruise control is on");
    }

    public void cruiseControlOff() {
        System.out.println("Cruise control is off");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CruiseControl that = (CruiseControl) o;
        return countryOfProduction == that.countryOfProduction;
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryOfProduction);
    }
}
