package hu.nero.toyota;

import hu.nero.toyota.detail.*;
import hu.nero.toyota.exceptoin.StartCarFailedException;
import hu.nero.toyota.model.Camry;
import hu.nero.toyota.model.Dyna;
import hu.nero.toyota.model.Hiance;
import hu.nero.toyota.model.Solara;

public class Runner {
    public static void main(String[] args) throws StartCarFailedException {

        Engine engine = new Engine();
        HeadLights headLights = new HeadLights();
        ElectricalSystem electricalSystem = new ElectricalSystem();
        Usb usb = new Usb();
        Camry camry = new Camry(Color.BLUE);

        camry.setEngine(engine);
        camry.setHeadLights(headLights);
        camry.setElectricalSystem(electricalSystem);
        camry.setUsb(usb);

        camry.connectedMusic();
        camry.start();



    }
}
