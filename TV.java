package in.ac.spit.mca.se.ise2.receiver;

public class TV {

  private String description;

  public TV() {}

  public TV(String description) {
    this.description = description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getDescription() {
    return this.description;
  }

  public void switchOn() {
    System.out.println(this.description + " is switched on!");
  }

  public void switchOff() {
    System.out.println(this.description + " is switched off!");
  }
}
