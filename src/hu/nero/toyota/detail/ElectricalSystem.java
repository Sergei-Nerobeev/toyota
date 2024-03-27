package hu.nero.toyota.detail;

import java.util.Objects;

public class ElectricalSystem extends AbsCrushDetail {
    private CountryOfProduction countryOfProduction;

    public ElectricalSystem(CountryOfProduction countryOfProduction) {
        this.countryOfProduction = countryOfProduction;
    }

    @Override
    public String toString() {
        return "ElectricalSystem made in: " + countryOfProduction.toString();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ElectricalSystem electricalSystem = (ElectricalSystem) object;
        return Objects.equals(countryOfProduction, electricalSystem.countryOfProduction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryOfProduction);
    }
}
