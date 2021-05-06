public class Truck extends Automobile {
  private int bedLengthFeet;
  private int bedWidthFeet;
  private int containerHeightFeet;
  private int currentLoadCubicFeet;

  public Truck(String type, String model, String make, int mpg, int fuelCapacity, int bedLengthFeet, int bedWidthFeet) {
    super(type, model, make, mpg, fuelCapacity);
    this.bedLengthFeet = bedLengthFeet;
    this.bedWidthFeet = bedWidthFeet;
    this.currentLoadCubicFeet = 0;
    this.setRunning(false);
    this.containerHeightFeet = 3;
  }

  public Truck(String type, String model, String make, int mpg, int fuelCapacity, int bedLengthFeet, int bedWidthFeet, int containerHeightFeet) {
//    super(type, model, make, mpg, fuelCapacity);
//    this.bedLengthFeet = bedLengthFeet;
//    this.bedWidthFeet = bedWidthFeet;
//    this.currentLoadCubicFeet = 0;
//    this.setRunning(false);
    this(type, model, make, mpg, fuelCapacity, bedLengthFeet, bedWidthFeet);
    this.containerHeightFeet = containerHeightFeet;
  }

  public int getCurrentLoadCubicFeet() {
    return currentLoadCubicFeet;
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
}
