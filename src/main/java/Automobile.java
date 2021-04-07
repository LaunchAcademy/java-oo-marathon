public abstract class Automobile {
  private String type;
  private String model;
  private String make;
  private int mpg;
  private int fuelCapacity;
  private boolean engineRunning;

  //void keyword is redundant
  public Automobile(String type, String model, String make, int mpg, int fuelCapacity) {
//    String type = this.type;
    this.type = type;
    this.model = model;
    this.make = make;
    this.mpg = mpg;
    this.fuelCapacity = fuelCapacity;
    this.engineRunning = true;
  }

  public boolean getRunning() {
    return this.engineRunning;
  }

  public void toggleEngine() {
//    this.engineRunning = false;
    if(this.engineRunning) {
      this.engineRunning = false;
    } else {
      this.engineRunning = true;
    }
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
}
