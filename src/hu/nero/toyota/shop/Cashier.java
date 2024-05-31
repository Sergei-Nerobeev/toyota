package hu.nero.toyota.shop;

import hu.nero.toyota.model.Camry;

public class Cashier {
    private static double income = 0.0;

    public void addIncome(Camry camry) {
        income += camry.getPrice();
    }

    public static double getIncome() {
        return income;
    }
}
