package hu.nero.toyota.shop;

import hu.nero.toyota.model.Camry;

public class Cashier {
    public static Double inCome = (double) 0;

    public void addIncome(Camry camry) {
        inCome = camry.getPrice();
    }

    public static Double getInCome() {
        return inCome;
    }
}
