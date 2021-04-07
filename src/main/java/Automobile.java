public class Automobile {
  private final String type;
  private final String model;
  private final String make;
  private final int mpg;
  private final int fuelCapacity;
  private boolean running;

  public Automobile(String type, String model, String make, int mpg, int fuelCapacity) {
    this.type = type;
    this.model = model;
    this.make = make;
    this.mpg = mpg;
    this.fuelCapacity = fuelCapacity;
    this.running = true;
  }

  public String getType() {
    return this.type;
  }

  public String getModel() {
    return this.model;
  }

  public String getMake() {
    return this.make;
  }

  public int getMpg() {
    return this.mpg;
  }

  public int getFuelCapacity() {
    return this.fuelCapacity;
  }

  public boolean isRunning() {
    return this.running;
  }

  public void toggleEngine() {
    if (this.isRunning() == true) {
      this.running = false;
    } else if (this.isRunning() == false) {
      this.running = true;
    }
//    this.running = !this.running;
  }
}
