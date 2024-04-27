package hu.nero.toyota.shop;

public record Customer() {
    public static String NAME;
    private static double CASH;

    public Customer {
    }

    public static String getNAME() {
        return NAME;
    }

    public static double getCASH() {
        return CASH;
    }
}
