public class Truck extends Automobile {
  private int bedLengthFeet;
  private int bedWidthFeet;
  private int containerHeightFeet;
  private int currentLoadCubicFeet;

  Truck(String type, String model, String make, int mpg, int fuelCapacity, int bedLengthFeet, int bedWidthFeet) {
    super(type, model, make, mpg, fuelCapacity);
    this.bedLengthFeet = bedLengthFeet;
    this.bedWidthFeet = bedWidthFeet;
    this.containerHeightFeet = 3;
    toggleEngine();
    this.currentLoadCubicFeet = 0;
  }

  Truck(String type, String model, String make, int mpg, int fuelCapacity, int bedLengthFeet, int bedWidthFeet, int containerHeightFeet) {
    super(type, model, make, mpg, fuelCapacity);
    this.bedLengthFeet = bedLengthFeet;
    this.bedWidthFeet = bedWidthFeet;
    toggleEngine();
    this.containerHeightFeet = containerHeightFeet;
    this.currentLoadCubicFeet = 0;
  }

  public int getBedLengthFeet() {
    return this.bedLengthFeet;
  }

  public int getBedWidthFeet() {
    return this.bedWidthFeet;
  }

  public int getContainerHeightFeet() {
    return this.containerHeightFeet;
  }

  public int getCurrentLoadCubicFeet() {
    return this.currentLoadCubicFeet;
  }

  public int volumeCapacity() {
    return this.bedLengthFeet * this.bedWidthFeet * this.containerHeightFeet;
  }

  public boolean addCargo(int newCargo) {
    if (currentLoadCubicFeet + newCargo > volumeCapacity()) {
      return false;
    } else {
      currentLoadCubicFeet += newCargo;
      return true;
    }
  }

  public void emptyCargo() {
    this.currentLoadCubicFeet = 0;
  }
}
