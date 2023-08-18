public class Truck extends Automobile {
  private int bedLengthFeet;
  private int bedWidthFeet;
  private int containerHeightFeet;
  private int currentLoadCubicFeet;

  public Truck(String type, String model, String make, int mpg, int fuelCapacity, int bedLengthFeet, int bedWidthFeet) {
    super(type, model, make, mpg, fuelCapacity);
    // this.running is true by default at this point
    toggleEngine(); // now set to false
    this.bedLengthFeet = bedLengthFeet;
    this.bedWidthFeet = bedWidthFeet;
    this.containerHeightFeet = 3;
    this.currentLoadCubicFeet = 0;
  }

  public Truck(String type, String model, String make, int mpg, int fuelCapacity, int bedLengthFeet, int bedWidthFeet, int containerHeightFeet) {
    this(type, model, make, mpg, fuelCapacity, bedLengthFeet, bedWidthFeet);
    this.containerHeightFeet = containerHeightFeet;
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
    int totalVolume = bedLengthFeet * bedWidthFeet * containerHeightFeet;
    return totalVolume;
  }

  public boolean addCargo(int newCargo) {
//    int volume = volumeCapacity();
    if(volumeCapacity() >= newCargo) {
      currentLoadCubicFeet += newCargo;
      return true;
    } else {
      return false;
    }
  }

  public void emptyCargo() {
    currentLoadCubicFeet = 0;
  }
}
