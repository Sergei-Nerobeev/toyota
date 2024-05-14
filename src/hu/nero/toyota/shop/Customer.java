package hu.nero.toyota.shop;

public class Customer {
    private String name;
    private double moneyAmount;

    public Customer(String name, double moneyAmount) {
        this.name = name;
        this.moneyAmount = moneyAmount;
    }

    public String getName() {
        return "My name is " + name;
    }

    public double getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(int moneyAmount) {
        this.moneyAmount = moneyAmount;
    }
}
