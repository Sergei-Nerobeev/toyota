package hu.nero.toyota.detail;

public class Roof extends AbsTurnDetail{
    private Roof roof;
    public Roof getRoof() {
        return roof;
    }

    public void setRoof(Roof roof) {
        this.roof = roof;
    }

    public void roofUp() {
        System.out.println("Roof up");
        roof.setOn(true);
    }

    public void roofDown() {
        System.out.println("Roof down");
        roof.setOn(false);
    }
}
