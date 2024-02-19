package hu.nero.toyota.detail;

public enum Color {
  RED("RED"),
  WHITE("WHITE"),
  BLACK("BLACK"),
  GREEEN("GREEN"),
  BLUE("BLUE"),
  ORANGE("ORANGE");
  private String name;

  Color(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
