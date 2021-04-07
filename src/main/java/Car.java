public class Car extends Automobile {
  private final int capacity;
  private int numPassengers;

  public Car(String type, String model, String make, int mpg, int fuelCapacity, int capacity, int numPassengers) {
    super(type, model, make, mpg, fuelCapacity);
    this.capacity = capacity;
    this.numPassengers = numPassengers;
    toggleEngine();
  }

  public int getCapacity() {
    return this.capacity;
  }

  public int getNumPassengers() {
    return this.numPassengers;
  }

  public boolean addPassengers(int numberToAdd) {
    if ((numberToAdd + this.numPassengers) > this.capacity) {
      return false;
    }
    this.numPassengers += numberToAdd;
    return true;
  }

  public void exitPassengers(int numToExit) {
    //if resulting numbofpassengers < 0 set to 0
    if ((this.numPassengers - numToExit) < 0) {
      this.numPassengers = 0;
    } else {
      this.numPassengers -= numToExit;
    }
  }
}
