package hu.nero.toyota;

import hu.nero.toyota.detail.Color;
import hu.nero.toyota.detail.FuelTank;
import hu.nero.toyota.exceptoin.StartCarFailedException;
import hu.nero.toyota.detail.Country;
import hu.nero.toyota.model.Camry;
import hu.nero.toyota.model.Dyna;
import hu.nero.toyota.model.Hiance;
import hu.nero.toyota.model.Solara;

public class Runner {
    public static void main(String[] args) throws StartCarFailedException {
        Camry camry = new Camry(Color.BLUE, Country.USA);
        Dyna dyna = new Dyna(Color.BLACK, Country.CHINE);
        Hiance hiance = new Hiance(Color.GREEEN,Country.JAPAN);
        Solara solara = new Solara(Color.ORANGE,Country.CHINE);
        FuelTank fuelTank = new FuelTank();
        fuelTank.setLevel(20.0);
        camry.setFuelTank(fuelTank);
        camry.start();
        dyna.start();
        hiance.start();
        solara.start();


    }
}
