public class Car extends Automobile {
  private int capacity;
  private int numPassengers;

  public Car (String type, String model, String make, int mpg, int fuelCapacity, int capacity, int numPassengers){
    super(type, model, make, mpg, fuelCapacity);
    this.capacity = capacity;
    this.numPassengers = numPassengers;
    toggleEngine();
  }

  public int getCapacity() {
    return capacity;
  }

  public int getNumPassengers() {
    return numPassengers;
  }

  public boolean addPassengers(int newPassengers) {
    if (newPassengers + numPassengers > capacity) {
      return false;
    } else {
      numPassengers += newPassengers;
      return true;
    }
  }

  public void exitPassengers(int exitingPassengers) {
    if(exitingPassengers > numPassengers) {
//    if(numPassengers - exitingPassengers < 0) {
      numPassengers = 0;
    } else {
      numPassengers -= exitingPassengers;
    }


//    numPassengers -= exitingPassengers;
//    if(numPassengers < 0) {
//      numPassengers = 0;
//    }

  }
}
