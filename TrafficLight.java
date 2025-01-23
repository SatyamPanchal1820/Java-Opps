class Light {
  private String colour;
  private int duration;

  public Light(String colour, int duration) {
    this.colour = colour;
    this.duration = duration;

  }

  public String getColour() {
    return colour;
  }

  public int getDuration() {
    return duration;
  }

  void setColour(String colour) {
    this.colour = colour;

  }

  void setDuration(int duration) {
    this.duration = duration;
  }

  public void changeColor(String newColour) {

    colour = newColour;
  }

  public boolean isRed() {

    return colour.equals("red");
  }

  public boolean isGreen() {

    return colour.equals("green");
  }

}

public class TrafficLight {

  public static void main(String[] args) {

    Light light = new Light("red", 30);

    System.out.println("The light is red: " + light.isRed());

    System.out.println("The light is green: " + light.isGreen());

    light.changeColor("green");

    System.out.println("The light is now green: " + light.isGreen());

    System.out.println("The light duration is: " + light.getDuration());

    light.setDuration(20);
    System.out.println("The light duration is now: " + light.getDuration());
  }
}
