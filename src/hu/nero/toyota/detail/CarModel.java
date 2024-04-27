package hu.nero.toyota.detail;

public enum CarModel {
    CAMRY(10_000, 5_000),
    DYNA(12_000, 8_000),
    HIANCE(15_000,10_000),
    SOLARA(22_000,12_000);
 private final double shopPrice;
 private final double factoryPrice;

    CarModel(double shopPrice, double factoryPrice) {
        this.shopPrice = shopPrice;
        this.factoryPrice = factoryPrice;
    }

    public double getShopPrice() {
        return shopPrice;
    }

    public double getFactoryPrice() {
        return factoryPrice;
    }
}
