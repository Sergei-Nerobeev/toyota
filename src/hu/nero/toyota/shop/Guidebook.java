package hu.nero.toyota.shop;

public class Guidebook {

    private final static double CAMRY_COST_PRICE = 5000;
    private final double SOLARA_COST_PRICE = 8000;
    private final double DYNA_COST_PRICE = 10_000;
    private final double HIANCE_COST_PRICE = 12_000;

    public double getCAMRY_COST_PRICE() {
        return CAMRY_COST_PRICE;
    }

    public double getSOLARA_COST_PRICE() {
        return SOLARA_COST_PRICE;
    }

    public double getDYNA_COST_PRICE() {
        return DYNA_COST_PRICE;
    }

    public double getHIANCE_COST_PRICE() {
        return HIANCE_COST_PRICE;
    }

    @Override
    public String toString() {
        return "CAMRY_COST_PRICE =" + CAMRY_COST_PRICE;



    }
}
