package in.ac.spit.mca.se.ise2.receiver;

public class AC {

  private String description;
  private int temperature;

  public AC() {}

  public AC(String description, int temperature) {
    this.description = description;
    this.temperature = temperature;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getDescription() {
    return this.description;
  }

  public void setTemperature(int temperature) {
    this.temperature = temperature;
  }

  public int getTemperature() {
    return this.temperature;
  }

  public void incrementTemperature() {
    System.out.println("Current temperature: "+this.temperature);
    this.temperature++;
    System.out.println("Increased to: "+this.temperature);
  }

  public void decrementTemperature() {
    System.out.println("Current temperature: "+this.temperature);
    this.temperature--;
    System.out.println("Decreased to: "+this.temperature);
  }

  public void switchOn() {
    System.out.println(this.description + " is switched on!");
  }

  public void switchOff() {
    System.out.println(this.description + " is switched off!");
  }
}
