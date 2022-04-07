public class Truck extends Automobile {
  private int bedLengthFeet;
  private int bedWidthFeet;
  private int containerHeightFeet;
  private int currentLoadCubicFeet;

  public Truck(String type, String model, String make, int mpg, int fuelCapacity, int bedLengthFeet, int bedWidthFeet, int containerHeightFeet) {
    super(type, model, make, mpg, fuelCapacity);
    toggleEngine();
    this.bedLengthFeet = bedLengthFeet;
    this.bedWidthFeet = bedWidthFeet;
    this.containerHeightFeet = containerHeightFeet;
    this.currentLoadCubicFeet = 0;
  }

  public Truck(String type, String model, String make, int mpg, int fuelCapacity, int bedLengthFeet, int bedWidthFeet) {
    super(type, model, make, mpg, fuelCapacity);
    toggleEngine();
    this.bedLengthFeet = bedLengthFeet;
    this.bedWidthFeet = bedWidthFeet;
    this.containerHeightFeet = 3;
    this.currentLoadCubicFeet = 0;
  }

  public int getBedLengthFeet() {
    return bedLengthFeet;
  }

  public int getBedWidthFeet() {
    return bedWidthFeet;
  }

  public int getContainerHeightFeet() {
    return containerHeightFeet;
  }

  public int getCurrentLoadCubicFeet() {
    return currentLoadCubicFeet;
  }

  public int volumeCapacity() {
    return bedLengthFeet * bedWidthFeet * containerHeightFeet;
  }

  public boolean addCargo(int cargoAdded) {
    if(cargoAdded + currentLoadCubicFeet  > volumeCapacity()){
      return false;
    }
    currentLoadCubicFeet += cargoAdded;
    return true;
  }

  public void emptyCargo() {
    currentLoadCubicFeet = 0;
  }
}
