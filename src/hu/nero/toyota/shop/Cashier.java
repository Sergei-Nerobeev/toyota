package hu.nero.toyota.shop;

import hu.nero.toyota.model.Camry;

public class Cashier {
    private static double income = 0.0;

    public void addIncome(Camry camry) {
        income += camry.getPrice();
        System.out.printf("Sales amount:%s ",getIncome());
    }

    public static double getIncome() {
        return income;
    }
}
