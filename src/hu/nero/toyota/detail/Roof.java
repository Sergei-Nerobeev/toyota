package hu.nero.toyota.detail;

public class Roof extends AbsTurnDetail {
    private Roof roof;

    public Roof getRoof() {
        return roof;
    }

    public void roofUp() {
        System.out.println("Roof up");

    }

    public void roofDown() {
        System.out.println("Roof down");
        roof.setOn(false);
    }
}
