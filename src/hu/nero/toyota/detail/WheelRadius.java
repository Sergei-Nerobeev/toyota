package hu.nero.toyota.detail;

public enum WheelRadius {
    SIXTEEN(16),SEVENTEEN(17),TWENTY(20);
    private final int size;

    WheelRadius(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
