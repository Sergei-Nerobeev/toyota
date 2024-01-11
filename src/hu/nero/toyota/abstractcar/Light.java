package hu.nero.toyota.abstractcar;

public class Light {
  private boolean isOn;

  public Light() {
    this.isOn = true;
  }

  public void tornOn() {
    if (isOn) {
      System.out.println("Light on");
    }
    else {
      System.out.println("Light is not working");
    }
  }
}
