package hu.nero.toyota.detail;
/*
*  Вкл - Выкл
* */
public abstract class AbsTurnDetail {
    private boolean isOn = false;

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }
}
