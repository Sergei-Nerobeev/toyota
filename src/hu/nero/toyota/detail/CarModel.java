package hu.nero.toyota.detail;

public enum CarModel {
    CAMRY("CAMRY"), DYNA("DYNA"), HIANCE("HIANCE"), SOLARA("SOLARA");
    private String name;
    CarModel(String name) {
        this.name = name;
    }
}
