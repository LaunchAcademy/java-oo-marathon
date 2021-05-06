public class Car extends Automobile{

  private int capacity;
  private int numPassengers;

  public Car(String type, String model, String make, int mpg, int fuelCapacity, int capacity, int numPassengers){
    super(type, model, make, mpg, fuelCapacity);
    this.capacity = capacity;
    this.numPassengers = numPassengers;
    this.setRunning(false);
    // we could only do the below if we marked the field as protected
    // this is not ideal as it exposes the field more
//    this.running = false;
  }

  public int getCapacity() {
    return capacity;
  }

  public int getNumPassengers() {
    return numPassengers;
  }

  public boolean addPassengers(int newPassengers) {

    // check if we still have room
    // capacity tells us how many people can fit
    // numPassengers tells us how many people are currently in the car
    // newPassengers tells us how many people are trying to get in the car
    // we need to check: can numPassengers + newPassengers fit in the car
    // is numPassengers + newPassengers <= capacity
    if(numPassengers + newPassengers <= capacity) {
      numPassengers += newPassengers;
      return true;
    } else {
      return false;
    }

  }

  public void exitPassengers(int numExitingPassengers) {
    // if more people are trying to leave than are currently in the car
    // (if subtracting numExitingPassengers from numPassengers is negative)
    if (this.numPassengers - numExitingPassengers < 0) {
      // set numPassengers to 0 (instead of allowing it to be negative)
      this.numPassengers  = 0;
    } else {
      // otherwise subtract numExitingPassengers
      this.numPassengers -= numExitingPassengers;
    }
  }
}