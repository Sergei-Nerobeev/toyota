package hu.nero.toyota.detail;

import java.util.Objects;

public class Socket {
    private CountryOfProduction countryOfProduction;

    public Socket(CountryOfProduction countryOfProduction) {
        this.countryOfProduction = countryOfProduction;
    }

    public void chargePhone() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Socket socket = (Socket) o;
        return countryOfProduction == socket.countryOfProduction;
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryOfProduction);
    }
}
