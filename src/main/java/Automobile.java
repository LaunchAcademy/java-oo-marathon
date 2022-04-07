public class Automobile {
  private String type;
  private String model;
  private String make;
  private int mpg;
  private int fuelCapacity;
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
    return type;
  }

  public String getModel() {
    return model;
  }

  public String getMake() {
    return make;
  }

  public int getMpg() {
    return mpg;
  }

  public int getFuelCapacity() {
    return fuelCapacity;
  }

  public boolean isRunning() {
    return running;
  }

  public void toggleEngine() {
//    if (this.running == true) {
//    if (this.running) {
//      this.running = false;
//    }
//    else {
//      this.running = true;
//    }
    this.running = !this.running;
//    running = !running;
  }
}
