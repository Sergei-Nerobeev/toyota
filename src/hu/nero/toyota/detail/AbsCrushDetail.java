package hu.nero.toyota.detail;

public abstract class AbsCrushDetail {
    private boolean isWork = true;

    public boolean isWork() {
        return isWork;
    }

    public void setWork(boolean work) {
        isWork = work;
    }
}
