public class Truck extends Automobile{
  private int bedLengthFeet;
  private int bedWidthFeet;
  private int containerHeightFeet;
  private int currentLoadCubicFeet;

  public Truck(String type, String model, String make, int mpg, int fuelCapacity, int bedLengthFeet, int bedWidthFeet ){
    super(type, model, make, mpg, fuelCapacity);
    this.bedLengthFeet = bedLengthFeet;
    this.bedWidthFeet = bedWidthFeet;
    this.containerHeightFeet = 3;
    this.currentLoadCubicFeet = 0;
    toggleEngine();
  }

  public Truck(String type, String model, String make, int mpg, int fuelCapacity, int bedLengthFeet, int bedWidthFeet, int containerHeightFeet){
    // here, the `this` keyword is just like calling `new Truck(...)`
    // line 19 is able to replace lines 21-25, which can now be commented out
    this(type, model, make, mpg, fuelCapacity, bedLengthFeet, bedWidthFeet);
    this.containerHeightFeet = containerHeightFeet;
//    super(type, model, make, mpg, fuelCapacity);
//    this.bedLengthFeet = bedLengthFeet;
//    this.bedWidthFeet = bedWidthFeet;
//    this.currentLoadCubicFeet = 0;
//    toggleEngine();
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

  public int volumeCapacity(){
    int capacity = bedWidthFeet * containerHeightFeet * bedLengthFeet;
    return capacity;
  }

  public boolean addCargo(int newCargo) {
//    if(newCargo + currentLoadCubicFeet <= volumeCapacity()){
//      currentLoadCubicFeet += newCargo;
//      return true;
//    }else{
//      return false;
//    }
    if(newCargo + currentLoadCubicFeet <= volumeCapacity()){
      currentLoadCubicFeet += newCargo;
      return true;
    }
    return false;
  }

  public void emptyCargo() {
    currentLoadCubicFeet = 0;
  }
}
