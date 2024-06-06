package hu.nero.toyota.shop;

import hu.nero.toyota.model.Camry;

public class Cashier {
    private static double income = 0.0;


    public double countIncome(Camry camry) {
        income += camry.getPrice();
        System.out.printf("Sales amount: %s ",getIncome());
        return income;
    }

    public static double getIncome() {
        return income;
    }
}
