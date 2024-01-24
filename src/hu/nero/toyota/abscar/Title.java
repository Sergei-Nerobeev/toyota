package hu.nero.toyota.abscar;

public enum Title {
  CAMRY("Camry"), SOLARA("Solara"), DYNA("Dyna"), HIANCE("Hiance");

  private String title;

  Title(String title) {
    this.title = title;
  }

  public String getTitle() {
    return title;
  }
}
