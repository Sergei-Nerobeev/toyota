package hu.nero.toyota.detail;

import java.util.Objects;

public class Fridge {
    private CountryOfProduction countryOfProduction;
    private String title;

    public void freeze() {
        System.out.println("Cool cold cola in " + title);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCountryOfProduction(CountryOfProduction countryOfProduction) {
        this.countryOfProduction = countryOfProduction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fridge fridge = (Fridge) o;
        return countryOfProduction == fridge.countryOfProduction && Objects.equals(title, fridge.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryOfProduction, title);
    }
}
